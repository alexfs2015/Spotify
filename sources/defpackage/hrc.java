package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;

/* renamed from: hrc reason: default package */
public final class hrc {
    public final hre a;
    public final Context b;

    public hrc(hre hre, Context context) {
        this.a = hre;
        this.b = context;
    }

    public final MediaBrowserItem a(vkt vkt) {
        String targetUri = vkt.getTargetUri();
        if (fbo.a(targetUri)) {
            return null;
        }
        String name = vkt.getName();
        vku artist = vkt.getArtist();
        String name2 = artist != null ? artist.getName() : "";
        Uri a2 = this.a.a(vkt.getImageUri(Size.NORMAL));
        boolean z = vkt.getOfflineState() instanceof a;
        hup hup = new hup(targetUri);
        hup.b = name;
        hup.c = name2;
        hup.d = a2;
        hup.a = ActionType.PLAYABLE;
        hup.g = z;
        return hup.b();
    }

    public final MediaBrowserItem a(vkv vkv, gcr<vkv, String> gcr) {
        hup hup = new hup(vkv.getUri());
        hup.a = ActionType.PLAYABLE;
        hup.b = vkv.getTitle();
        hup.c = (String) gcr.apply(vkv);
        hup.d = this.a.a(vkv.getImageUri());
        hup.f = (!TextUtils.isEmpty(vkv.getImageUri()) ? Uri.parse(vkv.getImageUri()) : Uri.EMPTY).toString();
        Show t = vkv.t();
        if (t != null) {
            hup.a().putString("com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ContentUri", t.getUri());
        }
        return hup.b();
    }

    public final MediaBrowserItem a(vlc vlc) {
        String a2 = vlc.a();
        String uri = vlc.getUri();
        int t = vlc.t();
        String imageUri = vlc.getImageUri(Size.LARGE);
        Uri parse = Uri.parse(uri);
        Uri a3 = this.a.a(imageUri);
        vlg d = vlc.d();
        StringBuilder sb = new StringBuilder(64);
        String c = d != null ? d.c() : "";
        if (!vlc.k() && !fbo.a(c)) {
            sb.append(String.format(this.b.getString(R.string.playlist_by_owner), new Object[]{c}));
            sb.append(" • ");
        }
        sb.append(this.b.getResources().getQuantityString(R.plurals.playlist_track_count, t, new Object[]{Integer.valueOf(t)}));
        boolean z = vlc.s() instanceof a;
        hup hup = new hup(parse);
        hup.b = a2;
        hup.a = ActionType.PLAYABLE;
        hup.c = sb.toString();
        hup.d = a3;
        hup.g = z;
        return hup.b();
    }
}
