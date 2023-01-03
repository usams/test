import java.util.Scanner;
class DeterminanM{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int [][] matrik = new int [3][3];
		
			System.out.println("");
			System.out.println("\tOrdo matrikriks = 3X3");
			System.out.println("");
			System.out.println("Masukkan Elemen matrikriksnya : ");
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(" Elemen ["+(i+1)+","+(j+1)+"] = ");
					matrik[i][j] = input.nextInt();
				}
			}
			
			System.out.println("");
			for(int i=0;i<3;i++)
			{
				System.out.print("|");
				for(int j=0;j<3;j++)
				{
					System.out.print(" "+matrik[i][j]+" ");
				}
				System.out.println("|");
			}
			int dtre = ((matrik[0][0]*matrik[1][1]*matrik[2][2])+(matrik[0][1]*matrik[1][2]
				matrik[2][0])+(matrik[0][2])*matrik[1][0]*matrik[2][1])-
			((matrik[0][2]matrik[1][1]*matrik[2][0])+(matrik[0][0]*matrik[1][2]
				matrik[2][1])+(matrik[0][1]*matrik[1][0]*matrik[2][2]));
			System.out.println(" Determinan nya adalah = "+dtre);
	}
}