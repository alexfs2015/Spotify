package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: gzz reason: default package */
public interface gzz {

    /* renamed from: gzz$a */
    public static abstract class a {
        public abstract a a(gzq gzq);

        public abstract a a(gzt gzt);

        public abstract a a(String str);

        public abstract a a(String str, Serializable serializable);

        public abstract a a(List<? extends gzt> list);

        public abstract a a(gzt... gztArr);

        public abstract gzz a();

        public abstract a b(gzq gzq);

        public abstract a b(String str);

        public abstract a b(List<? extends gzt> list);

        public abstract a b(gzt... gztArr);

        public abstract a c(String str);

        public abstract a c(List<? extends gzt> list);

        public abstract a c(gzt... gztArr);
    }

    List<? extends gzt> body();

    gzq custom();

    String extension();

    gzt header();

    String id();

    List<? extends gzt> overlays();

    String title();

    a toBuilder();
}
