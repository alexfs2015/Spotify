package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel.HeaderViewType;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jmv reason: default package */
public final class jmv implements jmu {
    private final jmb b;
    private final Activity c;
    private final udr d;
    private final sih e;
    /* access modifiers changed from: private */
    public final jsz f;
    private final jyj g;
    private final jyl h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    /* access modifiers changed from: private */
    public final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final Optional<String> u;
    private final Optional<String> v;
    private final tmy w = new tmy(this.c.getResources(), (gbd) ggw.a(gbd.class));
    /* access modifiers changed from: private */
    public final jnu x;
    private final jmx y;
    private final boolean z;

    /* renamed from: jmv$a */
    class a implements jnu {
        private final fpt b;

        public a(fpt fpt) {
            this.b = fpt;
        }

        public final void a(ContextMenuEvent contextMenuEvent) {
            jmv.this.x.a(contextMenuEvent);
            if (ContextMenuEvent.DOWNLOAD == contextMenuEvent) {
                if (!jmv.this.q) {
                    jmv.this.f.a(SpotifyIconV2.CHECK, iqk.a(this.b, R.string.toast_saved_to_collection), 0);
                }
            } else if (ContextMenuEvent.UNDOWNLOAD == contextMenuEvent && !jmv.this.q) {
                jmv.this.f.a(SpotifyIconV2.X, iqk.a(this.b, R.string.toast_removed_from_collection), 0);
            }
        }
    }

    public jmv(jmb jmb, Activity activity, udr udr, sih sih, jsz jsz, jyj jyj, jyl jyl, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, jnu jnu, jmx jmx, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Optional<String> optional, Optional<String> optional2) {
        this.b = jmb;
        this.c = activity;
        this.d = udr;
        this.e = sih;
        this.f = jsz;
        this.g = jyj;
        this.h = jyl;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.s = z12;
        this.z = z8;
        this.x = (jnu) fay.a(jnu);
        this.y = (jmx) fay.a(jmx);
        this.q = z9;
        this.r = z13;
        this.t = z14;
        this.u = optional;
        this.v = optional2;
        this.o = z10;
        this.p = z11;
    }

    public final ContextMenuViewModel a(joc<uys> joc) {
        SpotifyIconV2 spotifyIconV2 = this.z ? SpotifyIconV2.VIDEO : SpotifyIconV2.PODCASTS;
        HeaderViewType headerViewType = this.z ? HeaderViewType.TWO_LINE_LANDSCAPE_IMAGE : HeaderViewType.TWO_LINE_SQUARE_IMAGE;
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.e = headerViewType;
        fuf fuf = new fuf(joc.d(), "", Uri.EMPTY, spotifyIconV2, false);
        contextMenuViewModel.c = fuf;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(joc<uys> joc, fpt fpt) {
        int i2;
        Map<String, String> map;
        String str;
        joc<uys> joc2 = joc;
        fay.a(joc.a());
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        ContextMenuHelper a2 = this.b.a(this.d, this.e, contextMenuViewModel, new a(fpt), fpt);
        uys uys = (uys) joc.b();
        Show show = (Show) fay.a(uys.t());
        boolean z2 = uys.w() != MediaType.AUDIO;
        List<jyi> list = this.h.a;
        String a3 = uze.a(uys.b(), uys.c(), show, Size.NORMAL);
        Uri parse = !TextUtils.isEmpty(a3) ? Uri.parse(a3) : Uri.EMPTY;
        String a4 = this.w.a(show.a(), uys.s(), uys.m(), uys.n(), uys.o()).a(true).a();
        fuf fuf = new fuf(uys.a(), a4, parse, z2 ? SpotifyIconV2.VIDEO : SpotifyIconV2.PODCASTS, false);
        if (!this.k || uys.w() != MediaType.AUDIO) {
            fuf.c = twn.a(uys.d());
        }
        if (fax.a(show.c())) {
            fuf.d = show.a();
        } else {
            fuf.d = this.c.getString(R.string.episode_context_menu_header, new Object[]{show.a(), show.c()});
        }
        fuf.h = this.c.getResources().getInteger(R.integer.show_and_episode_context_menu_title_max_rows);
        contextMenuViewModel.d = a4;
        contextMenuViewModel.c = fuf;
        contextMenuViewModel.e = this.z ? HeaderViewType.TWO_LINE_LANDSCAPE_IMAGE : HeaderViewType.TWO_LINE_SQUARE_IMAGE;
        if (this.u.b() && this.v.b()) {
            a2.a((String) this.u.c(), (String) this.v.c(), jst.a(uys.getUri()).b);
        }
        Map<String, String> map2 = joc2.e;
        String str2 = map2 == null ? null : (String) map2.get(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY);
        boolean z3 = jst.a(str2).b == LinkType.TRACK;
        if (!this.z || map2 == null || str2 == null || !z3) {
            map = map2;
            i2 = 1;
            if (!this.z) {
                if (this.t) {
                    a2.b(uys.getUri(), this.e.toString(), joc2.c);
                } else {
                    a2.a(uys.getUri(), this.e.toString(), joc2.c);
                }
            }
        } else {
            boolean booleanValue = Boolean.valueOf((String) map2.get("audio_track_uri_in_collection")).booleanValue();
            map = map2;
            String str3 = str2;
            i2 = 1;
            a2.a(booleanValue, true, false, str3, show.getUri());
            String str4 = "";
            String str5 = (String) jtc.a(map.get("audio_track_album_name"), str4);
            String str6 = (String) jtc.a(map.get("audio_track_artist_name"), str4);
            a2.a(str3, this.e.toString(), joc2.c);
            if (this.l) {
                String str7 = (String) map.get("audio_track_album_uri");
                if (str7 != null) {
                    a2.a(str7, str5);
                }
            }
            String str8 = (String) map.get("audio_track_artist_uri");
            if (str8 != null) {
                a2.c(str8, str6);
            }
        }
        if (uys.w() == MediaType.AUDIO && iqh.a(fpt) && this.i && (uys.l() || !(uys.u() instanceof f))) {
            a2.a(uys.getUri(), uys.u());
        }
        if (this.n) {
            a2.a(uys.getUri(), uys.o(), this.y);
        }
        if (uys.l() && !this.p) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(uys.v());
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("context_uri", this.e.toString());
            a2.a(PlayerTrack.create(uys.getUri(), hashMap));
        }
        if (this.o) {
            a2.c(ViewUris.Z.toString());
        }
        if (this.s) {
            String a5 = uys.a();
            Activity activity = this.c;
            Object[] objArr = new Object[i2];
            objArr[0] = show.a();
            String string = activity.getString(R.string.share_episode_of_name, objArr);
            String uri = uys.getUri();
            if (joc2.d) {
                str = joc2.c;
            } else {
                str = null;
            }
            a2.a(a5, string, uri, str, parse);
        }
        if (this.j) {
            a2.b(show.getUri(), show.a(), z2);
        }
        if (this.k && uys.w() == MediaType.AUDIO) {
            a2.e(uys.getUri(), uys.a());
        }
        if (this.r) {
            a2.d(uys.getUri());
        }
        if (!this.z && ruy.a(fpt)) {
            a2.a(uys.getUri(), this.e);
        }
        if (this.m) {
            return Observable.a((ObservableSource<? extends T1>) Observable.b(contextMenuViewModel), (ObservableSource<? extends T2>) this.g.a(), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$jmv$cxjL88VniTH9HgJzGueiOnW_OEM<Object,Object,Object>(a2, list, contextMenuViewModel));
        }
        return Observable.b(contextMenuViewModel);
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z2) {
        return jnz.a(contextMenuViewModel, z2);
    }
}
