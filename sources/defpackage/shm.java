package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: shm reason: default package */
public final class shm {
    private final Map<Class<? extends shj>, Map<Class<? extends shj>, shl>> a;

    /* renamed from: shm$a */
    public static class a {
        final Map<Class<? extends shj>, Map<Class<? extends shj>, shl>> a = new HashMap();

        public final a a(Class<? extends shj> cls, Class<? extends shj> cls2, shl shl) {
            Map map = (Map) this.a.get(cls);
            if (map == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(cls2, shl);
                this.a.put(cls, hashMap);
            } else {
                map.put(cls2, shl);
            }
            return this;
        }

        public final shm a() {
            return new shm(this, 0);
        }
    }

    private shm(a aVar) {
        this.a = aVar.a;
    }

    /* synthetic */ shm(a aVar, byte b) {
        this(aVar);
    }

    public final shl a(shj shj, shj shj2) {
        Map map = (Map) this.a.get(shj.getClass());
        if (map == null) {
            return null;
        }
        return (shl) map.get(shj2.getClass());
    }
}
