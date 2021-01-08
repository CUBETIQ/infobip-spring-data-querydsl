package com.infobip.spring.data.r2dbc.extension;

import com.infobip.spring.data.r2dbc.TestBase;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

@AllArgsConstructor
public class ExtensionTest extends TestBase {

    private final FooBarRepository fooBarRepository;

    @Test
    void shouldCreateCustomBaseRepository() {
        // then
        then(fooBarRepository).isInstanceOf(CustomQuerydslR2dbcRepository.class);
    }
}