package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem.Type;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: htm reason: default package */
public final class htm implements hth {
    private final hga b;
    private final Context c;
    private final hre d;
    private final jty e;

    public htm(Context context, hre hre, hga hga, jty jty) {
        this.c = context;
        this.d = hre;
        this.b = hga;
        this.e = jty;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(RecentlyPlayedItems recentlyPlayedItems) {
        String str;
        Uri uri;
        RecentlyPlayedItem[] items = recentlyPlayedItems.getItems();
        if (items == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(items.length);
        for (RecentlyPlayedItem recentlyPlayedItem : items) {
            String str2 = recentlyPlayedItem.name;
            String str3 = "Unknown type with link: ";
            switch (recentlyPlayedItem.type) {
                case PLAYLIST:
                    if (!recentlyPlayedItem.isOwnedBySelf && !fbo.a(recentlyPlayedItem.ownerName)) {
                        str = this.c.getString(R.string.recently_played_playlist_by, new Object[]{recentlyPlayedItem.ownerName});
                        break;
                    } else {
                        str = this.c.getResources().getString(R.string.recently_played_playlist);
                        break;
                    }
                case ALBUM:
                    str = this.c.getString(R.string.recently_played_album_by, new Object[]{recentlyPlayedItem.artistName});
                    break;
                case ARTIST:
                    str = this.c.getString(R.string.recently_played_artist);
                    break;
                case SHOW:
                    str = this.c.getString(R.string.recently_played_show_by, new Object[]{recentlyPlayedItem.publisher});
                    break;
                case RADIO:
                case DAILYMIX:
                    str = ute.a(this.c, jva.a(ute.c(recentlyPlayedItem.link)));
                    break;
                default:
                    StringBuilder sb = new StringBuilder(str3);
                    sb.append(recentlyPlayedItem.link);
                    Assertion.b(sb.toString());
                    str = "";
                    break;
            }
            switch (recentlyPlayedItem.type) {
                case PLAYLIST:
                case ALBUM:
                case ARTIST:
                case SHOW:
                    uri = Uri.parse(recentlyPlayedItem.link);
                    break;
                case RADIO:
                case DAILYMIX:
                    uri = ute.a(ute.d(recentlyPlayedItem.link), this.e);
                    break;
                case COLLECTION_SONGS:
                    uri = Uri.EMPTY;
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder(str3);
                    sb2.append(recentlyPlayedItem.link);
                    Assertion.b(sb2.toString());
                    uri = Uri.EMPTY;
                    break;
            }
            boolean z = recentlyPlayedItem.offlineState instanceof a;
            hup hup = new hup(uri);
            hup.d = this.d.a(recentlyPlayedItem.imageUri);
            hup.f = (!TextUtils.isEmpty(recentlyPlayedItem.imageUri) ? Uri.parse(recentlyPlayedItem.imageUri) : Uri.EMPTY).toString();
            hup.b = str2;
            hup.c = str;
            hup.g = z;
            if (recentlyPlayedItem.type == Type.SHOW) {
                hup.a = ActionType.BROWSABLE;
                hup.a(new gqn().b(1).a);
            } else {
                hup.a = ActionType.PLAYABLE;
                hup.c = str;
            }
            arrayList.add(hup.b());
        }
        return arrayList;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.b.a().h().f(new $$Lambda$htm$YCy8kEfHh_qntsg0uFlFJXZooas(this));
    }
}
