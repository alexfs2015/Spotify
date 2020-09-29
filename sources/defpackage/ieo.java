package defpackage;

import android.os.Build;
import android.os.Build.VERSION;
import com.spotify.mobile.android.spotlets.ads.AdsProductState;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Predicate;

/* renamed from: ieo reason: default package */
public final class ieo implements c {
    private final hzx a;
    private final hgz b;
    private final Scheduler c;
    private final CompositeDisposable d = new CompositeDisposable();

    public ieo(hzx hzx, hgz hgz, Scheduler scheduler) {
        this.a = hzx;
        this.b = hgz;
        this.c = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str) {
        return Observable.a((ObservableSource<? extends T>) this.a.a("submodel", Build.MODEL).b(this.c), (ObservableSource<? extends T>) this.a.a("make", Build.MANUFACTURER).b(this.c), (ObservableSource<? extends T>) this.a.a("os_version", Integer.toString(VERSION.SDK_INT)).b(this.c));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str) {
        return str != null && str.equals(AdsProductState.ENABLED.mValue);
    }

    public final void ai_() {
        Observable h = this.b.b("ads").a((Predicate<? super T>) $$Lambda$ieo$_Qjma6IcOrHjCgu4GIeTdzDkS8.INSTANCE).h(new $$Lambda$ieo$yVG4LHfahL0vijGigalGvHcKVls(this));
        iic iic = new iic();
        h.subscribe(iic);
        this.d.a((Disposable) iic);
    }

    public final void aj_() {
        this.d.c();
    }

    public final String c() {
        return "AdsDeviceTargetingUpdaterPlugin";
    }
}
