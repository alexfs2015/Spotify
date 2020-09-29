package defpackage;

import com.spotify.music.features.addtoplaylist.AddToPlaylistLogger;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: lna reason: default package */
public final class lna {
    public final lno a;
    public final AddToPlaylistLogger b;
    public final CompositeDisposable c = new CompositeDisposable();
    private final hvl d;
    private final Scheduler e;
    private final hec f;
    private final rgz g;

    public lna(lno lno, AddToPlaylistLogger addToPlaylistLogger, hvl hvl, Scheduler scheduler, hec hec, rgz rgz) {
        this.a = lno;
        this.b = addToPlaylistLogger;
        this.d = hvl;
        this.e = scheduler;
        this.f = hec;
        this.g = rgz;
    }

    public final void a() {
        CompositeDisposable compositeDisposable = this.c;
        Flowable a2 = this.d.a.a((Predicate<? super T>) $$Lambda$e4mv30H7KYvrXlczsuVnyxQNJs.INSTANCE).a(this.e);
        lno lno = this.a;
        lno.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) new $$Lambda$TKJwzXGuQf39IR_5xJe61uEuAE<Object>(lno), (Consumer<? super Throwable>) $$Lambda$lna$hOVH0PpPc8kurw8GnrkKM6bPVrQ.INSTANCE));
        this.c.a(this.f.a().a((Consumer<? super T>) new $$Lambda$lna$Yjjm6CbZFi_F2AyMYZUG04nsKU<Object>(this), (Consumer<? super Throwable>) $$Lambda$lna$0O2obetndSAUBDaLS9JJtUWbcig.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        if (this.g.a(fpt)) {
            this.a.l();
        }
        this.a.a(fpt);
    }
}
