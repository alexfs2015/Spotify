package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$krj$P1rspTyZX0KnJoDfFRUO2NRYTMM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krj$P1rspTyZX0KnJoDfFRUO2NRYTMM implements Function {
    private final /* synthetic */ krn f$0;

    public /* synthetic */ $$Lambda$krj$P1rspTyZX0KnJoDfFRUO2NRYTMM(krn krn) {
        this.f$0 = krn;
    }

    public final Object apply(Object obj) {
        return krj.a(this.f$0, "ad_voice_error", ((d) obj).b, 0, ImmutableMap.a("utterance_id", ((d) obj).a, "error_message", ((d) obj).c));
    }
}
