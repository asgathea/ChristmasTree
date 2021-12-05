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
        int treeLevel = defaultTreeLevel;
        if (commandLineArguments.length > 0)
        {
            try
            {
                treeLevel =  Integer.parseInt(commandLineArguments[0]);
            }
            catch (Exception e)
            {
                System.out.println("Bitte eine Zahl für die Baumhöhe eingeben.");
            }
        }
        return treeLevel;
    }

    private static int getTreeType(String[] commandLineArguments)
    {
        int treeType = defaultTreeType;
        if (commandLineArguments.length > 1)
        {
            try
            {
                treeType = Integer.parseInt(commandLineArguments[1]);
            }
            catch (Exception e)
            {
                System.out.println("Bitte 0 oder 1 für den Baumtyp eingeben.");
            }
        }
        return treeType;
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
