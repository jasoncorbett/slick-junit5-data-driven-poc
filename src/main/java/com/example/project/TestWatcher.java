package com.example.project;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.Optional;

/**
 * Using this to test out ideas of how to deal with scheduling tests.  Not needed for now.
 */
public class TestWatcher implements org.junit.jupiter.api.extension.TestWatcher, BeforeEachCallback {

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {

    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        System.out.println("Yomama");

    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {

    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {

    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("Yomama");

    }
}
