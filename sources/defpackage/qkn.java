package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: qkn reason: default package */
public final class qkn extends c implements a {
    private final vti<qir> a;
    private final Scheduler b;
    private final qjw c;
    private final qix d;
    private final qja e;
    private final CompositeDisposable f = new CompositeDisposable();

    public qkn(vti<qir> vti, a aVar, Scheduler scheduler, qka qka, qix qix, qja qja) {
        this.a = vti;
        aVar.a(this);
        this.b = scheduler;
        this.c = qka;
        this.d = qix;
        this.e = qja;
    }

    public final void a() {
        this.f.c();
    }

    public final void a(TasteOnboardingItem tasteOnboardingItem) {
        qjy a2 = this.c.a(tasteOnboardingItem);
        ((qir) this.a.get()).b(a2.b());
        if (a2.c()) {
            a(a2.b().b(), a2.a());
        }
    }

    private int d() {
        return this.e.a.size() - 1;
    }

    private void a(int i, TasteOnboardingItem tasteOnboardingItem) {
        qjx a2 = this.c.a(i, tasteOnboardingItem);
        ((qir) this.a.get()).a(a2.a());
        if (a2.b()) {
            this.f.a(this.c.a(tasteOnboardingItem.id()).a(this.b).a((Consumer<? super T>) new $$Lambda$qkn$u5NRxYGlMluXbPVEMjvqK1Zx3I<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qkn$6UQAPImLMdfOK0FoRPSAAby640<Object>(tasteOnboardingItem)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(qjj qjj) {
        ((qir) this.a.get()).a(qjj.a());
    }

    public final void a(int i, TasteOnboardingItem tasteOnboardingItem, String str) {
        if (!tasteOnboardingItem.isLiked()) {
            this.d.a(tasteOnboardingItem, i, d(), str);
        } else {
            this.d.b(tasteOnboardingItem, i, d(), str);
        }
        a(i, tasteOnboardingItem);
    }
}
