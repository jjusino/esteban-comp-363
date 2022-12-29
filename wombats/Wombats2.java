import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombats2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wombats2 extends Actor
{
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;
    
    private int direction;
    private int leavesEaten;
    private int score;
    /**
     * Act - do whatever the Wombats2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wombats2(){
        setDirection(EAST);
        leavesEaten = 0;
    }
    public void act()
    {
       if (Greenfoot.isKeyDown("up")){
            setDirection (NORTH);
            move(1);
        }
        if (Greenfoot.isKeyDown("down")){
            setDirection (SOUTH);
            move(1);
        }
        if (Greenfoot.isKeyDown ("left")){
            setDirection(WEST);
            move(1);
        }
        if (Greenfoot.isKeyDown("right")){
            setDirection(EAST);
            move(1);
        }
        if(foundLeaf()) {
            eatLeaf();
    }
}
public boolean foundLeaf()
    {
        Actor leaf = getOneObjectAtOffset(0, 0, Leaf.class);
        if(leaf != null) {
            return true;
        }
        else {
            return false;
        }
    }
    public void eatLeaf()
    {
        Actor leaf = getOneObjectAtOffset(0, 0, Leaf.class);
        if(leaf != null) {
            // eat the leaf...
            getWorld().removeObject(leaf);
            leavesEaten = leavesEaten + 1; 
        }
}
public void setDirection(int direction)
    {
        this.direction = direction;
        switch(direction) {
            case SOUTH :
                setRotation(90);
                break;
            case EAST :
                setRotation(0);
                break;
            case NORTH :
                setRotation(270);
                break;
            case WEST :
                setRotation(180);
                break;
            default :
                break;
        }
    }

    public int getLeavesEaten(){
    return leavesEaten;
    }

    public void score(){
        if (score == 3){
            System.out.println("Winner: Wombats2");
        }
    }
    private boolean leavesRemain(){
        return !getWorld().getObjects(Leaf.class).isEmpty();
    }
    
    public boolean foundRocks()
    {
        Actor Rocks = getOneObjectAtOffset(0, 0, Rocks.class);
        if (Rocks != null){
            return true;
        }
        else {
            return false;
        }
    }
}