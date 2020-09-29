package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: qya reason: default package */
public final class qya extends scq {
    private final qyu f;

    public qya(hqr hqr, hpt hpt, gcb gcb, hwi hwi, qyu qyu, jty jty) {
        super(hqr, hpt, gcb, jty, hwi);
        this.f = qyu;
    }

    private void h() {
        this.d.c().c();
    }

    public final void a(Uri uri, Bundle bundle) {
        Logger.a("MediaSessionCallbackHandler.onPrepareFromUri uri=%s", uri);
        h();
        qyt a = this.f.a(this.c, this.d);
        Uri a2 = uri == null ? Uri.EMPTY : wer.a(uri);
        if (bundle == null) {
            bundle = new Bundle();
        }
        String str = "";
        a.a.a(a2, bundle.getString("android.intent.extra.user_query", str), bundle.getString("android.intent.extra.user_query_language", str));
    }

    public final void a(RatingCompat ratingCompat) {
        boolean z = true;
        Logger.b("Received rating: %s", Boolean.valueOf(ratingCompat.a()));
        qyt a = this.f.a(this.c, this.d);
        PlayerState b = a.c.d().b();
        if (b != null && ratingCompat.a()) {
            PlayerTrack track = b.track();
            if (track != null) {
                String uri = track.uri();
                String contextUri = b.contextUri();
                Logger.b("Rating is for track Uri: %s  context Uri: %s", uri, contextUri);
                if (!fbo.a(contextUri) && !fbo.a(uri)) {
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

    public final void b(int i) {
        boolean z = true;
        Logger.a("MediaSessionCallbackHandler.onSetShuffleMode %d", Integer.valueOf(i));
        qyt a = this.f.a(this.c, this.d);
        if (i == 1) {
            a.a.a.a();
            a.e = true;
            return;
        }
        qyg qyg = a.a.a;
        PlayerState lastPlayerState = qyg.a.getLastPlayerState();
        if (lastPlayerState == null || lastPlayerState.restrictions().disallowTogglingShuffleReasons().isEmpty()) {
            z = false;
        }
        if (!z) {
            qyg.a.setShufflingContext(false);
        }
        a.e = false;
    }

    public final void b(Uri uri, Bundle bundle) {
        Logger.a("MediaSessionCallbackHandler.onPlayFromUri uri=%s", uri);
        h();
        qyt a = this.f.a(this.c, this.d);
        Uri a2 = uri == null ? Uri.EMPTY : wer.a(uri);
        if (bundle == null) {
            bundle = new Bundle();
        }
        String str = "";
        a.a.b(a2, bundle.getString("android.intent.extra.user_query", str), bundle.getString("android.intent.extra.user_query_language", str));
    }
}
