package app.we.go.log;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * {@link java.util.logging.Logger}-based logger that provides the same API as the android Logger
 * from the library app-we-go_log-android (supports building messages using formatted strings
 * and vararg parameters).
 * The following correspondece of levels is established:
 * <ul>
 *     <li>v -> FINEST</li>
 *     <li>d -> FINE</li>
 *     <li>i -> INFO</li>
 *     <li>w -> WARN</li>
 *     <li>e -> SEVERE</li>
 *     <li>wtf -> SEVERE</li>
 * </ul>
 * <p>
 */
public class LOG {

    private static boolean enabled;

    public static void enable() {
        enabled = true;
    }

    public static void v(String tag, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.FINEST, msg, params);
        }
    }

    public static void v(String tag, Throwable tr, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.FINEST, String.format(msg, params), tr);
        }
    }

    public static void d(String tag, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.FINE, msg, params);
        }
    }

    public static void d(String tag, Throwable tr, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.FINE, String.format(msg, params), tr);
        }
    }

    public static void i(String tag, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.INFO, msg, params);
        }
    }

    public static void i(String tag, Throwable tr, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.INFO, String.format(msg, params), tr);
        }
    }

    public static void w(String tag, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.WARNING, msg, params);
        }
    }

    public static void w(String tag, Throwable tr, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.WARNING, String.format(msg, params), tr);
        }
    }

    public static void e(String tag, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.SEVERE, msg, params);
        }
    }

    public static void e(String tag, Throwable tr, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.SEVERE, String.format(msg, params), tr);
        }
    }

    public static void wtf(String tag, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.SEVERE, msg, params);
        }
    }

    public static void wtf(String tag, Throwable tr, String msg, Object... params) {
        if (enabled) {
            getLogger(tag).log(Level.SEVERE, String.format(msg, params), tr);
        }
    }

    private static Logger getLogger(String tag) {
        return Logger.getLogger(tag);
    }

}
