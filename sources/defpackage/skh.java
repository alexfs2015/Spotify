package defpackage;

import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;

/* renamed from: skh reason: default package */
public final class skh implements skc {
    public final a a(a aVar, Entity entity) {
        if (!(EntityCase.a(entity.d) == EntityCase.ARTIST || EntityCase.a(entity.d) == EntityCase.PROFILE)) {
            return aVar;
        }
        hcp main = aVar.a().images().main();
        if (main == null) {
            return aVar;
        }
        return aVar.a(hcw.builder().a(main.toBuilder().a("style", "circular")));
    }
}
