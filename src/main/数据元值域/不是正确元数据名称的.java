/**
 * 依据数据（湖南）科技有限公司 版权所有Copyright (C) 2012
 * <p>
 * $$Id$$
 * $$Revision$$
 * $$Author$$
 * $$Date$$
 */
package 数据源值域;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czs
 * @since 2019/4/16
 */
public class 不是正确元数据名称的
{
    public static void main (String[] args)
    {
        List<String> metanames = new ArrayList<> ();
        metanames.add ("02.10.103.00");
        metanames.add ("02.10.099.00");
        metanames.add ("08.50.056.00");
        metanames.add ("02.01.079.00");
        metanames.add ("04.50.135.00");
        metanames.add ("05.10.165.00");
        metanames.add ("08.50.057.00");
        metanames.add ("06.00.341.00");
        metanames.add ("02.01.039.0G");
        metanames.add ("06.00.340.00");
        metanames.add ("01.00.023.00");
        metanames.add ("04.10.265.00");
        metanames.add ("05.10.173.00");
        metanames.add ("01.0Q.026.00");
        metanames.add ("04.50.149.00");
        metanames.add ("06.00.291.00");
        metanames.add ("06.00.342.00");
        metanames.add ("06.00.338.00");
        metanames.add ("06.00.317.00");
        metanames.add ("08.50.023.G0");
        metanames.add ("08.50.058.00");
        metanames.add ("08.50.055.00");
        metanames.add ("08.50.035.00");
        metanames.add ("06.00.339.00");
        metanames.add ("09.00.117.00");
        metanames.add ("08.10.013.G0");
        metanames.add ("05.10.138.01");
        metanames.add ("05.10.138.02");
        metanames.add ("05.10.138.03");
        metanames.add ("06.00.343.00");
        metanames.add ("08.50.947.00");

        for (String str: metanames)
        {
            for (String temp : str.split ("."))
            {
                try{
                    new Integer (str);
                }catch (Exception e){
                    System.out.println (str);
                }
            }
        }
    }
}