package com.onlineschool.models;

public class Stacktrace {
    private LevelLog warning;
    private LevelLog error;

    public Stacktrace(LevelLog warning, LevelLog error) {
        this.warning = warning;
        this.error = error;
    }

    public LevelLog getWarning() {
        return warning;
    }

    public void setWarning(LevelLog warning) {
        this.warning = warning;
    }

    public LevelLog getError() {
        return error;
    }

    public void setError(LevelLog error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
