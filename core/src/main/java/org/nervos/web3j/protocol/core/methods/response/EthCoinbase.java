package org.nervos.web3j.protocol.core.methods.response;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.protocol.core.Response;

/**
 * eth_coinbase.
 */
public class EthCoinbase extends Response<String> {
    public String getAddress() {
        return getResult();
    }
}
