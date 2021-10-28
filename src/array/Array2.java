package array;

public class Array2 {


    public static void main(String[] args) {
        int []arr1=new int[3];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        display(arr1);

    }
    static  void display(int data[])
    {
        for(int a=0;a<data.length;a++)
        {
            System.out.println(data[a]);
        }
    }
}
