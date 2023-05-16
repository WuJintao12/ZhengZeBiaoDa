package test;

import java.util.Scanner;

public class main {
    public boolean selectBiaoDaShi(String BiaoDaShi){
        return true;
    }

    public static void main(String[] args) {
        String e_qq="[1-9][0-9]{5,14}";
        String e_tel="1[3-9][0-9]{8}";
        String e_email="\\S{5,10}@\\S{2,7}[.]com";
        String num;
        int temp;
        Scanner san=new Scanner(System.in);
        while(true){
            System.out.println("校验的类型");
            System.out.println("1.QQ号码\n2.电话号码\n3.邮箱\n4.退出");
            temp=san.nextInt();
            switch (temp){
                case 1:
                    System.out.println("请输入QQ");
                    num=san.next();
                    System.out.println(num.matches(e_qq)?"正确":"错误");
                    break;
                case 2:
                    System.out.println("请输入电话号码");
                    num=san.next();
                    System.out.println(num.matches(e_tel)?"正确":"错误");
                    break;
                case 3:
                    System.out.println("请输入邮箱");
                    num=san.next();
                    System.out.println(num.matches(e_email)?"正确":"错误");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("输入错误");
            }
            System.out.println("*******************");
        }
    }
}
