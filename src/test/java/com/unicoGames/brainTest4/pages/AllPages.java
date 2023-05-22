package com.unicoGames.brainTest4.pages;

import com.unicoGames.brainTest4.pages.android.*;


public class AllPages {

    public AllPages(){
    }


    private GamePages gamePages;


    public GamePages gamePages(){
        if (gamePages == null){
            gamePages = new GamePages();
        }
        return gamePages;
    }

}
