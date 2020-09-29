package defpackage;

import android.app.Application;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$kyb$aaEjZGhg217wrTMmK5xkMfVfeKo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kyb$aaEjZGhg217wrTMmK5xkMfVfeKo implements ObservableOnSubscribe {
    private final /* synthetic */ Application f$0;

    public /* synthetic */ $$Lambda$kyb$aaEjZGhg217wrTMmK5xkMfVfeKo(Application application) {
        this.f$0 = application;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        kyb.a(this.f$0, observableEmitter);
    }
}
