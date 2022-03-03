package Arrays;

public class TestWithArrays{
	public static void main(String args[]){
		int[][] arr = {{5,4,3,2,1,0}, {1,2,3,4,5,6}};
		for(int i = 0; i<arr.length; i++){
			System.out.println("Array"+(i+1));
			for(int j = 0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+" ");
			System.out.print("\n");
		}
	}
}
