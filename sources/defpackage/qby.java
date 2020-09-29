package defpackage;

import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import com.spotify.searchview.proto.Track;

/* renamed from: qby reason: default package */
public final class qby implements rzi {
    private final boolean a;

    public qby(boolean z) {
        this.a = z;
    }

    public final gzt a(Entity entity, gzt gzt) {
        a builder = gzt.toBuilder();
        boolean z = true;
        if (this.a && EntityCase.a(entity.d) == EntityCase.TRACK && !fax.a(entity.k().h)) {
            Track k = entity.k();
            builder = builder.c("onDemandPlaylistUri", k.h).c("onDemandTrackUri", k.g);
        }
        if (EntityCase.a(entity.d) != EntityCase.TRACK || !entity.k().i) {
            z = false;
        }
        if (z) {
            builder = builder.c("onDemand", Boolean.TRUE);
        }
        return builder.a();
    }
}
