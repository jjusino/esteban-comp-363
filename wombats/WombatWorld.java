import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random;



public class WombatWorld extends World
{
    public int score;
    private int leavesEaten;
    /**
     * Create a new world with 8x8 cells and
     * with a cell size of 60x60 pixels
     */
    public WombatWorld() 
    {
        super(8, 8, 60);        
        setBackground("cell.jpg");
    }

    /**
     * Populate the world with a fixed scenario of wombats and leaves.
     */    
    public void populate()
    {
        Wombat w1 = new Wombat();
        addObject(w1, 3, 3);
        
        Wombats2 w2 = new Wombats2();
        addObject(w2, 1, 1);

        Leaf l1 = new Leaf();
        addObject(l1, 5, 3);

        Leaf l2 = new Leaf();
        addObject(l2, 0, 2);

        Leaf l3 = new Leaf();
        addObject(l3, 7, 5);

        Leaf l4 = new Leaf();
        addObject(l4, 2, 6);

        Leaf l5 = new Leaf();
        addObject(l5, 5, 0);
        
        Leaf l6 = new Leaf();
        addObject(l6, 4, 7);
        
        Rocks r1 = new Rocks();
        addObject(r1, 3, 2);
        
        Rocks r2 = new Rocks();
        addObject(r2, 6, 5);
        
        Rocks r3 = new Rocks();
        addObject(r3, 5, 5);
        
        Rocks r4 = new Rocks();
        addObject(r4 , 3, 1);
        
        Rocks r5 = new Rocks();
        addObject(r5, 2, 2);
        
        Rocks r6 = new Rocks();
        addObject(r6, 2, 4);
        
        Rocks r7 = new Rocks();
        addObject(r7, 2, 8);
        
    }
    
    /**
     * Place a number of leaves into the world at random places.
     * The number of leaves can be specified.
     */
    public void randomLeaves(int howMany)
    {
        for(int i=0; i<howMany; i++) {
            Leaf leaf = new Leaf();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(leaf, x, y);
        }
    }
    
    public int getLeavesEaten()
    {
        return leavesEaten;
    }
    
    
}
