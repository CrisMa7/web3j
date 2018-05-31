package org.nervos.web3j.protocol;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Future;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.nervos.web3j.utils.Async;
import org.nervos.web3j.protocol.core.Request;
import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.utils.Async;

/**
 * Base service implementation.
 */
public abstract class Service implements Web3jService {

    protected final ObjectMapper objectMapper;

    public Service(boolean includeRawResponses) {
        objectMapper = ObjectMapperFactory.getObjectMapper(includeRawResponses);
    }

    protected abstract InputStream performIO(String payload) throws IOException;

    @Override
    public <T extends Response> T send(
            Request request, Class<T> responseType) throws IOException {
        String payload = objectMapper.writeValueAsString(request);

        try (InputStream result = performIO(payload)) {
            if (result != null) {
                return objectMapper.readValue(result, responseType);
            } else {
                return null;
            }
        }
    }

    @Override
    public <T extends Response> Future<T> sendAsync(
            Request jsonRpc20Request, Class<T> responseType) {
        return Async.run(() -> send(jsonRpc20Request, responseType));
    }
}