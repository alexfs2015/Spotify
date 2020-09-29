package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* renamed from: xgj reason: default package */
final class xgj extends defpackage.xgd.a {
    static final defpackage.xgd.a a = new xgj();

    /* renamed from: xgj$a */
    static final class a<T> implements xgd<xam, Optional<T>> {
        private xgd<xam, T> a;

        a(xgd<xam, T> xgd) {
            this.a = xgd;
        }

        public final /* synthetic */ Object a(Object obj) {
            return Optional.ofNullable(this.a.a((xam) obj));
        }
    }

    xgj() {
    }

    public final xgd<xam, ?> a(Type type, Annotation[] annotationArr, xgp xgp) {
        if (xgr.a(type) != Optional.class) {
            return null;
        }
        return new a(xgp.a((defpackage.xgd.a) null, xgr.a(0, (ParameterizedType) type), annotationArr));
    }
}
