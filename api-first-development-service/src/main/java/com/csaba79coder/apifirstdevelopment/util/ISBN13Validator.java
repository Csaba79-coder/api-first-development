package com.csaba79coder.apifirstdevelopment.util;

import java.math.BigDecimal;

public class ISBN13Validator {

    public static boolean isValidISBN(BigDecimal isbnLong) {
        String isbn = String.valueOf(isbnLong);
        if (isbn == null) {
            return false;
        }
        if (isbn.startsWith("-")) {
            return false;
        }
        isbn = isbn.replaceAll("-", "");
        if ( isbn.length() != 13 ) {
            return false;
        }
        try {
            int tot = 0;
            for (int i = 0; i < 12; i++) {
                int digit = Integer.parseInt(isbn.substring( i, i + 1 ));
                tot += (i % 2 == 0) ? digit : digit * 3;
            }
            int checksum = 10 - (tot % 10);
            if (checksum == 10) {
                checksum = 0;
            }
            return checksum == Integer.parseInt(isbn.substring(12));
        }
        catch (NumberFormatException nfe) {
            return false;
        }
    }

    private ISBN13Validator() {

    }
}
