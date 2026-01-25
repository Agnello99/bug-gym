package dev.philixtheexplorer.buggym.model;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a coding question with its metadata, content, and test cases.
 */
public class Question {
    private final String id;
    private final String title;
    private final String categoryId;
    private final Path markdownPath;
    private final int order;
    private String markdownContent;
    private String hint;
    private String starterCode;
    private String userCode;
    private List<TestCase> testCases;
    private boolean solved;

    public Question(String id, String title, String categoryId, Path markdownPath, int order) {
        this.id = id;
        this.title = title;
        this.categoryId = categoryId;
        this.markdownPath = markdownPath;
        this.order = order;
        this.testCases = new ArrayList<>();
        this.solved = false;
        this.starterCode = getDefaultStarterCode();
        this.userCode = null;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public Path getMarkdownPath() {
        return markdownPath;
    }

    public int getOrder() {
        return order;
    }

    public String getMarkdownContent() {
        return markdownContent;
    }

    public void setMarkdownContent(String markdownContent) {
        this.markdownContent = markdownContent;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getStarterCode() {
        return starterCode;
    }

    public void setStarterCode(String starterCode) {
        this.starterCode = starterCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public List<TestCase> getTestCases() {
        return testCases;
    }

    public void setTestCases(List<TestCase> testCases) {
        this.testCases = testCases;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public String getDisplayName() {
        String prefix = solved ? "✓ " : "";
        return "%sQuestion %d: %s".formatted(prefix, order, title);
    }

    private String getDefaultStarterCode() {
        return """
                import java.util.Scanner;

                public class Main {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);

                        // Your code here

                        sc.close();
                    }
                }
                """;
    }

    @Override
    public String toString() {
        return getDisplayName();
    }
}
