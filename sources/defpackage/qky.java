package defpackage;

import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import com.spotify.searchview.proto.Track;

/* renamed from: qky reason: default package */
public final class qky implements siw {
    private final boolean a;

    public qky(boolean z) {
        this.a = z;
    }

    public final hcm a(Entity entity, hcm hcm) {
        a builder = hcm.toBuilder();
        boolean z = true;
        if (this.a && EntityCase.a(entity.d) == EntityCase.TRACK && !fbo.a(entity.k().h)) {
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
