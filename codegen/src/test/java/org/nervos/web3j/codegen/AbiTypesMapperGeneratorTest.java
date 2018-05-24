package org.nervos.web3j.codegen;

import org.junit.Test;

import org.nervos.web3j.TempFileProvider;
import org.nervos.web3j.TempFileProvider;


public class AbiTypesMapperGeneratorTest extends TempFileProvider {

    @Test
    public void testGeneration() throws Exception {
        AbiTypesMapperGenerator.main(new String[] { tempDirPath });
    }
}
