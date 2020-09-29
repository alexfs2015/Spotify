package defpackage;

import java.util.List;

/* renamed from: kcv reason: default package */
public final class kcv {
    final long a;
    final long b;
    final ayu c;
    final long d;
    final long e;
    final aqv f;
    final List<String> g;
    final String h;
    private final String i;

    public kcv(long j, aqv aqv, int i2, List<String> list, String str, String str2, long j2, long j3) {
        ayu ayu;
        this.e = j;
        this.f = aqv;
        this.g = list;
        this.h = str;
        this.i = str2;
        this.d = j2;
        this.a = j2 * 1000000;
        this.b = aqm.b(j3);
        if (kdf.a(aqv.f)) {
            ayu = null;
        } else {
            String str3 = (String) fbp.a(aqv.e);
            ayu = new ayu(str3.startsWith("video/webm") || str3.startsWith("audio/webm") ? new aud() : new auo(), i2, aqv);
        }
        this.c = ayu;
    }

    public final int a() {
        return (int) ben.a(this.b, this.a);
    }

    public final int a(long j) {
        int a2 = a();
        if (a2 == 0) {
            return 0;
        }
        int i2 = (int) (j / this.a);
        if (i2 < 0) {
            return 0;
        }
        return a2 == -1 ? i2 : Math.min(i2, a2 - 1);
    }

    public final fbf b(long j) {
        String str = "{{profile_id}}";
        String str2 = "{{segment_timestamp}}";
        fbf fbf = new fbf(this.i.replace(str, String.valueOf(this.e)).replace(str2, String.valueOf(j * this.d)), 0, -1);
        return fbf;
    }
}
