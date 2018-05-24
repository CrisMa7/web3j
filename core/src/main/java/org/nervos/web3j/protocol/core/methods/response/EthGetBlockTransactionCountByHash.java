package org.nervos.web3j.protocol.core.methods.response;

import java.math.BigInteger;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.utils.Numeric;
import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.utils.Numeric;

/**
 * eth_getBlockTransactionCountByHash.
 */
public class EthGetBlockTransactionCountByHash extends Response<String> {
    public BigInteger getTransactionCount() {
        return Numeric.decodeQuantity(getResult());
    }
}
