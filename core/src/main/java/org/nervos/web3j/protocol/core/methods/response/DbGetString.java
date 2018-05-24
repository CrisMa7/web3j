package org.nervos.web3j.protocol.core.methods.response;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.protocol.core.Response;

/**
 * db_getString.
 */
public class DbGetString extends Response<String> {

    public String getStoredValue() {
        return getResult();
    }
}
