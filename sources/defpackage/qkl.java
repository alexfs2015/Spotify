package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.tasteonboarding.logging.Intent;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: qkl reason: default package */
public final class qkl extends c implements a {
    private final vti<qir> a;
    private final Scheduler b;
    private final qjw c;
    private final qjp d;
    private final qix e;
    private final qja f;
    private final CompositeDisposable g = new CompositeDisposable();
    private Disposable h = Disposables.b();

    public qkl(vti<qir> vti, a aVar, Scheduler scheduler, qjl qjl, qjp qjp, qix qix, qja qja) {
        this.a = vti;
        aVar.a(this);
        this.b = scheduler;
        this.c = qjl;
        this.d = qjp;
        this.e = qix;
        this.f = qja;
    }

    public final void a() {
        this.g.c();
    }

    public final void a(TasteOnboardingItem tasteOnboardingItem) {
        qjy a2 = this.c.a(tasteOnboardingItem);
        ((qir) this.a.get()).b(a2.b());
        if (a2.c()) {
            a(a2.b().b(), a2.a());
        }
    }

    private int d() {
        return this.f.a.size() - 1;
    }

    private void a(int i, TasteOnboardingItem tasteOnboardingItem) {
        qjx a2 = this.c.a(i, tasteOnboardingItem);
        ((qir) this.a.get()).a(a2.a());
        if (a2.b()) {
            this.g.a(this.c.a(tasteOnboardingItem.id()).a(this.b).a((Consumer<? super T>) new $$Lambda$qkl$P1CpyGqVmqdN3CypRHTWZm_yM2Q<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qkl$nAZhoRyppBMzPsc5JxkJ9vBrRU<Object>(tasteOnboardingItem)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(qjj qjj) {
        ((qir) this.a.get()).a(qjj.a());
        ((qir) this.a.get()).a(qjj.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, TasteOnboardingItem tasteOnboardingItem, qjk qjk) {
        this.f.a.addAll(i, qjk.a());
        if (qjk.b()) {
            this.f.a.remove(qkp.a(this.f.a, tasteOnboardingItem.id()));
        }
        ((qir) this.a.get()).a(this.f.a);
    }

    public final void a(int i, TasteOnboardingItem tasteOnboardingItem, String str) {
        if (!tasteOnboardingItem.isArtist() && !tasteOnboardingItem.isPodcast()) {
            qix qix = this.e;
            int d2 = d();
            qmj qmj = (qmj) fay.a(tasteOnboardingItem.logging());
            qix.a.a(qix.b.a(tasteOnboardingItem.id(), Intent.SELECT_GENRE.mIntent, qmj.b(), qmj.c(), qmj.a(), i, d2, str));
        } else if (!tasteOnboardingItem.isLiked()) {
            this.e.a(tasteOnboardingItem, i, d(), str);
        } else {
            this.e.b(tasteOnboardingItem, i, d(), str);
        }
        if (tasteOnboardingItem.isArtist() || tasteOnboardingItem.isPodcast()) {
            a(i, tasteOnboardingItem);
            return;
        }
        this.g.b(this.h);
        this.h = this.d.a(tasteOnboardingItem).a(this.b).a((Consumer<? super T>) new $$Lambda$qkl$x_J1261e9pizdHUWI5O_Ci_qqgk<Object>(this, i, tasteOnboardingItem), (Consumer<? super Throwable>) new $$Lambda$qkl$uPceMP9_PxrD3GdPtSSPmgwdOyg<Object>(tasteOnboardingItem));
        this.g.a(this.h);
    }
}
