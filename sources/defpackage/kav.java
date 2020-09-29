package defpackage;

import java.util.List;

/* renamed from: kav reason: default package */
public final class kav {
    final long a;
    final long b;
    final ayd c;
    final long d;
    final long e;
    final aqe f;
    final List<String> g;
    final String h;
    private final String i;

    public kav(long j, aqe aqe, int i2, List<String> list, String str, String str2, long j2, long j3) {
        ayd ayd;
        this.e = j;
        this.f = aqe;
        this.g = list;
        this.h = str;
        this.i = str2;
        this.d = j2;
        this.a = j2 * 1000000;
        this.b = apv.b(j3);
        if (kbf.a(aqe.f)) {
            ayd = null;
        } else {
            String str3 = (String) fay.a(aqe.e);
            ayd = new ayd(str3.startsWith("video/webm") || str3.startsWith("audio/webm") ? new atm() : new atx(), i2, aqe);
        }
        this.c = ayd;
    }

    public final int a() {
        return (int) bdw.a(this.b, this.a);
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
        if (a2 == -1) {
            return i2;
        }
        return Math.min(i2, a2 - 1);
    }

    public final fao b(long j) {
        String str = "{{profile_id}}";
        String str2 = "{{segment_timestamp}}";
        fao fao = new fao(this.i.replace(str, String.valueOf(this.e)).replace(str2, String.valueOf(j * this.d)), 0, -1);
        return fao;
    }
}
