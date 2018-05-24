package org.nervos.web3j.protocol.admin;

import java.math.BigInteger;

import org.nervos.web3j.protocol.Web3j;
import org.nervos.web3j.protocol.Web3jService;
import org.nervos.web3j.protocol.Web3j;
import org.nervos.web3j.protocol.Web3jService;
import org.nervos.web3j.protocol.admin.methods.response.NewAccountIdentifier;
import org.nervos.web3j.protocol.admin.methods.response.PersonalListAccounts;
import org.nervos.web3j.protocol.admin.methods.response.PersonalUnlockAccount;
import org.nervos.web3j.protocol.core.Request;
import org.nervos.web3j.protocol.core.methods.request.Transaction;
import org.nervos.web3j.protocol.core.methods.response.EthSendTransaction;

/**
 * JSON-RPC Request object building factory for common Parity and Geth. 
 */
public interface Admin extends Web3j {

    static Admin build(Web3jService web3jService) {
        return new JsonRpc2_0Admin(web3jService);
    }
    
    public Request<?, PersonalListAccounts> personalListAccounts();
    
    public Request<?, NewAccountIdentifier> personalNewAccount(String password);
    
    public Request<?, PersonalUnlockAccount> personalUnlockAccount(
            String address, String passphrase, BigInteger duration);
    
    public Request<?, PersonalUnlockAccount> personalUnlockAccount(
            String address, String passphrase);
    
    public Request<?, EthSendTransaction> personalSendTransaction(
            Transaction transaction, String password);

}   
