package cow.fedex;

public class GameLogic {

  private int level;
  private int totalQuestions;
  private int askedQuestions;
  private int correctGuesses;

  public GameLogic() {
    this.level = 1;
    this.askedQuestions = 0;
    this.correctGuesses = 0;
  }

  public GameLogic(int level, int totalQuestions) {
    this.level = level += 1;
    this.totalQuestions = totalQuestions;
    this.askedQuestions = 0;
    this.correctGuesses = 0;
  }

  public GameLogic(int totalQuestions) {
    this.level = 1;
    this.totalQuestions = totalQuestions;
    this.askedQuestions = 0;
    this.correctGuesses = 0;
  }

  public boolean score() {
    double result = (double) (this.correctGuesses / this.askedQuestions);
    if (result >= 0.8) {
      return true;
    }
    return false;
  }

  public void increaseLevel(int level, int totalQuestions) {
    if (level <= 5) {
      if (this.askedQuestions == this.totalQuestions) {
        if (score()) {
          GameLogic gameLogic = new GameLogic(level, totalQuestions);
        }
      }
    }
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getTotalQuestions() {
    return totalQuestions;
  }

  public void setTotalQuestions(int totalQuestions) {
    this.totalQuestions = totalQuestions;
  }

  public int getAskedQuestions() {
    return askedQuestions;
  }

  public void setAskedQuestions(int askedQuestions) {
    this.askedQuestions = askedQuestions;
  }

  public int getCorrectGuesses() {
    return correctGuesses;
  }

  public void setCorrectGuesses(int correctGuesses) {
    this.correctGuesses = correctGuesses;
  }
}
