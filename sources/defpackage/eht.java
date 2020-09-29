package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: eht reason: default package */
public final class eht {
    public static final g<ehb> a = new g<>();
    public static boolean b = true;

    static {
        new g();
        new g();
        new g();
        new g();
        try {
            Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
        }
        ehl.b("com.google.cast.multizone");
    }
}
