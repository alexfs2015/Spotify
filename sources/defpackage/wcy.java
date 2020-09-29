package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

/* renamed from: wcy reason: default package */
public final class wcy implements xiy<wot, xii<JsonNode>> {
    /* access modifiers changed from: private */
    public /* synthetic */ void a(wot wot, final Emitter emitter) {
        wot.c().b(new wql<JsonNode>() {
            public final /* synthetic */ void a_(wpb wpb, Object obj) {
                emitter.onNext((JsonNode) obj);
            }
        });
    }

    public final /* synthetic */ Object call(Object obj) {
        return xii.a((xis<Emitter<T>>) new $$Lambda$wcy$IEVyPFhuq7a_ShCTlvsCR7ibmCI<Emitter<T>>(this, (wot) obj), BackpressureMode.LATEST);
    }
}
