package defpackage;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$hnj$0GAO70qzY6ByWgwv09zAF0lw8n0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hnj$0GAO70qzY6ByWgwv09zAF0lw8n0 implements Function {
    private final /* synthetic */ hnj f$0;
    private final /* synthetic */ Function f$1;

    public /* synthetic */ $$Lambda$hnj$0GAO70qzY6ByWgwv09zAF0lw8n0(hnj hnj, Function function) {
        this.f$0 = hnj;
        this.f$1 = function;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (LoginResponse) obj);
    }
}
