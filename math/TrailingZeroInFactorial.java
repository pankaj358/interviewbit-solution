public class TrailingZeroInFactorial
{
  public int trailingZero(int N)
  {
    int count = 0;
    while( N > 0)
    {
       int t = N/5;
       count +=5;
       N /=5;
    }

     return count;
  }
}
