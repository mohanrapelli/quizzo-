package com.example.pratice2.model;

public class wwemodel {
    String playername;
    int playerrating,imageview;

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public int getPlayerrating() {
        return playerrating;
    }

    public void setPlayerrating(int playerrating) {
        this.playerrating = playerrating;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public wwemodel(String playername, int playerrating, int imageview) {
        this.playername = playername;
        this.playerrating = playerrating;
        this.imageview = imageview;

    }
}
