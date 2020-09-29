package defpackage;

import com.fasterxml.jackson.databind.ObjectWriter;

/* renamed from: wsv reason: default package */
final class wsv<T> implements wry<T, wme> {
    private static final wlz a = wlz.a("application/json; charset=UTF-8");
    private final ObjectWriter b;

    wsv(ObjectWriter objectWriter) {
        this.b = objectWriter;
    }

    public final /* synthetic */ Object a(Object obj) {
        return wme.a(a, this.b.writeValueAsBytes(obj));
    }
}
