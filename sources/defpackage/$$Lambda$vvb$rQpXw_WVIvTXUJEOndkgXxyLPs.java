package defpackage;

import android.content.Intent;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$vvb$rQpXw_WVIvTXUJEOndkgXx-yLPs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vvb$rQpXw_WVIvTXUJEOndkgXxyLPs implements ObservableOnSubscribe {
    private final /* synthetic */ vvb f$0;
    private final /* synthetic */ Intent f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$vvb$rQpXw_WVIvTXUJEOndkgXxyLPs(vvb vvb, Intent intent, String str) {
        this.f$0 = vvb;
        this.f$1 = intent;
        this.f$2 = str;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        this.f$0.a(this.f$1, this.f$2, observableEmitter);
    }
}
