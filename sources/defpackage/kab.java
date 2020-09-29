package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.Map;

/* renamed from: kab reason: default package */
public abstract class kab {

    /* renamed from: kab$a */
    public static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract Map<String, String> a();

        public abstract a a(String str);

        public abstract a a(Map<String, String> map);

        public abstract a a(boolean z);

        public abstract a b(boolean z);

        /* access modifiers changed from: 0000 */
        public abstract kab b();

        public final kab c() {
            a((Map<String, String>) ImmutableMap.a(a()));
            kab b = b();
            String c = b.c();
            fbp.b(!(c == null || c.length() == 0), "Media url must be set");
            return b;
        }
    }

    public static a e() {
        return new a().a(Collections.emptyMap());
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract String c();

    public abstract Map<String, String> d();
}
