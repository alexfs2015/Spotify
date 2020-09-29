package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.playlist.service.PlaylistService;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.collection.service.OffliningService;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: jnj reason: default package */
public final class jnj implements jni {
    private final jmb b;
    private final Activity c;
    private final udr d;
    private final sih e;
    private final boolean f;
    private final boolean g;
    private final jnu h;
    private final jsz i;

    jnj(jmb jmb, Activity activity, udr udr, sih sih, boolean z, boolean z2, jnu jnu, jsz jsz) {
        this.b = jmb;
        this.c = (Activity) fay.a(activity);
        this.d = (udr) fay.a(udr);
        this.e = (sih) fay.a(sih);
        this.f = z;
        this.g = z2;
        this.h = (jnu) fay.a(jnu);
        this.i = jsz;
    }

    public final ContextMenuViewModel a(joc<uyz> joc) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        fuf fuf = new fuf(joc.d(), "", Uri.EMPTY, SpotifyIconV2.PLAYLIST, false);
        contextMenuViewModel.c = fuf;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(joc<uyz> joc, fpt fpt) {
        fay.a(joc.a());
        return ((hvl) ggw.a(hvl.class)).a.c((Function<? super T, ? extends R>) new $$Lambda$jnj$t3QTqDWBpEJ4MYnAzANWBHsvoY<Object,Object>(this, (uyz) joc.b(), joc, fpt)).j();
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return jnz.a(contextMenuViewModel, z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ContextMenuViewModel a(uyz uyz, joc joc, fpt fpt, SessionState sessionState) {
        final uyz uyz2 = uyz;
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        ContextMenuHelper a = this.b.a(this.d, this.e, contextMenuViewModel, (jnu) fay.a(this.h), fpt);
        uzd d2 = uyz.d();
        String str = "";
        if (d2 != null) {
            str = (String) jtc.a(d2.c(), str);
        }
        fuf fuf = new fuf(uyz.a(), str, !TextUtils.isEmpty(uyz.getImageUri()) ? Uri.parse(uyz.getImageUri()) : Uri.EMPTY, SpotifyIconV2.PLAYLIST, false);
        contextMenuViewModel.c = fuf;
        String c2 = joc.c();
        if (uyz.e() && !uyz.f() && !uyz.k()) {
            a.a(c2, uyz.h());
        }
        if (this.f && (sessionState.connected() || uyz.j()) && !uyz.f()) {
            a.a(c2, uyz.s(), (fui) new fui() {
                public final void onMenuItemClick(fug fug) {
                    jnj.a(jnj.this, uyz2, true);
                }
            }, (fui) new fui() {
                public final void onMenuItemClick(fug fug) {
                    jnj.a(jnj.this, uyz2, false);
                }
            });
        }
        if (uyz.e() && (sessionState.connected() || uyz.j()) && !uyz.f() && (uyz.k() || uyz.g())) {
            a.a(c2);
        }
        if (uyz.e() && !uyz.f() && !uyz.g() && uyz.k()) {
            a.c(c2, uyz.i());
        }
        if (uyz.e() && !uyz.f() && (sessionState.connected() || uyz.j()) && uyz.k()) {
            a.b(c2, uyz.g());
        }
        if (this.g && uyz.k() && !uyz.f()) {
            a.d(uyz.a(), c2);
        }
        if (uyz.e() && !uyz.f() && (sessionState.connected() || uyz.j())) {
            a.a(uyz.a(), this.c.getString(R.string.share_by_owner, new Object[]{str}), jst.f(jst.a(c2).f()).h(), (String) null, !TextUtils.isEmpty(uyz.getImageUri()) ? Uri.parse(uyz.getImageUri()) : Uri.EMPTY);
        }
        if (uyz.e() && (sessionState.connected() || uyz.j())) {
            a.a(joc.d(), c2);
        }
        if (this.e == ViewUris.bb) {
            a.f(c2);
        }
        if (uyz.e()) {
            a.c(c2, joc.d(), uyz.getImageUri());
        }
        a.b.h = uyz.e();
        return contextMenuViewModel;
    }

    static /* synthetic */ void a(jnj jnj, uyz uyz, boolean z) {
        String uri = uyz.getUri();
        if (z && !uyz.h()) {
            PlaylistService.a((Context) jnj.c, uri, true);
        } else if (!z || !uyz.h()) {
            OffliningService.a(jnj.c, uri, false);
        } else {
            OffliningService.a(jnj.c, uri, true);
        }
        if (!z) {
            jnj.i.a((int) R.string.toast_undownload, 0, new Object[0]);
        }
    }
}
