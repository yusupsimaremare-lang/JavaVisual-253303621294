package com.unpri.charactermanager.model;

public class Character {
    private int id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;

    public Character(String name, CharacterType type, int level) {
        this.id = 0;
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = 150;
        this.attackPower = 35;
    }

    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}