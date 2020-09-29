package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import io.reactivex.functions.Function;
import java.net.HttpCookie;

/* renamed from: -$$Lambda$nvf$F5LLLzVNBzLBsZwrM8NH6dt6q_s reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nvf$F5LLLzVNBzLBsZwrM8NH6dt6q_s implements Function {
    private final /* synthetic */ nvf f$0;
    private final /* synthetic */ AuthorizationRequest f$1;

    public /* synthetic */ $$Lambda$nvf$F5LLLzVNBzLBsZwrM8NH6dt6q_s(nvf nvf, AuthorizationRequest authorizationRequest) {
        this.f$0 = nvf;
        this.f$1 = authorizationRequest;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (HttpCookie) obj);
    }
}
