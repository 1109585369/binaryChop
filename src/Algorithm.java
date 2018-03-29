/**
 * @Created with IntelliJ IDEA.
 * @author: Administrator
 * @Date: 2018/3/29
 * @Time: 11:06
 * To change this template use File | Settings | File Templates.
 */
public class Algorithm {
     //查找数组指定值的下标，没有返回-1
    static int binarySerach(int[] array,int key){
        int left=0;
        int right=array.length-1;
        while (left<=right){
            int mid=(left+right)/2;
              if(array[mid]==key){
                  return mid;
              }else if(array[mid]<key){
                  left=mid+1;
              }
              else{
                  right=mid-1;
              }
        }
        return -1;
    }

    static int findLastEqual(int [] arry,int key){
        int left=0;
        int right=arry.length-1;

        while (left<=right){
            int mid=(left+right)/2;
            if(arry[mid]<key){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if(right>=0&&arry[right]==key){
            return right;
        }
        return -1;
    }



    public static void main(String[] args) {
        int [] arry=new int[] {1,2,3};
        System.out.println(binarySerach(arry,3));

    }

    
}
