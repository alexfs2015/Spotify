package defpackage;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: fjc reason: default package */
public final class fjc<E> extends fin<Object> {
    public static final fio a = new fio() {
        public final <T> fin<T> a(fid fid, fju<T> fju) {
            Type type = fju.b;
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type d = C$Gson$Types.d(type);
            return new fjc(fid, fid.a(fju.a(d)), C$Gson$Types.b(d));
        }
    };
    private final Class<E> b;
    private final fin<E> c;

    public fjc(fid fid, fin<E> fin, Class<E> cls) {
        this.c = new fjo(fid, fin, cls);
        this.b = cls;
    }

    public final Object a(fjv fjv) {
        if (fjv.f() == JsonToken.NULL) {
            fjv.k();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        fjv.a();
        while (fjv.e()) {
            arrayList.add(this.c.a(fjv));
        }
        fjv.b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final void a(fjw fjw, Object obj) {
        if (obj == null) {
            fjw.e();
            return;
        }
        fjw.a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.a(fjw, Array.get(obj, i));
        }
        fjw.b();
    }
}
