import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocks extends Actor
{
    /**
     * Act - do whatever the Rocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor Rocks;
        Rocks = getOneObjectAtOffset(0, 0, Rocks.class);
        if (Rocks != null){
            World world;
            world = getWorld();
            world.removeObject(Rocks);
        }
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
