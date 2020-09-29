package defpackage;

import java.util.HashMap;

/* renamed from: diq reason: default package */
public final class diq extends dho<Integer, Long> {
    public long a;
    public long b;

    public diq() {
        this.a = -1;
        this.b = -1;
    }

    public diq(String str) {
        this();
        a(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), Long.valueOf(this.a));
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        HashMap b2 = b(str);
        if (b2 != null) {
            this.a = ((Long) b2.get(Integer.valueOf(0))).longValue();
            this.b = ((Long) b2.get(Integer.valueOf(1))).longValue();
        }
    }
}
