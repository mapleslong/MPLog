package com.mapleslong.utils.log;

/**
 * 创建时间: 2016/11/4 16:05
 * 类描述: 日志常量
 *
 * @author 枫叶
 * @version 1.0
 */
public interface LogConstant {
    String DEFAULT_MESSAGE = "execute";
    String LINE_SEPARATOR = System.getProperty("line.separator");
    String NULL_TIPS = "Log with null object";
    int JSON_INDENT = 4;
    int V = 0x1;
    int D = 0x2;
    int I = 0x3;
    int W = 0x4;
    int E = 0x5;
    int A = 0x6;
    int JSON = 0x7;

}
