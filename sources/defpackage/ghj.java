package defpackage;

import android.util.Pair;
import com.google.common.base.Function;
import com.google.protobuf.ByteString;
import com.spotify.eventsender.gabo.EventEnvelope;
import com.spotify.eventsender.gabo.EventEnvelope.EventFragment;

/* renamed from: ghj reason: default package */
public final class ghj {
    /* access modifiers changed from: private */
    public static /* synthetic */ EventFragment a(Pair pair) {
        return (EventFragment) EventFragment.k().a((String) pair.first).a((ByteString) pair.second).g();
    }

    /* access modifiers changed from: 0000 */
    public final EventEnvelope a(gff gff) {
        return (EventEnvelope) EventEnvelope.k().a(gff.b()).a((Iterable<? extends EventFragment>) fcp.a(gff.e()).a((Function<? super E, T>) $$Lambda$ghj$N4EHCuV1BEGFkRQkybfIqbhCj5I.INSTANCE)).a(gff.c()).a(gff.d()).g();
    }
}
