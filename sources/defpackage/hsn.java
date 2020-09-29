package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.SingleSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hsn reason: default package */
public final class hsn implements hpd {
    private final uxn a;
    private boolean b = false;
    private wuk c;
    private final PlaylistMetadataDecorationPolicy d;
    private final FolderMetadataDecorationPolicy e;
    private final hpb f;

    public hsn(uxn uxn, PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy, FolderMetadataDecorationPolicy folderMetadataDecorationPolicy, hpb hpb) {
        this.a = (uxn) fay.a(uxn);
        this.d = playlistMetadataDecorationPolicy;
        this.e = folderMetadataDecorationPolicy;
        this.f = hpb;
    }

    public final void a() {
        this.b = true;
        wuk wuk = this.c;
        if (wuk != null) {
            wuk.unsubscribe();
            this.c = null;
        }
    }

    public final void a(String str, hpe hpe) {
        Optional optional;
        Optional optional2;
        if (this.b) {
            hpe.a((Throwable) new IllegalStateException("loadItems can not be called after stop()"));
        } else if (!a(str)) {
            StringBuilder sb = new StringBuilder("Cannot load identifier ");
            sb.append(str);
            hpe.a((Throwable) new IllegalArgumentException(sb.toString()));
        } else {
            wuk wuk = this.c;
            if (wuk != null) {
                wuk.unsubscribe();
                this.c = null;
            }
            RootlistRequestPayload a2 = RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a(this.d).a(this.e).a()).a();
            if (str.contains(":folder:")) {
                optional = Optional.c(jst.a(str).k());
            } else {
                optional = Optional.e();
            }
            C0082a a3 = a.m().a(Optional.b(a2));
            if (jre.a(Uri.parse(str))) {
                optional2 = Optional.b(Boolean.TRUE);
            } else {
                optional2 = Optional.e();
            }
            wud a4 = wuh.a(vun.a((SingleSource<T>) this.a.a(optional, a3.c(optional2).a()))).a(vun.a(((heg) ggw.a(heg.class)).c()));
            $$Lambda$hsn$qP4TU_RC5NwaRJtSHc7LeDb75A r0 = new $$Lambda$hsn$qP4TU_RC5NwaRJtSHc7LeDb75A(this, hpe);
            hpe.getClass();
            this.c = a4.a((wun<? super T>) r0, (wun<Throwable>) new $$Lambda$QLoBuIyxeGNwHYjk788ZJpQnpuI<Throwable>(hpe));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hpe hpe, uyv uyv) {
        uyz[] uyzArr;
        ArrayList arrayList = new ArrayList();
        for (uyz uyz : (uyz[]) uyv.getItems()) {
            if (!uyz.f()) {
                arrayList.add(this.f.a(uyz));
            } else if (uyz.r() != null) {
                hpb hpb = this.f;
                uyv r = uyz.r();
                String a2 = r.a();
                String b2 = r.b();
                int d2 = r.d();
                StringBuilder sb = new StringBuilder(64);
                sb.append(hpb.b.getResources().getQuantityString(R.plurals.playlist_playlist_count, d2, new Object[]{Integer.valueOf(d2)}));
                int c2 = r.c();
                if (c2 > 0) {
                    sb.append(", ");
                    sb.append(hpb.b.getResources().getQuantityString(R.plurals.playlist_folder_count, c2, new Object[]{Integer.valueOf(c2)}));
                }
                hpa hpa = new hpa(Uri.parse(b2));
                hpa.b = a2;
                hpa.c = sb.toString();
                hpa.a = ActionType.BROWSABLE;
                hpa.d = gbf.a(hpb.b, R.drawable.mediaservice_playlists);
                hpa.f = true;
                arrayList.add(hpa.b());
            }
        }
        hpe.a((List<MediaBrowserItem>) arrayList);
    }

    public final boolean a(String str) {
        return str.startsWith(ViewUris.bd.toString()) || str.contains(":folder:");
    }
}
