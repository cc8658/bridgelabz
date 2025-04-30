public class Searching {

    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i< arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={2,5,3,7,9,45,34,78};
        int target=45;

        System.out.println("index of element: "+linearsearch(arr,target));
    }




}
