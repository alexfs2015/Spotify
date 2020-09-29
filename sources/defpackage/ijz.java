package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating;
import com.spotify.music.spotlets.radio.model.ThumbState;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: ijz reason: default package */
public final class ijz extends ikf {
    private ThumbState c;
    private Disposable d;
    private final Scheduler e;

    public ijz(hne hne, a aVar, Scheduler scheduler) {
        super(hne, aVar);
        this.e = scheduler;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d = vun.b(this.b.e().a()).a(this.e).a((Consumer<? super T>) new $$Lambda$ijz$6CtIwC19OOUqhVRpq_kO5QZXV1Y<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ijz$xYRXNyEmB_XGVrW4DfnQdSdttOQ<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ugu ugu) {
        ThumbState b = ugu.b();
        ThumbState thumbState = this.c;
        if (thumbState == null || thumbState != b) {
            this.c = b;
            a((Object) new Rating(b));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.c = null;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Disposable disposable = this.d;
        if (disposable != null && !disposable.b()) {
            this.d.bf_();
        }
    }

    public final void a(ija ija, int i) {
        a((Object) new Rating(this.c));
    }
}
