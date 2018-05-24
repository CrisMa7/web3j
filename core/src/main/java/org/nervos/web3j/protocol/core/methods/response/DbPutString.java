package org.nervos.web3j.protocol.core.methods.response;

import org.nervos.web3j.protocol.core.Response;
import org.nervos.web3j.protocol.core.Response;

/**
 * db_putString.
 */
public class DbPutString extends Response<Boolean> {

    public boolean valueStored() {
        return getResult();
    }
}
