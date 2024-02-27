package org.example;
import java.util.ArrayList;

public class ScoreCollection {
    private ArrayList<Integer> scores;

    public ScoreCollection() {
        this.scores = new ArrayList<>();
    }

    public void addScore(Integer score) {
        this.scores.add(score);
    }

    public double averageScores() {
        double total = 0;

        for (int i = 0; i < this.scores.size(); i++) {
            total += this.scores.get(i);
        }
        return this.scores.isEmpty() ? 0.0 : total / this.scores.size();
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }
}
