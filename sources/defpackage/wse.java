package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* renamed from: wse reason: default package */
final class wse extends defpackage.wry.a {
    static final defpackage.wry.a a = new wse();

    /* renamed from: wse$a */
    static final class a<T> implements wry<wmg, Optional<T>> {
        private wry<wmg, T> a;

        public final /* synthetic */ Object a(Object obj) {
            return Optional.ofNullable(this.a.a((wmg) obj));
        }

        a(wry<wmg, T> wry) {
            this.a = wry;
        }
    }

    wse() {
    }

    public final wry<wmg, ?> a(Type type, Annotation[] annotationArr, wsk wsk) {
        if (wsm.a(type) != Optional.class) {
            return null;
        }
        return new a(wsk.a((defpackage.wry.a) null, wsm.a(0, (ParameterizedType) type), annotationArr));
    }
}
