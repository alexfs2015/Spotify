package defpackage;

import com.google.gson.internal.LinkedTreeMap;
import java.util.ArrayList;

/* renamed from: fjj reason: default package */
public final class fjj extends fin<Object> {
    public static final fio a = new fio() {
        public final <T> fin<T> a(fid fid, fju<T> fju) {
            if (fju.a == Object.class) {
                return new fjj(fid);
            }
            return null;
        }
    };
    private final fid b;

    fjj(fid fid) {
        this.b = fid;
    }

    public final Object a(fjv fjv) {
        switch (fjv.f()) {
            case BEGIN_ARRAY:
                ArrayList arrayList = new ArrayList();
                fjv.a();
                while (fjv.e()) {
                    arrayList.add(a(fjv));
                }
                fjv.b();
                return arrayList;
            case BEGIN_OBJECT:
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                fjv.c();
                while (fjv.e()) {
                    linkedTreeMap.put(fjv.h(), a(fjv));
                }
                fjv.d();
                return linkedTreeMap;
            case STRING:
                return fjv.i();
            case NUMBER:
                return Double.valueOf(fjv.l());
            case BOOLEAN:
                return Boolean.valueOf(fjv.j());
            case NULL:
                fjv.k();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public final void a(fjw fjw, Object obj) {
        if (obj == null) {
            fjw.e();
            return;
        }
        fin a2 = this.b.a(obj.getClass());
        if (a2 instanceof fjj) {
            fjw.c();
            fjw.d();
            return;
        }
        a2.a(fjw, obj);
    }
}
