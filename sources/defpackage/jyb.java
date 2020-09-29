package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.Map;

/* renamed from: jyb reason: default package */
public abstract class jyb {

    /* renamed from: jyb$a */
    public static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract Map<String, String> a();

        public abstract a a(String str);

        public abstract a a(Map<String, String> map);

        public abstract a a(boolean z);

        public abstract a b(boolean z);

        /* access modifiers changed from: 0000 */
        public abstract jyb b();

        public final jyb c() {
            a((Map<String, String>) ImmutableMap.a(a()));
            jyb b = b();
            String c = b.c();
            fay.b(!(c == null || c.length() == 0), "Media url must be set");
            return b;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract String c();

    public abstract Map<String, String> d();

    public static a e() {
        return new a().a(Collections.emptyMap());
    }
}
