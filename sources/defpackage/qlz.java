package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import io.reactivex.Completable;

/* renamed from: qlz reason: default package */
public final class qlz {
    private final RxResolver a;

    public qlz(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    public final Completable a() {
        return this.a.resolve(new Request(Request.POST, qht.a())).g();
    }
}
