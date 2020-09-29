package defpackage;

import android.util.Pair;
import com.google.common.base.Function;
import com.google.protobuf.ByteString;
import com.spotify.eventsender.gabo.EventEnvelope;
import com.spotify.eventsender.gabo.EventEnvelope.EventFragment;

/* renamed from: gfy reason: default package */
public final class gfy {
    /* access modifiers changed from: 0000 */
    public final EventEnvelope a(gdu gdu) {
        return (EventEnvelope) EventEnvelope.k().a(gdu.b()).a((Iterable<? extends EventFragment>) fbx.a(gdu.e()).a((Function<? super E, T>) $$Lambda$gfy$PeOXNsl_dGfYw4onL1jQsXLVE8c.INSTANCE)).a(gdu.c()).a(gdu.d()).g();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ EventFragment a(Pair pair) {
        return (EventFragment) EventFragment.k().a((String) pair.first).a((ByteString) pair.second).g();
    }
}
