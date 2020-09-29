package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.Functions;

/* renamed from: jvm reason: default package */
public final class jvm {
    public static Observable<ConnectionType> a(jvn jvn) {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$jvm$G3fLhcKvkZGqtveBQ8Szgt_TkOs<T>(jvn)).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ObservableEmitter observableEmitter, ConnectionType connectionType, boolean z) {
        if (!observableEmitter.b()) {
            observableEmitter.a(connectionType);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(jvn jvn, ObservableEmitter observableEmitter) {
        $$Lambda$jvm$VxvPG36qEcT266MnJQV2kxHOAY r0 = new $$Lambda$jvm$VxvPG36qEcT266MnJQV2kxHOAY(observableEmitter);
        jvn.a((jvs) r0);
        observableEmitter.a(jvn.a());
        observableEmitter.a(Disposables.a((Action) new $$Lambda$jvm$_sW1vwUXmPf0sxAeewlnqr_RGwc(jvn, r0)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(jvn jvn, jvs jvs) {
        jvn.b(jvs);
        jvn.b();
    }
}
