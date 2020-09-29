package defpackage;

import java.io.File;

/* renamed from: xdk reason: default package */
public final class xdk {
    private static final char a = File.separatorChar;

    static {
        Character.toString('.');
    }

    static boolean a() {
        return a == '\\';
    }
}
