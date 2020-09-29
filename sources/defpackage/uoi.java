package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.storylines.model.Storylines;
import java.util.concurrent.Callable;

/* renamed from: uoi reason: default package */
public final class uoi implements uoj {
    private final uok a;

    public uoi(uok uok) {
        this.a = uok;
    }

    public final wuh<Optional<Storylines>> a() {
        wuh<Optional<Storylines>> a2 = wuh.a((Callable<? extends T>) new $$Lambda$uoi$N8uDmr6GIBGdd4Z1lVeeWPeARbU<Object>(this));
        uok uok = this.a;
        if (!(uok.e.a() - uok.d.a(uok.b, -1) >= uok.c)) {
            return a2;
        }
        return wxt.a(Optional.e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional b() {
        return Optional.b(this.a.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Storylines storylines) {
        uok uok = this.a;
        uok.d.a().a(uok.a, storylines.getEntityUris()).a(uok.b, uok.e.a()).b();
    }

    public final wub a(Storylines storylines) {
        return wub.a((wum) new $$Lambda$uoi$0MWNEhqP3HTHizucVm_DJXlq3mo(this, storylines));
    }
}
