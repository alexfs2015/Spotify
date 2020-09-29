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

/* renamed from: jpv reason: default package */
public final class jpv implements jpu {
    private final jon b;
    private final Activity c;
    private final uqm d;
    private final sso e;
    private final boolean f;
    private final boolean g;
    private final jqg h;
    private final jvf i;

    jpv(jon jon, Activity activity, uqm uqm, sso sso, boolean z, boolean z2, jqg jqg, jvf jvf) {
        this.b = jon;
        this.c = (Activity) fbp.a(activity);
        this.d = (uqm) fbp.a(uqm);
        this.e = (sso) fbp.a(sso);
        this.f = z;
        this.g = z2;
        this.h = (jqg) fbp.a(jqg);
        this.i = jvf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ContextMenuViewModel a(vlc vlc, jqo jqo, fqn fqn, SessionState sessionState) {
        final vlc vlc2 = vlc;
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        ContextMenuHelper a = this.b.a(this.d, this.e, contextMenuViewModel, (jqg) fbp.a(this.h), fqn);
        vlg d2 = vlc.d();
        String str = "";
        if (d2 != null) {
            str = (String) jvi.a(d2.c(), str);
        }
        fuz fuz = new fuz(vlc.a(), str, !TextUtils.isEmpty(vlc.getImageUri()) ? Uri.parse(vlc.getImageUri()) : Uri.EMPTY, SpotifyIconV2.PLAYLIST, false);
        contextMenuViewModel.c = fuz;
        String c2 = jqo.c();
        if (vlc.e() && !vlc.f() && !vlc.k()) {
            a.a(c2, vlc.h());
        }
        if (this.f && (sessionState.connected() || vlc.j()) && !vlc.f()) {
            a.a(c2, vlc.s(), (fvc) new fvc() {
                public final void onMenuItemClick(fva fva) {
                    jpv.a(jpv.this, vlc2, true);
                }
            }, (fvc) new fvc() {
                public final void onMenuItemClick(fva fva) {
                    jpv.a(jpv.this, vlc2, false);
                }
            });
        }
        if (vlc.e() && (sessionState.connected() || vlc.j()) && !vlc.f() && (vlc.k() || vlc.g())) {
            a.a(c2);
        }
        if (vlc.e() && !vlc.f() && !vlc.g() && vlc.k()) {
            a.c(c2, vlc.i());
        }
        if (vlc.e() && !vlc.f() && (sessionState.connected() || vlc.j()) && vlc.k()) {
            a.b(c2, vlc.g());
        }
        if (this.g && vlc.k() && !vlc.f()) {
            a.d(vlc.a(), c2);
        }
        if (vlc.e() && !vlc.f() && (sessionState.connected() || vlc.j())) {
            a.a(vlc.a(), this.c.getString(R.string.share_by_owner, new Object[]{str}), jva.f(jva.a(c2).f()).h(), (String) null, !TextUtils.isEmpty(vlc.getImageUri()) ? Uri.parse(vlc.getImageUri()) : Uri.EMPTY);
        }
        if (vlc.e() && (sessionState.connected() || vlc.j())) {
            a.a(jqo.d(), c2);
        }
        if (this.e == ViewUris.ba) {
            a.f(c2);
        }
        if (vlc.e()) {
            a.c(c2, jqo.d(), vlc.getImageUri());
        }
        a.b.h = vlc.e();
        return contextMenuViewModel;
    }

    static /* synthetic */ void a(jpv jpv, vlc vlc, boolean z) {
        String uri = vlc.getUri();
        if (z && !vlc.h()) {
            PlaylistService.a((Context) jpv.c, uri, true);
        } else if (!z || !vlc.h()) {
            OffliningService.a(jpv.c, uri, false);
        } else {
            OffliningService.a(jpv.c, uri, true);
        }
        if (!z) {
            jpv.i.a((int) R.string.toast_undownload, 0, new Object[0]);
        }
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return jql.a(contextMenuViewModel, z);
    }

    public final ContextMenuViewModel a(jqo<vlc> jqo) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        fuz fuz = new fuz(jqo.d(), "", Uri.EMPTY, SpotifyIconV2.PLAYLIST, false);
        contextMenuViewModel.c = fuz;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(jqo<vlc> jqo, fqn fqn) {
        fbp.a(jqo.a());
        return ((hxx) gih.a(hxx.class)).a.c((Function<? super T, ? extends R>) new $$Lambda$jpv$5aAss6TOwrWz00WElKa_UFtxI4<Object,Object>(this, (vlc) jqo.b(), jqo, fqn)).j();
    }
}
