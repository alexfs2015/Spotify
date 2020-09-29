package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.WazeBannerModel.Type;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: kqq reason: default package */
final class kqq implements kqb {
    private final kew a;
    private Disposable b = Disposables.b();
    private final Scheduler c;
    private final sff d;
    private hk<Boolean> e = $$Lambda$kqq$wUyMmh9HQw0OQFtP0VfDG_xog.INSTANCE;

    kqq(kew kew, Scheduler scheduler, sff sff) {
        this.a = kew;
        this.c = scheduler;
        this.d = sff;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(WazeBannerModel wazeBannerModel) {
        return Boolean.valueOf(wazeBannerModel.a() == Type.GOTO_BANNER_UNIFIED);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool) {
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        Logger.d(th, "Error listening to the Waze model", new Object[0]);
        a(false);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            this.d.a("waze");
        }
        this.e.accept(Boolean.valueOf(z));
    }

    public final void a() {
        this.b.bd_();
    }

    public final void a(Intent intent, fqn fqn) {
    }

    public final void a(hk<Boolean> hkVar) {
        this.e = hkVar;
        this.b = this.a.a().c((Function<? super T, ? extends R>) $$Lambda$kqq$QDzg5EM34EEjfptOX9Zk59aTuvo.INSTANCE).a(Functions.a()).a(this.c).a((Consumer<? super T>) new $$Lambda$kqq$VU1Imw_DA63si0haOzDtf3bxfxI<Object>(this), (Consumer<? super Throwable>) new $$Lambda$kqq$eEkkyVR3izWBsSfDObHDm8ozhos<Object>(this));
    }
}
