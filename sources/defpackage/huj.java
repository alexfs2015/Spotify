package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;

/* renamed from: huj reason: default package */
public final class huj implements hth {
    private final vjp b;
    private final PlaylistMetadataDecorationPolicy c;
    private final FolderMetadataDecorationPolicy d;
    private final hrc e;

    public huj(vjp vjp, PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy, FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, hrc hrc) {
        this.b = vjp;
        this.c = playlistMetadataDecorationPolicy;
        this.d = folderMetadataDecorationPolicy;
        this.e = hrc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(vky vky) {
        vlc[] vlcArr;
        ArrayList arrayList = new ArrayList(((vlc[]) vky.getItems()).length);
        for (vlc vlc : (vlc[]) vky.getItems()) {
            if (!vlc.f()) {
                arrayList.add(this.e.a(vlc));
            } else if (vlc.r() != null) {
                hrc hrc = this.e;
                vky r = vlc.r();
                String a = r.a();
                String b2 = r.b();
                int d2 = r.d();
                StringBuilder sb = new StringBuilder(64);
                sb.append(hrc.b.getResources().getQuantityString(R.plurals.playlist_playlist_count, d2, new Object[]{Integer.valueOf(d2)}));
                int c2 = r.c();
                if (c2 > 0) {
                    sb.append(", ");
                    sb.append(hrc.b.getResources().getQuantityString(R.plurals.playlist_folder_count, c2, new Object[]{Integer.valueOf(c2)}));
                }
                hup hup = new hup(Uri.parse(b2));
                hup.b = a;
                hup.c = sb.toString();
                hup.a = ActionType.BROWSABLE;
                hup.d = gcd.a(hrc.b, R.drawable.mediaservice_playlists);
                hup.g = true;
                arrayList.add(hup.b());
            }
        }
        return arrayList;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.b.a(huo.b().contains(":folder:") ? Optional.c(jva.a(huo.b()).k()) : Optional.e(), a.m().a(Optional.b(RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a(this.c).a(this.d).a()).a())).c(z ? Optional.e() : Optional.b(Boolean.TRUE)).a()).f(new $$Lambda$huj$7pjncdXtJSpsz3m8God4TdWwc(this));
    }
}
