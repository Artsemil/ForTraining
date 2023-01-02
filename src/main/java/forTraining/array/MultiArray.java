package forTraining.array;

import java.util.ArrayList;
import java.util.List;

public class MultiArray {
    public static void main(String[] args) {
//        int SIZE = 5;
//        int counter = 1;
//        int[][] graph = new int[SIZE][SIZE];
//
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                graph[i][j] = counter;
//                counter++;
//            }
//        }
//
//        int[] nums = new int[]{5, 4, 9, 4, 9, 5};
//        fix45(nums);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(3);


        if (list1.equals(list2)) System.out.println("Yes");
        else System.out.println("No");

    }


    public static int[] fix45(int[] nums) {
        int len = nums.length;
        List<Integer> afterFrourIndexs = new ArrayList<>();
        List<Integer> fiveIndexs = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                afterFrourIndexs.add(i + 1);
            }
            if (i == 0) {
                if (nums[i] == 5) {
                    fiveIndexs.add(i);
                }
            }
            if (i>0){
                if (nums[i] == 5 && nums[i - 1] != 4) {
                    fiveIndexs.add(i);
                }
            }
        }
        int fourAmount = afterFrourIndexs.size();
        for (int i = 0; i < fourAmount; i++) {
            nums[fiveIndexs.get(i)] = nums[afterFrourIndexs.get(i)];
            nums[afterFrourIndexs.get(i)] = 5;
        }
        return nums;
    }
}
