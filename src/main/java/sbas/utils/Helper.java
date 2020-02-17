package sbas.utils;

import org.joda.time.DateTime;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

public class Helper {

    public static String getStackTraceAsString(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

//    public static String executeCommand(String cmd) {
//        StringBuffer sout = new StringBuffer(), serr = new StringBuffer();
//        Process proc = cmd.execute();
//        proc.consumeProcessOutput(sout, serr);
//        proc.waitForOrKill(1000);
//    	println "out> $sout"
//    	println "err> $serr"
//        return sout.toString();
//    }

    public static DateTime createStartOfTheDay() {
        DateTime dt = new DateTime();
        dt = new DateTime(dt.getYear(), dt.getMonthOfYear(),
                dt.getDayOfMonth(), 0, 0, 0);
        return dt;
    }

    public static DateTime createEndOfTheDay() {
        DateTime dt = new DateTime();
        dt = new DateTime(dt.getYear(), dt.getMonthOfYear(),
                dt.getDayOfMonth(), 23, 59, 59);
        return dt;
    }

    public static DateTime createStartOfTheDay(Date date) {
        DateTime dt = new DateTime(date);
        dt = new DateTime(dt.getYear(), dt.getMonthOfYear(),
                dt.getDayOfMonth(), 0, 0, 0);
        return dt;
    }

    public static DateTime createEndOfTheDay(Date date) {
        DateTime dt = new DateTime(date);
        dt = new DateTime(dt.getYear(), dt.getMonthOfYear(),
                dt.getDayOfMonth(), 23, 59, 59);
        return dt;
    }

    public static DateTime createWithTimeOffFromNow() {
        DateTime dt = new DateTime();
        dt = new DateTime(dt.getYear(), dt.getMonthOfYear(),
                dt.getDayOfMonth(), 0, 0, 0);
        return dt;
    }

    public static DateTime createWithTimeOffFromDate(Date date) {
        DateTime dt = new DateTime(date);
        dt = new DateTime(dt.getYear(), dt.getMonthOfYear(),
                dt.getDayOfMonth(), 0, 0, 0);
        return dt;
    }

}
