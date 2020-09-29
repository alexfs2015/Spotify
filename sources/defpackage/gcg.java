package defpackage;

import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.Observable;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: gcg reason: default package */
public final class gcg {
    public final SerialDisposable a = new SerialDisposable();
    public a b;
    private final kyj c;

    /* renamed from: gcg$a */
    public interface a {
        void onAttachOnBackground(String str);
    }

    public gcg(kyj kyj) {
        this.c = kyj;
    }

    public final void a(Observable<GaiaDevice> observable) {
        this.a.a(observable.a((Consumer<? super T>) new $$Lambda$gcg$8xMvXzpIVzjoKe5xkEeKqqe_Dk<Object>(this), (Consumer<? super Throwable>) $$Lambda$1lcEnKLZ3M195ucXB816VGho9eA.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(GaiaDevice gaiaDevice) {
        if (gaiaDevice.isActive() && !this.c.c()) {
            this.b.onAttachOnBackground(gaiaDevice.getAttachId());
        }
    }
}
