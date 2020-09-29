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

/* renamed from: jph reason: default package */
public final class jph implements jpg {
    private final jon b;
    private final Activity c;
    private final uqm d;
    private final sso e;
    /* access modifiers changed from: private */
    public final jvf f;
    private final kaj g;
    private final kal h;
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
    private final tyx w;
    /* access modifiers changed from: private */
    public final jqg x;
    private final jpj y;
    private final boolean z;

    /* renamed from: jph$a */
    class a implements jqg {
        private final fqn b;

        public a(fqn fqn) {
            this.b = fqn;
        }

        public final void a(ContextMenuEvent contextMenuEvent) {
            jph.this.x.a(contextMenuEvent);
            if (ContextMenuEvent.DOWNLOAD == contextMenuEvent) {
                if (!jph.this.q) {
                    jph.this.f.a(SpotifyIconV2.CHECK, isx.a(this.b, R.string.toast_saved_to_collection), 0);
                }
            } else if (ContextMenuEvent.UNDOWNLOAD == contextMenuEvent && !jph.this.q) {
                jph.this.f.a(SpotifyIconV2.X, isx.a(this.b, R.string.toast_removed_from_collection), 0);
            }
        }
    }

    public jph(jon jon, Activity activity, uqm uqm, sso sso, jvf jvf, kaj kaj, kal kal, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, jqg jqg, jpj jpj, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Optional<String> optional, Optional<String> optional2, gcb gcb) {
        this.b = jon;
        this.c = activity;
        this.d = uqm;
        this.e = sso;
        this.f = jvf;
        this.g = kaj;
        this.h = kal;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.s = z12;
        this.z = z8;
        this.x = (jqg) fbp.a(jqg);
        this.y = (jpj) fbp.a(jpj);
        this.q = z9;
        this.r = z13;
        this.t = z14;
        this.u = optional;
        this.v = optional2;
        this.w = new tyx(this.c.getResources(), gcb, new tyr(this.c.getResources()));
        this.o = z10;
        this.p = z11;
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z2) {
        return jql.a(contextMenuViewModel, z2);
    }

    public final ContextMenuViewModel a(jqo<vkv> jqo) {
        SpotifyIconV2 spotifyIconV2 = this.z ? SpotifyIconV2.VIDEO : SpotifyIconV2.PODCASTS;
        HeaderViewType headerViewType = this.z ? HeaderViewType.TWO_LINE_LANDSCAPE_IMAGE : HeaderViewType.TWO_LINE_SQUARE_IMAGE;
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.e = headerViewType;
        fuz fuz = new fuz(jqo.d(), "", Uri.EMPTY, spotifyIconV2, false);
        contextMenuViewModel.c = fuz;
        return contextMenuViewModel;
    }

    public final Observable<ContextMenuViewModel> a(jqo<vkv> jqo, fqn fqn) {
        int i2;
        Map<String, String> map;
        jqo<vkv> jqo2 = jqo;
        fbp.a(jqo.a());
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        ContextMenuHelper a2 = this.b.a(this.d, this.e, contextMenuViewModel, new a(fqn), fqn);
        vkv vkv = (vkv) jqo.b();
        Show show = (Show) fbp.a(vkv.t());
        boolean z2 = vkv.w() != MediaType.AUDIO;
        List<kai> list = this.h.a;
        String a3 = vlh.a(vkv.b(), vkv.c(), show, Size.NORMAL);
        Uri parse = !TextUtils.isEmpty(a3) ? Uri.parse(a3) : Uri.EMPTY;
        String a4 = this.w.a(show.a(), vkv.s(), vkv.m(), vkv.n(), vkv.o()).a(true).a();
        fuz fuz = new fuz(vkv.a(), a4, parse, z2 ? SpotifyIconV2.VIDEO : SpotifyIconV2.PODCASTS, false);
        if (!this.k || vkv.w() != MediaType.AUDIO) {
            fuz.c = uiq.a(vkv.d());
        }
        if (fbo.a(show.c())) {
            fuz.d = show.a();
        } else {
            fuz.d = this.c.getString(R.string.episode_context_menu_header, new Object[]{show.a(), show.c()});
        }
        fuz.h = this.c.getResources().getInteger(R.integer.show_and_episode_context_menu_title_max_rows);
        contextMenuViewModel.d = a4;
        contextMenuViewModel.c = fuz;
        contextMenuViewModel.e = this.z ? HeaderViewType.TWO_LINE_LANDSCAPE_IMAGE : HeaderViewType.TWO_LINE_SQUARE_IMAGE;
        if (this.u.b() && this.v.b()) {
            a2.a((String) this.u.c(), (String) this.v.c(), jva.a(vkv.getUri()).b);
        }
        Map<String, String> map2 = jqo2.e;
        String str = map2 == null ? null : (String) map2.get(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY);
        boolean z3 = jva.a(str).b == LinkType.TRACK;
        if (!this.z || map2 == null || str == null || !z3) {
            map = map2;
            i2 = 1;
            if (!this.z) {
                if (this.t) {
                    a2.b(vkv.getUri(), this.e.toString(), jqo2.c);
                } else {
                    a2.a(vkv.getUri(), this.e.toString(), jqo2.c);
                }
            }
        } else {
            boolean booleanValue = Boolean.valueOf((String) map2.get("audio_track_uri_in_collection")).booleanValue();
            map = map2;
            String str2 = str;
            i2 = 1;
            a2.a(booleanValue, true, false, str2, show.getUri());
            String str3 = "";
            String str4 = (String) jvi.a(map.get("audio_track_album_name"), str3);
            String str5 = (String) jvi.a(map.get("audio_track_artist_name"), str3);
            a2.a(str2, this.e.toString(), jqo2.c);
            if (this.l) {
                String str6 = (String) map.get("audio_track_album_uri");
                if (str6 != null) {
                    a2.a(str6, str4);
                }
            }
            String str7 = (String) map.get("audio_track_artist_uri");
            if (str7 != null) {
                a2.c(str7, str5);
            }
        }
        if (vkv.w() == MediaType.AUDIO && isu.a(fqn) && this.i && (vkv.l() || !(vkv.u() instanceof f))) {
            a2.a(vkv.getUri(), vkv.u());
        }
        if (this.n) {
            a2.a(vkv.getUri(), vkv.o(), this.y);
        }
        if (vkv.l() && !this.p) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(vkv.v());
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("context_uri", this.e.toString());
            a2.a(PlayerTrack.create(vkv.getUri(), hashMap));
        }
        if (this.o) {
            a2.c(ViewUris.Y.toString());
        }
        if (this.s) {
            String a5 = vkv.a();
            Activity activity = this.c;
            Object[] objArr = new Object[i2];
            objArr[0] = show.a();
            a2.a(a5, activity.getString(R.string.share_episode_of_name, objArr), vkv.getUri(), jqo2.d ? jqo2.c : null, parse);
        }
        if (this.j) {
            a2.b(show.getUri(), show.a(), z2);
        }
        if (this.k && vkv.w() == MediaType.AUDIO) {
            a2.e(vkv.getUri(), vkv.a());
        }
        if (this.r) {
            a2.d(vkv.getUri());
        }
        if (!this.z && sei.a(fqn)) {
            a2.a(vkv.getUri(), this.e);
        }
        return this.m ? Observable.a((ObservableSource<? extends T1>) Observable.b(contextMenuViewModel), (ObservableSource<? extends T2>) this.g.a(), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$jph$Z22ugNscIlU9MRdNhOEO154f3VI<Object,Object,Object>(a2, list, contextMenuViewModel)) : Observable.b(contextMenuViewModel);
    }
}
