package defpackage;

import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.Observable;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: gdr reason: default package */
public final class gdr {
    public final SerialDisposable a = new SerialDisposable();
    public a b;
    private final lbs c;

    /* renamed from: gdr$a */
    public interface a {
        void onAttachOnBackground(String str);
    }

    public gdr(lbs lbs) {
        this.c = lbs;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(GaiaDevice gaiaDevice) {
        if (gaiaDevice.isActive() && !this.c.c()) {
            this.b.onAttachOnBackground(gaiaDevice.getAttachId());
        }
    }

    public final void a(Observable<GaiaDevice> observable) {
        this.a.a(observable.a((Consumer<? super T>) new $$Lambda$gdr$uTePyVl3G___imVHKsibFt5bTTs<Object>(this), (Consumer<? super Throwable>) $$Lambda$1lcEnKLZ3M195ucXB816VGho9eA.INSTANCE));
    }
}
