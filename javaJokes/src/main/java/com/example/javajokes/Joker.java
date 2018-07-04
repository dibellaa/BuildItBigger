package com.example.javajokes;

import java.util.Random;

public class Joker {

    String[] jokes = {
            "Programmer (noun.):\n A machine that turns coffee into code.",
            "Algorithm (noun.):\n Word used by programmers when they do not want to explain what they did.",
            "Hardware (noun.):\n The part of a computer that you can kick.",
            "Real programmers count from 0.",
            "Chuck Norris can take a screenshot of his blue screen.",
            "A foo walks into a bar, takes a look around and says 'Hello World!'",
            "Documentation is like sex. When it is good, it is very good. When it is bad, it is better than nothing.",
            "Software developers like to solve problems. If there are no problems available, they will create their own problems.",
            "I would like to make the world a better place. But they will not give me the source code...",
            "A programmer puts two glasses on his bedside table before going to sleep. A full one, in case he gets thirsty, and an empty one, in case he does not.",
            "Java and C were telling jokes. It was C's turn, so he writes something on the wall, points to it and says \"Do you get the reference?\" But Java didn't."
    };

    public String getJoke() {
        int idx = new Random().nextInt(jokes.length);
        return jokes[idx];
    }
}
