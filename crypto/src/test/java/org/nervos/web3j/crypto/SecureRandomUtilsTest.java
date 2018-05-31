package org.nervos.web3j.crypto;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.nervos.web3j.crypto.SecureRandomUtils.isAndroidRuntime;
import static org.nervos.web3j.crypto.SecureRandomUtils.secureRandom;

public class SecureRandomUtilsTest {

    @Test
    public void testSecureRandom() {
        SecureRandomUtils.secureRandom().nextInt();
    }

    @Test
    public void testIsNotAndroidRuntime() {
        assertFalse(SecureRandomUtils.isAndroidRuntime());
    }
}