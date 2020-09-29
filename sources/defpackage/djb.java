package defpackage;

import java.util.HashMap;

/* renamed from: djb reason: default package */
public final class djb extends dho<Integer, Long> {
    public Long a;
    public Long b;

    public djb() {
    }

    public djb(String str) {
        a(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.a);
        hashMap.put(Integer.valueOf(1), this.b);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        HashMap b2 = b(str);
        if (b2 != null) {
            this.a = (Long) b2.get(Integer.valueOf(0));
            this.b = (Long) b2.get(Integer.valueOf(1));
        }
    }
}
