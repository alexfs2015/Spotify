package defpackage;

import android.util.Pair;
import com.google.common.base.Function;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.eventsender.FragmentsContainer;

/* renamed from: gfg reason: default package */
final class gfg {
    private final gfu a;

    public gfg(gfu gfu) {
        this.a = gfu;
    }

    /* access modifiers changed from: 0000 */
    public final gff a(ggv ggv) {
        FragmentsContainer l = FragmentsContainer.l();
        try {
            l = FragmentsContainer.a(ggv.f);
        } catch (InvalidProtocolBufferException e) {
            this.a.a((Throwable) e, "Error in parsing contexts.");
        }
        return new a().a(ggv.a).a(ggv.c).a(ByteString.a(ggv.d)).b(ggv.e).a((Iterable<Pair<String, ByteString>>) fcp.a((Iterable<E>) l.d).a((Function<? super E, T>) $$Lambda$gfg$LBkdoD0ObRaGUGeCOYnxBvURcE.INSTANCE)).a();
    }
}
