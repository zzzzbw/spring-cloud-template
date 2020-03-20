package cn.zzzbw.util;

/**
 * @author by zzzzbw
 * @since 2020/3/20 12:43
 */
public class SystemHelp {
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
        return isWindows() || isMac() || "dev".equals(System.getProperty("env"));
    }
}
