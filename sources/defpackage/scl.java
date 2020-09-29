package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.PlaybackStateCompat.CustomAction;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: scl reason: default package */
public abstract class scl {

    /* renamed from: scl$a */
    public static class a extends scl {
        protected a() {
        }

        public final PlaybackStateCompat a(sch sch) {
            android.support.v4.media.session.PlaybackStateCompat.a a = new android.support.v4.media.session.PlaybackStateCompat.a().a(0, -1, 0.0f);
            if (sch == null) {
                a.b = 0;
                return a.a();
            }
            long j = 141312;
            for (MediaAction a2 : sch.a(new hqx().a(null, null, null))) {
                long a3 = sch.a(a2);
                if (0 != a3) {
                    j |= a3;
                }
            }
            a.b = j;
            return a.a();
        }

        public final MediaMetadataCompat b() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return getClass().getSimpleName();
        }
    }

    /* renamed from: scl$b */
    public static class b extends scl {
        private final int a;
        private final String b;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public b(String str) {
            this(0, str);
        }

        public final PlaybackStateCompat a(sch sch) {
            long j = sch == null ? 0 : 141312;
            android.support.v4.media.session.PlaybackStateCompat.a a2 = new android.support.v4.media.session.PlaybackStateCompat.a().a(7, -1, 0.0f).a(this.a, this.b);
            a2.b = j;
            return a2.a();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a) {
                return false;
            }
            String str = this.b;
            return str == null ? bVar.b == null : str.equals(bVar.b);
        }

        public final int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(": ");
            sb.append(this.b);
            sb.append(' ');
            sb.append(this.a);
            return sb.toString();
        }
    }

    /* renamed from: scl$c */
    public static class c extends scl {
        private final List<MediaAction> a;
        private final android.support.v4.media.session.PlaybackStateCompat.a b;
        private final MediaMetadataCompat c;
        private final sdd d;
        private final String e;
        private final int f;
        private final int g;

        protected c(hre hre, PlayerState playerState, usi usi, PlayerQueue playerQueue, boolean z, tvn tvn, int i) {
            hre hre2 = hre;
            PlayerQueue playerQueue2 = playerQueue;
            PlayerTrack playerTrack = (PlayerTrack) fbp.a(playerState.track());
            android.support.v4.media.session.PlaybackStateCompat.a aVar = new android.support.v4.media.session.PlaybackStateCompat.a();
            boolean z2 = playerState.isPlaying() && !playerState.isPaused();
            int i2 = 2;
            if (z2) {
                aVar.a(3, playerState.currentPlaybackPosition(), playerState.playbackSpeed());
            } else {
                aVar.a(2, playerState.currentPlaybackPosition(), playerState.playbackSpeed());
            }
            if (z2) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("com.amazon.alexa.externalmediaplayer.active", z);
                Logger.b("Alexa extra isActiveLocalPlayback: %b", Boolean.valueOf(z));
                aVar.d = bundle;
            }
            android.support.v4.media.MediaMetadataCompat.a aVar2 = new android.support.v4.media.MediaMetadataCompat.a();
            Map metadata = playerTrack.metadata();
            boolean parseBoolean = Boolean.parseBoolean((String) metadata.get("is_advertisement"));
            long j = Boolean.parseBoolean((String) metadata.get("is_explicit")) ? 1 : 0;
            PlayerOptions options = playerState.options();
            this.g = options.shufflingContext() ? 1 : 0;
            if (!options.repeatingContext()) {
                i2 = options.repeatingTrack() ? 1 : 0;
            }
            this.f = i2;
            String str = "";
            android.support.v4.media.MediaMetadataCompat.a a2 = aVar2.a("android.media.metadata.TITLE", (String) metadata.get("title")).a("android.media.metadata.ARTIST", parseBoolean ? (String) metadata.get("advertiser") : (String) metadata.get("artist_name")).a("android.media.metadata.ALBUM", parseBoolean ? str : (String) metadata.get("album_title")).a("android.media.metadata.DURATION", playerState.duration());
            if (!parseBoolean) {
                str = hre2.a((String) metadata.get("image_large_url")).toString();
            }
            a2.a("android.media.metadata.ALBUM_ART_URI", str).a("android.media.IS_EXPLICIT", j);
            PlayerTrack track = playerState.track();
            if (track != null) {
                aVar2.a("android.media.metadata.MEDIA_ID", track.uri());
            }
            this.c = aVar2.a();
            if (playerQueue2 == null || !playerState.restrictions().disallowPeekingNextReasons().isEmpty()) {
                this.d = sdd.a;
            } else {
                this.d = new sdd(hre2, playerQueue2);
                aVar.c = 0;
            }
            new hqx();
            this.a = hqx.a(playerState, usi, tvn, i);
            this.b = aVar;
            this.e = playerState.playbackId();
        }

        public final int a() {
            return this.f;
        }

        public final PlaybackStateCompat a(sch sch) {
            if (sch == null) {
                return this.b.a();
            }
            long j = 141312;
            for (MediaAction mediaAction : sch.a((List<MediaAction>) new ArrayList<MediaAction>(this.a))) {
                long a2 = sch.a(mediaAction);
                if (0 == a2) {
                    CustomAction b2 = sch.b(mediaAction);
                    if (b2 != null) {
                        android.support.v4.media.session.PlaybackStateCompat.a aVar = this.b;
                        if (b2 != null) {
                            aVar.a.add(b2);
                        } else {
                            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
                        }
                    } else {
                        continue;
                    }
                } else {
                    j |= a2;
                }
            }
            android.support.v4.media.session.PlaybackStateCompat.a aVar2 = this.b;
            aVar2.b = j;
            return aVar2.a();
        }

        public final MediaMetadataCompat b() {
            return this.c;
        }

        public final sdd c() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public final int e() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f == cVar.f && this.g == cVar.g && this.a.equals(cVar.a) && this.e.equals(cVar.e);
        }

        public final int hashCode() {
            return (((((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(": ");
            sb.append(this.b.a().a);
            sb.append(" Artist: ");
            sb.append(this.c.a("android.media.metadata.ARTIST"));
            sb.append(" Title: ");
            sb.append(this.c.a("android.media.metadata.TITLE"));
            sb.append(" PlaybackId: ");
            sb.append(this.e);
            return sb.toString();
        }
    }

    /* renamed from: scl$d */
    public static class d extends scl {
        public final PlaybackStateCompat a(sch sch) {
            long j = sch == null ? 0 : 141312;
            android.support.v4.media.session.PlaybackStateCompat.a a = new android.support.v4.media.session.PlaybackStateCompat.a().a(8, -1, 0.0f);
            a.b = j;
            return a.a();
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return getClass().getSimpleName();
        }
    }

    public static scl a(Context context, hre hre, SessionState sessionState, PlayerState playerState, usi usi, PlayerQueue playerQueue, boolean z, tvn tvn, int i) {
        usi usi2 = usi;
        fbp.a(context);
        boolean z2 = true;
        if (!sessionState.loggedIn() && !sessionState.loggingIn() && !sessionState.loggingOut()) {
            Context context2 = context;
            String string = context.getString(R.string.applink_logged_out_warning_linescombo);
            Logger.c("Waiting state for session reasons %s", string);
            return new b(3, string);
        } else if (sessionState.loggingIn() || sessionState.loggingOut()) {
            Logger.c("Waiting state for session reasons", new Object[0]);
            return new d();
        } else if (playerState == null) {
            return new a();
        } else {
            if (playerState.track() != null) {
                if (usi2 != null) {
                    if (!ute.f(usi2.c) || !usi2.e) {
                        z2 = false;
                    }
                    if (z2) {
                        Logger.c("Waiting state for radio reasons", new Object[0]);
                        return new d();
                    }
                }
                Logger.c("Playable state", new Object[0]);
                c cVar = new c(hre, playerState, usi, playerQueue, z, tvn, i);
                return cVar;
            } else if (playerState.isPlaying()) {
                Logger.c("Waiting state, isPlaying = %b, isPaused = %b", Boolean.valueOf(playerState.isPlaying()), Boolean.valueOf(playerState.isPaused()));
                return new d();
            } else {
                Logger.c("Empty state, track = %s, isPlaying = %b, isPaused = %b", playerState.track(), Boolean.valueOf(playerState.isPlaying()), Boolean.valueOf(playerState.isPaused()));
                return new a();
            }
        }
    }

    public int a() {
        return 0;
    }

    public abstract PlaybackStateCompat a(sch sch);

    public MediaMetadataCompat b() {
        return new android.support.v4.media.MediaMetadataCompat.a().a();
    }

    public sdd c() {
        return sdd.a;
    }

    public String d() {
        return null;
    }

    public int e() {
        return 0;
    }
}
