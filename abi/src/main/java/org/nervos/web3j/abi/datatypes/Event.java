package org.nervos.web3j.abi.datatypes;

import java.util.List;

import org.nervos.web3j.abi.TypeReference;
import org.nervos.web3j.abi.Utils;
import org.nervos.web3j.abi.TypeReference;

import static org.nervos.web3j.abi.Utils.convert;

/**
 * Event wrapper type.
 */
public class Event {
    private String name;
    private List<TypeReference<Type>> indexedParameters;
    private List<TypeReference<Type>> nonIndexedParameters;

    public Event(String name, List<TypeReference<?>> indexedParameters,
                 List<TypeReference<?>> nonIndexedParameters) {
        this.name = name;
        this.indexedParameters = Utils.convert(indexedParameters);
        this.nonIndexedParameters = Utils.convert(nonIndexedParameters);
    }

    public String getName() {
        return name;
    }

    public List<TypeReference<Type>> getIndexedParameters() {
        return indexedParameters;
    }

    public List<TypeReference<Type>> getNonIndexedParameters() {
        return nonIndexedParameters;
    }
}
