package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;
import io.reactivex.Completable;

/* renamed from: otf reason: default package */
final class otf implements otd, ote {
    private static final int a = otf.class.hashCode();
    private final String b;
    private final ifn c;
    private final AdRules d;
    private final otb e;
    private final Context f;
    private uwh g;
    private Optional<ifm> h = Optional.e();
    private Bundle i;

    public otf(String str, ifn ifn, AdRules adRules, otb otb, Context context) {
        this.c = ifn;
        this.d = adRules;
        this.e = otb;
        this.f = context;
        this.b = str;
    }

    public final Completable a() {
        return this.e.b;
    }

    public final void a(Bundle bundle) {
        this.i = bundle;
    }

    public final void a(a aVar) {
        this.e.a(aVar);
    }

    public final void az_() {
        if (this.h.b()) {
            this.d.a(StateType.ON_SPONSORED_PAGE, true);
            ifm ifm = (ifm) this.h.c();
            Bundle bundle = this.i;
            if (!(ifm.a == null || bundle == null)) {
                ifm.a.a(bundle.getBoolean("sponsorship_impression_logged"));
            }
        }
        this.e.a((ote) this);
    }

    public final void c() {
        if (this.h.b()) {
            this.d.a(StateType.ON_SPONSORED_PAGE, false);
        }
        this.e.a((ote) null);
    }

    public final void d() {
        this.e.a.c();
    }

    public final void b(Bundle bundle) {
        if (this.h.b()) {
            ifm ifm = (ifm) this.h.c();
            if (ifm.a != null && bundle != null) {
                bundle.putBoolean("sponsorship_impression_logged", ifm.a.b());
            }
        }
    }

    public final void a(uwh uwh, fpt fpt) {
        ifm ifm;
        this.g = uwh;
        ifn ifn = this.c;
        Context context = this.f;
        String str = this.b;
        boolean z = ifn.b.c != null;
        if ((ifn.b.b(str) || z) && ife.a(fpt)) {
            ifm = new ifm(context);
            ifn.a.b = str;
            ifm.b = ifn.c;
            ifm.a = ifn.a;
        } else {
            ifm = null;
        }
        this.h = Optional.c(ifm);
        if (this.h.b()) {
            ifm ifm2 = (ifm) this.h.c();
            ifm2.setLayoutParams(new LayoutParams(-1, -2));
            uwh.a((a<H>) new jlu<H>(ifm2, true), a);
            uwh.a(false, a);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.g.a(true, a);
            return;
        }
        this.g.a(false, a);
    }
}
