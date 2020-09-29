package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$vvk$S4Bw56MVN6hAMXwiv23pi4-twMg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vvk$S4Bw56MVN6hAMXwiv23pi4twMg implements ObservableOnSubscribe {
    private final /* synthetic */ vvk f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ StackTraceElement[] f$2;
    private final /* synthetic */ Observable f$3;

    public /* synthetic */ $$Lambda$vvk$S4Bw56MVN6hAMXwiv23pi4twMg(vvk vvk, String str, StackTraceElement[] stackTraceElementArr, Observable observable) {
        this.f$0 = vvk;
        this.f$1 = str;
        this.f$2 = stackTraceElementArr;
        this.f$3 = observable;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        this.f$0.b(this.f$1, this.f$2, this.f$3, observableEmitter);
    }
}
