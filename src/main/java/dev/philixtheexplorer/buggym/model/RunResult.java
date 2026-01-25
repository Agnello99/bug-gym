package dev.philixtheexplorer.buggym.model;

import java.util.List;

/**
 * Represents the overall result of running all test cases for a question.
 */
public record RunResult(
        List<TestResult> testResults,
        boolean compilationSuccess,
        String compilationError,
        long totalExecutionTimeMs) {
    public static RunResult compilationFailure(String error) {
        return new RunResult(List.of(), false, error, 0);
    }

    public static RunResult success(List<TestResult> results, long totalTime) {
        return new RunResult(results, true, null, totalTime);
    }

    public int passedCount() {
        return (int) testResults.stream().filter(TestResult::passed).count();
    }

    public int totalCount() {
        return testResults.size();
    }

    public boolean allPassed() {
        return compilationSuccess && testResults.stream().allMatch(TestResult::passed);
    }

    public String getSummary() {
        if (!compilationSuccess) {
            return "❌ Compilation Failed:\n" + compilationError;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("📊 Results: %d/%d tests passed\n\n".formatted(passedCount(), totalCount()));

        for (int i = 0; i < testResults.size(); i++) {
            TestResult result = testResults.get(i);
            sb.append("Test %d: %s\n".formatted(i + 1, result.getSummary()));
        }

        if (allPassed()) {
            sb.append("\n🎉 All tests passed! Great job!");
        }

        return sb.toString();
    }
}
