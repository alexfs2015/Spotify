package defpackage;

import java.lang.reflect.Type;

/* renamed from: wrz reason: default package */
final class wrz extends a {
    static final a a = new wrz();

    wrz() {
    }

    public final wrv<?, ?> a(Type type) {
        if (wsm.a(type) != wru.class) {
            return null;
        }
        final Type e = wsm.e(type);
        return new wrv<Object, wru<?>>() {
            public final /* bridge */ /* synthetic */ Object a(wru wru) {
                return wru;
            }

            public final Type a() {
                return e;
            }
        };
    }
}
