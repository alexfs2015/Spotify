package defpackage;

import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import java.io.Serializable;

/* renamed from: skd reason: default package */
public final class skd implements skc {
    public final a a(a aVar, Entity entity) {
        if (!((EntityCase.a(entity.d) == EntityCase.AUDIO_EPISODE && entity.n().e) || (EntityCase.a(entity.d) == EntityCase.TRACK && entity.k().d))) {
            return aVar;
        }
        String str = "explicit";
        return aVar.c("label", str).a(str, (Serializable) Boolean.TRUE);
    }
}
