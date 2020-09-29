package defpackage;

import java.io.Serializable;

/* renamed from: hcp reason: default package */
public interface hcp {

    /* renamed from: hcp$a */
    public static abstract class a {
        public abstract a a(hcj hcj);

        public final a a(Enum<?> enumR) {
            return b(hch.a(enumR));
        }

        public abstract a a(String str);

        public abstract a a(String str, Serializable serializable);

        public abstract hcp a();

        public abstract a b(hcj hcj);

        public abstract a b(String str);
    }

    hcj custom();

    String placeholder();

    a toBuilder();

    String uri();
}
