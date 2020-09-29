package defpackage;

import java.io.File;

/* renamed from: wpe reason: default package */
public final class wpe {
    private static final char a = File.separatorChar;

    static {
        Character.toString('.');
    }

    static boolean a() {
        return a == '\\';
    }
}
