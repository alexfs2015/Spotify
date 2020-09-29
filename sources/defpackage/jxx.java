package defpackage;

import com.google.common.base.Optional;

/* renamed from: jxx reason: default package */
public abstract class jxx {

    /* renamed from: jxx$a */
    public static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract Optional<Long> a();

        public abstract a a(Long l);

        public abstract a a(boolean z);

        /* access modifiers changed from: 0000 */
        public abstract jxx b();

        public final jxx c() {
            if (a().b()) {
                fay.a(((Long) a().c()).longValue() >= 0, (Object) "Initial position must not be negative");
            }
            return b();
        }
    }

    public abstract Optional<Long> a();

    public abstract boolean b();

    public static a c() {
        return new a().a(true);
    }
}
