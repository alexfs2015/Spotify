package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.functions.Function;
import java.net.HttpCookie;

/* renamed from: -$$Lambda$ksw$qpDQ12puwEOpYb4b_rVvHUlS9ok reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ksw$qpDQ12puwEOpYb4b_rVvHUlS9ok implements Function {
    private final /* synthetic */ ksw f$0;
    private final /* synthetic */ AuthorizationRequest f$1;

    public /* synthetic */ $$Lambda$ksw$qpDQ12puwEOpYb4b_rVvHUlS9ok(ksw ksw, AuthorizationRequest authorizationRequest) {
        this.f$0 = ksw;
        this.f$1 = authorizationRequest;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (HttpCookie) obj);
    }
}
