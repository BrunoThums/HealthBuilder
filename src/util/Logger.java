/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author bbt-1
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Logger {

    /**
     * Logs an error
     *
     * @param clazz
     * @param message
     * @param thrown
     */
    public static void error(Class clazz, String message, Throwable thrown) {
        error(clazz, message, thrown, null);
    }

    /**
     * Logs an error and optionally closes the app
     *
     * @param clazz
     * @param message
     * @param thrown
     * @param exitcode if not null closes the app
     */
    public static void error(Class clazz, String message, Throwable thrown, Integer exitcode) {
        String msg = getDate() + ' ' + clazz.getName() + '\n';

        msg += "ERROR: " + thrown.getClass().getName() + '\n';

        if (message != null) {
            msg += message + '\n';
        }

        if (thrown.getMessage() != null) {
            msg += "> " + thrown.getMessage().replace("\n", "\n> ") + '\n';
        }

        msg += stackTraceToString(thrown.getStackTrace());

        System.err.println(msg);

        if (exitcode != null) {
            System.exit(exitcode);
        }
    }

    private static String getDate() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
        return dateFormat.format(date);
    }

    private static String stackTraceToString(StackTraceElement[] elements) {
        StringBuilder message = new StringBuilder();

        for (int i = 1; i < elements.length; i++) {
            StackTraceElement line = elements[i];

            message.append(String.format("\tat %s.%s(%s:%s)\n",
                    line.getClassName(),
                    line.getMethodName(),
                    line.getFileName(),
                    line.getLineNumber()
            ));
        }

        return message.toString();
    }

}