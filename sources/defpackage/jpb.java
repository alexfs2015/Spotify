package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.music.follow.FollowManager.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;

/* renamed from: jpb reason: default package */
public final class jpb implements jpa {
    private final jon b;
    private final uqm c;
    private final sso d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final jqg j;

    public jpb(jon jon, uqm uqm, sso sso, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, jqg jqg) {
        this.b = jon;
        this.c = (uqm) fbp.a(uqm);
        this.d = (sso) fbp.a(sso);
        this.j = (jqg) fbp.a(jqg);
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return jql.a(contextMenuViewModel, z);
    }

    public final ContextMenuViewModel a(jqo<vku> jqo) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        fuz fuz = new fuz(jqo.d(), "", Uri.EMPTY, SpotifyIconV2.ARTIST, true);
        contextMenuViewModel.c = fuz;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(jqo<vku> jqo, fqn fqn) {
        fbp.a(jqo.a());
        if (jqo.b() != null) {
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            ContextMenuHelper a = this.b.a(this.c, this.d, contextMenuViewModel, (jqg) fbp.a(this.j), fqn);
            vku vku = (vku) jqo.b();
            Covers covers = vku.getCovers();
            String collectionUri = vku.getCollectionUri();
            String imageUri = covers != null ? covers.getImageUri(Size.NORMAL) : "";
            fuz fuz = new fuz(vku.getName(), "", !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY, SpotifyIconV2.ARTIST, true);
            contextMenuViewModel.c = fuz;
            if (this.g || this.h) {
                a aVar = new a(vku.getUri(), 0, 0, vku.isFollowed(), vku.isDismissed());
                if (this.g) {
                    a.a(aVar);
                }
                if (this.h) {
                    a.a(aVar, this.i);
                }
                contextMenuViewModel.a();
            }
            if ((this.e && vku.getNumTracksInCollection() != 0) && collectionUri != null) {
                a.a(collectionUri, vku.getOfflineState());
            }
            if (this.d.equals(ViewUris.be)) {
                a.c(vku.getUri(), vku.getName());
            }
            a.a(vku.getName(), "", vku.getUri(), (String) null, !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
            if (!this.f) {
                a.a(vku.getName(), vku.getUri());
            }
            if (this.d == ViewUris.ba) {
                a.f(vku.getUri());
            }
            a.c(vku.getUri(), vku.getName(), vku.getImageUri());
            return Observable.b(contextMenuViewModel);
        }
        throw new NullPointerException();
    }
}
