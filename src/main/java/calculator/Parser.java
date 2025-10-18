package calculator;

public final class Parser {
    private Parser() {
    }

    private static final String DEFAULT_DELIMITER = ",|:";
    private static final String PREFIX_DELIMITER = "//";
    private static final char SUFFIX_DELIMITER = '\n';

    public static int[] parseAndConvertToInts(String raw) {
        String norm = (raw == null) ? "" : raw.replace("\\n", "\n");
        if (norm.isBlank()) {
            return new int[0];
        }

        String delimiter = DEFAULT_DELIMITER;
        String parseTarget = norm;

        if (norm.startsWith(PREFIX_DELIMITER)) {
            int idx = norm.indexOf(SUFFIX_DELIMITER);
            if (idx > 0) {
                String customDelimiter = norm.substring(PREFIX_DELIMITER.length(), idx);
                delimiter += customDelimiter;
                parseTarget = norm.substring(idx + 1);
            }
        }

        return new int[0];
    }
}
