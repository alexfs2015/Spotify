package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: jvw reason: default package */
public final class jvw {
    public static Observable<Boolean> a(Context context) {
        return b(context).c((Function<? super T, ? extends R>) $$Lambda$jvw$Tdqkl3s7XHwq0d_l3UhRVprtRM.INSTANCE).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(ConnectionType connectionType) {
        return Boolean.valueOf(connectionType != ConnectionType.CONNECTION_TYPE_NONE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, final ObservableEmitter observableEmitter) {
        AnonymousClass1 r0 = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    observableEmitter.a(jvw.d(context.getApplicationContext()));
                }
            }
        };
        observableEmitter.a((Cancellable) new $$Lambda$jvw$_7ZPdRN0XOVqGWN2jsKTi8fvA3c(context, r0));
        context.registerReceiver(r0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public static Observable<ConnectionType> b(Context context) {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$jvw$SHzbdhaHjUkx7SfIvYfNuzlPvBk<T>(context.getApplicationContext())).a(Functions.a());
    }

    public static boolean c(Context context) {
        return d(context) != ConnectionType.CONNECTION_TYPE_NONE;
    }

    static ConnectionType d(Context context) {
        return jvt.a((ConnectivityManager) context.getSystemService("connectivity"));
    }
}
