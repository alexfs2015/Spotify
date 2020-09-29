package defpackage;

import android.content.Intent;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$vhw$FSicOxuGVslp04n1fpF25j-v5cM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vhw$FSicOxuGVslp04n1fpF25jv5cM implements ObservableOnSubscribe {
    private final /* synthetic */ vhw f$0;
    private final /* synthetic */ Intent f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$vhw$FSicOxuGVslp04n1fpF25jv5cM(vhw vhw, Intent intent, String str) {
        this.f$0 = vhw;
        this.f$1 = intent;
        this.f$2 = str;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        this.f$0.a(this.f$1, this.f$2, observableEmitter);
    }
}
