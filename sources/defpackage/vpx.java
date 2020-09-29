package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

/* renamed from: vpx reason: default package */
public final class vpx implements wut<wan, wud<JsonNode>> {
    public final /* synthetic */ Object call(Object obj) {
        return wud.a((wun<Emitter<T>>) new $$Lambda$vpx$KU89K7I1sr0sbq9hD_DeYRLR9U<Emitter<T>>(this, (wan) obj), BackpressureMode.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wan wan, final Emitter emitter) {
        wan.c().b(new wcf<JsonNode>() {
            public final /* synthetic */ void a_(wav wav, Object obj) {
                emitter.onNext((JsonNode) obj);
            }
        });
    }
}
