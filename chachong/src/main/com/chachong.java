package main.com;

import java.util.Scanner;

public class chachong {

        public static void main(String[] args)  {

<<<<<<< HEAD

            Scanner sc = new Scanner(System.in);//键盘接收原文的绝对路径

            System.out.println("请输入论文原文的绝对路径");
            String YuanwenLujing = sc.next();//原文的绝对路径放在这个字符串变量中
            String Ystr = TxtDemo.readTxt(YuanwenLujing);//内容存入Ystr中

            System.out.println("请输入抄袭论文的绝对路径");
            String ChaoxiLujing = sc.next();//抄袭论文的绝对路径放在这个字符串变量中
            String Cstr = TxtDemo.readTxt(ChaoxiLujing);//内容存入Cstr中

            String Ysimhash = Algorithm.getSimHash(Ystr);//获取原文内容的simHash值
            String Csimhash = Algorithm.getSimHash(Cstr);//获取抄袭论文的simHash值

            double result = Algorithm.getSimilarity(Ysimhash,Csimhash);//计算相似度

            System.out.println("请输入存放结果文件的绝对路径");
            String resultPath = sc.next();//抄袭论文的绝对路径放在这个字符串变量中

            TxtDemo.writeTxt(result,resultPath);

            //testMain.testAll(); // 这个函数可以测试全部
=======
           Scanner sc = new Scanner(System.in);//键盘接收原文的绝对路径

           System.out.println("请输入论文原文的绝对路径");
           String YuanwenLujing = sc.next();//原文的绝对路径放在这个字符串变量中
           String Ystr = TxtDemo.readTxt(YuanwenLujing);//内容存入Ystr中

           System.out.println("请输入抄袭论文的绝对路径");
           String ChaoxiLujing = sc.next();//抄袭论文的绝对路径放在这个字符串变量中
           String Cstr = TxtDemo.readTxt(ChaoxiLujing);//内容存入Cstr中

           String Ysimhash = Algorithm.getSimHash(Ystr);//获取原文内容的simHash值
           String Csimhash = Algorithm.getSimHash(Cstr);//获取抄袭论文的simHash值

           double result = Algorithm.getSimilarity(Ysimhash,Csimhash);//计算相似度

           System.out.println("请输入存放结果文件的绝对路径");
           String resultPath = sc.next();//抄袭论文的绝对路径放在这个字符串变量中

           TxtDemo.writeTxt(result,resultPath);

           //testMain.testAll(); // 这个函数可以测试全部
>>>>>>> f339c12471278b0d21fddac06ed093e8c2322b80

        }
}


