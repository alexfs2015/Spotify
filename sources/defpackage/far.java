package defpackage;

import java.nio.charset.Charset;

/* renamed from: far reason: default package */
public final class far {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("ISO-8859-1");
    public static final Charset c = Charset.forName("UTF-8");
    public static final Charset d = Charset.forName("UTF-16");

    static {
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
    }
}
