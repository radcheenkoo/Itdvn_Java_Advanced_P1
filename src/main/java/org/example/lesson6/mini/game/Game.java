package org.example.lesson6.mini.game;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Game {
private static final Logger logger = LoggerFactory.getLogger(Game.class);
private static final Scanner scanner = new Scanner(System.in);
private static final org.example.lesson6.mini.game.Character prototype = new org.example.lesson6.mini.game.Character("Evil", 20);

public static void main(String[] args) {
    org.example.lesson6.mini.game.Character character = null;
    boolean isRunning = true;
    boolean isNewGame = true;

    while (isRunning) {
        try {
            if (isNewGame) {
                character = prototype.clone();
                logger.info("You are playing against {}. Lives:{}", character.getName(), character.getLife());
                isNewGame = false;
            }

            int damage = (int) (Math.random() * 10);
            character.reduceLives(damage);
            logger.info("Damage {}. Lives left: {}", damage, character.getLife());

            if (character.getLife() < 1) {
                logger.info("The end. Do you want play again? y/n (or any other key):");
                String input = scanner.next();
                if (input.equalsIgnoreCase("y")) {
                    isNewGame = true;
                } else {
                    isRunning = false;
                }
            }
        } catch (NumberFormatException | CloneNotSupportedException e) {
            isRunning = false;
        }
    }
}
}

