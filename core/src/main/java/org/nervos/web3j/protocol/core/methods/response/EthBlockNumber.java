package org.nervos.web3j.protocol.core.methods.response;

import java.math.BigInteger;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.utils.Numeric;
import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.utils.Numeric;

/**
 * eth_blockNumber.
 */
public class EthBlockNumber extends Response<String> {
    public boolean isEmpty() {
        return getResult() == null;
    }

    public BigInteger getBlockNumber() {
        return Numeric.decodeQuantity(getResult());
    }
}
