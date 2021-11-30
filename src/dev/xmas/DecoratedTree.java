package dev.xmas;

public class DecoratedTree extends Tree implements ITree
{
    private static final String twigWithStar = "X*";

    public DecoratedTree(int treeLevels)
    {
        super(treeLevels);
    }

    @Override
    public void printTree(int treeLevels)
    {
        for (int currentLevel = 0; currentLevel < treeLevels; currentLevel++)
        {
            printPrecedingSpaces(treeLevels, currentLevel);
            printTwigsAndStarsInRow(currentLevel);
        }
    }

    private static void printTwigsAndStarsInRow(int currentLevel)
    {
        if (currentLevel > 0)
        {
            printTwigsAndStars(currentLevel);
        }
        System.out.println(twig);
    }

    private static void printTwigsAndStars(int twigsInRow)
    {
        for (int i = 0; i < twigsInRow; i++)
        {
            System.out.print(twigWithStar);
        }
    }
}
