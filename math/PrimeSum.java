
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeSum
{

  public ArrayList<Integer> solve(int N)
  {
     boolean []visited = new boolean[N + 1];
     Arrays.fill(visited, true);
  
     if( N > 2) 
     {
        for(int i = 2; i < N; i++)
        {
           if(visited[i])
           {
             for(int j = i + i ; j <= N; j += i)
             {
               visited[j] = false;
             }
           }
        }
     }

    List<Integer> primes = new ArrayList<>();

    for(int i = 1; i < N; i++)
    {
       if(visited[i])
        primes.add(i);
    }

    int left = 0;
    int right = primes.size() - 1;

    while(left < right)
    { 
       int sum = primes.get(left) + primes.get(right);
       if(sum == N) 
       {
         return new ArrayList<Integer>(Arrays.asList(primes.get(left), primes.get(right)));
       }
       else if(sum > N)
       {
         right--;
       }
       else 
       {
          left++;
       }
    }

    return new ArrayList<Integer>();
      
  }

}
