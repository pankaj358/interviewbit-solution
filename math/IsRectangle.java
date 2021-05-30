public class IsRectangle
{
   public boolean isRectangle(int A, int B, int C, int D){

     if(A == B) return C == D;
     else if(A == C) return B == D;
     else if(A == D) return B == C;
     else return false;    
  
   }
}
