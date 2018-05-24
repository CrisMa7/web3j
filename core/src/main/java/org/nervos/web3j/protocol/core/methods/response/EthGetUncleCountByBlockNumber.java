package org.nervos.web3j.protocol.core.methods.response;

import java.math.BigInteger;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.utils.Numeric;
import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.utils.Numeric;

/**
 * eth_getUncleCountByBlockNumber.
 */
public class EthGetUncleCountByBlockNumber extends Response<String> {
    public BigInteger getUncleCount() {
        return Numeric.decodeQuantity(getResult());
    }
}
