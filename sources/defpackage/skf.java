package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import java.io.Serializable;

/* renamed from: skf reason: default package */
public final class skf implements skc {
    private final skb a;

    public skf(skb skb) {
        this.a = skb;
    }

    public final a a(a aVar, Entity entity) {
        a c = aVar.c(SearchHistoryItem.SEARCH_HISTORY_SUBTITLE, this.a.b(entity));
        if (!(EntityCase.a(entity.d) == EntityCase.TRACK)) {
            return c;
        }
        return c.a("album_uri", (Serializable) entity.k().k().d);
    }
}
