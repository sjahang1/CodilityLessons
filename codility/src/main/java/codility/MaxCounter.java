package codility;
import static java.lang.Math.*;
import java.util.*;

public class MaxCounter {
	public int[] solution(int N, int[] A) {
		int[] arr = new int[N];
		int maxCounter = 0;
		
		for (int i=0; i<A.length; i++) {
			if(A[i] == N+1) {
				Arrays.fill(arr, maxCounter);
			}else {
				arr[A[i] -1 ] +=1;
				maxCounter = max(maxCounter,arr[A[i]-1]);
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		return arr;
	}

}
