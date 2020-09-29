package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import com.spotify.searchview.proto.EntityType;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rzm reason: default package */
public final class rzm implements Function<rzv, gzz> {
    private final rzh a;
    private final rzq b;
    private final rzw c;
    private final boolean d;
    private final rzi e;

    public final /* synthetic */ Object apply(Object obj) {
        gzt gzt;
        rzv rzv = (rzv) obj;
        if (rzv.e().k() > 0) {
            e<Entity> eVar = rzv.e().d;
            int intValue = rzv.d().b() ? ((Integer) rzv.d().c()).intValue() : 0;
            ArrayList arrayList = new ArrayList(eVar.size());
            for (int i = 0; i < eVar.size(); i++) {
                String a2 = rzv.a();
                int i2 = intValue + i;
                Entity entity = (Entity) eVar.get(i);
                if (EntityCase.a(entity.d) == EntityCase.PLAYLIST) {
                    rzx rzx = new rzx(this.c, this.b, entity, i2, a2, a(EntityCase.a(entity.d)));
                    gzt = rzx.a();
                } else {
                    rzy rzy = r9;
                    rzy rzy2 = new rzy(this.c, this.b, entity, i2, a2, a(EntityCase.a(entity.d)));
                    rzy.a = this.d;
                    int i3 = AnonymousClass1.a[EntityCase.a(entity.d).ordinal()];
                    if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                        rzy.b = true;
                    }
                    gzt = this.e.a(entity, rzy.a());
                }
                arrayList.add(gzt);
            }
            return hai.builder().b(this.c.a(rzv.c(), rzv.b())).a((List<? extends gzt>) arrayList).a(a(rzv)).a();
        } else if (!rzv.d().b()) {
            return this.a.a(rzv.b(), false).toBuilder().b(a(rzv)).a();
        } else {
            return hai.EMPTY.toBuilder().b(HubsImmutableComponentBundle.builder().a("isLastPage", true).a()).a();
        }
    }

    public rzm(rzh rzh, rzq rzq, rzw rzw, boolean z, rzi rzi) {
        this.a = rzh;
        this.b = rzq;
        this.c = rzw;
        this.d = z;
        this.e = rzi;
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

    private static gzq a(rzv rzv) {
        String str = "requestId";
        String str2 = "pageIdentifier";
        String str3 = "isLastPage";
        a a2 = HubsImmutableComponentBundle.builder().a("searchTerm", rzv.b()).a(str, rzv.a()).a(str2, a(rzv.c())).a(str3, b(rzv));
        if (rzv.d().b()) {
            a2 = a2.a("lastOffset", ((Integer) rzv.d().c()).intValue());
        }
        return a2.a();
    }

    private static boolean b(rzv rzv) {
        return rzv.e().k() < 20;
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
}
