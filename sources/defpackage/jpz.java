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

/* renamed from: jpz reason: default package */
public final class jpz implements jpy {
    private final jon b;
    private final Activity c;
    private final uqm d;
    private final sso e;
    private final boolean f;
    private final jqg g;

    public jpz(jon jon, Activity activity, uqm uqm, sso sso, boolean z, jqg jqg) {
        this.b = jon;
        this.c = (Activity) fbp.a(activity);
        this.d = (uqm) fbp.a(uqm);
        this.e = (sso) fbp.a(sso);
        this.f = z;
        this.g = (jqg) fbp.a(jqg);
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return jql.a(contextMenuViewModel, z);
    }

    public final ContextMenuViewModel a(jqo<Show> jqo) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        fuz fuz = new fuz(jqo.d(), "", Uri.EMPTY, SpotifyIconV2.PODCASTS, false);
        contextMenuViewModel.c = fuz;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(jqo<Show> jqo, fqn fqn) {
        Show show = (Show) jqo.b();
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        ContextMenuHelper a = this.b.a(this.d, this.e, contextMenuViewModel, (jqg) fbp.a(this.g), fqn);
        Covers b2 = show.b();
        String imageUri = b2 != null ? b2.getImageUri(Size.NORMAL) : "";
        fuz fuz = new fuz(show.a(), show.c(), !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY, SpotifyIconV2.PODCASTS, false);
        if (this.f) {
            fuz.c = uiq.a(show.f());
        }
        contextMenuViewModel.c = fuz;
        contextMenuViewModel.c.h = this.c.getResources().getInteger(R.integer.show_and_episode_context_menu_title_max_rows);
        if (isu.a(fqn)) {
            a.a(show.g() ? AlbumCollectionState.YES : AlbumCollectionState.NO, show.getUri(), show.getUri());
        }
        if (this.e == ViewUris.ba) {
            a.f(show.getUri());
        }
        a.a(show.a(), "", show.getUri(), (String) null, !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
        return Observable.b(contextMenuViewModel);
    }
}
