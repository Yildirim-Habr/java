static class Modulo {
		static int modInverse(int A, int M) { // A = number, M = modulo
			
			return power(A, M - 2, M);
		}

		static int power(int x, int y, int M) {
			long xx = (long)x;
			xx %= M;
		    if (xx == 0) return 0;
		    long ret = 1L;
		    while (y > 0){
		        if (y % 2 == 1){  
		            ret *= xx;
		            ret %= M; 
		            y--;
		        }
		        xx *= xx; 
		        xx %= M; 
		        y >>= 1;
		    }
		    return (int)ret;
		}
	}
