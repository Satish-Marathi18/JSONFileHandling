package com;

public class Demo {
Example example1 = Example.getInstance();
}

class Example {
    private Example() {

    }

    static Example example = new Example();

    public static Example getInstance() {
        return example;
    }
}
