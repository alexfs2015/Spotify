package defpackage;

/* renamed from: eol reason: default package */
final class eol implements env {
    final enx a;
    final String b;
    final Object[] c;
    private final int d;

    eol(enx enx, String str, Object[] objArr) {
        this.a = enx;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.d = c2 | (charAt2 << i);
                return;
            }
        }
    }

    public final enx c() {
        return this.a;
    }

    public final int a() {
        return (this.d & 1) == 1 ? e.h : e.i;
    }

    public final boolean b() {
        return (this.d & 2) == 2;
    }
}
