package defpackage;

import android.content.Context;
import com.google.common.base.Optional;

/* renamed from: kcp reason: default package */
public final class kcp implements kai {
    private final jjf a;
    private final jrp b = gbd.a();
    private final Context c;

    public kcp(Context context, jjf jjf, gbd gbd) {
        this.c = context;
        this.a = jjf;
    }

    public final Optional<kah> a(jya jya, jxx jxx, jyc jyc, String str, jyd jyd) {
        kco kco = new kco(jya, this.b, new jth(this.c), str, this.a);
        return Optional.b(kco);
    }
}
