public class SonesDie {

    //constants
    private static final int    MAX = 6;
    private static final int    MIN = 1;

    protected int value;


    public SonesDie()
  {
    value = ((int)(Math.random() * 100) % MAX + MIN);
  }

  public int getValue() {
    return value;
    }
  
  public void setValue(int value)
  {
    this.value = value;
  }
}