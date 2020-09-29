package defpackage;

import java.util.Map;

/* renamed from: gzs reason: default package */
public interface gzs {

    /* renamed from: gzs$a */
    public static abstract class a {
        public abstract a a(gzw gzw);

        public abstract a a(String str);

        public abstract a a(Map<String, ? extends gzw> map);

        public abstract gzs a();

        public abstract a b(gzw gzw);

        public final a a(defpackage.gzw.a aVar) {
            return a(aVar.a());
        }

        public final a a(Enum<?> enumR) {
            return a(gzo.a(enumR));
        }
    }

    gzw background();

    Map<String, ? extends gzw> custom();

    String icon();

    gzw main();

    a toBuilder();
}
