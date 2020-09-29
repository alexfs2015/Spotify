package defpackage;

import java.io.Serializable;

/* renamed from: gzp reason: default package */
public interface gzp {

    /* renamed from: gzp$a */
    public static abstract class a {
        public abstract a a(gzq gzq);

        public abstract a a(String str);

        public abstract a a(String str, Serializable serializable);

        public abstract gzp a();

        public abstract a b(gzq gzq);
    }

    gzq data();

    String name();

    a toBuilder();
}
