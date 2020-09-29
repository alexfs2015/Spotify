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

/* renamed from: lbk reason: default package */
public final class lbk {
    public final Observable<Boolean> a;

    public lbk(Application application) {
        this.a = Observable.a((ObservableOnSubscribe<T>) new $$Lambda$lbk$IIP9JzbjEdeGXkxtfkv1fjbQbHY<T>(application)).e(Boolean.valueOf(a(application))).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Application application, final ObservableEmitter observableEmitter) {
        AnonymousClass1 r0 = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    observableEmitter.a(Boolean.valueOf(lbk.a(context.getApplicationContext())));
                }
            }
        };
        application.registerReceiver(r0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        observableEmitter.a(Disposables.a((Action) new $$Lambda$lbk$aiP9UHSXCAbfoBMyi2k_sDphGZI(application, r0)));
    }

    static boolean a(Context context) {
        return jvt.a(context) != ConnectionType.CONNECTION_TYPE_NONE;
    }
}
