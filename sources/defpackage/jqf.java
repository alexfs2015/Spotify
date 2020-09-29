package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import java.util.List;
import java.util.Map;

/* renamed from: jqf reason: default package */
public final class jqf implements jqe {
    private final rqb A = new rqb();
    private final qvz B = new qvz();
    private final jon b;
    private final Activity c;
    private final uqm d;
    private final sso e;
    private final jqg f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final Optional<String> k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final Optional<jqm> t;
    private final Optional<jqm> u;
    private final boolean v;
    private final boolean w;
    private final RxResolver x;
    private final Optional<String> y;
    private final uix z = new uix();

    public jqf(jon jon, Activity activity, uqm uqm, sso sso, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Optional<String> optional, boolean z7, jqg jqg, Optional<String> optional2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Optional<jqm> optional3, Optional<jqm> optional4, boolean z14, boolean z15, RxResolver rxResolver) {
        this.b = jon;
        this.c = (Activity) fbp.a(activity);
        this.d = (uqm) fbp.a(uqm);
        this.e = (sso) fbp.a(sso);
        this.f = (jqg) fbp.a(jqg);
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.m = z6;
        this.k = (Optional) fbp.a(optional);
        this.l = z7;
        this.y = (Optional) fbp.a(optional2);
        this.n = z8;
        this.o = z9;
        this.p = z10;
        this.q = z11;
        this.r = z12;
        this.s = z13;
        this.t = optional3;
        this.u = optional4;
        this.v = z14;
        this.w = z15;
        this.x = rxResolver;
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z2) {
        return jql.a(contextMenuViewModel, z2);
    }

    public final ContextMenuViewModel a(jqo<vlf> jqo) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        fuz fuz = new fuz(jqo.d(), "", Uri.EMPTY, SpotifyIconV2.TRACK, false);
        contextMenuViewModel.c = fuz;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(jqo<vlf> jqo, fqn fqn) {
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        jqo<vlf> jqo2 = jqo;
        fqn fqn2 = fqn;
        fbp.a(jqo.a());
        if (jqo.b() != null) {
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            ContextMenuHelper a = this.b.a(this.d, this.e, contextMenuViewModel, (jqg) fbp.a(this.f), fqn);
            vlf vlf = (vlf) jqo.b();
            vkt vkt = (vkt) fbp.a(vlf.getAlbum());
            List list = (List) fbp.a(vlf.getArtists());
            vku vku = (vku) ((List) fbp.a(list)).get(0);
            Covers covers = vkt.getCovers();
            String str2 = "";
            String imageUri = covers != null ? covers.getImageUri(Size.NORMAL) : str2;
            fuz fuz = new fuz(vlf.getName(), vku.getName(), !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY, SpotifyIconV2.TRACK, false);
            contextMenuViewModel.c = fuz;
            if (!this.i || (!vlf.inCollection() && !vlf.canAddToCollection())) {
                str = str2;
                z2 = false;
            } else {
                str = str2;
                a.a(vlf.inCollection(), true, this.j, vlf.getUri(), vkt.getUri());
                z2 = true;
            }
            if (this.q || vlf.isBanned()) {
                a.a(vlf.isBanned(), vlf.getUri(), jqo2.c, this.r);
                z2 = true;
            }
            if ((this.A.a(fqn2) || uix.a(fqn)) && z2) {
                contextMenuViewModel.a();
            }
            if (this.j) {
                Assertion.a("A row id is needed for showing the \"Remove from this playlist\" context menu.", this.y.b());
                a.a((String) this.k.a(str), (String) this.y.c(), jva.a(vlf.getUri()).b);
            }
            if (vlf.isAvailableInMetadataCatalogue()) {
                if (this.l) {
                    a.b(vlf.getUri(), this.e.toString(), jqo2.c);
                } else {
                    a.a(vlf.getUri(), this.e.toString(), jqo2.c);
                }
            }
            if ((!this.o) && vlf.isAvailableInMetadataCatalogue() && vlf.isCurrentlyPlayable()) {
                Map<String, String> map = jqo2.e;
                a.a(map == null ? PlayerTrack.create(vlf.getUri()) : PlayerTrack.create(vlf.getUri(), map));
            }
            if (this.n) {
                a.c(ViewUris.Y.toString());
            }
            if (this.m) {
                a.a();
            }
            if (this.g && !vlf.isLocal()) {
                a.a(vkt.getUri(), vkt.getName());
            }
            if (this.h && !vlf.isLocal()) {
                a.a(list);
            }
            if (!vlf.isLocal()) {
                a.a(vlf.getName(), this.c.getString(R.string.share_by_artist, new Object[]{vku.getName()}), vlf.getUri(), jqo2.d ? jqo2.c : null, !TextUtils.isEmpty(vlf.getImageUri()) ? Uri.parse(vlf.getImageUri()) : Uri.EMPTY);
            }
            if (this.w) {
                a.d(vlf.getUri());
            }
            if (!vlf.isLocal()) {
                z3 = true;
                if (!this.p) {
                    a.a(vlf.getName(), vlf.getUri());
                }
            } else {
                z3 = true;
            }
            boolean a2 = sei.a(fqn);
            boolean isLocal = vlf.isLocal() ^ z3;
            if (isLocal && !a2) {
                a.a(vlf.getUri(), jqo2.c, vlf.isExplicit());
            }
            if (this.t.b()) {
                jqm jqm = (jqm) this.t.c();
                boolean z5 = jqm.a;
                ImmutableList<Drawable> immutableList = jqm.b;
                a aVar = jqm.c;
                fvb a3 = a.b.a((int) R.id.context_menu_shuffle, a.a.getText(R.string.context_menu_shuffle), immutableList);
                a3.e = z5;
                a3.d = false;
                a3.f = aVar;
            }
            if (this.u.b()) {
                jqm jqm2 = (jqm) this.u.c();
                boolean z6 = jqm2.a;
                ImmutableList<Drawable> immutableList2 = jqm2.b;
                a aVar2 = jqm2.c;
                fvb a4 = a.b.a((int) R.id.context_menu_repeat, a.a.getText(R.string.context_menu_repeat), immutableList2);
                a4.e = z6;
                z4 = false;
                a4.d = false;
                a4.f = aVar2;
            } else {
                z4 = false;
            }
            if (this.v) {
                a.b();
            }
            if ((fqn2.a(qvy.a) == RolloutFlag.ENABLED) && !vlf.isLocal()) {
                a.e(vlf.getUri());
            }
            if (!this.s || a2) {
                if (isLocal || this.s) {
                    z4 = true;
                }
                if (z4 && a2) {
                    a.a(vlf.getUri(), this.e);
                }
                return Observable.b(contextMenuViewModel);
            }
            hhc hhc = (hhc) gih.a(hhc.class);
            return Observable.a((ObservableSource<? extends T1>) Observable.b(contextMenuViewModel), (ObservableSource<? extends T2>) new RxWebToken(this.x, hhc.b(), hhc.b(), (rwl) gih.a(rwl.class)).a(Uri.parse(((String) fqn2.a(inc.a)).replace("{uri}", vlf.getUri()))), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$jqf$fitXCYa_oUzLlJyUXi_USTmqsyM<Object,Object,Object>(a, contextMenuViewModel));
        }
        throw new NullPointerException();
    }
}
