package com.example.project;

import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.Arrays;
import java.util.stream.Stream;

public class SlickArgumentsProvider implements ArgumentsProvider, Extension {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        // this will eventually come from the environment variable
        return Arrays.asList(Arguments.of("0", "2", "2")).stream();
    }

}
