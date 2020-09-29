package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;
import io.reactivex.Completable;

/* renamed from: pam reason: default package */
final class pam implements pak, pal {
    private static final int a = pam.class.hashCode();
    private final String b;
    private final iia c;
    private final AdRules d;
    private final pai e;
    private final Context f;
    private vhx g;
    private Optional<ihz> h = Optional.e();
    private Bundle i;

    public pam(String str, iia iia, AdRules adRules, pai pai, Context context) {
        this.c = iia;
        this.d = adRules;
        this.e = pai;
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

    public final void a(vhx vhx, fqn fqn) {
        ihz ihz;
        this.g = vhx;
        iia iia = this.c;
        Context context = this.f;
        String str = this.b;
        boolean z = iia.b.c != null;
        if ((iia.b.b(str) || z) && ihr.a(fqn)) {
            ihz = new ihz(context);
            iia.a.b = str;
            ihz.b = iia.c;
            ihz.a = iia.a;
        } else {
            ihz = null;
        }
        this.h = Optional.c(ihz);
        if (this.h.b()) {
            ihz ihz2 = (ihz) this.h.c();
            ihz2.setLayoutParams(new LayoutParams(-1, -2));
            vhx.a((a<H>) new jog<H>(ihz2, true), a);
            vhx.a(false, a);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.g.a(true, a);
            return;
        }
        this.g.a(false, a);
    }

    public final void ay_() {
        if (this.h.b()) {
            this.d.a(StateType.ON_SPONSORED_PAGE, true);
            ihz ihz = (ihz) this.h.c();
            Bundle bundle = this.i;
            if (!(ihz.a == null || bundle == null)) {
                ihz.a.a(bundle.getBoolean("sponsorship_impression_logged"));
            }
        }
        this.e.a((pal) this);
    }

    public final void b(Bundle bundle) {
        if (this.h.b()) {
            ihz ihz = (ihz) this.h.c();
            if (ihz.a != null && bundle != null) {
                bundle.putBoolean("sponsorship_impression_logged", ihz.a.b());
            }
        }
    }

    public final void c() {
        if (this.h.b()) {
            this.d.a(StateType.ON_SPONSORED_PAGE, false);
        }
        this.e.a((pal) null);
    }

    public final void d() {
        this.e.a.c();
    }
}
