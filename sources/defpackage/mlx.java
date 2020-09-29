package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import io.reactivex.Observable;

/* renamed from: mlx reason: default package */
public final class mlx implements wig<mlw> {
    private final wzi<Observable<ConnectManager>> a;
    private final wzi<gmk> b;

    private mlx(wzi<Observable<ConnectManager>> wzi, wzi<gmk> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mlx a(wzi<Observable<ConnectManager>> wzi, wzi<gmk> wzi2) {
        return new mlx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mlw((Observable) this.a.get(), (gmk) this.b.get());
    }
}
