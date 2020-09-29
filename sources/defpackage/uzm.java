package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.storylines.model.Storylines;
import java.util.concurrent.Callable;

/* renamed from: uzm reason: default package */
public final class uzm implements uzn {
    private final uzo a;

    public uzm(uzo uzo) {
        this.a = uzo;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional b() {
        return Optional.b(this.a.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Storylines storylines) {
        uzo uzo = this.a;
        uzo.d.a().a(uzo.a, storylines.getEntityUris()).a(uzo.b, uzo.e.a()).b();
    }

    public final xig a(Storylines storylines) {
        return xig.a((xir) new $$Lambda$uzm$SXmDRdIzdRUIDtzQY9rOZMIb9c(this, storylines));
    }

    public final xim<Optional<Storylines>> a() {
        xim<Optional<Storylines>> a2 = xim.a((Callable<? extends T>) new $$Lambda$uzm$ENCdFvGvELWt6mJbhHyhyysLRUI<Object>(this));
        uzo uzo = this.a;
        return !(((uzo.e.a() - uzo.d.a(uzo.b, -1)) > uzo.c ? 1 : ((uzo.e.a() - uzo.d.a(uzo.b, -1)) == uzo.c ? 0 : -1)) >= 0) ? a2 : xly.a(Optional.e());
    }
}
