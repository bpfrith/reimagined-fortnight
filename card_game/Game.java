package card_game;
import java.util.*;

public class Game{

  private String name; 
  private Deck deck;
  private ArrayList<Player> players;
  private int turnLog;

  public Game() {
    this.name = name;
    this.deck = new Deck();
    this.players = new ArrayList<Player>();
    this.turnLog = 0;
  }

  public void addPlayer(Player player) {
    players.add(player);
  }

  public int numberOfPlayers() {
    return players.size();
  }

  public Deck getDeck() {
    return deck;
  }

  public int turnLog() {
    return turnLog;
  }

  public void increaseTurnLog() {
    this.turnLog += 1;
  }

}