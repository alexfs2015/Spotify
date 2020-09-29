package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: qpk reason: default package */
public final class qpk extends rtj {
    private final qqf f;

    public qpk(hop hop, hne hne, gbd gbd, htw htw, qqf qqf) {
        super(hop, hne, gbd, htw);
        this.f = qqf;
    }

    public final void b(Uri uri, Bundle bundle) {
        Uri uri2;
        Logger.a("MediaSessionCallbackHandler.onPlayFromUri uri=%s", uri);
        h();
        qqe a = this.f.a(this.c, this.d);
        if (uri == null) {
            uri2 = Uri.EMPTY;
        } else {
            uri2 = qpo.a(uri);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        String str = "";
        a.a.b(uri2, bundle.getString("android.intent.extra.user_query", str), bundle.getString("android.intent.extra.user_query_language", str));
    }

    public final void a(Uri uri, Bundle bundle) {
        Uri uri2;
        Logger.a("MediaSessionCallbackHandler.onPrepareFromUri uri=%s", uri);
        h();
        qqe a = this.f.a(this.c, this.d);
        if (uri == null) {
            uri2 = Uri.EMPTY;
        } else {
            uri2 = qpo.a(uri);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        String str = "";
        a.a.a(uri2, bundle.getString("android.intent.extra.user_query", str), bundle.getString("android.intent.extra.user_query_language", str));
    }

    public final void b(int i) {
        boolean z = true;
        Logger.a("MediaSessionCallbackHandler.onSetShuffleMode %d", Integer.valueOf(i));
        qqe a = this.f.a(this.c, this.d);
        if (i == 1) {
            a.a.a.a();
            a.e = true;
            return;
        }
        qpr qpr = a.a.a;
        PlayerState lastPlayerState = qpr.a.getLastPlayerState();
        if (lastPlayerState == null || lastPlayerState.restrictions().disallowTogglingShuffleReasons().isEmpty()) {
            z = false;
        }
        if (!z) {
            qpr.a.setShufflingContext(false);
        }
        a.e = false;
    }

    public final void a(RatingCompat ratingCompat) {
        boolean z = true;
        Logger.b("Received rating: %s", Boolean.valueOf(ratingCompat.a()));
        qqe a = this.f.a(this.c, this.d);
        PlayerState b = a.c.d().b();
        if (b != null && ratingCompat.a()) {
            PlayerTrack track = b.track();
            if (track != null) {
                String uri = track.uri();
                String contextUri = b.contextUri();
                Logger.b("Rating is for track Uri: %s  context Uri: %s", uri, contextUri);
                if (!fax.a(contextUri) && !fax.a(uri)) {
                    if (!(ratingCompat.a == 2 && ratingCompat.b == 1.0f)) {
                        z = false;
                    }
                    if (z) {
                        a.c.b().a(uri, contextUri, a.b.d());
                        return;
                    }
                    a.c.b().a(uri, a.b.d());
                }
            }
        }
    }

    private void h() {
        this.d.c().c();
    }
}
