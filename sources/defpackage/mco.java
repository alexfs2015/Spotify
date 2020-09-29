package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: mco reason: default package */
public final class mco extends sgc<hcs> {
    mco(a aVar, sgb sgb, sso sso, rmf rmf) {
        super(aVar, sgb, sso, rmf);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hcs hcs) {
        if (mdl.a(hcs, "browse-error-empty-view")) {
            b();
        }
    }

    /* renamed from: a */
    public final xii<hcs> call(xii<hcs> xii) {
        return super.call(xii).b((xis<? super T>) new $$Lambda$mco$ZE0VeOBXQxP7bFE2KSl3LWfWBlI<Object>(this));
    }

    public final /* synthetic */ boolean a(Object obj) {
        hcs hcs = (hcs) obj;
        return !hdb.EMPTY.equals(hcs) && !hbb.a(hcs);
    }
}
