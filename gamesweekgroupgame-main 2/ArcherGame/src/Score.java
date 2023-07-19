public class Score {
    private int player1Score;
    private int player2Score;


    public void getplayer1Score() {
        this.player1Score = player1Score;
    }

    public void getplayer2Score() {
        this.player2Score = player2Score;
    }

    public Score() {
        player1Score = 0;
        player2Score = 0;
    }

    public void updateScores( int player1Score, int player2Score ) {
        this.player1Score += player1Score;
        this.player2Score += player2Score;
    }

    public void resetScores() {
        player1Score = 0;
        player2Score = 0;

    }

    @Override
    public String toString() {
        return String.valueOf(player1Score);

       /* public String toString() {
            return String.valueOf(player2Score);
        }*/

    }
}