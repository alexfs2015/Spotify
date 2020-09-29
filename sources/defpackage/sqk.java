package defpackage;

import com.google.common.base.Optional;

/* renamed from: sqk reason: default package */
public final class sqk {
    public final sqj a;
    public final sph b;
    public final lbg c;
    public final int d;
    public final sql e;

    private sqk(String str, sql sql, Optional<Integer> optional, sph sph, lbg lbg, int i) {
        this(optional.b() ? sqj.a(str, sql.a(), ((Integer) optional.c()).intValue()) : sqj.a(str, sql.a()), sph, lbg, 4, sql);
    }

    private sqk(sqj sqj, sph sph, lbg lbg, int i, sql sql) {
        this.a = (sqj) fbp.a(sqj);
        this.b = (sph) fbp.a(sph);
        this.c = (lbg) fbp.a(lbg);
        this.d = i;
        this.e = sql;
    }

    public static sqk a(sqj sqj, sph sph, lbg lbg) {
        sqk sqk = new sqk(sqj, sph, lbg, 20, sql.a(sqj.b()));
        return sqk;
    }

    public static sqk a(sql sql, sph sph, lbg lbg) {
        sqk sqk = new sqk("", sql, Optional.e(), sph, lbg, 4);
        return sqk;
    }

    public final int a() {
        return (this.a.c().b() ? ((Integer) this.a.c().c()).intValue() : 0) + this.d;
    }
}
