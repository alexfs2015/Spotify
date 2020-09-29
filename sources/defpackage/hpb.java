package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;

/* renamed from: hpb reason: default package */
public final class hpb {
    public final hpg a;
    public final Context b;

    public hpb(hpg hpg, Context context) {
        this.a = hpg;
        this.b = context;
    }

    public final MediaBrowserItem a(uyq uyq) {
        String targetUri = uyq.getTargetUri();
        if (fax.a(targetUri)) {
            return null;
        }
        String name = uyq.getName();
        uyr artist = uyq.getArtist();
        String name2 = artist != null ? artist.getName() : "";
        Uri a2 = this.a.a(uyq.getImageUri(Size.NORMAL));
        boolean z = uyq.getOfflineState() instanceof a;
        hpa hpa = new hpa(targetUri);
        hpa.b = name;
        hpa.c = name2;
        hpa.d = a2;
        hpa.a = ActionType.PLAYABLE;
        hpa.f = z;
        return hpa.b();
    }

    public final MediaBrowserItem a(uyz uyz) {
        String a2 = uyz.a();
        String uri = uyz.getUri();
        int t = uyz.t();
        String imageUri = uyz.getImageUri(Size.LARGE);
        Uri parse = Uri.parse(uri);
        Uri a3 = this.a.a(imageUri);
        uzd d = uyz.d();
        StringBuilder sb = new StringBuilder(64);
        String c = d != null ? d.c() : "";
        if (!uyz.k() && !fax.a(c)) {
            sb.append(String.format(this.b.getString(R.string.playlist_by_owner), new Object[]{c}));
            sb.append(" • ");
        }
        sb.append(this.b.getResources().getQuantityString(R.plurals.playlist_track_count, t, new Object[]{Integer.valueOf(t)}));
        boolean z = uyz.s() instanceof a;
        hpa hpa = new hpa(parse);
        hpa.b = a2;
        hpa.a = ActionType.PLAYABLE;
        hpa.c = sb.toString();
        hpa.d = a3;
        hpa.f = z;
        return hpa.b();
    }

    public final MediaBrowserItem a(uys uys, gbt<uys, String> gbt) {
        hpa hpa = new hpa(uys.getUri());
        hpa.a = ActionType.PLAYABLE;
        hpa.b = uys.getTitle();
        hpa.c = (String) gbt.apply(uys);
        hpa.d = this.a.a(uys.getImageUri());
        hpa.e = (!TextUtils.isEmpty(uys.getImageUri()) ? Uri.parse(uys.getImageUri()) : Uri.EMPTY).toString();
        Show t = uys.t();
        if (t != null) {
            hpa.a().putString("com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ContentUri", t.getUri());
        }
        return hpa.b();
    }
}
