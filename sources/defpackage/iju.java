package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Capabilities;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: iju reason: default package */
public final class iju extends ikf {
    private final Observable<fpt> c;
    private CompositeDisposable d;

    public iju(hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.c = hne.i().a().j().b(scheduler).a(scheduler);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d = new CompositeDisposable();
    }

    public final void a(ija ija, int i) {
        this.d.a(this.c.a((Predicate<? super T>) $$Lambda$i33qTocIRf9FcULl8qHblXtgJw.INSTANCE).a((Consumer<? super T>) new $$Lambda$iju$Ht8C6cdOo2CglfCH7zn3cuKxCXg<Object>(this, i), (Consumer<? super Throwable>) $$Lambda$iju$qDuMk5VZauJ4dHbM_FFlDT4No9s.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, fpt fpt) {
        a(i, (Object) a(fpt));
    }

    public static Capabilities a(fpt fpt) {
        return new Capabilities(((Boolean) fpt.a(guf.a)).booleanValue());
    }

    /* access modifiers changed from: protected */
    public final void b() {
        CompositeDisposable compositeDisposable = this.d;
        if (compositeDisposable != null) {
            compositeDisposable.bf_();
            this.d = null;
        }
    }
}
