package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: hcs reason: default package */
public interface hcs {

    /* renamed from: hcs$a */
    public static abstract class a {
        public abstract a a(hcj hcj);

        public abstract a a(hcm hcm);

        public abstract a a(String str);

        public abstract a a(String str, Serializable serializable);

        public abstract a a(List<? extends hcm> list);

        public abstract a a(hcm... hcmArr);

        public abstract hcs a();

        public abstract a b(hcj hcj);

        public abstract a b(String str);

        public abstract a b(List<? extends hcm> list);

        public abstract a b(hcm... hcmArr);

        public abstract a c(String str);

        public abstract a c(List<? extends hcm> list);

        public abstract a c(hcm... hcmArr);
    }

    List<? extends hcm> body();

    hcj custom();

    String extension();

    hcm header();

    String id();

    List<? extends hcm> overlays();

    String title();

    a toBuilder();
}
