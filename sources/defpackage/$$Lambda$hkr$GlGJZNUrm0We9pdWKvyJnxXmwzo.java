package defpackage;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$hkr$GlGJZNUrm0We9pdWKvyJnxXmwzo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hkr$GlGJZNUrm0We9pdWKvyJnxXmwzo implements Function {
    private final /* synthetic */ hkr f$0;
    private final /* synthetic */ Function f$1;

    public /* synthetic */ $$Lambda$hkr$GlGJZNUrm0We9pdWKvyJnxXmwzo(hkr hkr, Function function) {
        this.f$0 = hkr;
        this.f$1 = function;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (LoginResponse) obj);
    }
}
