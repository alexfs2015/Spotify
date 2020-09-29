package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Capabilities;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: imh reason: default package */
public final class imh extends ims {
    private final Observable<fqn> c;
    private CompositeDisposable d;

    public imh(hpt hpt, a aVar, Scheduler scheduler) {
        super(hpt, aVar);
        this.c = hpt.i().a().j().b(scheduler).a(scheduler);
    }

    public static Capabilities a(fqn fqn) {
        return new Capabilities(((Boolean) fqn.a(gwf.a)).booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, fqn fqn) {
        a(i, (Object) a(fqn));
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d = new CompositeDisposable();
    }

    public final void a(iln iln, int i) {
        this.d.a(this.c.a((Predicate<? super T>) $$Lambda$qTcPNaUa6AH8fr8X7JVMhLzoOTk.INSTANCE).a((Consumer<? super T>) new $$Lambda$imh$P5azbLMEuyh3DytoqDBZO6OZZo0<Object>(this, i), (Consumer<? super Throwable>) $$Lambda$imh$znusb83DqHD6cDf_KX4yO6R8Izk.INSTANCE));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        CompositeDisposable compositeDisposable = this.d;
        if (compositeDisposable != null) {
            compositeDisposable.bd_();
            this.d = null;
        }
    }
}
