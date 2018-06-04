import java.util.*;

class BigNumber {

    CharSequence value;

    BigNumber(CharSequence number) {
        value = number;
    }

    public BigNumber(String number) {
        value = number;
    }

    public BigNumber(int number) {
        value = String.valueOf(number);
    }

    BigNumber add(BigNumber number) {
        CharSequence kek = new StringBuilder(value.toString()).reverse().toString();
        CharSequence lol = new StringBuilder(number.value.toString()).reverse().toString();
        StringBuilder result = new StringBuilder();
        int um = 0;
        if (kek.length() >= lol.length()) {
            // КАКА!!!!1!!1!!! ПЕРЕДЕЛАТЬ.
            for (int i = 0; i < kek.length(); i++) {
                if (i < lol.length()) {
                    int currentResult = Integer.parseInt(String.valueOf(kek.charAt(i))) + Integer.parseInt(String.valueOf(lol.charAt(i))) + um;
                    if (currentResult >= 10) {
                        result.append("0");
                        um = currentResult - 10;
                    } else result.append(currentResult);
                } else result.append(kek.charAt(i));
            }
        } else {
            for (int i = 0; i < lol.length(); i++) {
                if (i < kek.length()) {
                    int currentResult = Integer.parseInt(String.valueOf(kek.charAt(i))) + Integer.parseInt(String.valueOf(lol.charAt(i))) + um;
                    if (currentResult >= 10) {
                        result.append("0");
                        um = currentResult - 10;
                    } else result.append(currentResult);
                } else result.append(lol.charAt(i));
            }
        }
        if (um > 0) {
            BigNumber kekek = new BigNumber(new StringBuilder(((String) kek).substring(result.length())).reverse().toString());
            BigNumber umNumber = new BigNumber(um);
            result.append(kekek.add(umNumber).value.toString());
        }

        return new BigNumber(result.reverse().toString());
    }

    BigNumber substract(BigNumber number) {

        return new BigNumber("0");
    }

    BigNumber multiply(BigNumber number) {

        return new BigNumber("0");
    }

    BigNumber max(BigNumber number) {

        return new BigNumber("0");
    }

    BigNumber min(BigNumber number) {

        return new BigNumber("0");
    }

    int compareTo(BigNumber number) {

        return 0;
    }

    BigNumber gcd(BigNumber number) {

        return new BigNumber("0");
    }

    BigNumber abs(BigNumber number) {

        return new BigNumber("0");
    }

    long longValue() {
        return Long.parseLong(value.toString());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
