package calculator;

import java.util.Arrays;
import java.util.regex.Pattern;

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
                delimiter += "|" + Pattern.quote(customDelimiter);
                parseTarget = norm.substring(idx + 1);
            }
        }

        return Arrays.stream(parseTarget.split(delimiter))
                .map(String::trim)
                .mapToInt(s -> {
                    final int n;
                    try {
                        n = Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("숫자가 아님: " + s);
                    }
                    if (n < 0) {
                        throw new IllegalArgumentException("음수 불가: " + n);
                    }
                    return n;
                }).toArray();
    }
}
