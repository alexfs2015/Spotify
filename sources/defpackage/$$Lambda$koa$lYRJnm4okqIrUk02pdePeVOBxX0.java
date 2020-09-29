package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$koa$lYRJnm4okqIrUk02pdePeVOBxX0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$koa$lYRJnm4okqIrUk02pdePeVOBxX0 implements Function {
    private final /* synthetic */ koe f$0;

    public /* synthetic */ $$Lambda$koa$lYRJnm4okqIrUk02pdePeVOBxX0(koe koe) {
        this.f$0 = koe;
    }

    public final Object apply(Object obj) {
        return koa.a(this.f$0, "ad_voice_speech_received", ((e) obj).b, ((e) obj).c, ImmutableMap.b("utterance_id", ((e) obj).a));
    }
}
