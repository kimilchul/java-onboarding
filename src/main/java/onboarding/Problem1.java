package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        return answer;
    }

    public static boolean isTwoPages(List<Integer> page){
        if(page.size()!=2)
            return false;
        return true;
    }


    public static boolean isPageNotEmpty(List<Integer> page){
        for(Integer i : page){
            if (i == null)
                return false;
        }
        return true;
    }

}