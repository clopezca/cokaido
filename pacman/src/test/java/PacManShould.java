import org.junit.Assert;
import org.junit.Test;
/*
* Direction: R, L, U, D
* Assert Pacmans direction is up when moving up from right
* Assert Pacmans direction is down when moving down from right
* Assert Pacmans direction is right when moving right from left
*
 */
public class PacManShould {

    @Test
    public void new_ensure_pacman_moves_right_and_looks_right() {
        PacMan pacman = new PacMan(0,0, Direction.LEFT);

        pacman.moveRight();

        Assert.assertEquals(new PacMan(1,0, Direction.RIGHT), pacman);
    }

    @Test
    public void new_ensure_pacman_moves_left_and_looks_left() {
        PacMan pacman = new PacMan(0, 0, Direction.RIGHT);

        pacman.moveLeft();

        Assert.assertEquals(new PacMan(-1, 0, Direction.LEFT), pacman);
    }



}
