package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: gzt reason: default package */
public interface gzt {

    /* renamed from: gzt$a */
    public static abstract class a {
        public abstract a a(gzq gzq);

        public abstract a a(gzr gzr);

        public abstract a a(gzs gzs);

        public abstract a a(gzv gzv);

        @Deprecated
        public abstract a a(gzy gzy);

        public abstract a a(String str);

        public abstract a a(String str, gzp gzp);

        public abstract a a(String str, Serializable serializable);

        public abstract a a(String str, String str2);

        public abstract a a(List<? extends gzt> list);

        public abstract a a(Map<String, ? extends gzp> map);

        public abstract a a(gzt... gztArr);

        public abstract gzt a();

        public abstract a b(gzq gzq);

        public abstract a b(String str);

        public abstract a b(String str, Serializable serializable);

        public abstract a b(List<? extends gzt> list);

        public abstract a b(Map<String, ? extends gzp> map);

        public abstract a b(gzt... gztArr);

        public abstract a c(gzq gzq);

        public abstract a c(String str, Serializable serializable);

        public abstract a d(gzq gzq);

        public abstract a e(gzq gzq);

        public abstract a f(gzq gzq);

        public final a a(defpackage.gzv.a aVar) {
            return a(aVar.a());
        }

        public final a a(defpackage.gzs.a aVar) {
            return a(aVar.a());
        }

        public final a a(String str, defpackage.gzp.a aVar) {
            return a(str, aVar.a());
        }
    }

    List<? extends gzt> childGroup(String str);

    List<? extends gzt> children();

    gzr componentId();

    gzq custom();

    Map<String, ? extends gzp> events();

    String group();

    String id();

    gzs images();

    gzq logging();

    gzq metadata();

    @Deprecated
    gzy target();

    gzv text();

    a toBuilder();
}
