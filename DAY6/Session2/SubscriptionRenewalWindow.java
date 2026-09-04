package DAY6.Session2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SubscriptionRenewalWindow {
    public static int longestWindow(List<Integer>days , int k){
        int left = 0;
        int maxLength = 0;
        for (int right =0 ; right<days.size(); right++){
            if(days.get(right) - days.get(left)>k){
                left++;
            }
            maxLength = Math.max(maxLength , right-left +1);
        }
        return maxLength;

    }

    public static void main(String[] args){
        List<Integer>days = new ArrayList<>();
        days = Arrays.asList(1,3,5,7,9);
    }
    
}
