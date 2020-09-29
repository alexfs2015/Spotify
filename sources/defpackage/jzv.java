package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import io.reactivex.Scheduler;

/* renamed from: jzv reason: default package */
public final class jzv implements kai {
    private final Context a;
    private final jrp b = gbd.a();
    private final gdz<fko> c;
    private final jzs d;
    private final Scheduler e;
    private final jzx f;
    private final jzy g;

    public jzv(Context context, gdz<fko> gdz, jzs jzs, gbd gbd, Scheduler scheduler, jzx jzx, jzy jzy) {
        this.a = context;
        this.c = gdz;
        this.d = jzs;
        this.e = scheduler;
        this.f = jzx;
        this.g = jzy;
    }

    public final Optional<kah> a(jya jya, jxx jxx, jyc jyc, String str, jyd jyd) {
        if (jyd == null || !jya.c()) {
            return Optional.e();
        }
        jzu jzu = new jzu(jya, jxx, jyc, str, this.b, new jth(this.a), this.d, this.c, vun.a(this.e), this.g, this.f);
        return Optional.b(jzu);
    }
}
