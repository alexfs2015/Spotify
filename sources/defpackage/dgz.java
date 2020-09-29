package defpackage;

import java.util.HashMap;

/* renamed from: dgz reason: default package */
public final class dgz extends dgx<Integer, Object> {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;

    public dgz() {
        String str = "E";
        this.a = str;
        this.b = -1;
        this.c = str;
        this.d = str;
        this.e = str;
    }

    public dgz(String str) {
        this();
        a(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.a);
        hashMap.put(Integer.valueOf(4), this.e);
        hashMap.put(Integer.valueOf(3), this.d);
        hashMap.put(Integer.valueOf(2), this.c);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        HashMap b2 = b(str);
        if (b2 != null) {
            String str2 = "E";
            this.a = b2.get(Integer.valueOf(0)) == null ? str2 : (String) b2.get(Integer.valueOf(0));
            this.b = b2.get(Integer.valueOf(1)) == null ? -1 : ((Long) b2.get(Integer.valueOf(1))).longValue();
            this.c = b2.get(Integer.valueOf(2)) == null ? str2 : (String) b2.get(Integer.valueOf(2));
            this.d = b2.get(Integer.valueOf(3)) == null ? str2 : (String) b2.get(Integer.valueOf(3));
            if (b2.get(Integer.valueOf(4)) != null) {
                str2 = (String) b2.get(Integer.valueOf(4));
            }
            this.e = str2;
        }
    }
}
