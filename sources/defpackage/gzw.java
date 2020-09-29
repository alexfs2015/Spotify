package defpackage;

import java.io.Serializable;

/* renamed from: gzw reason: default package */
public interface gzw {

    /* renamed from: gzw$a */
    public static abstract class a {
        public abstract a a(gzq gzq);

        public abstract a a(String str);

        public abstract a a(String str, Serializable serializable);

        public abstract gzw a();

        public abstract a b(gzq gzq);

        public abstract a b(String str);

        public final a a(Enum<?> enumR) {
            return b(gzo.a(enumR));
        }
    }

    gzq custom();

    String placeholder();

    a toBuilder();

    String uri();
}
