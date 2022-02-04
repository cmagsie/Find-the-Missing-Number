//Cassia Magsie
//@date and version [TODO: date and version]
//CS245 Lab 1: Find the Missing Number
import java.util.Arrays;
public class Lab01 {
        public static int findMissingNum(int[] nums) {
                int i, j, findNum = 0, missingNum =-1;
                
                int countNum = nums.length;
                
                int max = nums[0];      
                for (i = 1; i < countNum; i++) 
                if (nums[i] > max)
                        max = nums[i];
                for(i = 0; i <= max; i++) {
                     findNum = 0; 
                     for(j = 0; j < countNum; j++) {
                           if(nums[j] == i)
                           findNum = 1;
                     }
                    if(findNum == 0)
                    missingNum=i;                      
                }
        return missingNum;
        }
        
        
        public static void main(String[] args) {
        int[] test1 = {2,5,7,6,1,3,0}; //returns 4
        System.out.println("The missing number: " + findMissingNum(test1));
 
        int[] test2 = {0,1}; //returns -1
        System.out.println("The missing number: " + findMissingNum(test2)); 
        
        int[] test3 = {5,3,4,2,1}; //returns 0
        System.out.println("The missing number: " + findMissingNum(test3)); 
        }
  
}