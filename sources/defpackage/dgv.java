package defpackage;

import java.nio.charset.Charset;

/* renamed from: dgv reason: default package */
public final class dgv {
    protected static final Charset a = Charset.forName("UTF-8");
    public static final Object b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    public static void a(dgr dgr, dgr dgr2) {
        if (dgr.Y != null) {
            dgr2.Y = (dgt) dgr.Y.clone();
        }
    }
}
