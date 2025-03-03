package dk.easv.bll.bot;

import dk.easv.bll.bot.IBot;
import dk.easv.bll.game.IGameState;
import dk.easv.bll.move.IMove;
import java.util.List;
import java.util.Random;

public class MyBot implements IBot {

    private static String BOTNAME = "Goob";

    @Override
    public IMove doMove(IGameState gameState) {

        // hent tilgængelige træk
        List<IMove> availableMoves = gameState.getField().getAvailableMoves();

        // vælg tilfældig træk, hvis tilgængelig
        if (!availableMoves.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(availableMoves.size());
            return availableMoves.get(randomIndex);
        }

        // hvis der ikke er nogen tilgængelige træk
        return null;
    }

    @Override
    public String getBotName() {
        return BOTNAME;
    }
}

