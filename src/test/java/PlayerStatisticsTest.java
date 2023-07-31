import com.player.Player;
import com.player.PlayerAgeException;
import com.player.PlayerStatistics;
import org.junit.jupiter.api.*;

public class PlayerStatisticsTest {
    Player player1, player2;
    PlayerStatistics playerStatistics;

    @BeforeAll
    public static void begin() {
        System.out.println("Tests begin");
    }

    @BeforeEach
    public void init(){
        player1 = new Player("Sam", 18);
        player2 = new Player("Jack", 21);
        playerStatistics = new PlayerStatistics(player1, 2, 5);
    }

    @Test
    public void playerNameEqual() {
        Assertions.assertEquals(player1, player1);
    }

    @Test
    public void checkYoungerPlayer() {
        Assertions.assertSame(player1, PlayerStatistics.getYoungerPlayer(player1, player2));
    }

    @Test
    @DisplayName(value = "Exception Test")
    public void checkPlayerAge() {
        Player player3 = new Player("John", 7);
        Exception thrown = Assertions.assertThrows(PlayerAgeException.class, () -> player3.checkPlayerAge());
        Assertions.assertTrue(thrown.getMessage().contains("Player is not eligible by age!"));
    }

    @AfterAll
    public static void end() {
        System.out.println("Tests completed");
    }



}
