package teststring;

/**
 * @author charwayh
 */
public class TestString {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        //str.charAt(int index)    根据传入的索引值返回相应的char值
        System.out.println("str.charAt(int index)提取指定字符");
        String str = "I like Java";
        //String str = "我爱爪蛙";
        System.out.println("字符串索引值3的位置的内容为: "+str.charAt(3));


        System.out.println("\n\n---------------------------------");
        //str1.contat(String str2)     String1的结尾再接着一个String2，如果String2含有内容则返回新的String,无内容则返回String1
        System.out.println("str1.contat(str2)   字符串结尾连接");
        String a = "I have a pen.";
        String b = "I have an apple.";
        System.out.println("字符串的连接结果为: "+a.concat(b));


        System.out.println("\n\n---------------------------------");
        //str1.contains(String str2)   String1中是否包含String2，返回boolean类型
        System.out.println("str.charAt(int index)提取指定字符");
        //String str = "我爱爪蛙";
        System.out.println("str中是否包含\"Java\": "+str.contains("Java"));

        System.out.println("\n\n---------------------------------");
        //str.copyValueOf(char[] data)      将字符串数组转变为字符串
        System.out.println("将字符数组变为字符串");
        char[] array = {'浦','东','图','书','馆'};
        String newString = String.copyValueOf(array);
        System.out.println("由字符数组转变的字符串为: "+newString);
        //第二个入参为起始索引，第三个入参为字符数
        String newString2 = String.copyValueOf(array,2,2);
        System.out.println("由字符数组转变的字符串为: "+newString2);


        System.out.println("\n\n---------------------------------");
        //str.endsWith(String endString)      判断是否以后缀字符串结束
        System.out.println("str是否以java结束: "+str.endsWith("Java"));


        System.out.println("\n\n---------------------------------");
        //str.equals(String str2)      判断字符串内容是否相同
        String str2 = "I like Java";
        System.out.println("str与str2是否与相等: "+str.equals(str2));
        //str.equals(String str3)      忽略大小写，判断字符串内容是否相同
        String str3 = "I like java";
        System.out.println("忽略大小写，str与str3是否与相等: "+str.equalsIgnoreCase(str3));

        //System.out.println("\n\n---------------------------------");
        //String.format(String str,Object...args)
        //转换符                说明
        //%b %B                boolean类型
        //%s %S                格式化为字符串类型
        //%c %C                格式化为字符类型
        //%d/%o/%x %X          格式化为十/八/十六进制
        //%e                   转化为科学计数法10进制
        //%h %H                格式化为散列码
        //%%                   结果为字面值%


        System.out.println("\n\n---------------------------------");
        //str.getBytes()        获取字符串的字节数组，返回byte[]
        byte[] bytes = str.getBytes();
        System.out.println("str对应的字节数组为: ");
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+" ");
        }


        System.out.println("\n\n---------------------------------");
        //str.getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)     获取字符串数组
        char[] dst = new char[10];
        //将字符串复制到dst数组中
        str.getChars(0,10,dst,0);
        System.out.println("str对应的字符数组为: ");
        for (int i = 0; i < dst.length; i++) {
            System.out.print(dst[i]);
        }


        System.out.println("\n\n---------------------------------");
        //str.hashCode()    返回字符串对应的hashcode
        System.out.println("str的hashCode为"+str.hashCode());

        /**
         * 未看完
         */
        System.out.println("\n\n---------------------------------");
        //str.indexOf(char[] ch)
        System.out.println("str的第一次出现'a'的索引为"+str.indexOf("a"));

        //str.lastIndexOf(char[] ch)
        System.out.println("str的最后出现'a'的索引为"+str.lastIndexOf("a"));


        System.out.println("\n\n---------------------------------");
        //创建两个内容相同的字符串
        String strCom = new String("I like java!!!");
        String strCom2 = new String("I like java!!!");
        //比较字符串内容
        System.out.println(strCom.equals(strCom2));
        //比较是否为同一个字符串
        System.out.println(strCom == strCom2);
        //当且仅当equals()为true时，inter()才为true
        System.out.println(strCom.intern() == strCom2.intern());


        System.out.println("\n\n---------------------------------");
        //str.isEmpty()     判断字符串是否为空 返回boolean类型
        System.out.println("str是否为空: "+str.isEmpty());


        System.out.println("\n\n---------------------------------");
        //str.length()      返回字符串长度 int
        System.out.println("str的字符串长度为: "+str.length());


        /**
         * 未看完
         */
        System.out.println("\n\n---------------------------------");
        //str.matches()     用来匹配此字符串的正则表达式


        System.out.println("\n\n---------------------------------");
        //str.replace(oldChar,newChar)      替换字符    返回String类型
        //将oldChar替换为newChar
        String strTest = "oldChar";
        System.out.println(strTest.replace("oldChar","newChar"));




    }
}
