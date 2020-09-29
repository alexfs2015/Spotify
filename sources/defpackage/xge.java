package defpackage;

import java.lang.reflect.Type;

/* renamed from: xge reason: default package */
final class xge extends a {
    static final a a = new xge();

    xge() {
    }

    public final xga<?, ?> a(Type type) {
        if (xgr.a(type) != xfz.class) {
            return null;
        }
        final Type e = xgr.e(type);
        return new xga<Object, xfz<?>>() {
            public final /* bridge */ /* synthetic */ Object a(xfz xfz) {
                return xfz;
            }

            public final Type a() {
                return e;
            }
        };
    }
}
