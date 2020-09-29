package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import com.spotify.searchview.proto.EntityType;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sja reason: default package */
public final class sja implements Function<sjg, hcs> {
    private final siv a;
    private final sjy b;
    private final sjv c;
    private final sjt d;
    private final boolean e;
    private final siw f;

    public sja(siv siv, sjt sjt, sjy sjy, sjv sjv, boolean z, siw siw) {
        this.a = siv;
        this.b = sjy;
        this.c = sjv;
        this.d = sjt;
        this.e = z;
        this.f = siw;
    }

    private static hcj a(sjg sjg) {
        String str = "requestId";
        String str2 = "pageIdentifier";
        String str3 = "isLastPage";
        a a2 = HubsImmutableComponentBundle.builder().a("searchTerm", sjg.b()).a(str, sjg.a()).a(str2, a(sjg.c())).a(str3, b(sjg));
        if (sjg.d().b()) {
            a2 = a2.a("lastOffset", ((Integer) sjg.d().c()).intValue());
        }
        return a2.a();
    }

    private static String a(EntityCase entityCase) {
        switch (entityCase) {
            case TRACK:
                return "track-results";
            case ALBUM:
                return "album-results";
            case AUDIO_SHOW:
                return "show-results";
            case AUDIO_EPISODE:
                return "audioepisodes-results";
            case ARTIST:
                return "artist-results";
            case PLAYLIST:
                return "playlist-results";
            case GENRE:
                return "genre-results";
            case PROFILE:
                return "profile-results";
            default:
                return "search-results";
        }
    }

    private static String a(EntityType entityType) {
        PageIdentifiers pageIdentifiers;
        switch (entityType) {
            case ENTITY_TYPE_ARTIST:
                pageIdentifiers = PageIdentifiers.SEARCH_ARTISTS;
                break;
            case ENTITY_TYPE_TRACK:
                pageIdentifiers = PageIdentifiers.SEARCH_SONGS;
                break;
            case ENTITY_TYPE_ALBUM:
                pageIdentifiers = PageIdentifiers.SEARCH_ALBUMS;
                break;
            case ENTITY_TYPE_PLAYLIST:
                pageIdentifiers = PageIdentifiers.SEARCH_PLAYLISTS;
                break;
            case ENTITY_TYPE_GENRE:
                pageIdentifiers = PageIdentifiers.SEARCH_GENRES;
                break;
            case ENTITY_TYPE_AUDIO_SHOW:
                pageIdentifiers = PageIdentifiers.SEARCH_SHOWS;
                break;
            case ENTITY_TYPE_AUDIO_EPISODE:
                pageIdentifiers = PageIdentifiers.SEARCH_AUDIOS;
                break;
            case ENTITY_TYPE_PROFILE:
                pageIdentifiers = PageIdentifiers.SEARCH_PROFILES;
                break;
            default:
                pageIdentifiers = PageIdentifiers.SEARCH;
                break;
        }
        return pageIdentifiers.a();
    }

    private static boolean b(sjg sjg) {
        return sjg.e().k() < 20;
    }

    public final /* synthetic */ Object apply(Object obj) {
        hcm hcm;
        sjg sjg = (sjg) obj;
        if (sjg.e().k() <= 0) {
            return !sjg.d().b() ? this.a.a(sjg.b(), false).toBuilder().b(a(sjg)).a() : hdb.EMPTY.toBuilder().b(HubsImmutableComponentBundle.builder().a("isLastPage", true).a()).a();
        }
        e<Entity> eVar = sjg.e().d;
        int intValue = sjg.d().b() ? ((Integer) sjg.d().c()).intValue() : 0;
        ArrayList arrayList = new ArrayList(eVar.size());
        for (int i = 0; i < eVar.size(); i++) {
            String a2 = sjg.a();
            int i2 = intValue + i;
            Entity entity = (Entity) eVar.get(i);
            if (EntityCase.a(entity.d) == EntityCase.PLAYLIST) {
                hcm = this.c.a(entity, i2, a2, a(EntityCase.a(entity.d))).a();
            } else {
                sjx a3 = this.b.a(entity, i2, a2, a(EntityCase.a(entity.d)));
                a3.a = this.e;
                int i3 = AnonymousClass1.a[EntityCase.a(entity.d).ordinal()];
                if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                    a3.b = true;
                }
                hcm = this.f.a(entity, a3.a());
            }
            arrayList.add(hcm);
        }
        return hdb.builder().b(this.d.a(sjg.c(), sjg.b())).a((List<? extends hcm>) arrayList).a(a(sjg)).a();
    }
}
