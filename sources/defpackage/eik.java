package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: eik reason: default package */
public final class eik {
    public static final g<ehs> a = new g<>();
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
        eic.b("com.google.cast.multizone");
    }
}
