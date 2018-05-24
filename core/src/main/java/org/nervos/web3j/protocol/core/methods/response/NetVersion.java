package org.nervos.web3j.protocol.core.methods.response;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.protocol.core.Response;

/**
 * net_version.
 */
public class NetVersion extends Response<String> {
    public String getNetVersion() {
        return getResult();
    }
}
