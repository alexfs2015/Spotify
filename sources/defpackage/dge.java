package defpackage;

import java.nio.charset.Charset;

/* renamed from: dge reason: default package */
public final class dge {
    protected static final Charset a = Charset.forName("UTF-8");
    public static final Object b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    public static void a(dga dga, dga dga2) {
        if (dga.Y != null) {
            dga2.Y = (dgc) dga.Y.clone();
        }
    }
}
