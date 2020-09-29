package defpackage;

import com.google.common.collect.ImmutableMap;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$krj$4E0_ehjbXyzLSa8Q33OWoUnr-is reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krj$4E0_ehjbXyzLSa8Q33OWoUnris implements Function {
    private final /* synthetic */ krn f$0;

    public /* synthetic */ $$Lambda$krj$4E0_ehjbXyzLSa8Q33OWoUnris(krn krn) {
        this.f$0 = krn;
    }

    public final Object apply(Object obj) {
        return krj.a(this.f$0, "ad_voice_speech_received", ((e) obj).b, ((e) obj).c, ImmutableMap.b("utterance_id", ((e) obj).a));
    }
}
