package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.Functions;

/* renamed from: kyb reason: default package */
public final class kyb {
    public final Observable<Boolean> a;

    public kyb(Application application) {
        this.a = Observable.a((ObservableOnSubscribe<T>) new $$Lambda$kyb$aaEjZGhg217wrTMmK5xkMfVfeKo<T>(application)).e(Boolean.valueOf(a(application))).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Application application, final ObservableEmitter observableEmitter) {
        AnonymousClass1 r0 = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    observableEmitter.a(Boolean.valueOf(kyb.a(context.getApplicationContext())));
                }
            }
        };
        application.registerReceiver(r0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        observableEmitter.a(Disposables.a((Action) new $$Lambda$kyb$qClr8pPFYrBUL40ivPiNK5hVSqY(application, r0)));
    }

    static boolean a(Context context) {
        return jtl.a(context) != ConnectionType.CONNECTION_TYPE_NONE;
    }
}
