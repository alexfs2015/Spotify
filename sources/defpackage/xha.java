package defpackage;

import com.fasterxml.jackson.databind.ObjectWriter;

/* renamed from: xha reason: default package */
final class xha<T> implements xgd<T, xak> {
    private static final xaf a = xaf.a("application/json; charset=UTF-8");
    private final ObjectWriter b;

    xha(ObjectWriter objectWriter) {
        this.b = objectWriter;
    }

    public final /* synthetic */ Object a(Object obj) {
        return xak.a(a, this.b.writeValueAsBytes(obj));
    }
}
