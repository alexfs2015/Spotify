package defpackage;

import com.google.common.base.Optional;

/* renamed from: jzx reason: default package */
public abstract class jzx {

    /* renamed from: jzx$a */
    public static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract Optional<Long> a();

        public abstract a a(Long l);

        public abstract a a(boolean z);

        /* access modifiers changed from: 0000 */
        public abstract jzx b();

        public final jzx c() {
            if (a().b()) {
                fbp.a(((Long) a().c()).longValue() >= 0, (Object) "Initial position must not be negative");
            }
            return b();
        }
    }

    public static a c() {
        return new a().a(true);
    }

    public abstract Optional<Long> a();

    public abstract boolean b();
}
