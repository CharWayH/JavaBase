package IO;

import java.io.File;

/**
 * @author charwayh
 *
 * java.io包下
 * 文件和目录路径名的抽象表示形式
 * Java把电脑中的文件和文件夹(目录)封装为一个File类，可以使用File类对文件和文件夹进行操作
 * File类是一个与系统无关的类，任何操作系统都可以使用这个类的方法
 */
public class DemoFile {
    public static void main(String[] args) {
        //demo1();
        //demo2();
    }

    /**
     * String getAbsolutePath():获取File的绝对路径名
     * String getPath():获取文件的路径        toString就是调用此方法
     * String getName():获取File表示的文件或目录的名称
     * String getParent():获取文件上一级目录名
     * long length():获取文件的字节大小。    文件夹是没有大小的。如果路径不存在也返回0。
     */
    private static void demo1() {
        File file = new File("src/IO/testfile.txt");
        System.out.println("该文件的绝对路径:" + file.getAbsolutePath());
        System.out.println("该文件的相对路径:" + file.getPath());
        System.out.println("该文件名为:" + file.getName());
        System.out.println("该文件的上级目录路径:" + file.getParent());
        System.out.println("该文件的大小为:" + file.length() + "个字节");
        System.out.println("该文件上次修改的时间:" +file.lastModified());
    }

    /**
     * boolean exists():此file表示的文件或目录是否真实存在
     * boolean isDirectory():此file表示的是否为目录
     * boolean isFile():此file表示的是否为文件
     * boolean canRead():此file是否可读
     * boolean canWrite():此file是否可写
     */
    private static void demo2() {
        File file = new File("src/IO/testfile.txt");
        System.out.println("该文件是否存在:" + file.exists());
        System.out.println("该文件是否可读:" + file.canRead());
        System.out.println("该文件是否可写:" + file.canWrite());
        System.out.println("该文件是否是目录:" + file.isDirectory());
        System.out.println("该文件是否是文件:" + file.isFile());
    }


}
