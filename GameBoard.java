import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Game Board for Triples
 * 
 * @author (Stephen) 
 * @version (1/30)
 */
public class GameBoard extends World
{
    private final int NUM_CARDS_IN_DECK = 27;
    
    public GameBoard()
    {   
        super(430, 600, 1, false); 
        Dealer dealer = new Dealer(NUM_CARDS_IN_DECK);
        addObject(dealer, -30, -30);
        addObject(new Player(dealer), -30, -30);
        
    }

}
