package dev.philixtheexplorer.buggym.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a category of questions (e.g., "Basics, Variables & Arithmetic").
 */
public class Category {
    private final String id;
    private final String name;
    private final int order;
    private final List<Question> questions;

    public Category(String id, String name, int order) {
        this.id = id;
        this.name = name;
        this.order = order;
        this.questions = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public String getDisplayName() {
        return "%d. %s".formatted(order, name);
    }

    @Override
    public String toString() {
        return getDisplayName();
    }
}
