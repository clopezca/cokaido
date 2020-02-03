
public class Tile
{
    public int X;
    public int Y;
    public char Symbol;

    public Tile(int x, int y, char symbol) {
        X = x;
        Y = y;
        Symbol = symbol;
    }

    boolean hasSamePosition(int x, int y) {
        return X == x && Y == y;
    }
}