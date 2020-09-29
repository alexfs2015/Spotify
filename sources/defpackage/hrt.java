package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: hrt reason: default package */
public final class hrt implements hqx {
    private final hpb b;
    private final ioj c;

    public hrt(ioj ioj, hpb hpb) {
        this.c = ioj;
        this.b = hpb;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        ioi a = this.c.a();
        a.a(false, false, false);
        return a.a().h().f(new $$Lambda$hrt$uzUmcka4K03qo_0EMjjP0U_Uww(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(uyy uyy) {
        MediaBrowserItem mediaBrowserItem;
        String str;
        uyr[] uyrArr = (uyr[]) uyy.getItems();
        ArrayList arrayList = new ArrayList(uyrArr.length);
        for (uyr uyr : uyrArr) {
            hpb hpb = this.b;
            String uri = uyr.getUri();
            if (fax.a(uri)) {
                mediaBrowserItem = null;
            } else {
                int numTracksInCollection = uyr.getNumTracksInCollection();
                String collectionUri = uyr.getCollectionUri();
                if (numTracksInCollection <= 0 || TextUtils.isEmpty(collectionUri)) {
                    collectionUri = uri;
                }
                String name = uyr.getName();
                if (numTracksInCollection <= 0) {
                    Logger.b("Artist %s (%s) does not have any songs in any of the user`s collections.", name, uri);
                    str = jsd.a(hpb.b.getResources().getString(R.string.collection_artist_subtitle_following), Locale.getDefault());
                } else {
                    str = hpb.b.getResources().getQuantityString(R.plurals.mobile_artist_tracks_count, numTracksInCollection, new Object[]{Integer.valueOf(numTracksInCollection)});
                }
                Uri a = hpb.a.a(uyr.getImageUri(Size.NORMAL));
                boolean z = uyr.getOfflineState() instanceof a;
                hpa hpa = new hpa(collectionUri);
                hpa.b = name;
                hpa.c = str;
                hpa.d = a;
                hpa.a = ActionType.PLAYABLE;
                hpa.f = z;
                mediaBrowserItem = hpa.b();
            }
            arrayList.add(mediaBrowserItem);
        }
        return arrayList;
    }
}
