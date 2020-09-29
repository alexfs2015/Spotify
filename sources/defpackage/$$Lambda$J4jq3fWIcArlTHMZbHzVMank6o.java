package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.Observable;

/* renamed from: -$$Lambda$J4jq3fWIcArlTHMZbHzVMa-nk6o reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$J4jq3fWIcArlTHMZbHzVMank6o implements RxRouter {
    private final /* synthetic */ RxResolver f$0;

    public /* synthetic */ $$Lambda$J4jq3fWIcArlTHMZbHzVMank6o(RxResolver rxResolver) {
        this.f$0 = rxResolver;
    }

    public final Observable resolve(Request request) {
        return this.f$0.resolve(request);
    }
}
