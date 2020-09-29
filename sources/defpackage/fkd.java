package defpackage;

import com.google.gson.internal.LinkedTreeMap;
import java.util.ArrayList;

/* renamed from: fkd reason: default package */
public final class fkd extends fjh<Object> {
    public static final fji a = new fji() {
        public final <T> fjh<T> a(fix fix, fko<T> fko) {
            if (fko.a == Object.class) {
                return new fkd(fix);
            }
            return null;
        }
    };
    private final fix b;

    fkd(fix fix) {
        this.b = fix;
    }

    public final Object a(fkp fkp) {
        switch (fkp.f()) {
            case BEGIN_ARRAY:
                ArrayList arrayList = new ArrayList();
                fkp.a();
                while (fkp.e()) {
                    arrayList.add(a(fkp));
                }
                fkp.b();
                return arrayList;
            case BEGIN_OBJECT:
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                fkp.c();
                while (fkp.e()) {
                    linkedTreeMap.put(fkp.h(), a(fkp));
                }
                fkp.d();
                return linkedTreeMap;
            case STRING:
                return fkp.i();
            case NUMBER:
                return Double.valueOf(fkp.l());
            case BOOLEAN:
                return Boolean.valueOf(fkp.j());
            case NULL:
                fkp.k();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public final void a(fkq fkq, Object obj) {
        if (obj == null) {
            fkq.e();
            return;
        }
        fjh a2 = this.b.a(obj.getClass());
        if (a2 instanceof fkd) {
            fkq.c();
            fkq.d();
            return;
        }
        a2.a(fkq, obj);
    }
}
