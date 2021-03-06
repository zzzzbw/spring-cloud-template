package cn.zzzzbw.server.common.util;

/**
 * @author by zzzzbw
 * @since 2020/3/20 12:43
 */
public class SystemHelp {
    /**
     * 当前系统环境
     */
    public static String env() {
        return System.getProperty("env");
    }

    /**
     * 判断当前操作系统是否windows
     */
    public static boolean isWindows() {
        return System.getProperties().getProperty("os.name").toUpperCase().contains("WINDOWS");
    }

    /**
     * 判断当前操作系统是否mac
     */
    public static boolean isMac() {
        return System.getProperties().getProperty("os.name").toUpperCase().contains("MAC");
    }

    /**
     * 判定当前环境
     */
    public static boolean isDev() {
        return isWindows() || isMac() || "dev".equals(env());
    }
}
