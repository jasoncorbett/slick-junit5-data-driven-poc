package com.example.project;

import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;

import java.lang.annotation.*;

@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@TestTemplate
@ExtendWith(CustomParameterizedTestExtension.class)
public @interface CustomParameterizedTest {

    /**
     * The display name to be used for individual invocations of the
     * parameterized test; never blank or consisting solely of whitespace.
     *
     * <p>Defaults to {@link ParameterizedTest#DEFAULT_DISPLAY_NAME}.
     *
     * <h4>Supported placeholders</h4>
     * <ul>
     * <li>{@link ParameterizedTest#DISPLAY_NAME_PLACEHOLDER}</li>
     * <li>{@link ParameterizedTest#INDEX_PLACEHOLDER}</li>
     * <li>{@link ParameterizedTest#ARGUMENTS_PLACEHOLDER}</li>
     * <li><code>{0}</code>, <code>{1}</code>, etc.: an individual argument (0-based)</li>
     * </ul>
     *
     * <p>For the latter, you may use {@link java.text.MessageFormat} patterns
     * to customize formatting.
     *
     * @see java.text.MessageFormat
     */
    String name() default ParameterizedTest.DEFAULT_DISPLAY_NAME;

}
