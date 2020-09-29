package com.spotify.music.libs.mediasession;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import io.reactivex.Flowable;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class SpotifyRemoteControlClient implements rur {
    public static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, Boolean> a = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.b("send_playback_broadcasts");
    private static final wun<Throwable> b = $$Lambda$SpotifyRemoteControlClient$Y3NiOlWOokWrpIEVtefxAXtg9Jw.INSTANCE;
    private final Context c;
    private final AudioManager d;
    private final SpSharedPreferences<Object> e;
    private final rut f;
    private final Picasso g;
    private final wug h;
    private final Flowable<PlayerState> i;
    private final jrp j;
    private rus k = i();
    /* access modifiers changed from: private */
    public hhp l;
    private boolean m;
    private boolean n;
    /* access modifiers changed from: private */
    public Player o;
    /* access modifiers changed from: private */
    public PlayerState p;
    private Bitmap q;
    /* access modifiers changed from: private */
    public Uri r;
    private final vsr s;
    private xag t;

    /* renamed from: com.spotify.music.libs.mediasession.SpotifyRemoteControlClient$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Change.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.libs.mediasession.SpotifyRemoteControlClient$Change[] r0 = com.spotify.music.libs.mediasession.SpotifyRemoteControlClient.Change.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.libs.mediasession.SpotifyRemoteControlClient$Change r1 = com.spotify.music.libs.mediasession.SpotifyRemoteControlClient.Change.METADATA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.libs.mediasession.SpotifyRemoteControlClient$Change r1 = com.spotify.music.libs.mediasession.SpotifyRemoteControlClient.Change.PLAYBACK_STATE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.libs.mediasession.SpotifyRemoteControlClient$Change r1 = com.spotify.music.libs.mediasession.SpotifyRemoteControlClient.Change.QUEUE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.libs.mediasession.SpotifyRemoteControlClient$Change r1 = com.spotify.music.libs.mediasession.SpotifyRemoteControlClient.Change.PLAYBACK_LOCATION     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.mediasession.SpotifyRemoteControlClient.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Change {
        METADATA,
        PLAYBACK_STATE,
        QUEUE,
        PLAYBACK_LOCATION;
        
        public static final Change[] e = null;

        static {
            e = values();
        }
    }

    class a implements vsr {
        public final void b(Drawable drawable) {
        }

        private a() {
        }

        /* synthetic */ a(SpotifyRemoteControlClient spotifyRemoteControlClient, byte b) {
            this();
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fay.a(!bitmap.isRecycled());
            SpotifyRemoteControlClient.this.r = Uri.EMPTY;
            SpotifyRemoteControlClient spotifyRemoteControlClient = SpotifyRemoteControlClient.this;
            spotifyRemoteControlClient.a(spotifyRemoteControlClient.p, bitmap);
            fay.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            SpotifyRemoteControlClient.this.r = Uri.EMPTY;
        }
    }

    class b implements ruq {
        private b() {
        }

        /* synthetic */ b(SpotifyRemoteControlClient spotifyRemoteControlClient, byte b) {
            this();
        }

        public final void a() {
            b((gbr<PlayerTrack>) new gbr() {
                public final void accept(Object obj) {
                    b.this.b((PlayerTrack) obj);
                }
            });
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(PlayerTrack playerTrack) {
            c(new gbr() {
                public final void accept(Object obj) {
                    ((hhp) obj).a(PlayerTrack.this);
                }
            });
        }

        public final void b() {
            b((gbr<PlayerTrack>) new gbr() {
                public final void accept(Object obj) {
                    b.this.a((PlayerTrack) obj);
                }
            });
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(PlayerTrack playerTrack) {
            c(new gbr() {
                public final void accept(Object obj) {
                    ((hhp) obj).b(PlayerTrack.this);
                }
            });
        }

        public final void c() {
            a((gbr<Player>) $$Lambda$gFTDep_MSx7nKZiCyVz8nI33wh4.INSTANCE);
        }

        public final void d() {
            a((gbr<Player>) $$Lambda$YuLoB7FFvgnUARC7JTLgO7X26fI.INSTANCE);
        }

        public final void a(long j) {
            a((gbr<Player>) new gbr(j) {
                private final /* synthetic */ long f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    ((Player) obj).seekTo(this.f$0);
                }
            });
        }

        private void a(gbr<Player> gbr) {
            Player b = SpotifyRemoteControlClient.this.o;
            if (b != null) {
                gbr.accept(b);
            } else {
                Assertion.b("Player not available!");
            }
        }

        private void b(gbr<PlayerTrack> gbr) {
            if (SpotifyRemoteControlClient.this.o == null) {
                Assertion.b("Player not available!");
                return;
            }
            PlayerState lastPlayerState = SpotifyRemoteControlClient.this.o.getLastPlayerState();
            if (lastPlayerState != null) {
                PlayerTrack track = lastPlayerState.track();
                if (track != null) {
                    gbr.accept(track);
                }
            }
        }

        private void c(gbr<hhp> gbr) {
            hhp c = SpotifyRemoteControlClient.this.l;
            if (c == null) {
                Assertion.b("SkipActionHandler not available!");
            } else {
                gbr.accept(c);
            }
        }
    }

    static final class c {
        final String a;
        final String b;
        final String c;
        final String d;
        final String e;
        final long f;
        final int g;
        final boolean h;
        final boolean i;
        final boolean j;
        final long k;
        final boolean l;

        c(PlayerState playerState) {
            PlayerTrack track = playerState != null ? playerState.track() : null;
            long j2 = -1;
            if (playerState == null || track == null || SpotifyRemoteControlClient.b(playerState)) {
                String str = "";
                this.a = str;
                this.b = str;
                this.c = str;
                this.d = str;
                this.e = str;
                this.f = 0;
                this.g = 0;
                this.h = false;
                this.i = false;
                this.j = false;
                this.k = -1;
                this.l = false;
                return;
            }
            this.a = playerState.contextUri();
            this.b = (String) track.metadata().get("title");
            this.c = (String) track.metadata().get("album_title");
            String str2 = "artist_name";
            this.d = (String) track.metadata().get(str2);
            this.e = (String) track.metadata().get(str2);
            this.f = playerState.duration();
            boolean z = true;
            this.h = true;
            this.i = playerState.restrictions().disallowSkippingPrevReasons().isEmpty() && !"radio".equals(playerState.playOrigin().featureIdentifier());
            if (!playerState.restrictions().disallowSkippingNextReasons().isEmpty() || SpotifyRemoteControlClient.d(playerState)) {
                z = false;
            }
            this.j = z;
            this.g = (playerState.isPaused() || !playerState.isPlaying()) ? 2 : 3;
            long currentPlaybackPosition = playerState.currentPlaybackPosition();
            if (currentPlaybackPosition != -1) {
                j2 = currentPlaybackPosition;
            }
            this.k = j2;
            this.l = playerState.restrictions().disallowSeekingReasons().isEmpty();
        }
    }

    public SpotifyRemoteControlClient(Context context, SpSharedPreferences<Object> spSharedPreferences, rut rut, Picasso picasso, wug wug, Flowable<PlayerState> flowable, jrp jrp) {
        this.c = context;
        this.e = spSharedPreferences;
        this.f = rut;
        this.h = wug;
        this.i = flowable;
        this.j = jrp;
        this.d = (AudioManager) context.getSystemService("audio");
        this.g = picasso;
        this.s = new a(this, 0);
    }

    private rus i() {
        if (this.k == null) {
            this.k = this.f.a(new b(this, 0));
            Logger.b("MediaSession has been created %s", this.k.g());
        }
        this.m = this.k.c();
        return this.k;
    }

    public final void a(Player player) {
        if (!this.n) {
            this.o = (Player) fay.a(player);
            this.l = new hhp(new hmt(player));
            this.t = new xag();
            wud a2 = vun.a((wrf<T>) this.i).a(this.h);
            wuk a3 = a2.a((wun<? super T>) new wun() {
                public final void call(Object obj) {
                    SpotifyRemoteControlClient.this.f((PlayerState) obj);
                }
            }, b);
            wud b2 = a2.f($$Lambda$LRvKWt5EFY4ttY8p3E2byI4t8QE.INSTANCE).b().b((wun<? super T>) new wun() {
                public final void call(Object obj) {
                    SpotifyRemoteControlClient.this.e((Uri) obj);
                }
            });
            wuk a4 = b2.b(2, TimeUnit.SECONDS).c((wut<? super T, Boolean>) new wut() {
                public final Object call(Object obj) {
                    return SpotifyRemoteControlClient.this.d((Uri) obj);
                }
            }).a((wun<? super T>) new wun() {
                public final void call(Object obj) {
                    SpotifyRemoteControlClient.this.c((Uri) obj);
                }
            }, b);
            wuk a5 = b2.c((wut<? super T, Boolean>) $$Lambda$SpotifyRemoteControlClient$0W5w3W6wPHrk6KhizHKgR0xogdo.INSTANCE).a((wun<? super T>) new wun() {
                public final void call(Object obj) {
                    SpotifyRemoteControlClient.this.a((Uri) obj);
                }
            }, b);
            this.t.a(a3);
            this.t.a(a4);
            this.t.a(a5);
            rus rus = this.k;
            if (rus != null) {
                rus.a();
            }
            this.n = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(PlayerState playerState) {
        a(playerState, this.q);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(Uri uri) {
        this.r = uri;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean d(Uri uri) {
        return Boolean.valueOf(uri.equals(this.r));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Uri uri) {
        a(this.p, (Bitmap) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri) {
        this.g.a(uri).a(this.s);
    }

    static Uri a(PlayerState playerState) {
        if (playerState == null || playerState.track() == null) {
            return Uri.EMPTY;
        }
        return ivs.b(playerState.track());
    }

    public final void a() {
        if (this.n) {
            this.t.unsubscribe();
            rus rus = this.k;
            if (rus != null) {
                rus.b();
            }
            this.o = null;
            this.n = false;
        }
    }

    public final void b() {
        rus rus = this.k;
        if (rus != null) {
            MediaSessionCompat g2 = rus.g();
            g2.b();
            Logger.b("MediaSession has been released %s", g2);
        }
        this.k = null;
        this.m = false;
    }

    public final MediaSessionCompat c() {
        return i().g();
    }

    public final void e() {
        i().e();
    }

    public final void f() {
        rus rus = this.k;
        if (rus != null) {
            rus.d();
        }
    }

    public final Token d() {
        return i().f();
    }

    /* access modifiers changed from: 0000 */
    public final void a(PlayerState playerState, Bitmap bitmap) {
        if (this.n) {
            PlayerState playerState2 = this.p;
            EnumSet noneOf = EnumSet.noneOf(Change.class);
            if (playerState2 == null) {
                Collections.addAll(noneOf, Change.e);
            } else {
                if (playerState2.isPaused() != playerState.isPaused()) {
                    noneOf.add(Change.PLAYBACK_STATE);
                }
                if (playerState2.isPlaying() != playerState.isPlaying()) {
                    noneOf.add(Change.PLAYBACK_STATE);
                }
                if (!playerState2.restrictions().disallowSkippingPrevReasons().equals(playerState.restrictions().disallowSkippingPrevReasons())) {
                    noneOf.add(Change.QUEUE);
                }
                if (!playerState2.restrictions().disallowSkippingNextReasons().equals(playerState.restrictions().disallowSkippingNextReasons())) {
                    noneOf.add(Change.QUEUE);
                }
                if (d(playerState2) != d(playerState)) {
                    noneOf.add(Change.QUEUE);
                }
                if (playerState2.duration() != playerState.duration()) {
                    noneOf.add(Change.PLAYBACK_STATE);
                }
                if (playerState2.currentPlaybackPosition() != playerState.currentPlaybackPosition()) {
                    noneOf.add(Change.PLAYBACK_STATE);
                }
                if (e(playerState2) != e(playerState)) {
                    noneOf.add(Change.QUEUE);
                }
                PlayerTrack track = playerState2.track();
                PlayerTrack track2 = playerState.track();
                if ((track == null && track2 != null) || (track != null && track2 == null)) {
                    noneOf.add(Change.METADATA);
                } else if (track != null && !track.uri().equals(track2.uri())) {
                    noneOf.add(Change.METADATA);
                }
            }
            long a2 = this.j.a();
            if (j() && !d(playerState)) {
                Intent intent = new Intent();
                Iterator it = noneOf.iterator();
                while (it.hasNext()) {
                    Change change = (Change) it.next();
                    if (intent.getExtras() != null) {
                        intent.getExtras().clear();
                    }
                    int i2 = AnonymousClass1.a[change.ordinal()];
                    if (i2 == 1) {
                        rup.b(intent, playerState);
                        intent.setAction("com.spotify.music.metadatachanged");
                    } else if (i2 == 2) {
                        rup.a(intent, playerState);
                        intent.setAction("com.spotify.music.playbackstatechanged");
                    } else if (i2 == 3) {
                        intent.setAction("com.spotify.music.queuechanged");
                    } else if (i2 == 4) {
                    }
                    intent.putExtra("timeSent", a2);
                    this.c.sendStickyBroadcast(intent);
                }
            }
            if (this.d.isBluetoothA2dpOn()) {
                a(playerState, noneOf);
            }
            if (noneOf.contains(Change.METADATA)) {
                this.c.sendBroadcast(new Intent("com.spotify.music.active"));
            }
            this.p = playerState;
            this.q = bitmap;
            c cVar = new c(playerState);
            android.support.v4.media.MediaMetadataCompat.a aVar = new android.support.v4.media.MediaMetadataCompat.a();
            aVar.a("android.media.metadata.TITLE", cVar.b);
            aVar.a("android.media.metadata.ALBUM", cVar.c);
            aVar.a("android.media.metadata.ARTIST", cVar.d);
            aVar.a("android.media.metadata.ALBUM_ARTIST", cVar.e);
            aVar.a("android.media.metadata.DURATION", cVar.f);
            aVar.a("android.media.metadata.MEDIA_ID", cVar.a);
            if (bitmap != null) {
                if (this.m && VERSION.SDK_INT >= 18) {
                    Config config = bitmap.getConfig();
                    if (config == null) {
                        config = Config.ARGB_8888;
                    }
                    bitmap = bitmap.copy(config, false);
                }
                aVar.a("android.media.metadata.ALBUM_ART", bitmap);
            }
            i().a(aVar.a());
            android.support.v4.media.session.PlaybackStateCompat.a aVar2 = new android.support.v4.media.session.PlaybackStateCompat.a();
            long j2 = 141312;
            if (cVar.h) {
                j2 = 141824;
                if (cVar.g == 3) {
                    j2 = 141827;
                } else if (cVar.g == 2) {
                    j2 = 141828;
                }
            }
            long j3 = 0;
            long j4 = j2 | (cVar.i ? 16 : 0) | (cVar.j ? 32 : 0);
            if (cVar.l) {
                j3 = 256;
            }
            aVar2.b = j4 | j3;
            aVar2.a(cVar.g, cVar.k, 1.0f);
            i().a(aVar2.a());
        }
    }

    private synchronized boolean j() {
        return this.e.a(a, false);
    }

    private void a(PlayerState playerState, EnumSet<Change> enumSet) {
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Change change = (Change) it.next();
            Intent intent = new Intent();
            int i2 = AnonymousClass1.a[change.ordinal()];
            boolean z = true;
            if (i2 == 1) {
                rup.b(intent, playerState);
                a(intent);
                intent.setAction("com.android.music.metachanged");
            } else if (i2 == 2) {
                rup.a(intent, playerState);
                a(intent);
                if (Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                    Intent intent2 = new Intent("com.samsung.music.playstatechanged");
                    if (playerState.isPaused() || !playerState.isPlaying()) {
                        z = false;
                    }
                    intent.putExtra("playing", z);
                    this.c.sendBroadcast(intent2);
                }
                intent.setAction("com.android.music.playstatechanged");
            } else if (i2 != 3) {
                if (i2 == 4) {
                }
            }
            this.c.sendBroadcast(intent);
        }
    }

    private static void a(Intent intent) {
        intent.putExtra("id", 1);
        intent.putExtra("playing", true);
    }

    public final void g() {
        i().a();
    }

    public final void h() {
        rus rus = this.k;
        if (rus != null) {
            rus.b();
        }
    }

    public final void a(run run) {
        i().a(run);
    }

    /* access modifiers changed from: private */
    public static boolean d(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track != null) {
            String str = "is_advertisement";
            if (track.metadata().containsKey(str) && Boolean.valueOf((String) track.metadata().get(str)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track != null) {
            Map metadata = track.metadata();
            String str = Metadata.MFT_INJECTION_SOURCE;
            if (metadata.containsKey(str)) {
                if ("fallback".equalsIgnoreCase((String) track.metadata().get(str))) {
                    return true;
                }
            }
        }
        return false;
    }

    static /* synthetic */ boolean b(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track != null) {
            if ("video".equals(track.metadata().get("media.type"))) {
                if (!"true".equals(track.metadata().get(Metadata.IS_BACKGROUNDABLE))) {
                    return true;
                }
            }
        }
        return false;
    }
}
