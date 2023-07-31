package com.player;

public class PlayerStatistics {
    private Player player;
    private int games;
    private int goals;

    public PlayerStatistics(Player player, int games, int goals) {
        this.player = player;
        this.games = games;
        this.goals = goals;
    }

    public double gamesPerGoal() {
        return (double) this.games / this.goals;
    }

    public double goalsPerGame() {
        return (double) this.goals / (double) this.games;
    }

    public boolean underThirty() {
        return this.player.getAge() < 30;
    }

    public static Player getYoungerPlayer(Player player1, Player player2) {
        return (player1.getAge() < player2.getAge()) ? player1 : player2;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}
