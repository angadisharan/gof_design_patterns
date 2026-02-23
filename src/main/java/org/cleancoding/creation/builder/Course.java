package org.cleancoding.creation.builder;

public class Course {

    private String title;
    private String level;
    private int duration;

    private Course(Builder builder) {
        this.title = builder.title;
        this.level = builder.level;
        this.duration = builder.duration;
    }

    public static class Builder {

        private String title;
        private String level;
        private int duration;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setLevel(String level) {
            this.level = level;
            return this;
        }

        public Builder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }

    public void print() {
        System.out.println(title + " | " + level + " | " + duration + " hrs");
    }
}