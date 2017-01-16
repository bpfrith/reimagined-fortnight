package games;

import java.util.*;
import card_game.*;

public interface Score{
  public ArrayList<Card> compare(ArrayList<Card> hand1, ArrayList<Card> hand2);
}