package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.DataSource;
import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: npb reason: default package */
public final class npb extends sgc<hcs> {
    npb(a aVar, sgb sgb, sso sso, rmf rmf) {
        super(aVar, sgb, sso, rmf);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hcs hcs) {
        if (nit.a(hcs, "home-error-empty-view") || nit.a(hcs)) {
            b();
        }
        if (nkh.a(hcs.custom(), hcs.body())) {
            this.a = DataSource.CACHE;
            return;
        }
        if (nkh.a(hcs.custom())) {
            this.a = DataSource.REMOTE;
        }
    }

    /* renamed from: a */
    public final xii<hcs> call(xii<hcs> xii) {
        return super.call(xii.b((xis<? super T>) new $$Lambda$npb$6OrjOzkTPh2IaXHcYfBDh1wfC_k<Object>(this)));
    }

    public final /* synthetic */ boolean a(Object obj) {
        hcs hcs = (hcs) obj;
        return !hdb.EMPTY.equals(hcs) && !hbb.a(hcs);
    }
}
