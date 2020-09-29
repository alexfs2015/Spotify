package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import io.reactivex.Completable;

/* renamed from: quh reason: default package */
public final class quh {
    private final RxResolver a;

    public quh(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    public final Completable a() {
        return this.a.resolve(new Request(Request.POST, qqh.a())).g();
    }
}
