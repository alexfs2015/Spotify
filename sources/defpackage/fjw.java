package defpackage;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: fjw reason: default package */
public final class fjw<E> extends fjh<Object> {
    public static final fji a = new fji() {
        public final <T> fjh<T> a(fix fix, fko<T> fko) {
            Type type = fko.b;
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type d = C$Gson$Types.d(type);
            return new fjw(fix, fix.a(fko.a(d)), C$Gson$Types.b(d));
        }
    };
    private final Class<E> b;
    private final fjh<E> c;

    public fjw(fix fix, fjh<E> fjh, Class<E> cls) {
        this.c = new fki(fix, fjh, cls);
        this.b = cls;
    }

    public final Object a(fkp fkp) {
        if (fkp.f() == JsonToken.NULL) {
            fkp.k();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        fkp.a();
        while (fkp.e()) {
            arrayList.add(this.c.a(fkp));
        }
        fkp.b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final void a(fkq fkq, Object obj) {
        if (obj == null) {
            fkq.e();
            return;
        }
        fkq.a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.a(fkq, Array.get(obj, i));
        }
        fkq.b();
    }
}
