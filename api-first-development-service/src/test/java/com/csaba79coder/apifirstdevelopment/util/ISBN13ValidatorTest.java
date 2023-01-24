package com.csaba79coder.apifirstdevelopment.util;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.BDDAssertions.then;

class ISBN13ValidatorTest {

    // https://medium.com/@stefanovskyi/unit-test-naming-conventions-dd9208eadbea

    @Test
    void validISBN() {
        boolean isValid = ISBN13Validator.isValidISBN(BigDecimal.valueOf(9780671557003L));
        then(isValid)
                .isTrue();
    }

    @Test
    void invalidISBN() {
        boolean isValid = ISBN13Validator.isValidISBN(BigDecimal.valueOf(999L));
        then(isValid)
                .isFalse();
    }

    @Test
    void nullISBN() {
        boolean isValid = ISBN13Validator.isValidISBN(null);
        then(isValid)
                .isFalse();
    }

    @Test
    void zeroISBN() {
        boolean isValid = ISBN13Validator.isValidISBN(BigDecimal.valueOf(0L));
        then(isValid)
                .isFalse();
    }

    @Test
    void negativeNonValidISBN() {
        boolean isValid = ISBN13Validator.isValidISBN(BigDecimal.valueOf(-112L));
        then(isValid)
                .isFalse();
    }

    @Test
    void negativeValidISBN() {
        boolean isValid = ISBN13Validator.isValidISBN(BigDecimal.valueOf(-9780425175477L));
        then(isValid)
                .isFalse();
    }
}