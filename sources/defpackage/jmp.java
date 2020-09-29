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

/* renamed from: jmp reason: default package */
public final class jmp implements jmo {
    private final jmb b;
    private final udr c;
    private final sih d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final jnu j;

    public jmp(jmb jmb, udr udr, sih sih, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, jnu jnu) {
        this.b = jmb;
        this.c = (udr) fay.a(udr);
        this.d = (sih) fay.a(sih);
        this.j = (jnu) fay.a(jnu);
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final ContextMenuViewModel a(joc<uyr> joc) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        fuf fuf = new fuf(joc.d(), "", Uri.EMPTY, SpotifyIconV2.ARTIST, true);
        contextMenuViewModel.c = fuf;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(joc<uyr> joc, fpt fpt) {
        fay.a(joc.a());
        if (joc.b() != null) {
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            ContextMenuHelper a = this.b.a(this.c, this.d, contextMenuViewModel, (jnu) fay.a(this.j), fpt);
            uyr uyr = (uyr) joc.b();
            Covers covers = uyr.getCovers();
            String collectionUri = uyr.getCollectionUri();
            String imageUri = covers != null ? covers.getImageUri(Size.NORMAL) : "";
            fuf fuf = new fuf(uyr.getName(), "", !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY, SpotifyIconV2.ARTIST, true);
            contextMenuViewModel.c = fuf;
            if (this.g || this.h) {
                a aVar = new a(uyr.getUri(), 0, 0, uyr.isFollowed(), uyr.isDismissed());
                if (this.g) {
                    a.a(aVar);
                }
                if (this.h) {
                    a.a(aVar, this.i);
                }
                contextMenuViewModel.a();
            }
            if ((this.e && uyr.getNumTracksInCollection() != 0) && collectionUri != null) {
                a.a(collectionUri, uyr.getOfflineState());
            }
            if (this.d.equals(ViewUris.bf)) {
                a.c(uyr.getUri(), uyr.getName());
            }
            a.a(uyr.getName(), "", uyr.getUri(), (String) null, !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
            if (!this.f) {
                a.a(uyr.getName(), uyr.getUri());
            }
            if (this.d == ViewUris.bb) {
                a.f(uyr.getUri());
            }
            a.c(uyr.getUri(), uyr.getName(), uyr.getImageUri());
            return Observable.b(contextMenuViewModel);
        }
        throw new NullPointerException();
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return jnz.a(contextMenuViewModel, z);
    }
}
