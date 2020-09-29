package defpackage;

import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;

/* renamed from: skl reason: default package */
public final class skl implements skc {
    public final a a(a aVar, Entity entity) {
        return EntityCase.a(entity.d) == EntityCase.TRACK && entity.k().e ? aVar.c("label", "premium") : aVar;
    }
}
