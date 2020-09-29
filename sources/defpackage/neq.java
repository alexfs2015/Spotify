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

/* renamed from: neq reason: default package */
public final class neq implements wuu<RecentlyPlayedItems, String, List<gzt>> {
    private final fpt a;
    private final hdf b;
    private final tjv c;

    neq(fpt fpt, hdf hdf, tjv tjv) {
        this.a = (fpt) fay.a(fpt);
        this.b = hdf;
        this.c = tjv;
    }

    /* renamed from: a */
    public final List<gzt> call(RecentlyPlayedItems recentlyPlayedItems, String str) {
        String str2;
        a aVar;
        String str3;
        String str4 = str;
        a g = ImmutableList.g();
        char c2 = 0;
        int i = 0;
        for (RecentlyPlayedItem recentlyPlayedItem : recentlyPlayedItems.items) {
            hdf hdf = this.b;
            switch (recentlyPlayedItem.type) {
                case PLAYLIST:
                case ALBUM:
                case ARTIST:
                case RADIO:
                case DAILYMIX:
                case SHOW:
                    str2 = recentlyPlayedItem.name;
                    break;
                case COLLECTION_SONGS:
                    str2 = hdf.a.getResources().getString(R.string.recently_played_liked_songs);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown type with link: ");
                    sb.append(recentlyPlayedItem.link);
                    Assertion.a(sb.toString());
                    str2 = "";
                    break;
            }
            if (!fax.a(str2)) {
                String uri = recentlyPlayedItem.getUri();
                String targetUri = recentlyPlayedItem.getTargetUri(this.c, this.a);
                String str5 = (String) recentlyPlayedItem.formatListAttributes.get("image");
                boolean z = recentlyPlayedItem.type == Type.COLLECTION_SONGS;
                a a2 = haf.builder().a(str2);
                a builder = hae.builder();
                if (z) {
                    aVar = builder.a("home:cardLikedSongs", HubsComponentCategory.CARD.mId).c("shuffleBadge", Boolean.valueOf(!jsl.c(this.a)));
                } else {
                    aVar = builder.a(rhq.a);
                    Optional<Boolean> optional = recentlyPlayedItem.isOnDemandInFree;
                    if (optional.b()) {
                        aVar = aVar.c("isOnDemandInFree", (Serializable) optional.c());
                    }
                }
                a a3 = HubsImmutableComponentBundle.builder().a("ui:group", "shows-recently-played-group").a("ui:uri", uri).a("ui:index_in_block", i);
                if (!fax.a(str) && str4.contains("-cached")) {
                    a3 = a3.a("ui:source", str4);
                }
                Object[] objArr = new Object[1];
                objArr[c2] = Integer.valueOf(i);
                a a4 = aVar.a(String.format("home-recently-played_card%s", objArr));
                a builder2 = had.builder();
                a builder3 = hag.builder();
                if (str5 == null) {
                    str5 = recentlyPlayedItem.getImageUri();
                }
                a a5 = builder3.a(str5).a((Enum<?>) gxs.b(uri));
                int i2 = AnonymousClass1.a[jst.a((String) fay.a(uri)).b.ordinal()];
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
                a a6 = a4.a(builder2.a(a5.a("style", str3).a())).a("click", gvz.a(targetUri)).a("uri", (Serializable) uri).c(a3.a()).a(a2.a());
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
