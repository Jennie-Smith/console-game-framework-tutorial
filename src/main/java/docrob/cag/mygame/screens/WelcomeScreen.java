package docrob.cag.mygame.screens;

import docrob.cag.framework.screens.Screen;
import docrob.cag.framework.screens.ScreenManager;
import docrob.cag.framework.state.Game;
import docrob.cag.framework.utils.ConsoleColors;

public class WelcomeScreen extends Screen {
    public void show(){
        System.out.println(ConsoleColors.ANSI_CLEAR);
        System.out.println("Welcome screen");
    }

    protected void handleInput(){
        Game.getInstance().getInput().getString("Press Enter to continue.");
        ScreenMangaer.addScreen(new MainScreen());
    }
}