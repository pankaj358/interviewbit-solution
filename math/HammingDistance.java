public class HammingDistance
{

  public int hammingDistance(final int []A)
  {
     long count = 0L;
     long ans = 0;

     long MOD = 1000000007L;

     for(int i = 0; i < 31; i++)
     {
        count = 0L;
        for(int j = 0; j < A.length; j++)
        {
           if((A[j] & (1 << i)) != 0) count++;
        }

        ans = (ans + count * (A.length - count) * 2) % MOD;
     }

     return (int)ans;
  }

}
