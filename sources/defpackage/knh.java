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

/* renamed from: knh reason: default package */
final class knh implements kms {
    private final kcv a;
    private Disposable b = Disposables.b();
    private final Scheduler c;
    private final rvv d;
    private hk<Boolean> e = $$Lambda$knh$S_I0GVj2Rtbguf6F0nIxxBRzzVQ.INSTANCE;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool) {
    }

    public final void a(Intent intent, fpt fpt) {
    }

    knh(kcv kcv, Scheduler scheduler, rvv rvv) {
        this.a = kcv;
        this.c = scheduler;
        this.d = rvv;
    }

    public final void a(hk<Boolean> hkVar) {
        this.e = hkVar;
        this.b = this.a.a().c((Function<? super T, ? extends R>) $$Lambda$knh$FzwrQBnoApPic2KTw_1UVsJsVQ.INSTANCE).a(Functions.a()).a(this.c).a((Consumer<? super T>) new $$Lambda$knh$BbN2IU31xxwI0_Xc0CRxElavMA<Object>(this), (Consumer<? super Throwable>) new $$Lambda$knh$mn36S7HM6aIPKTNaetmh_auNJgg<Object>(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(WazeBannerModel wazeBannerModel) {
        return Boolean.valueOf(wazeBannerModel.a() == Type.GOTO_BANNER_UNIFIED);
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
        this.b.bf_();
    }
}
