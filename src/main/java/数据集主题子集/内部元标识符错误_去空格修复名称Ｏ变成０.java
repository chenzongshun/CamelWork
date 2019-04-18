package 数据集主题子集;

import scala.reflect.generic.Trees;

import java.util.ArrayList;
import java.util.List;

public class 内部元标识符错误_去空格修复名称Ｏ变成０
{
    public static void main (String[] args)
    {
        List<String> items = new ArrayList<> ();



        items.add (" HDSD00,02.025   ");
        items.add (" HDSDOO.02.035   ");
        items.add (" HD9D00.02.052   ");
        items.add (" HDSDOO,02.013   ");
        items.add (" HDSDOO.02.001   ");
        items.add (" HDSDOO.02.006   ");
        items.add (" HDSDOO.02.047   ");
        items.add (" HDSDOO.02.022   ");
        items.add (" HDSDOO,02.005   ");
        items.add (" HDSDOO.02.064   ");
        items.add (" HDSDOO.02.020   ");
        items.add (" HDSDOO.02.021   ");
        items.add (" HDSDOO.02.017   ");
        items.add (" HDSDOO.02.061   ");
        items.add (" HDSDOO.03.010   ");
        items.add (" HDSDOO.03.013   ");
        items.add (" HDSDOO.03.008   ");
        items.add (" MDSD00,04.029   ");
        items.add (" HDSD00.04.0H   ");
        items.add (" HDSDOO,04.026   ");
        items.add (" HDSDOO. 04.001   ");
        items.add (" HDSDOO.04.013   ");
        items.add (" HDSDOO.04.005   ");
        items.add (" HDSDOO.04.020   ");
        items.add (" HDSDOO.04.019   ");
        items.add (" MDSD00.04.023   ");
        items.add (" HDSDOO.04.021   ");
        items.add (" HDSDOO.04.025   ");
        items.add (" HDSDOO.04.026   ");
        items.add (" HDSDOO.04.028   ");
        items.add (" HDSDOO.04.030   ");
        items.add (" HDSDOO.05.043   ");
        items.add (" HDSDOO,05.067   ");
        items.add (" HDSDOO.06.104   ");
        items.add (" HDSDOO.06.074   ");
        items.add (" HDSDOO.06.075   ");
        items.add (" HDSDOO.06.080   ");
        items.add (" HDSDOO.06.040   ");
        items.add (" HDSDOO. 06.083   ");
        items.add (" HDSDOO.06.082   ");
        items.add (" HDSDOO.06.138   ");
        items.add (" HDSDOO.06.022   ");
        items.add (" HDSDOO.06.066   ");
        items.add (" HDSDOO.06.054   ");
        items.add (" HDSDOO.06.068   ");
        items.add (" HDSD00. 06.043   ");
        items.add (" HDSDOO. 06.056   ");
        items.add (" HDSD00.06.043   ");
        items.add (" HDSDOO.07.003   ");
        items.add (" HDSDOO.07.016   ");
        items.add (" HDSDOO.07.037   ");
        items.add (" HDSDOO.07.040   ");
        items.add (" HDSDOO.07.042   ");
        items.add (" HDSDOO.07.043   ");
        items.add (" HDSDOO.07.044   ");
        items.add (" HDSDOO.07.045   ");
        items.add (" HDSDOO.07.046   ");
        items.add (" HDSDOO.07.066   ");
        items.add (" HDSDOO.07.075   ");
        items.add (" HDSDOO.07.076   ");
        items.add (" HDSDOO. 07.003   ");
        items.add (" HDSDOO.07.119   ");
        items.add (" HDSDOO.07.120   ");
        items.add (" HDSDOO.07.121   ");
        items.add (" HDSDOO.07.125   ");
        items.add (" HDSDOO.08.091   ");
        items.add (" HDSDOO.08.017   ");
        items.add (" HDSDOO.08.052   ");
        items.add (" HDSDOO.08.042   ");
        items.add (" HDSDOO.08.040   ");
        items.add (" HDSDOO.08.006   ");
        items.add (" HDSDOO.08.005   ");
        items.add (" HDSDOO.08.004   ");
        items.add (" HDSDOO.08.063   ");
        items.add (" HDSDOO.08.043   ");
        items.add (" HDSDOO.08.044   ");
        items.add (" HDSDOO.08.076   ");
        items.add (" HDSDOO.08.001   ");
        items.add (" HDSDOO.08.064   ");
        items.add (" HDSDOO.08.048   ");
        items.add (" HDSDOO.08.029   ");
        items.add (" HDSDOO.08.031   ");
        items.add (" HDSD00.08.072   ");
        items.add (" HDSDOO.08.061   ");
        items.add (" HDSDOO.08.025   ");
        items.add (" HDSDOO.08.076   ");
        items.add (" HDSDOO.08.028   ");
        items.add (" HDSDOO.08.027   ");
        items.add (" HDSD00.1l.103   ");
        items.add (" HDSD00.1l.075   ");
        items.add (" HDSD00.ll.095   ");
        items.add (" HDSD00.ll.074   ");
        items.add (" HDSD00.ll.143   ");
        items.add (" HDSD00.ll.148   ");
        items.add (" HDSD00.ll.111   ");
        items.add (" HDSD00.14.066   ");
        items.add (" HDSD00.14.066   ");
        items.add (" HDSD00. 14.083   ");
        items.add (" HDSD00.16.01l   ");
        items.add ("    ");


        for (String str : items)
        {
            str = str.trim ();

            if (str.length () != 0){
                // 截取尾部
                String end = str.substring (4);
                // 空格
                end = end.replace (" ", "");
                // 替换0和，
                end = end.replace ("O", "0");
                end = end.replace (",", ".");
                end = end.replace ("，", ".");
                // H = 14
                end = end.replace ("H", "14");
                // l = 1
                end = end.replace ("l", "1");

                // 尾部的格式是否是int格式
                for (String s : end.replace (".", "-").split ("-"))
                {
                    try{new Integer (s);}catch (Exception e){
                        System.out.println ("------------" + str);
                    }
                }
                if(("HDSD"+end).length ()!=13){
                    System.out.println ("------------" + str);
                }else
                System.err.println ("HDSD"+end);
//                System.err.println (str);
            }

        }

    }
}
