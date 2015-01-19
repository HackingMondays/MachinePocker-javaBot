package machinepocker.javabot.rest;

import machinepocker.javabot.domain.Bet;
import machinepocker.javabot.domain.Game;
import restx.annotations.GET;
import restx.annotations.POST;
import restx.annotations.RestxResource;
import restx.factory.Component;
import restx.security.PermitAll;

import java.util.Random;
import java.util.logging.Logger;

@Component
@RestxResource
public class HelloResource {

    private static final Logger logger = Logger.getLogger("Boom");
    public static final Random RANDOM = new Random();

    @POST("/bot")
    @PermitAll
    public Integer getBot(Game game) {
        Bet betting = game.getBetting();
        if (betting.isCanRaise()) {
            int choice = getRandomTill(3);
            switch (choice) {
                case 1:
                    return betting.getCall();
                case 2:
                    return betting.getRaise() * (getRandomTill(5) + 1);
                default:
                case 0:
                    return 0;
            }
        } else {
            Random random = new Random();
            int choice = Math.abs(random.nextInt() % 2);
            switch (choice) {
                default:
                case 0:
                    return 0;
                case 1:
                    return betting.getCall();
            }
        }
    }

    private int getRandomTill(int range) {
        return Math.abs(RANDOM.nextInt() % range);
    }

}
