package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.spotlets.collection.util.AlbumCollectionState;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import io.reactivex.Observable;

/* renamed from: jnn reason: default package */
public final class jnn implements jnm {
    private final jmb b;
    private final Activity c;
    private final udr d;
    private final sih e;
    private final boolean f;
    private final jnu g;

    public jnn(jmb jmb, Activity activity, udr udr, sih sih, boolean z, jnu jnu) {
        this.b = jmb;
        this.c = (Activity) fay.a(activity);
        this.d = (udr) fay.a(udr);
        this.e = (sih) fay.a(sih);
        this.f = z;
        this.g = (jnu) fay.a(jnu);
    }

    public final ContextMenuViewModel a(joc<Show> joc) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        fuf fuf = new fuf(joc.d(), "", Uri.EMPTY, SpotifyIconV2.PODCASTS, false);
        contextMenuViewModel.c = fuf;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(joc<Show> joc, fpt fpt) {
        Show show = (Show) joc.b();
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        ContextMenuHelper a = this.b.a(this.d, this.e, contextMenuViewModel, (jnu) fay.a(this.g), fpt);
        Covers b2 = show.b();
        String imageUri = b2 != null ? b2.getImageUri(Size.NORMAL) : "";
        fuf fuf = new fuf(show.a(), show.c(), !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY, SpotifyIconV2.PODCASTS, false);
        if (this.f) {
            fuf.c = twn.a(show.f());
        }
        contextMenuViewModel.c = fuf;
        contextMenuViewModel.c.h = this.c.getResources().getInteger(R.integer.show_and_episode_context_menu_title_max_rows);
        if (iqh.a(fpt)) {
            a.a(show.g() ? AlbumCollectionState.YES : AlbumCollectionState.NO, show.getUri(), show.getUri());
        }
        if (this.e == ViewUris.bb) {
            a.f(show.getUri());
        }
        a.a(show.a(), "", show.getUri(), (String) null, !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
        return Observable.b(contextMenuViewModel);
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return jnz.a(contextMenuViewModel, z);
    }
}
