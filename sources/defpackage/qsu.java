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

/* renamed from: qsu reason: default package */
public final class qsu extends c implements a {
    private final who<qrb> a;
    private final Scheduler b;
    private final qsf c;
    private final qry d;
    private final qrg e;
    private final qrj f;
    private final CompositeDisposable g = new CompositeDisposable();
    private Disposable h = Disposables.b();

    public qsu(who<qrb> who, a aVar, Scheduler scheduler, qru qru, qry qry, qrg qrg, qrj qrj) {
        this.a = who;
        aVar.a(this);
        this.b = scheduler;
        this.c = qru;
        this.d = qry;
        this.e = qrg;
        this.f = qrj;
    }

    private void a(int i, TasteOnboardingItem tasteOnboardingItem) {
        qsg a2 = this.c.a(i, tasteOnboardingItem);
        ((qrb) this.a.get()).a(a2.a());
        if (a2.b()) {
            this.g.a(this.c.a(tasteOnboardingItem.id()).a(this.b).a((Consumer<? super T>) new $$Lambda$qsu$ALiLI6rFwycrNknXslltSF66hE<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qsu$dXW2Y06Z9LbitXeQQCR7eAR4k8<Object>(tasteOnboardingItem)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, TasteOnboardingItem tasteOnboardingItem, qrt qrt) {
        this.f.a.addAll(i, qrt.a());
        if (qrt.b()) {
            this.f.a.remove(qsy.a(this.f.a, tasteOnboardingItem.id()));
        }
        ((qrb) this.a.get()).a(this.f.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(qrs qrs) {
        ((qrb) this.a.get()).a(qrs.a());
        ((qrb) this.a.get()).a(qrs.b());
    }

    private int d() {
        return this.f.a.size() - 1;
    }

    public final void a() {
        this.g.c();
    }

    public final void a(int i, TasteOnboardingItem tasteOnboardingItem, String str) {
        if (!tasteOnboardingItem.isArtist() && !tasteOnboardingItem.isPodcast()) {
            qrg qrg = this.e;
            int d2 = d();
            qur qur = (qur) fbp.a(tasteOnboardingItem.logging());
            qrg.a.a(qrg.b.a(tasteOnboardingItem.id(), Intent.SELECT_GENRE.mIntent, qur.b(), qur.c(), qur.a(), i, d2, str));
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
        this.h = this.d.a(tasteOnboardingItem).a(this.b).a((Consumer<? super T>) new $$Lambda$qsu$T_Kr9l_Cm_O1QZAQzcK7uHZe47Q<Object>(this, i, tasteOnboardingItem), (Consumer<? super Throwable>) new $$Lambda$qsu$M075HJfIs0ayk9KhYTJmnpyQBl8<Object>(tasteOnboardingItem));
        this.g.a(this.h);
    }

    public final void a(TasteOnboardingItem tasteOnboardingItem) {
        qsh a2 = this.c.a(tasteOnboardingItem);
        ((qrb) this.a.get()).b(a2.b());
        if (a2.c()) {
            a(a2.b().b(), a2.a());
        }
    }
}
