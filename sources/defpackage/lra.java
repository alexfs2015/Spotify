package defpackage;

import com.spotify.music.features.addtoplaylist.AddToPlaylistLogger;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: lra reason: default package */
public final class lra {
    public final lro a;
    public final AddToPlaylistLogger b;
    public final CompositeDisposable c = new CompositeDisposable();
    private final hxx d;
    private final Scheduler e;
    private final hgy f;
    private final rqb g;

    public lra(lro lro, AddToPlaylistLogger addToPlaylistLogger, hxx hxx, Scheduler scheduler, hgy hgy, rqb rqb) {
        this.a = lro;
        this.b = addToPlaylistLogger;
        this.d = hxx;
        this.e = scheduler;
        this.f = hgy;
        this.g = rqb;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        if (this.g.a(fqn)) {
            this.a.l();
        }
        this.a.a(fqn);
    }

    public final void a() {
        CompositeDisposable compositeDisposable = this.c;
        Flowable a2 = this.d.a.a((Predicate<? super T>) $$Lambda$gFz_cVPYAl5maQZ7xewFvMizyXk.INSTANCE).a(this.e);
        lro lro = this.a;
        lro.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) new $$Lambda$DhGe2hjWhSmY6eNWMj9vwBYQzg0<Object>(lro), (Consumer<? super Throwable>) $$Lambda$lra$izbEwTqQV5LJJBgQ1yxzbi_u_oQ.INSTANCE));
        this.c.a(this.f.a().a((Consumer<? super T>) new $$Lambda$lra$N93U4VYu3Syzeo6sx1p0_1vuU8k<Object>(this), (Consumer<? super Throwable>) $$Lambda$lra$w5jl8Q64sSipaXkKJS0gKjHttUI.INSTANCE));
    }
}
