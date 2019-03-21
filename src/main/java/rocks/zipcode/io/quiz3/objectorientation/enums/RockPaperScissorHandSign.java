package rocks.zipcode.io.quiz3.objectorientation.enums;

import java.awt.print.Paper;
import java.util.Map;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        if (this == ROCK){
            return PAPER;
        } else if (this == PAPER){
            return SCISSOR;
        }
        return ROCK;
    }

    public RockPaperScissorHandSign getLoser() {
        if (this == ROCK){
            return SCISSOR;
        } else if (this == PAPER){
            return ROCK;
        }
        return PAPER;
    }
}
