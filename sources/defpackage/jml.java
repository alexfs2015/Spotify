package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper.ItemType;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;

/* renamed from: jml reason: default package */
public final class jml implements jmk {
    private final jmb b;
    private final Activity c;
    private final udr d;
    private final sih e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final jnu i;

    jml(jmb jmb, Activity activity, udr udr, sih sih, boolean z, boolean z2, boolean z3, jnu jnu) {
        this.b = jmb;
        this.c = activity;
        this.d = udr;
        this.e = sih;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = jnu;
    }

    public final ContextMenuViewModel a(joc<ior> joc) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        fuf fuf = new fuf(joc.d(), "", Uri.EMPTY, SpotifyIconV2.ALBUM, false);
        contextMenuViewModel.c = fuf;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(joc<ior> joc, fpt fpt) {
        fay.a(joc.a());
        if (joc.b() != null) {
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            ContextMenuHelper a = this.b.a(this.d, this.e, contextMenuViewModel, (jnu) fay.a(this.i), fpt);
            ior ior = (ior) joc.b();
            uyq a2 = ior.a();
            String collectionUri = a2.getCollectionUri();
            Covers covers = a2.getCovers();
            String imageUri = covers != null ? covers.getImageUri(Size.NORMAL) : "";
            fuf fuf = new fuf(a2.getName(), a2.getArtist().getName(), !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY, SpotifyIconV2.ALBUM, false);
            contextMenuViewModel.c = fuf;
            AlbumCollectionState a3 = AlbumCollectionState.a(a2.getNumTracksInCollection(), a2.isSavedToCollection());
            a.a(a3, this.g, a2.getUri(), a2.getUri(), ItemType.TRACK_OR_ALBUM_OR_EPISODE);
            if (!(!this.h || a3 == AlbumCollectionState.NO || collectionUri == null)) {
                a.a(collectionUri, a2.getOfflineState());
            }
            a.a(a2.getUri(), this.e.toString(), joc.c);
            if (ior.b() != null) {
                a.a(a2.getUri(), ior.b());
            }
            boolean z = a2.isAnyTrackPlayable() && jsl.c(fpt);
            if (a() && z) {
                a.b(collectionUri);
            } else if (z) {
                a.b(a2.getUri());
            }
            if (a()) {
                a.b(a2.getUri(), a2.getName());
            }
            if (this.f && !jrk.a(a2.getArtist().getName())) {
                a.c(a2.getArtist().getUri(), a2.getArtist().getName());
            }
            a.a(a2.getName(), this.c.getString(R.string.share_subtitle, new Object[]{a2.getArtist().getName()}), a2.getUri(), (String) null, !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
            a.a(a2.getName(), a2.getUri());
            if (this.e == ViewUris.bb) {
                a.f(a2.getUri());
            }
            a.c(a2.getUri(), a2.getName(), a2.getImageUri());
            return Observable.b(contextMenuViewModel);
        }
        throw new NullPointerException();
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return jnz.a(contextMenuViewModel, z);
    }

    private boolean a() {
        return b() || c();
    }

    private boolean b() {
        return this.e.equals(ViewUris.bg);
    }

    private boolean c() {
        return jst.a(this.e.toString()).b == LinkType.COLLECTION_ARTIST;
    }
}
