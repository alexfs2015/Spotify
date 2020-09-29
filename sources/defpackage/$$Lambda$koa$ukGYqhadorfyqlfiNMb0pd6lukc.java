package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$koa$ukGYqhadorfyqlfiNMb0pd6lukc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$koa$ukGYqhadorfyqlfiNMb0pd6lukc implements Function {
    private final /* synthetic */ koe f$0;

    public /* synthetic */ $$Lambda$koa$ukGYqhadorfyqlfiNMb0pd6lukc(koe koe) {
        this.f$0 = koe;
    }

    public final Object apply(Object obj) {
        return koa.a(this.f$0, "ad_voice_error", ((d) obj).b, 0, ImmutableMap.a("utterance_id", ((d) obj).a, "error_message", ((d) obj).c));
    }
}
