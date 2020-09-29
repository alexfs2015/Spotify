package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.playlist.shelves.Extender;
import com.spotify.mobile.android.playlist.shelves.Extender.Track;
import com.spotify.mobile.android.playlist.shelves.ExtenderLogger;
import com.spotify.mobile.android.playlist.shelves.ExtenderLogger.UserIntent;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.R;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.endpoints.exceptions.InsufficientStorageException;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: hcj reason: default package */
public final class hcj implements hvn {
    static final b<Object, Boolean> a = b.b("playlist-extender-is-collapsed-key");
    private final lkn A;
    /* access modifiers changed from: private */
    public final uxh B;
    /* access modifiers changed from: private */
    public final ExtenderLogger C;
    /* access modifiers changed from: private */
    public final jsz D;
    private final Handler E;
    private fpt F;
    /* access modifiers changed from: private */
    public String G;
    /* access modifiers changed from: private */
    public boolean H;
    /* access modifiers changed from: private */
    public boolean I;
    private boolean J;
    private final com.spotify.mobile.android.playlist.shelves.Extender.a K = new com.spotify.mobile.android.playlist.shelves.Extender.a() {
        public final void a(List<Track> list) {
            hcj.this.o = true;
            hcj.this.i.a(list);
            hcj.this.m.b((CharSequence) null);
            if (ImmutableList.a((Collection<? extends E>) hcj.this.i.d).isEmpty()) {
                if (hcj.this.b.c()) {
                    hcj.d(hcj.this);
                } else {
                    hcj.this.H = false;
                    hcj.this.m.b((CharSequence) hcj.this.e.getString(R.string.playlist_extended_tracks_no_results));
                }
            }
            hcj hcj = hcj.this;
            hcj.G = hcj.e.getString(hcj.this.d.d() == 0 ? R.string.playlist_extended_tracks_section_description_songs_empty : R.string.playlist_extended_tracks_section_description_songs);
            hcj.this.d();
        }

        public final void a(Throwable th) {
            hcj.this.o = true;
            Logger.b("extender: onError(%s)", th.getMessage());
            if (hcj.this.f()) {
                hcj.this.H = false;
                hcj.this.m.b((CharSequence) hcj.this.e.getString(R.string.playlist_extended_tracks_offline));
            } else {
                hcj.this.H = true;
                hcj.this.m.b((CharSequence) hcj.this.e.getString(R.string.playlist_extended_tracks_error));
            }
            hcj.this.d();
        }
    };
    public final Extender b;
    public final ObjectMapper c;
    public final a d;
    public final Context e;
    public final Player f;
    public final hcd g;
    public final fsc h;
    public hcc i;
    public uwh j;
    public fru k;
    public Button l;
    public fuj m;
    public boolean n;
    public boolean o;
    public final CompositeDisposable p = new CompositeDisposable();
    public final defpackage.hcb.a q = new defpackage.hcb.a() {
        public final void a(String str, int i, C0043a aVar) {
            hcj.this.p.a(hcj.this.B.a(hcj.this.u, Collections.singletonList(str)).a(hcj.this.z).a((Action) new $$Lambda$hcj$2$PNpOKpa27YX_UDjrTiozQ6pH_8(this, str, i, aVar), (Consumer<? super Throwable>) new $$Lambda$hcj$2$X2yYeuMkng45y0QA8ulDRf7A8L0<Object>(this, aVar)));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, int i, C0043a aVar) {
            hcj.this.b.a(jst.a(str).f());
            hcj.this.c();
            String str2 = str;
            hcj.this.C.a(str2, "playlist-extender", i, InteractionType.HIT, UserIntent.ADD_TRACK_CLICKED);
            hcc a2 = hcj.this.i;
            int size = a2.d.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((Track) a2.d.get(i2)).getUri().equals(str)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                a2.d.remove(i2);
                a2.e();
            }
            aVar.itemWasAdded(true);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(C0043a aVar, Throwable th) {
            if (th instanceof InsufficientStorageException) {
                hcj.this.D.a((int) R.string.toast_playlist_size_limit_exceeded, 1, new Object[0]);
            } else {
                hcj.this.D.a((int) R.string.error_general_title, 0, new Object[0]);
            }
            aVar.itemWasAdded(false);
            Logger.e(th, "Failed to add playlist extender track to playlist", new Object[0]);
        }
    };
    public final PlayerStateObserver r = new PlayerStateObserver() {
        public final void onPlayerStateReceived(PlayerState playerState) {
            PlayerTrack track = playerState.track();
            if (track == null || !faw.a(hcj.this.t, playerState.entityUri())) {
                hcj.this.i.a((String) null);
            } else {
                hcj.this.i.a(track.uri());
            }
        }
    };
    public final OnClickListener s = new OnClickListener() {
        public final void onClick(View view) {
            hcj hcj = hcj.this;
            hcj.I = !hcj.I;
            if (hcj.this.I) {
                hcj.this.C.a(false);
                hcj.this.d();
            } else {
                hcj.this.d.e();
                hcj.this.d();
                hcj.this.b();
                hcj.this.C.a(true);
            }
            hcj.this.y.a().a(hcj.a, hcj.this.I).b();
        }
    };
    /* access modifiers changed from: private */
    public final String t;
    /* access modifiers changed from: private */
    public final String u;
    private final SpotifyIconDrawable v;
    private final ObjectAnimator w;
    private final int x;
    /* access modifiers changed from: private */
    public final SpSharedPreferences<Object> y;
    /* access modifiers changed from: private */
    public final Scheduler z;

    /* renamed from: hcj$a */
    public interface a extends defpackage.hvn.a {
        boolean a();

        boolean b();

        String c();

        int d();

        void e();
    }

    public hcj(Context context, fpt fpt, String str, int i2, SpotifyIconDrawable spotifyIconDrawable, ObjectAnimator objectAnimator, ObjectMapper objectMapper, Player player, hcf hcf, boolean z2, SpSharedPreferences<Object> spSharedPreferences, hcd hcd, fsc fsc, Scheduler scheduler, lkn lkn, uxh uxh, hch hch, jsz jsz, InteractionLogger interactionLogger, a aVar) {
        String str2 = str;
        hcf hcf2 = hcf;
        this.F = fpt;
        this.d = aVar;
        this.e = context;
        this.u = str2;
        this.x = i2;
        this.v = spotifyIconDrawable;
        this.w = objectAnimator;
        this.c = (ObjectMapper) fay.a(objectMapper);
        this.f = player;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":recommended");
        this.t = sb.toString();
        Extender extender = new Extender((FireAndForgetResolver) hcf.a(hcf2.a.get(), 1), (ObjectMapper) hcf.a(hcf2.b.get(), 2), (String) hcf.a(hcf2.c.get(), 3), (com.spotify.mobile.android.playlist.shelves.Extender.a) hcf.a(this.K, 4), ((Integer) hcf.a(hcf2.d.get(), 5)).intValue());
        this.b = extender;
        this.I = z2;
        this.y = spSharedPreferences;
        this.g = hcd;
        this.h = fsc;
        this.z = scheduler;
        this.A = lkn;
        this.B = uxh;
        if (interactionLogger != null) {
            this.C = new ExtenderLogger(interactionLogger);
            this.D = jsz;
            this.E = new Handler(context.getMainLooper());
            return;
        }
        StringBuilder sb2 = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb2.append(1);
        throw new NullPointerException(sb2.toString());
    }

    public final void a() {
        this.f.registerPlayerStateObserver(this.r);
        this.p.a(vun.b(this.A.a()).a(this.z).a((Consumer<? super T>) new $$Lambda$hcj$yfZbsJ4g9PDwKuv0pri1PwaU<Object>(this), (Consumer<? super Throwable>) $$Lambda$hcj$s13eowEDIB9VYUimvN8P6t0m3xM.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.J = bool.booleanValue();
        hcc hcc = this.i;
        hcc.f = bool.booleanValue();
        if (hcc.a() > 0) {
            hcc.e();
        }
    }

    public final void b() {
        if (e() && !this.I && !this.n && this.d.f()) {
            this.n = true;
            this.E.post(new $$Lambda$oluUXDASVBooxJWXECuHhAz_mKY(this));
        }
    }

    private boolean e() {
        return !this.d.a();
    }

    public void c() {
        boolean z2 = false;
        if (f()) {
            this.H = false;
            this.m.b((CharSequence) this.e.getString(R.string.playlist_extended_tracks_offline));
            d();
            return;
        }
        if (ImmutableList.a((Collection<? extends E>) this.i.d).size() < (this.x << 1)) {
            z2 = true;
        }
        if (this.n && this.d.b() && z2 && !this.b.a()) {
            this.b.b(this.d.c());
            d();
        }
    }

    /* access modifiers changed from: private */
    public boolean f() {
        return !this.d.b() && ImmutableList.a((Collection<? extends E>) this.i.d).isEmpty();
    }

    public void d() {
        if (!e()) {
            this.j.a(false, 0, 1, 2, 3, 4);
        } else if (this.I) {
            this.j.a(true, 0);
            this.j.a(false, 1, 2, 3, 4);
            this.k.a().setTextColor(fr.c(this.e, R.color.gray_70));
            this.k.a().setOnClickListener(this.s);
            this.k.d().setVisibility(0);
            this.k.a(SpotifyIcon.CHEVRON_DOWN_32);
            this.k.c().setVisibility(8);
        } else {
            if (this.n) {
                this.j.a(true, 0);
                this.k.a(SpotifyIcon.CHEVRON_UP_32);
                this.k.a().setTextColor(fr.c(this.e, R.color.white));
                boolean z2 = !this.o;
                boolean a2 = this.b.a();
                boolean z3 = !TextUtils.isEmpty(this.m.c().getText());
                if (!z3 && !z2) {
                    this.k.d().setVisibility(0);
                    this.k.a().setOnClickListener(this.s);
                } else {
                    this.k.d().setVisibility(8);
                    this.k.a().setOnClickListener(null);
                }
                if (!z2 || !a2) {
                    this.j.a(false, 2);
                    if (z3) {
                        this.j.a(true, 3);
                        this.j.a(false, 1);
                        this.k.c().setVisibility(8);
                        if (this.H) {
                            this.j.a(true, 4);
                        } else {
                            this.j.a(false, 4);
                        }
                    } else {
                        this.j.a(false, 3);
                        this.j.a(true, 4, 1);
                        this.k.b(this.G);
                        this.k.c().setVisibility(0);
                    }
                    a(a2);
                } else {
                    this.j.a(true, 2);
                    this.j.a(false, 3, 1, 4);
                    this.k.c().setVisibility(8);
                }
            }
        }
    }

    private void a(boolean z2) {
        boolean z3 = false;
        if (this.l.getCompoundDrawables()[0] != null) {
            z3 = true;
        }
        if (z2) {
            if (!z3) {
                this.l.setCompoundDrawablesWithIntrinsicBounds(this.v, null, null, null);
            }
            this.l.setText(R.string.playlist_extended_tracks_refreshing_button);
            this.w.start();
            return;
        }
        if (this.w.isStarted()) {
            this.w.end();
        }
        if (z3) {
            this.l.setCompoundDrawables(null, null, null, null);
        }
        this.l.setText(R.string.playlist_extended_tracks_refresh_button);
    }

    static /* synthetic */ void d(hcj hcj) {
        hcc hcc = hcj.i;
        hcc.d.clear();
        hcc.e();
        hcj.b.b();
        hcj.b.b(hcj.d.c());
    }

    static /* synthetic */ void a(hcj hcj, int i2) {
        String uri = hcj.i.f(i2).getUri();
        if (!jsl.c(hcj.F)) {
            hcj.C.a(uri, "playlist-extender", i2, InteractionType.HIT, UserIntent.TRACK_CLICKED_MUTED);
            return;
        }
        boolean z2 = hcj.i.f(i2).explicit;
        if (!hcj.J || !z2) {
            PlayerTrack[] playerTrackArr = new PlayerTrack[hcj.i.a()];
            for (int i3 = 0; i3 < hcj.i.a(); i3++) {
                playerTrackArr[i3] = PlayerTrack.create(hcj.i.f(i3).getUri());
            }
            PlayerContext create = PlayerContext.create(hcj.t, playerTrackArr);
            Builder skipToIndex = new Builder().skipToIndex(0, i2);
            Boolean bool = Boolean.FALSE;
            hcj.f.play(create, skipToIndex.playerOptionsOverride(bool, bool, Boolean.FALSE).build());
        } else {
            hcj.A.a(uri, hcj.u);
        }
        hcj.C.a(uri, "playlist-extender", i2, InteractionType.HIT, UserIntent.TRACK_CLICKED);
    }

    static /* synthetic */ void s(hcj hcj) {
        if (!hcj.b.a()) {
            hcc hcc = hcj.i;
            hcc.d = hcc.d.subList(Math.min(hcc.d.size(), hcc.a), hcc.d.size());
            hcc.e();
            hcj.c();
        }
        hcj.C.a(null, "playlist-extender", -1, InteractionType.HIT, UserIntent.REFRESH_CLICKED);
    }
}
