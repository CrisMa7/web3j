package org.nervos.web3j.protocol.core.methods.response;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.protocol.core.Response;

/**
 * eth_compileSerpent.
 */
public class EthCompileSerpent extends Response<String> {
    public String getCompiledSourceCode() {
        return getResult();
    }
}
