package org.nervos.web3j.protocol.core.methods.response;

import org.nervos.web3j.protocol.core.Response;

public class EthGetAbi extends Response<String> {

    public boolean isEmpty() {
        return getResult() == null;
    }

    public String getAbi() {
        return getResult();
    }

}
