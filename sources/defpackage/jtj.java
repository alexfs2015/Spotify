package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: jtj reason: default package */
public final class jtj implements jti {
    private final Context a;
    private final jtm b;

    private jtj(Context context) {
        this(context, new jtm());
    }

    private jtj(Context context, jtm jtm) {
        this.a = context;
        this.b = jtm;
    }

    public static jti a(Context context) {
        return new jtj(context);
    }

    public final Observable<ConnectionType> a() {
        return vii.a(this.a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")).a((Predicate<? super T>) $$Lambda$jtj$fMoZ9J1IBWK6vbuOv0qd4_DwkGU.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$jtj$8tvUwfO_j6RsqykqlAt0oDtmVY<Object,Object>(this)).f((ObservableSource<? extends T>) Observable.b((Callable<? extends T>) new $$Lambda$nANOVRKzwm8SDIknBN_NLqtsBy8<Object>(this))).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ConnectionType a(Intent intent) {
        return b();
    }

    public final ConnectionType b() {
        return jtl.a(this.a);
    }
}
