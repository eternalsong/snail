package cn.eternalsong.snail.htw.ex02;

import java.io.File;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 长歌
 * Date: 18-4-1
 * Time: 上午8:46
 * Description: 常量类
 */
public class Constants {
    public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "how-tomcat-works" + File.separator + "src"+File.separator+"main"+File.separator+"resources";

    public static final String CLASS_ROOT = System.getProperty("user.dir") + File.separator + "how-tomcat-works" + File.separator + "target"+File.separator+"classes";

    public static final String SHUTDOWN_COMMAND = "/SHUTDOWN";

    public static final String HEADER = "HTTP/1.1 200 OK\r\n "
            + "Content-Type: text/html\r\n"
            + "Date"+new Date()+"\r\n"
            + "\r\n";

}
