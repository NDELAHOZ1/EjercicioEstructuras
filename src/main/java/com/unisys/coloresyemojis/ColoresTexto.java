package com.unisys.coloresyemojis;

import java.util.HashMap;
import java.util.Map;

public class ColoresTexto {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static String ANSI_RESET = "\u001B[0m";

    public static Map<Integer, String> crearDiccionarioColores() {
        Map<Integer, String > map = new HashMap<>();
        map.put(0,ANSI_RESET);
        map.put(1,ANSI_YELLOW);
        map.put(2,ANSI_BLUE);
        map.put(3,ANSI_BLACK);
        map.put(4,ANSI_CYAN);
        map.put(5,ANSI_GREEN);
        map.put(6,ANSI_PURPLE);
        map.put(7,ANSI_RED);
        map.put(8,ANSI_WHITE);
        map.put(9,ANSI_YELLOW_BACKGROUND);
        map.put(10,ANSI_BLUE_BACKGROUND);
        map.put(11,ANSI_BLACK_BACKGROUND);
        map.put(12,ANSI_CYAN_BACKGROUND);
        map.put(13,ANSI_GREEN_BACKGROUND);
        map.put(14,ANSI_PURPLE_BACKGROUND);
        map.put(15,ANSI_RED_BACKGROUND);
        map.put(16,ANSI_WHITE_BACKGROUND);
        return map;
    }
}
