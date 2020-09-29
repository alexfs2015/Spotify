package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Scheduler;

/* renamed from: htu reason: default package */
public final class htu {
    final hxx a;
    final Context b;
    final hgy c;
    final RxResolver d;
    final Scheduler e;
    final jty f;

    htu(hxx hxx, Context context, hgy hgy, RxResolver rxResolver, Scheduler scheduler, jty jty) {
        this.a = hxx;
        this.b = context;
        this.c = hgy;
        this.d = rxResolver;
        this.e = scheduler;
        this.f = jty;
    }

    /* access modifiers changed from: 0000 */
    public final hvd<huw> a(hva<huw> hva, String str, String str2, htw htw) {
        return hvd.a(this.b, hva, str, str2, this.d, this.c, this.a, wit.a(this.e), htw, this.f);
    }
}
