package org.nervos.web3j.protocol.core.methods.response;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.protocol.core.Response;

/**
 * eth_uninstallFilter.
 */
public class EthUninstallFilter extends Response<Boolean> {
    public boolean isUninstalled() {
        return getResult();
    }
}
