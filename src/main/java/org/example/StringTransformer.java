package org.example;

public final class StringTransformer {
    private StringTransformer() {
    }

    /**
     * Method that change string cases.
     *
     * @param input The start string
     * @return string The transformed string
     */
    public static String transformString(final String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(symbol));
            } else {
                sb.append(Character.toLowerCase(symbol));
            }
        }
        return sb.toString();
    }
}
