import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        List<Integer> list = new ArrayList<Integer>();        
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int sum = numbers[i] + numbers[j];
                list.add(sum);
                //System.out.println(numbers[i] +"+" + numbers[j] +"="+sum);
            }
        }
        
        
        
        List<Integer>lists = list.stream().distinct().collect(Collectors.toList());
        
        
        lists.sort(Comparator.naturalOrder());
        
        answer = lists.stream()
                    .mapToInt(i -> i)
                    .toArray();
        
        System.out.println(lists);
        return answer;
    }
}