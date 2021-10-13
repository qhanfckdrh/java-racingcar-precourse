package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racinggame.model.Car;
import racinggame.model.Player;

public class PlayerTest {
    @Test
    void 자동차_수가_정확히_카운트_된다(){
        Player player = new Player("alice,bob");
        Assertions.assertThat(player.count()).isEqualTo(2);
    }
}
