package defpackage;

import android.util.Pair;
import com.google.common.base.Function;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.eventsender.FragmentsContainer;

/* renamed from: gdv reason: default package */
final class gdv {
    private final gej a;

    public gdv(gej gej) {
        this.a = gej;
    }

    /* access modifiers changed from: 0000 */
    public final gdu a(gfk gfk) {
        FragmentsContainer l = FragmentsContainer.l();
        try {
            l = FragmentsContainer.a(gfk.f);
        } catch (InvalidProtocolBufferException e) {
            this.a.a((Throwable) e, "Error in parsing contexts.");
        }
        return new a().a(gfk.a).a(gfk.c).a(ByteString.a(gfk.d)).b(gfk.e).a((Iterable<Pair<String, ByteString>>) fbx.a((Iterable<E>) l.d).a((Function<? super E, T>) $$Lambda$gdv$emd0DSRWMc17ZHafsonGcTfJ1nQ.INSTANCE)).a();
    }
}
