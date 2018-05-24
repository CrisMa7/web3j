package org.nervos.web3j.protocol.core.methods.response;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.protocol.core.Response;

/**
 * eth_getCode.
 */
public class EthGetCode extends Response<String> {
    public boolean isEmpty() {
        return getResult() == null;
    }

    public String getCode() {
        return getResult();
    }
}
