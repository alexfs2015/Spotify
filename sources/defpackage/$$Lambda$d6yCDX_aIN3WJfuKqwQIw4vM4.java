package defpackage;

import com.spotify.cosmos.session.SessionClient;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$d6y-CDX_aIN3WJfuKqwQIw4-vM4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$d6yCDX_aIN3WJfuKqwQIw4vM4 implements Function {
    private final /* synthetic */ SessionClient f$0;

    public /* synthetic */ $$Lambda$d6yCDX_aIN3WJfuKqwQIw4vM4(SessionClient sessionClient) {
        this.f$0 = sessionClient;
    }

    public final Object apply(Object obj) {
        return this.f$0.notifyBootstrapCompleted((byte[]) obj);
    }
}
