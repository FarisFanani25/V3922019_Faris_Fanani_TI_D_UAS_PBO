/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas;

/**
 *
 * @author user
 */
public class UAS {
    public static void main(String[] args) {
        // Membuat objek Player
        Player player1 = new Player("Faris", 100);
        Player player2 = new Player("Fanani", 150);

        // Menjalankan permainan
        Game game = new Game(player1, player2);
        game.start();
    }

    public static class Player {
        private String name;
        private int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public void increaseScore(int points) {
            score += points;
        }
    }

    public static class Game {
        private Player player1;
        private Player player2;

        public Game(Player player1, Player player2) {
            this.player1 = player1;
            this.player2 = player2;
        }

        public void start() {
            System.out.println("Game started!");
            System.out.println("Player 1: " + player1.getName());
            System.out.println("Player 2: " + player2.getName());
            
            // Simulasi permainan dengan pemain meningkatkan skor
            player1.increaseScore(50);
            player2.increaseScore(75);
            
            System.out.println("Player 1 score: " + player1.getScore());
            System.out.println("Player 2 score: " + player2.getScore());
            
            // Menentukan pemenang berdasarkan skor tertinggi
            Player winner = determineWinner();
            if (winner != null) {
                System.out.println("Winner: " + winner.getName());
            } else {
                System.out.println("It's a tie!");
            }
        }

        private Player determineWinner() {
            if (player1.getScore() > player2.getScore()) {
                return player1;
            } else if (player2.getScore() > player1.getScore()) {
                return player2;
            } else {
                return null;
            }
        }
    }
}
