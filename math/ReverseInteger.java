public class ReverseInteger
{
   public int reverse(int X)
   {
      int ans = 0;
      int limit = Integer.MAX_VALUE;

      boolean isNeg = false;
      if(X < 0) {
          isNeg = true;
          X *=-1;
       }
      
      while(X > 0)
      {
        int tmp = X % 10;
       
         if(limit <= 10L * ans){
            return 0;
         }

         ans = ans * 10 + tmp;
         X /=10;
      }

      if(isNeg) ans *=-1;

      return ans;
      
   }
}
