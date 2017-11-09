package com.mapleslong.utils.log;

import android.text.TextUtils;
import android.util.Log;

/**
 * 创建时间: 2016/11/4 16:08
 * 类描述: 日志基础类
 *
 * @author 枫叶
 * @version 1.0
 */
public class BaseLog implements LogConstant {
    protected static void printLine(String tag, boolean isTop) {
        if (isTop) {
            Log.d(tag,
                    "╔═══════════════════════════════════════════════════════════════════════════════════════");
        } else {
            Log.d(tag,
                    "╚═══════════════════════════════════════════════════════════════════════════════════════");
        }
    }

    protected static boolean isEmpty(String line) {
        return TextUtils.isEmpty(line) || line.equals("\n") || line.equals("\t") || TextUtils.isEmpty(line.trim());
    }

    public static void printDefault(int type, String tag, String msg) {
        switch (type) {
            case V:
                Log.v(tag, msg);
                break;
            case D:
                Log.d(tag, msg);
                break;
            case I:
                Log.i(tag, msg);
                break;
            case W:
                Log.w(tag, msg);
                break;
            case E:
                Log.e(tag, msg);
                break;
            case A:
                Log.wtf(tag, msg);
                break;
        }
    }
}
