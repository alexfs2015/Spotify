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

/* renamed from: jox reason: default package */
public final class jox implements jow {
    private final jon b;
    private final Activity c;
    private final uqm d;
    private final sso e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final jqg i;

    jox(jon jon, Activity activity, uqm uqm, sso sso, boolean z, boolean z2, boolean z3, jqg jqg) {
        this.b = jon;
        this.c = activity;
        this.d = uqm;
        this.e = sso;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = jqg;
    }

    private boolean a() {
        return b() || c();
    }

    private boolean b() {
        return this.e.equals(ViewUris.bf);
    }

    private boolean c() {
        return jva.a(this.e.toString()).b == LinkType.COLLECTION_ARTIST;
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return jql.a(contextMenuViewModel, z);
    }

    public final ContextMenuViewModel a(jqo<ire> jqo) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        fuz fuz = new fuz(jqo.d(), "", Uri.EMPTY, SpotifyIconV2.ALBUM, false);
        contextMenuViewModel.c = fuz;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(jqo<ire> jqo, fqn fqn) {
        fbp.a(jqo.a());
        if (jqo.b() != null) {
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            ContextMenuHelper a = this.b.a(this.d, this.e, contextMenuViewModel, (jqg) fbp.a(this.i), fqn);
            ire ire = (ire) jqo.b();
            vkt a2 = ire.a();
            String collectionUri = a2.getCollectionUri();
            Covers covers = a2.getCovers();
            String imageUri = covers != null ? covers.getImageUri(Size.NORMAL) : "";
            fuz fuz = new fuz(a2.getName(), a2.getArtist().getName(), !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY, SpotifyIconV2.ALBUM, false);
            contextMenuViewModel.c = fuz;
            AlbumCollectionState a3 = AlbumCollectionState.a(a2.getNumTracksInCollection(), a2.isSavedToCollection());
            a.a(a3, this.g, a2.getUri(), a2.getUri(), ItemType.TRACK_OR_ALBUM_OR_EPISODE);
            if (!(!this.h || a3 == AlbumCollectionState.NO || collectionUri == null)) {
                a.a(collectionUri, a2.getOfflineState());
            }
            a.a(a2.getUri(), this.e.toString(), jqo.c);
            if (ire.b() != null) {
                a.a(a2.getUri(), ire.b());
            }
            boolean z = a2.isAnyTrackPlayable() && jus.c(fqn);
            if (a() && z) {
                a.b(collectionUri);
            } else if (z) {
                a.b(a2.getUri());
            }
            if (a()) {
                a.b(a2.getUri(), a2.getName());
            }
            if (this.f && !jtu.a(a2.getArtist().getName())) {
                a.c(a2.getArtist().getUri(), a2.getArtist().getName());
            }
            a.a(a2.getName(), this.c.getString(R.string.share_subtitle, new Object[]{a2.getArtist().getName()}), a2.getUri(), (String) null, !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
            a.a(a2.getName(), a2.getUri());
            if (this.e == ViewUris.ba) {
                a.f(a2.getUri());
            }
            a.c(a2.getUri(), a2.getName(), a2.getImageUri());
            return Observable.b(contextMenuViewModel);
        }
        throw new NullPointerException();
    }
}
