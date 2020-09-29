package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem.Type;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: hra reason: default package */
public final class hra implements hqx {
    private final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());
    private final jro c;
    private final jrf d;
    private final hde e;
    private final Context f;
    private final hpg g;

    public hra(Context context, jro jro, jrf jrf, hpg hpg, hde hde) {
        this.f = context;
        this.c = jro;
        this.d = jrf;
        this.g = hpg;
        this.e = hde;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        CC.a(this.c, this.b, this.d).put("region", str);
        return vun.a(vun.a((ObservableSource<T>) this.e.a(), BackpressureStrategy.BUFFER).f(new $$Lambda$hra$T87ijs1FaTraRMhZ8U9j1hEHI(this)).a());
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
                    if (!recentlyPlayedItem.isOwnedBySelf && !fax.a(recentlyPlayedItem.ownerName)) {
                        str = this.f.getString(R.string.recently_played_playlist_by, new Object[]{recentlyPlayedItem.ownerName});
                        break;
                    } else {
                        str = this.f.getResources().getString(R.string.recently_played_playlist);
                        break;
                    }
                case ALBUM:
                    str = this.f.getString(R.string.recently_played_album_by, new Object[]{recentlyPlayedItem.artistName});
                    break;
                case ARTIST:
                    str = this.f.getString(R.string.recently_played_artist);
                    break;
                case SHOW:
                    str = this.f.getString(R.string.recently_played_show_by, new Object[]{recentlyPlayedItem.publisher});
                    break;
                case RADIO:
                case DAILYMIX:
                    str = uhq.a(this.f, jst.a(uhq.d(recentlyPlayedItem.link)));
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
                    uri = uhq.a(uhq.e(recentlyPlayedItem.link));
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
            hpa hpa = new hpa(uri);
            hpa.d = this.g.a(recentlyPlayedItem.imageUri);
            hpa.e = (!TextUtils.isEmpty(recentlyPlayedItem.imageUri) ? Uri.parse(recentlyPlayedItem.imageUri) : Uri.EMPTY).toString();
            hpa.b = str2;
            hpa.c = str;
            hpa.f = z;
            if (recentlyPlayedItem.type == Type.SHOW) {
                hpa.a = ActionType.BROWSABLE;
                hpa.a(new gox().b(1).a);
            } else {
                hpa.a = ActionType.PLAYABLE;
                hpa.c = str;
            }
            arrayList.add(hpa.b());
        }
        return arrayList;
    }
}
