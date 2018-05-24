package org.nervos.web3j.protocol.core.methods.response;

import java.math.BigInteger;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.utils.Numeric;
import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.utils.Numeric;

/**
 * eth_hashrate.
 */
public class EthHashrate extends Response<String> {
    public BigInteger getHashrate() {
        return Numeric.decodeQuantity(getResult());
    }
}
