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

/* renamed from: jnt reason: default package */
public final class jnt implements jns {
    private final qnq A = new qnq();
    private final jmb b;
    private final Activity c;
    private final udr d;
    private final sih e;
    private final jnu f;
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
    private final Optional<joa> t;
    private final Optional<joa> u;
    private final boolean v;
    private final boolean w;
    private final Optional<String> x;
    private final twu y = new twu();
    private final rgz z = new rgz();

    public jnt(jmb jmb, Activity activity, udr udr, sih sih, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Optional<String> optional, boolean z7, jnu jnu, Optional<String> optional2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Optional<joa> optional3, Optional<joa> optional4, boolean z14, boolean z15) {
        this.b = jmb;
        this.c = (Activity) fay.a(activity);
        this.d = (udr) fay.a(udr);
        this.e = (sih) fay.a(sih);
        this.f = (jnu) fay.a(jnu);
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.m = z6;
        this.k = (Optional) fay.a(optional);
        this.l = z7;
        this.x = (Optional) fay.a(optional2);
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
    }

    public final ContextMenuViewModel a(joc<uzc> joc) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        fuf fuf = new fuf(joc.d(), "", Uri.EMPTY, SpotifyIconV2.TRACK, false);
        contextMenuViewModel.c = fuf;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(joc<uzc> joc, fpt fpt) {
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        String str2;
        PlayerTrack playerTrack;
        joc<uzc> joc2 = joc;
        fpt fpt2 = fpt;
        fay.a(joc.a());
        if (joc.b() != null) {
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            ContextMenuHelper a = this.b.a(this.d, this.e, contextMenuViewModel, (jnu) fay.a(this.f), fpt);
            uzc uzc = (uzc) joc.b();
            uyq uyq = (uyq) fay.a(uzc.getAlbum());
            List list = (List) fay.a(uzc.getArtists());
            uyr uyr = (uyr) ((List) fay.a(list)).get(0);
            Covers covers = uyq.getCovers();
            String str3 = "";
            String imageUri = covers != null ? covers.getImageUri(Size.NORMAL) : str3;
            fuf fuf = new fuf(uzc.getName(), uyr.getName(), !TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY, SpotifyIconV2.TRACK, false);
            contextMenuViewModel.c = fuf;
            if (!this.i || (!uzc.inCollection() && !uzc.canAddToCollection())) {
                str = str3;
                z2 = false;
            } else {
                str = str3;
                a.a(uzc.inCollection(), true, this.j, uzc.getUri(), uyq.getUri());
                z2 = true;
            }
            if (this.q || uzc.isBanned()) {
                a.a(uzc.isBanned(), uzc.getUri(), joc2.c, this.r);
                z2 = true;
            }
            if ((this.z.a(fpt2) || twu.a(fpt)) && z2) {
                contextMenuViewModel.a();
            }
            if (this.j) {
                Assertion.a("A row id is needed for showing the \"Remove from this playlist\" context menu.", this.x.b());
                a.a((String) this.k.a(str), (String) this.x.c(), jst.a(uzc.getUri()).b);
            }
            if (uzc.isAvailableInMetadataCatalogue()) {
                if (this.l) {
                    a.b(uzc.getUri(), this.e.toString(), joc2.c);
                } else {
                    a.a(uzc.getUri(), this.e.toString(), joc2.c);
                }
            }
            if ((!this.o) && uzc.isAvailableInMetadataCatalogue() && uzc.isCurrentlyPlayable()) {
                Map<String, String> map = joc2.e;
                if (map == null) {
                    playerTrack = PlayerTrack.create(uzc.getUri());
                } else {
                    playerTrack = PlayerTrack.create(uzc.getUri(), map);
                }
                a.a(playerTrack);
            }
            if (this.n) {
                a.c(ViewUris.Z.toString());
            }
            if (this.m) {
                a.a();
            }
            if (this.g && !uzc.isLocal()) {
                a.a(uyq.getUri(), uyq.getName());
            }
            if (this.h && !uzc.isLocal()) {
                a.a(list);
            }
            if (!uzc.isLocal()) {
                String name = uzc.getName();
                String string = this.c.getString(R.string.share_by_artist, new Object[]{uyr.getName()});
                String uri = uzc.getUri();
                if (joc2.d) {
                    str2 = joc2.c;
                } else {
                    str2 = null;
                }
                a.a(name, string, uri, str2, !TextUtils.isEmpty(uzc.getImageUri()) ? Uri.parse(uzc.getImageUri()) : Uri.EMPTY);
            }
            if (this.w) {
                a.d(uzc.getUri());
            }
            if (!uzc.isLocal()) {
                z3 = true;
                if (!this.p) {
                    a.a(uzc.getName(), uzc.getUri());
                }
            } else {
                z3 = true;
            }
            boolean a2 = ruy.a(fpt);
            boolean isLocal = uzc.isLocal() ^ z3;
            if (isLocal && !a2) {
                a.a(uzc.getUri(), joc2.c, uzc.isExplicit());
            }
            if (this.t.b()) {
                joa joa = (joa) this.t.c();
                boolean z5 = joa.a;
                ImmutableList<Drawable> immutableList = joa.b;
                a aVar = joa.c;
                fuh a3 = a.b.a((int) R.id.context_menu_shuffle, a.a.getText(R.string.context_menu_shuffle), immutableList);
                a3.e = z5;
                a3.d = false;
                a3.f = aVar;
            }
            if (this.u.b()) {
                joa joa2 = (joa) this.u.c();
                boolean z6 = joa2.a;
                ImmutableList<Drawable> immutableList2 = joa2.b;
                a aVar2 = joa2.c;
                fuh a4 = a.b.a((int) R.id.context_menu_repeat, a.a.getText(R.string.context_menu_repeat), immutableList2);
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
            if ((fpt2.a(qnp.a) == RolloutFlag.ENABLED) && !uzc.isLocal()) {
                a.e(uzc.getUri());
            }
            if (!this.s || a2) {
                if (isLocal || this.s) {
                    z4 = true;
                }
                if (z4 && a2) {
                    a.a(uzc.getUri(), this.e);
                }
                return Observable.b(contextMenuViewModel);
            }
            heg heg = (heg) ggw.a(heg.class);
            return Observable.a((ObservableSource<? extends T1>) Observable.b(contextMenuViewModel), (ObservableSource<? extends T2>) new RxWebToken((RxResolver) ggw.a(RxResolver.class), heg.b(), heg.b(), (rnf) ggw.a(rnf.class)).a(Uri.parse(((String) fpt2.a(ikp.a)).replace("{uri}", uzc.getUri()))), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$jnt$9QezVT1OIH9Q8e7UyK_Gx49a4zQ<Object,Object,Object>(a, contextMenuViewModel));
        }
        throw new NullPointerException();
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z2) {
        return jnz.a(contextMenuViewModel, z2);
    }
}
