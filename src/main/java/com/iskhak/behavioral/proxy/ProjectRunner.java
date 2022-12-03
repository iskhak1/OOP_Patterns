package com.iskhak.behavioral.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/iskhak/repo1");
        project.run();
    }
}
