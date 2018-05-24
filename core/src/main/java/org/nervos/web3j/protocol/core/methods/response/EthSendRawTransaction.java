package org.nervos.web3j.protocol.core.methods.response;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.protocol.core.Response;

/**
 * eth_sendRawTransaction.
 */
public class EthSendRawTransaction extends Response<String> {
    public String getTransactionHash() {
        return getResult();
    }
}
