public class Main {
    public static int[] twoSum(int[] nums, int target) {
        int[] numarr = new int[2];
        for (int i = 0; i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++){
                int res = nums[i]+nums[j];
                if (res == target){
                    numarr[0]=i;
                    numarr[1]=j;
                }
            }
        }
        return numarr;
    }
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        int[] nums = new int[4];
//        int target = 9;
//        nums[0]=2;
//        nums[1]=7;
//        nums[2]=11;
//        nums[3]=15;
//        int[] res = new int[2];
//        res = twoSum(nums,target);
//        System.out.println("res[0]:"+res[0]+",res[1]:"+res[1]);
//    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);
//        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(4);
        ListNode res = addTwoNumbers(l1,l2);
        while (res!=null){
            System.out.println("node:"+res.val);
            res = res.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        ListNode head = new ListNode(0);
        ListNode lo = head;
        while (a!=null){
            lo.next = new ListNode(a.val);
            a = a.next;
            lo = lo.next;
        }
        int temp = 0;
        lo = head;
        while (b!=null){
            if (lo.next==null) {
                temp = b.val +temp;
                if (temp > 9){
                    lo.next = new ListNode(temp - 10);
                    temp = 1;
                }else{
                    lo.next = new ListNode(temp);
                    temp = 0;
                }
            }
            else{
                temp = b.val + lo.next.val+temp;
                if (temp > 9){
                    lo.next.val = temp - 10;
                    temp = 1;
                }else{
                    lo.next.val = temp;
                    temp = 0;
                }
            }
            b = b.next;
            lo = lo.next;
        }
        while (lo.next!=null && temp > 0 ){
            temp = temp + lo.next.val;
            if (temp > 9){
                lo.next.val = temp - 10;
                temp = 1;
            }
            else{
                lo.next.val = temp;
                temp = 0;
            }
            lo = lo.next;
        }
        if (temp > 0 ){
            lo.next = new ListNode(1);
        }
        return head.next;
    }

}

