package _08_clean_code.bai_tap.refactoring;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int getScore_1, int getScore_2) {
        String score = "";
        int tempScore = 0;
        if (getScore_1 == getScore_2) {
            score = getStringMessage_01(getScore_1);
        } else {
            boolean resultScore_1 = getScore_1 >= 4;
            boolean resultScore_2 = getScore_2 >= 4;
            if (resultScore_1 || resultScore_2) {
                int result = getScore_1 - getScore_2;
                score = getStringMessage_02(result);
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = getScore_1;
                    else {
                        score += "-";
                        tempScore = getScore_2;
                    }
                    score = getStringMessage_03(score, tempScore);
                }
            }
        }
        return score;
    }

    private static String getStringMessage_03(String score, int tempScore) {
        switch (tempScore) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }
        return score;
    }

    private static String getStringMessage_02(int result) {
        String score;
        if (result == 1) {
            score = "Advantage player1";
        } else if (result == -1) {
            score = "Advantage player2";
        } else if (result >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    private static String getStringMessage_01(int getScore_1) {
        String score;
        switch (getScore_1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
