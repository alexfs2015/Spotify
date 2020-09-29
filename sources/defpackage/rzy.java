package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import com.spotify.searchview.proto.Track;
import java.io.Serializable;

/* renamed from: rzy reason: default package */
public final class rzy {
    boolean a;
    boolean b;
    private final sab c;
    private final rzq d;
    private final Entity e;
    private final int f;
    private final String g;
    private final String h;

    public rzy(sab sab, rzq rzq, Entity entity, int i, String str, String str2) {
        this.c = sab;
        this.d = rzq;
        this.e = entity;
        this.f = i;
        this.g = str;
        this.h = str2;
    }

    public final gzt a() {
        a a2 = a(this.e, hag.builder().a(this.e.g).a((Enum<?>) this.d.a(this.e)));
        a a3 = haf.builder().a(this.e.f);
        a builder = hae.builder();
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append('-');
        sb.append(this.f);
        String str = "ui:index_in_block";
        String str2 = "ui:source";
        a c2 = builder.a(sb.toString()).a((gzr) HubsGlueRow.NORMAL).a(had.builder().a(a2)).a((gzy) gzx.a(this.e.e)).c(HubsImmutableComponentBundle.builder().a("ui:group", this.h).a(str, this.f).a(str2, this.g).a());
        if (this.b) {
            a3 = a3.b(this.c.a(this.e));
        }
        return a(this.e, a(this.e, c2.a(a3), this.a)).a();
    }

    private a a(Entity entity, a aVar, boolean z) {
        if (a(entity)) {
            aVar = a(aVar);
        }
        if (b(entity)) {
            aVar = b(aVar);
        }
        if (z) {
            aVar = c(aVar);
        }
        return aVar.c(SearchHistoryItem.SEARCH_HISTORY_SUBTITLE, this.c.b(entity));
    }

    private static a a(a aVar) {
        return aVar.c("label", "explicit");
    }

    private static a b(a aVar) {
        return aVar.c("label", "premium");
    }

    private static a c(a aVar) {
        return aVar.c("secondary_icon", "chevron_right");
    }

    private static a a(Entity entity, a aVar) {
        if (a(entity)) {
            aVar = d(aVar);
        }
        return EntityCase.a(entity.d) == EntityCase.TRACK ? a(entity.k(), aVar) : aVar;
    }

    private static a a(Track track, a aVar) {
        return aVar.a("album_uri", (Serializable) track.k().d);
    }

    private static a d(a aVar) {
        return aVar.a("explicit", (Serializable) Boolean.TRUE);
    }

    private static boolean a(Entity entity) {
        return (EntityCase.a(entity.d) == EntityCase.AUDIO_EPISODE && entity.n().e) || (EntityCase.a(entity.d) == EntityCase.TRACK && entity.k().d);
    }

    private static boolean b(Entity entity) {
        return EntityCase.a(entity.d) == EntityCase.TRACK && entity.k().e;
    }

    private static a a(Entity entity, a aVar) {
        if (EntityCase.a(entity.d) == EntityCase.ARTIST || EntityCase.a(entity.d) == EntityCase.PROFILE) {
            return aVar.a("style", "circular");
        }
        return aVar;
    }
}
