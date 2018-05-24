package org.nervos.web3j.console;

import org.junit.Before;

import org.nervos.web3j.crypto.SampleKeys;
import org.nervos.web3j.TempFileProvider;

import static org.mockito.Mockito.mock;
import static org.nervos.web3j.crypto.SampleKeys.PASSWORD;

public abstract class WalletTester extends TempFileProvider {

    static final char[] WALLET_PASSWORD = SampleKeys.PASSWORD.toCharArray();

    IODevice console;

    @Before
    public void setUp() throws Exception {
        super.setUp();

        console = mock(IODevice.class);
    }
}
