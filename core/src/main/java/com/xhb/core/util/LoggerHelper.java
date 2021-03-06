package com.xhb.core.util;

import android.util.Log;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.LogcatLogStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;
import com.xhb.core.BuildConfig;

/**
 * @author: xiaohaibin.
 * @time: 2018/6/26
 * @mail:xhb_199409@163.com
 * @github:https://github.com/xiaohaibin
 * @describe:
 */
public class LoggerHelper {

    private static boolean DEBUG = true;

    public static void initLogger(final boolean isDebug) {
        DEBUG=isDebug;
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(true)  // (Optional) Whether to show thread info or not. Default true
                .methodCount(0)         // (Optional) How many method line to show. Default 2
                .methodOffset(7)        // (Optional) Hides internal method calls up to offset. Default 5
                .logStrategy(new LogcatLogStrategy()) // (Optional) Changes the log strategy to print out. Default LogCat
                .tag("Enjoy")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy) {
            @Override
            public boolean isLoggable(int priority, String tag) {
                return DEBUG;
            }
        });
    }


    public static void d(String tag,String message,Object... args) {
        if (DEBUG) {
            Logger.t(tag).d(message,args);
        }
    }

    public static void d(String message, Object... args) {
        if (DEBUG) {
            Logger.d(message, args);
        }
    }

    public static void d(String tag,Object object) {
        if (DEBUG) {
            Logger.t(tag).d(object);
        }
    }

    public static void d(Object object) {
        if (DEBUG) {
            Logger.d(object);
        }
    }

    public static void e(String tag,String message, Object... args) {
        if (DEBUG) {
            Logger.t(tag).e(message,args);
        }
    }

    public static void e(String message, Object... args) {
        if (DEBUG) {
            Logger.e(null, message, args);
        }
    }


    public static void e(String tag,Throwable throwable, String message, Object... args) {
        if (DEBUG) {
            Logger.t(tag).e(throwable,message,args);
        }
    }

    public static void e(Throwable throwable, String message, Object... args) {
        if (DEBUG) {
            Logger.e(throwable, message, args);
        }
    }

    public static void i(String tag,String message, Object... args) {
        if (DEBUG) {
            Logger.t(tag).i(message,args);
        }
    }

    public static void i(String message, Object... args) {
        if (DEBUG) {
            Logger.i(message, args);
        }
    }

    public static void v(String tag,String message, Object... args) {
        if (DEBUG) {
            Logger.t(tag).v(message,args);
        }
    }


    public static void v(String message, Object... args) {
        if (DEBUG) {
            Logger.v(message, args);
        }
    }

    public static void w(String tag,String message, Object... args) {
        if (DEBUG) {
            Logger.t(tag).w(message,args);
        }
    }

    public static void w(String message, Object... args) {
        if (DEBUG) {
            Logger.w(message, args);
        }
    }


    public static void json(String json) {
        if (DEBUG) {
            Logger.json(json);
        }
    }

    public static void json(String tag,String json) {
        if (DEBUG) {
            Logger.t(tag).json(json);
        }
    }

}
