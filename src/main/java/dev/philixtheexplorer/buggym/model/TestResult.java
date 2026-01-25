package dev.philixtheexplorer.buggym.model;

/**
 * Represents the result of running a single test case.
 */
public record TestResult(
        TestCase testCase,
        String actualOutput,
        boolean passed,
        String errorMessage,
        long executionTimeMs) {
    public static TestResult success(TestCase testCase, String actualOutput, long executionTimeMs) {
        return new TestResult(testCase, actualOutput, true, null, executionTimeMs);
    }

    public static TestResult failure(TestCase testCase, String actualOutput, long executionTimeMs) {
        return new TestResult(testCase, actualOutput, false, null, executionTimeMs);
    }

    public static TestResult error(TestCase testCase, String errorMessage) {
        return new TestResult(testCase, null, false, errorMessage, 0);
    }

    public String getStatusEmoji() {
        return passed ? "✅" : "❌";
    }

    public String getSummary() {
        if (errorMessage != null) {
            return "%s Error: %s".formatted(getStatusEmoji(), errorMessage);
        }
        if (passed) {
            return "%s Passed (%dms)".formatted(getStatusEmoji(), executionTimeMs);
        }
        return "%s Failed - Expected: \"%s\", Got: \"%s\"".formatted(
                getStatusEmoji(),
                testCase.expectedOutput().replace("\n", "\\n"),
                actualOutput != null ? actualOutput.replace("\n", "\\n") : "null");
    }
}
