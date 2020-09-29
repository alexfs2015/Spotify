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

/* renamed from: jvr reason: default package */
public final class jvr implements jvq {
    private final Context a;
    private final jvu b;

    private jvr(Context context) {
        this(context, new jvu());
    }

    private jvr(Context context, jvu jvu) {
        this.a = context;
        this.b = jvu;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ConnectionType a(Intent intent) {
        return b();
    }

    public static jvq a(Context context) {
        return new jvr(context);
    }

    public final Observable<ConnectionType> a() {
        return vvn.a(this.a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")).a((Predicate<? super T>) $$Lambda$jvr$AAIyNkTBxzCFSfjUB4AsFIm0V1Y.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$jvr$J_0_fnbuv53gm08t8l2NdUWUirM<Object,Object>(this)).f((ObservableSource<? extends T>) Observable.b((Callable<? extends T>) new $$Lambda$0nge4VhSfxDeqTGKVL7oAK8DGuQ<Object>(this))).a(Functions.a());
    }

    public final ConnectionType b() {
        return jvt.a(this.a);
    }
}
