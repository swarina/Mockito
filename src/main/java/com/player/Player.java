package com.player;

import java.util.Objects;

public class Player {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int checkPlayerAge() {
        if (this.getAge() < 18 || this.getAge() > 45) {
            throw new PlayerAgeException("Player is not eligible by age!");
        }

        else return this.getAge();
    }

    @Override
    public boolean equals(Object o) {
        Player player = (Player) o;
        return player.getName() == this.getName();
    }
}
