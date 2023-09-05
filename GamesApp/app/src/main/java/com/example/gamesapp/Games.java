package com.example.gamesapp;

public class Games {

    private int gameImg;
    private String gameTxt;

    public Games(int gameImg, String gameTxt) {
        this.gameImg = gameImg;
        this.gameTxt = gameTxt;
    }

    public int getGameImg() {
        return gameImg;
    }

    public String getGameTxt() {
        return gameTxt;
    }

}
