/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author: Cyrus Majd
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {

    public static void main(String[] args) {

		int size = Integer.parseInt(args[0]);
		
		boolean[][] a = new boolean[size][size];
		
		//calculate the power of 2 that makes size:
		/* Testing my horrible log skills:
		double meme = Math.log(size);
		double meme2 = Math.log(2.0);
		double meme3 = meme1/meme2;
		
		System.out.println("YAYEET: " + meme1 + " " + meme2 + " " + meme3);
		*/
		
		double sizeLog;
		double baseLog;
		double resultLog;
		String display = "";
		
		//System.out.println(1%2);
		//System.out.println("");
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				if (j % 2 == 0 || i % 2 == 0) {
					a[i][j] = true;
				}
				else{
					a[i][j] = false;
				}
				//(size > 2)
				//(a[i][j] = !a[i-(size/2)][j-(size/2)])
				
				sizeLog = Math.log(size);
				baseLog = Math.log(2.0);
				resultLog = sizeLog/baseLog;
				
				if (size%2 == 0) {
					/*if (((((j >= (int) resultLog)) && ((i >= (int) resultLog))))) {
						a[i][j] = !a[i][j];
					}*/
					if (((((j >= (int) size/2)) && ((i >= (int) size/2))))) {
					a[i][j] = !a[i][j];
					}
				}
				else {
					/*if (((((j > (int) resultLog)) && ((i > (int) resultLog))))) {
						a[i][j] = !a[i][j];
					}*/
					if (((((j > (int) size/2)) && ((i > (int) size/2))))) {
					a[i][j] = !a[i][j];
					System.out.print("FLIP 2");
					}
				}
				
				if ((size == 2) && (i == 1) && (j == 1)) {
					a[i][j] = false;
				}
				
				if (a[i][j] == true) {
					display = "T";
				}
				else if (a[i][j] == false) {
					display = "F";
				}
				
				System.out.print(display + " ");
			}
			System.out.println();
			System.out.println();
		}
		
		//T T T T
		//T F T F
		//T T F F
		//T F F T
		
		//every one where at least one of the coords is even it is true, otherwise false. with the exception of the last segment, which is a
		//inverse of the other three boxes.
		
    }
}
