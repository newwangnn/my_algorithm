package cn.wnn.base.day01;

public class MyFindBinaryOneCount {

    public static void main(String[] args) {
        //        0000 0100 对于未尾是1的二进制使用|或完成加1不成立，只能用加号
//                System.out.println(~4+1);
//                System.out.println(~4|1);

        int num = 5 ;

//        System.out.println(Integer.toBinaryString(num));
//        showNumBinary(num);

//        找出1个整数的二进制有多少个1
        int count = findBinary(num);
        System.out.println("count:"+count);
    }

    private static int findBinary(int num) {

        int count =0 ;
         int result=0;
        int numTemp =0;
        for (int i = 0; i < 31&& num!=0; i++) {
            showNumBinary("orign::",num);
             numTemp = ~num+1;
            showNumBinary("reverse",numTemp);
            result=  num&numTemp;
            showNumBinary("result:",result);
            if(result!=0){
                count++;
                result=~result;
                num=num&result;
            }
            System.out.println("-----------------");
        }
        return count;
    }

    //显示一个整数的二进制数样貌
    private static void showNumBinary(String mark,int num) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <31 ; i++) {
            sb.append((num&(1<<i))==0?'0':"1");
        }
        String s = sb.reverse().toString();
        System.out.println(mark+"::"+s);
    }
}
