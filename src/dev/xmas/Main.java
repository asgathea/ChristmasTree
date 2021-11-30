package dev.xmas;

public class Main
{
    static final int defaultTreeLevel = 5; // tree with 5 rows
    static final int defaultTreeType = 0; // tree without decoration

    public static void main(String[] args)
    {
        int treeLevels = getTreeLevels(args);
        int treeType = getTreeType(args);
        printSelectedTree(treeLevels, treeType);
    }

    private static int getTreeLevels(String[] commandLineArguments)
    {
        if (commandLineArguments.length > 0) {
            return Integer.parseInt(commandLineArguments[0]);
        }
        else
        {
            return defaultTreeLevel;
        }
    }

    private static int getTreeType(String[] commandLineArguments)
    {
        if (commandLineArguments.length > 1) {
            return Integer.parseInt(commandLineArguments[1]);
        }
        else
        {
            return defaultTreeType;
        }
    }

    private static void printSelectedTree(int treeLevels, int treeType)
    {
        if (treeType == 0)
        {
            new Tree(treeLevels);
        }
        else
        {
            new DecoratedTree(treeLevels);
        }
    }
}
