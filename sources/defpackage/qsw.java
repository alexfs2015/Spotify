package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: qsw reason: default package */
public final class qsw extends c implements a {
    private final who<qrb> a;
    private final Scheduler b;
    private final qsf c;
    private final qrg d;
    private final qrj e;
    private final CompositeDisposable f = new CompositeDisposable();

    public qsw(who<qrb> who, a aVar, Scheduler scheduler, qsj qsj, qrg qrg, qrj qrj) {
        this.a = who;
        aVar.a(this);
        this.b = scheduler;
        this.c = qsj;
        this.d = qrg;
        this.e = qrj;
    }

    private void a(int i, TasteOnboardingItem tasteOnboardingItem) {
        qsg a2 = this.c.a(i, tasteOnboardingItem);
        ((qrb) this.a.get()).a(a2.a());
        if (a2.b()) {
            this.f.a(this.c.a(tasteOnboardingItem.id()).a(this.b).a((Consumer<? super T>) new $$Lambda$qsw$DBLD32f8mgRhWQxxdXweyW9Ws4<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qsw$RKZoJFpDwylxExUVZ89D9AVdoZY<Object>(tasteOnboardingItem)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(qrs qrs) {
        ((qrb) this.a.get()).a(qrs.a());
    }

    private int d() {
        return this.e.a.size() - 1;
    }

    public final void a() {
        this.f.c();
    }

    public final void a(int i, TasteOnboardingItem tasteOnboardingItem, String str) {
        if (!tasteOnboardingItem.isLiked()) {
            this.d.a(tasteOnboardingItem, i, d(), str);
        } else {
            this.d.b(tasteOnboardingItem, i, d(), str);
        }
        a(i, tasteOnboardingItem);
    }

    public final void a(TasteOnboardingItem tasteOnboardingItem) {
        qsh a2 = this.c.a(tasteOnboardingItem);
        ((qrb) this.a.get()).b(a2.b());
        if (a2.c()) {
            a(a2.b().b(), a2.a());
        }
    }
}
