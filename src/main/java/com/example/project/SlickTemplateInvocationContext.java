package com.example.project;

import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.TestTemplateInvocationContext;
import org.junit.jupiter.params.ParameterizedTest;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.singletonList;

public class SlickTemplateInvocationContext implements TestTemplateInvocationContext {

    private final ParameterizedTestMethodContext methodContext;
    private ParameterizedTestNameFormatter formatter;

    public SlickTemplateInvocationContext(ParameterizedTestNameFormatter formatter, ParameterizedTestMethodContext method) {
        this.methodContext = method;
        this.formatter = formatter;
    }

    @Override
    public String getDisplayName(int index) {
        return formatter.format(index, "0", "2", "2");
    }


    @Override
    public List<Extension> getAdditionalExtensions() {
        return singletonList(new ParameterizedTestParameterResolver(this.methodContext, new Object[] {"0", "2", "2"}));
    }
}
