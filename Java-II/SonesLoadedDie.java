public class SonesLoadedDie extends SonesDie{
    private static final int    MAX = 6;
    private static final int    MIN = 2;

    public SonesLoadedDie()
  {
    value = ((int)(Math.random() * 100) % MAX + MIN);
  }
}