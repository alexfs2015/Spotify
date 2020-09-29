package com.spotify.music.internal.util.process;

public enum ProcessType {
    MAIN,
    GDBPROCESS,
    UNKNOWN;

    public static ProcessType a(String str) {
        if (str.contains("robolectric.ui")) {
            throw new AssertionError("this should not be necessary, please use TestingHelper instead");
        } else if (str.contains(".gdbprocess")) {
            return GDBPROCESS;
        } else {
            if (str.contains("com.spotify.music")) {
                return MAIN;
            }
            StringBuilder sb = new StringBuilder("The process name ");
            sb.append(str);
            sb.append(" is not allowed to start");
            throw new AssertionError(sb.toString());
        }
    }
}
