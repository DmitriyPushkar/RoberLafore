package LeetCode.BinarySearch;

public class FindSmallestLetter744 {
    public static char nextGreatestLetter(char[] letters, char target) {
            int lowerBound=0;
            int upperBound=letters.length-1;
            int mid;
            while(lowerBound<=upperBound){
                mid=(lowerBound+upperBound)/2;
                if(target>letters[mid]){
                    lowerBound=mid+1;

                }else if(target<letters[mid]){
                    upperBound=mid-1;
                }
                else{
                    lowerBound=mid+1;
                }
            }
            return letters[lowerBound%letters.length];

        }

    public static void main(String[] args) {
        char[] arr=new char[5];
        arr[0]='a';
        arr[1]='b';
        arr[2]='c';
        arr[3]='d';
        System.out.println(nextGreatestLetter(arr,'h'));
    }
}
