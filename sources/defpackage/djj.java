package defpackage;

import java.util.HashMap;

/* renamed from: djj reason: default package */
public final class djj extends dho<Integer, Long> {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;

    public djj() {
    }

    public djj(String str) {
        a(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.a);
        hashMap.put(Integer.valueOf(1), this.b);
        hashMap.put(Integer.valueOf(2), this.c);
        hashMap.put(Integer.valueOf(3), this.d);
        hashMap.put(Integer.valueOf(4), this.e);
        hashMap.put(Integer.valueOf(5), this.f);
        hashMap.put(Integer.valueOf(6), this.g);
        hashMap.put(Integer.valueOf(7), this.h);
        hashMap.put(Integer.valueOf(8), this.i);
        hashMap.put(Integer.valueOf(9), this.j);
        hashMap.put(Integer.valueOf(10), this.k);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        HashMap b2 = b(str);
        if (b2 != null) {
            this.a = (Long) b2.get(Integer.valueOf(0));
            this.b = (Long) b2.get(Integer.valueOf(1));
            this.c = (Long) b2.get(Integer.valueOf(2));
            this.d = (Long) b2.get(Integer.valueOf(3));
            this.e = (Long) b2.get(Integer.valueOf(4));
            this.f = (Long) b2.get(Integer.valueOf(5));
            this.g = (Long) b2.get(Integer.valueOf(6));
            this.h = (Long) b2.get(Integer.valueOf(7));
            this.i = (Long) b2.get(Integer.valueOf(8));
            this.j = (Long) b2.get(Integer.valueOf(9));
            this.k = (Long) b2.get(Integer.valueOf(10));
        }
    }
}
