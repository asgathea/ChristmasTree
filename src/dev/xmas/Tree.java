package dev.xmas;

public class Tree implements ITree
{
    static final char space = ' ';
    static final char star = '*';
    static final char twig = '-';
    static final char stem = 'I';

    public Tree(int treeLevels)
    {
        int maxPrecedingSpaces = calcMaxPrecedingSpaces(treeLevels);
        printStar(maxPrecedingSpaces);
        printTree(treeLevels);
        printStem(maxPrecedingSpaces);
    }

    static int calcMaxPrecedingSpaces(int totalLevels)
    {
        return totalLevels - 1; // maximum distance from left margin
    }

    static void printStar(int maxPrecedingSpaces)
    {
        printCharacters(space, maxPrecedingSpaces);
        System.out.println(star);
    }

    @Override
    public void printTree(int treeLevels)
    {
        for (int currentLevel = 0; currentLevel < treeLevels; currentLevel++)
        {
            printPrecedingSpaces(treeLevels, currentLevel);
            int twigsInRow = calcTwigsPerRow(currentLevel);
            printCharacters(twig, twigsInRow);
            System.out.println();
        }
    }

    private static int calcTwigsPerRow(int currentLevel)
    {
        return 2 * currentLevel + 1;
    }

    static void printPrecedingSpaces(int treeLevels, int currentLevel)
    {
        int precedingSpaces = calcPrecedingSpaces(treeLevels, currentLevel);
        printCharacters(space, precedingSpaces);
    }

    static int calcPrecedingSpaces(int totalLevels, int currentLevel)
    {
        return totalLevels - currentLevel - 1;
    }

    static void printStem(int maxPrecedingSpaces)
    {
        printCharacters(space, maxPrecedingSpaces);
        System.out.println(stem);
    }

    static void printCharacters(char characterToPrint, int numberOfChars)
    {
        for (int i = 0; i < numberOfChars; i++)
        {
            System.out.print(characterToPrint);
        }
    }
}
