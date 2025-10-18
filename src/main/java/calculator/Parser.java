package calculator;

public final class Parser {
    private Parser() {
    }

    private static final String DEFAULT_DELIMITER = ",|:";

    public static int[] toInts(String raw) {
        String norm = (raw == null) ? "" : raw.replace("\\n", "\n");
        if (norm.isBlank()) {
            return new int[0];
        }
        return new int[]{0};
    }
}
