/**
 * StringBuffer:
 * 修改：StringBuffer replace(start,end,string)；
 * void setCharAt(int index,char ch)
 *
 * JDK1.5版本后出现了StringBuilder
 * StringBuffer 线程同步
 * StrinfBuilder 线程不同步
 */


public class StringBufferDemo {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("0").append("1").append(2).append(3);
        sop(sb.toString());


        //sb.deleteCharAt(0);
      //  sb.delete(0,3);//delete(index start,index end)包含start，不包含end；
        sop(sb.toString());
        //sb.delete(0,sb.length());//清空缓冲区
        System.out.println(sb.indexOf("5"));//寻找相同的字符串
        String ts = sb.substring(0,2);//不包含end
        sop(ts);

    }

    public static void sop(String str)
    {
        System.out.println(str);
    }
}
