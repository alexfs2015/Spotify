package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ryc reason: default package */
public final class ryc {
    private final Map<Class<? extends rxz>, Map<Class<? extends rxz>, ryb>> a;

    /* renamed from: ryc$a */
    public static class a {
        final Map<Class<? extends rxz>, Map<Class<? extends rxz>, ryb>> a = new HashMap();

        public final a a(Class<? extends rxz> cls, Class<? extends rxz> cls2, ryb ryb) {
            Map map = (Map) this.a.get(cls);
            if (map == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(cls2, ryb);
                this.a.put(cls, hashMap);
            } else {
                map.put(cls2, ryb);
            }
            return this;
        }

        public final ryc a() {
            return new ryc(this, 0);
        }
    }

    /* synthetic */ ryc(a aVar, byte b) {
        this(aVar);
    }

    private ryc(a aVar) {
        this.a = aVar.a;
    }

    public final ryb a(rxz rxz, rxz rxz2) {
        Map map = (Map) this.a.get(rxz.getClass());
        if (map == null) {
            return null;
        }
        return (ryb) map.get(rxz2.getClass());
    }
}
