package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem.Type;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.io.Serializable;
import java.util.List;

/* renamed from: nkf reason: default package */
public final class nkf implements xiz<RecentlyPlayedItems, String, List<hcm>> {
    private final fqn a;
    private final hgb b;
    private final tvn c;

    nkf(fqn fqn, hgb hgb, tvn tvn) {
        this.a = (fqn) fbp.a(fqn);
        this.b = hgb;
        this.c = tvn;
    }

    /* renamed from: a */
    public final List<hcm> call(RecentlyPlayedItems recentlyPlayedItems, String str) {
        String str2;
        a aVar;
        String str3;
        String str4 = str;
        a g = ImmutableList.g();
        char c2 = 0;
        int i = 0;
        for (RecentlyPlayedItem recentlyPlayedItem : recentlyPlayedItems.items) {
            hgb hgb = this.b;
            switch (recentlyPlayedItem.type) {
                case PLAYLIST:
                case ALBUM:
                case ARTIST:
                case RADIO:
                case DAILYMIX:
                case SHOW:
                case TRACK:
                    str2 = recentlyPlayedItem.name;
                    break;
                case COLLECTION_SONGS:
                    str2 = hgb.a.getResources().getString(R.string.recently_played_liked_songs);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown type with link: ");
                    sb.append(recentlyPlayedItem.link);
                    Assertion.a(sb.toString());
                    str2 = "";
                    break;
            }
            if (!fbo.a(str2)) {
                String uri = recentlyPlayedItem.getUri();
                String targetUri = recentlyPlayedItem.getTargetUri(this.c, this.a);
                String str5 = (String) recentlyPlayedItem.formatListAttributes.get("image");
                boolean z = recentlyPlayedItem.type == Type.COLLECTION_SONGS;
                a a2 = hcy.builder().a(str2);
                a builder = hcx.builder();
                if (z) {
                    aVar = builder.a("home:cardLikedSongs", HubsComponentCategory.CARD.mId).c("shuffleBadge", Boolean.valueOf(!jus.c(this.a)));
                } else {
                    aVar = builder.a(rqs.a);
                    Optional<Boolean> optional = recentlyPlayedItem.isOnDemandInFree;
                    if (optional.b()) {
                        aVar = aVar.c("isOnDemandInFree", (Serializable) optional.c());
                    }
                }
                a a3 = HubsImmutableComponentBundle.builder().a("ui:group", "shows-recently-played-group").a("ui:uri", uri).a("ui:index_in_block", i);
                if (!fbo.a(str) && str4.contains("-cached")) {
                    a3 = a3.a("ui:source", str4);
                }
                Object[] objArr = new Object[1];
                objArr[c2] = Integer.valueOf(i);
                a a4 = aVar.a(String.format("home-recently-played_card%s", objArr));
                a builder2 = hcw.builder();
                a builder3 = hcz.builder();
                if (str5 == null) {
                    str5 = recentlyPlayedItem.getImageUri();
                }
                a a5 = builder3.a(str5).a((Enum<?>) hal.b(uri));
                int i2 = AnonymousClass1.a[jva.a((String) fbp.a(uri)).b.ordinal()];
                if (i2 != 1) {
                    switch (i2) {
                        case 11:
                        case 12:
                        case 13:
                            str3 = "rounded";
                            break;
                        default:
                            str3 = "default";
                            break;
                    }
                } else {
                    str3 = "circular";
                }
                a a6 = a4.a(builder2.a(a5.a("style", str3).a())).a("click", gya.a(targetUri)).a("uri", (Serializable) uri).c(a3.a()).a(a2.a());
                String str6 = "isFresh";
                String str7 = (String) recentlyPlayedItem.formatListAttributes.get(str6);
                if (str7 != null) {
                    a6 = a6.c(str6, Boolean.valueOf(str7));
                }
                g = g.c(a6.a());
                i++;
            }
            c2 = 0;
        }
        return g.a();
    }
}
