package array;

public class Array3 {
    public static void main(String[] args) {

        int arr1[]=arr();

        for(int a=0;a<arr1.length;a++)
        {
            
            System.out.println(arr1[a]);
        }

    }
    static int [] arr()
    {
       int  data[]=new int[2];
       data[0]=1;
       data[1]=2;
        return data;

    }
}
