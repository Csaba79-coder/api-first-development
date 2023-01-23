package com.csaba79coder.apifirstdevelopment.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class ISBN13ValidatorTest {

    @Test
    void validISBN() {
        boolean isValid = ISBN13Validator.validISBN(9788845292613L);
        then(isValid)
                .isTrue();
    }

    @Test
    void invalidISBN() {
        boolean isValid = ISBN13Validator.validISBN(999L);
        then(isValid)
                .isFalse();
    }

    @Test
    void nullISBN() {
        boolean isValid = ISBN13Validator.validISBN(null);
        then(isValid)
                .isFalse();
    }

    @Test
    void zeroISBN() {
        boolean isValid = ISBN13Validator.validISBN(0L);
        then(isValid)
                .isFalse();
    }

    @Test
    void negativeNonValidISBN() {
        boolean isValid = ISBN13Validator.validISBN(-112L);
        then(isValid)
                .isFalse();
    }

    @Test
    void negativeValidISBN() {
        boolean isValid = ISBN13Validator.validISBN(-9780425175477L);
        then(isValid)
                .isFalse();
    }
}