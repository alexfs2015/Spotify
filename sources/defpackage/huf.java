package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: huf reason: default package */
public final class huf implements hth {
    private final hrc b;
    private final iqw c;

    public huf(iqw iqw, hrc hrc) {
        this.c = iqw;
        this.b = hrc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(vlb vlb) {
        MediaBrowserItem mediaBrowserItem;
        String str;
        vku[] vkuArr = (vku[]) vlb.getItems();
        ArrayList arrayList = new ArrayList(vkuArr.length);
        for (vku vku : vkuArr) {
            hrc hrc = this.b;
            String uri = vku.getUri();
            if (fbo.a(uri)) {
                mediaBrowserItem = null;
            } else {
                int numTracksInCollection = vku.getNumTracksInCollection();
                String collectionUri = vku.getCollectionUri();
                if (numTracksInCollection <= 0 || TextUtils.isEmpty(collectionUri)) {
                    collectionUri = uri;
                }
                String name = vku.getName();
                if (numTracksInCollection <= 0) {
                    Logger.b("Artist %s (%s) does not have any songs in any of the user`s collections.", name, uri);
                    str = jun.a(hrc.b.getResources().getString(R.string.collection_artist_subtitle_following), Locale.getDefault());
                } else {
                    str = hrc.b.getResources().getQuantityString(R.plurals.mobile_artist_tracks_count, numTracksInCollection, new Object[]{Integer.valueOf(numTracksInCollection)});
                }
                Uri a = hrc.a.a(vku.getImageUri(Size.NORMAL));
                boolean z = vku.getOfflineState() instanceof a;
                hup hup = new hup(collectionUri);
                hup.b = name;
                hup.c = str;
                hup.d = a;
                hup.a = ActionType.PLAYABLE;
                hup.g = z;
                mediaBrowserItem = hup.b();
            }
            arrayList.add(mediaBrowserItem);
        }
        return arrayList;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        iqv a = this.c.a();
        a.a(false, !z, false);
        return a.a().h().f(new $$Lambda$huf$9jfd6H7Evmws4CUVgvcsTvJf3A(this));
    }
}
