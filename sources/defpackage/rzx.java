package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Card;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.searchview.proto.Entity;

/* renamed from: rzx reason: default package */
public final class rzx {
    private final sab a;
    private final rzq b;
    private final Entity c;
    private final int d;
    private final String e;
    private final String f;

    public rzx(sab sab, rzq rzq, Entity entity, int i, String str, String str2) {
        this.b = rzq;
        this.a = sab;
        this.c = entity;
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    public final gzt a() {
        String b2 = this.a.b(this.c);
        SpotifyIconV2 a2 = this.b.a(this.c);
        a builder = hae.builder();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('-');
        sb.append(this.d);
        return builder.a(sb.toString()).a((gzr) HubsGlue2Card.REGULAR).a(haf.builder().a(this.c.f)).a(had.builder().a(hag.builder().a(this.c.g).a((Enum<?>) a2))).a((gzy) gzx.a(this.c.e)).c(SearchHistoryItem.SEARCH_HISTORY_SUBTITLE, b2).c(HubsImmutableComponentBundle.builder().a("ui:group", this.f).a("ui:index_in_block", this.d).a("ui:source", this.e).a()).a();
    }
}
