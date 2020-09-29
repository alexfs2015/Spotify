package defpackage;

import java.io.Serializable;

/* renamed from: hci reason: default package */
public interface hci {

    /* renamed from: hci$a */
    public static abstract class a {
        public abstract a a(hcj hcj);

        public abstract a a(String str);

        public abstract a a(String str, Serializable serializable);

        public abstract hci a();

        public abstract a b(hcj hcj);
    }

    hcj data();

    String name();

    a toBuilder();
}
