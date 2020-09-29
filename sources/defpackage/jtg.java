package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.Functions;

/* renamed from: jtg reason: default package */
public final class jtg {
    public static Observable<ConnectionType> a(jth jth) {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$jtg$a2zqQFAa3C8Ur9IPEzILeFLZKUM<T>(jth)).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(jth jth, ObservableEmitter observableEmitter) {
        $$Lambda$jtg$Zhft3LofVJyDypDb_g6amLJEyZY r0 = new $$Lambda$jtg$Zhft3LofVJyDypDb_g6amLJEyZY(observableEmitter);
        jth.a(r0);
        observableEmitter.a(jth.c());
        observableEmitter.a(Disposables.a((Action) new $$Lambda$jtg$B8JwaT9e7N8A7ZdMlc8JPMlhzc(jth, r0)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ObservableEmitter observableEmitter, ConnectionType connectionType, boolean z) {
        if (!observableEmitter.b()) {
            observableEmitter.a(connectionType);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(jth jth, jtk jtk) {
        jth.a.remove(jtk);
        jth.a();
    }
}
