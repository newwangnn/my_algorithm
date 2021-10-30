package cn.wnn.base.day01;

public class MyArrayDiffNum {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6,2,3,4,7,6};
//        在一个数组中存在两个不同的数a和b，出现的次数都是奇数次，其它的数出现的都是偶数次，求这两个不同的奇数次数是什么数？
        int eor=0;  //相当于a^b
        for (int i = 0; i < arr.length; i++) {
            eor^=arr[i];
        }
        int eor2=eor&(~eor+1);//获取二进制形式的最右端的1,作为过滤条件
        int oneNum=0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]&eor2)==0)  //将最右端不为1的数做无进位相加，就得到其中一个奇数
                oneNum^=arr[i];
        }
        //用两奇数的无进位相加结果与其中一个奇数做无进位相加就得到另一个奇数
        System.out.println(oneNum+"--"+(eor^oneNum));
    }

}
