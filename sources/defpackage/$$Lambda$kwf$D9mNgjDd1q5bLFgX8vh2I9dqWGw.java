package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.functions.Function;
import java.net.HttpCookie;

/* renamed from: -$$Lambda$kwf$D9mNgjDd1q5bLFgX8vh2I9dqWGw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kwf$D9mNgjDd1q5bLFgX8vh2I9dqWGw implements Function {
    private final /* synthetic */ kwf f$0;
    private final /* synthetic */ AuthorizationRequest f$1;

    public /* synthetic */ $$Lambda$kwf$D9mNgjDd1q5bLFgX8vh2I9dqWGw(kwf kwf, AuthorizationRequest authorizationRequest) {
        this.f$0 = kwf;
        this.f$1 = authorizationRequest;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (HttpCookie) obj);
    }
}
