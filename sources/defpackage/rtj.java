package defpackage;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;

/* renamed from: rtj reason: default package */
public class rtj extends a {
    protected final hop c;
    protected final hne d;
    public long e;
    private final hos f;
    private final gbd g;
    private final htw h;
    private final rty i;

    /* access modifiers changed from: private */
    public static /* synthetic */ void h() {
    }

    public rtj(hop hop, hne hne, gbd gbd, htw htw) {
        this.c = hop;
        this.d = hne;
        this.g = gbd;
        this.h = htw;
        this.f = new hos(hop.d(), hne);
        this.i = new rty(hop.d(), hne);
        g();
    }

    public void a(String str, Bundle bundle) {
        boolean z = false;
        Logger.a("MediaSessionCallback.onPlayFromMediaId", new Object[0]);
        String string = bundle.getString("com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ContentUri");
        String c2 = rtg.c(str);
        String str2 = "android.media.session.extra.LEGACY_STREAM_TYPE";
        int i2 = bundle.getInt(str2, 3);
        Builder builder = new Builder();
        if (string != null) {
            PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, c2, 0);
            builder.skipTo(playOptionsSkipTo);
        } else {
            string = c2;
        }
        ho a = ho.a(string, builder.audioStream(i2 == 4 ? AudioStream.ALARM : AudioStream.DEFAULT).build());
        if (bundle != null) {
            int i3 = bundle.getInt(str2, 3);
            if (bundle.getInt("com.spotify.music.extra.PLAYBACK_TYPE") == 1 || i3 == 4) {
                z = true;
            }
        }
        if (z) {
            this.d.c().c();
        }
        this.h.a((String) fay.a(a.a), this.d, this.c.d(), null, (PlayOptions) a.b);
    }

    public void b() {
        Logger.a("MediaSessionCallback.onPlay", new Object[0]);
        this.d.d().a(this.c.d(), (ActionCallback) null);
    }

    public final void b(String str, Bundle bundle) {
        Logger.a("MediaSessionCallback.onPlayFromSearch", new Object[0]);
        this.i.a(str, bundle).a($$Lambda$rtj$ZYCRQ7EzrnZM57VKM1vBT4vPXg.INSTANCE, $$Lambda$rtj$tus5Sc3gkhZukbHj6RmKsL6bBo.INSTANCE);
    }

    public final void c(String str, Bundle bundle) {
        Logger.a("MediaSessionCallback.onCustomAction", new Object[0]);
        this.f.a(str);
    }

    public void c() {
        Logger.a("MediaSessionCallback.onPause", new Object[0]);
        this.d.d().a(this.c.d());
    }

    public void f() {
        Logger.a("MediaSessionCallback.onStop", new Object[0]);
        this.d.d().a(this.c.d());
    }

    public void d() {
        Logger.a("MediaSessionCallback.onSkipToNext", new Object[0]);
        this.d.d().b(this.c.d(), null);
    }

    public void e() {
        Logger.a("MediaSessionCallback.onSkipToPrevious", new Object[0]);
        this.d.d().c(this.c.d(), null);
    }

    public final void a(long j) {
        Logger.a("MediaSessionCallback.onSkipToQueueItem", new Object[0]);
        new htz(this.d.h(), this.d.d(), this.c.d()).a((int) j, null);
    }

    public final void b(long j) {
        Logger.a("MediaSessionCallback.onSeek", new Object[0]);
        this.d.d().a(j, (ActionCallback) null);
    }

    public final void a(int i2) {
        if (i2 == -1) {
            Logger.e("Setting Repeat mode invalid: (%d)", Integer.valueOf(i2));
        } else if (i2 == 0) {
            this.d.d().d(this.c.d());
        } else if (i2 == 1) {
            this.d.d().e(this.c.d());
        } else if (i2 == 2) {
            this.d.d().f(this.c.d());
        } else if (i2 != 3) {
            Logger.e("Setting Repeat mode unknown: (%d)", Integer.valueOf(i2));
        } else {
            Logger.e("Setting Repeat mode unsupported: (%d)", Integer.valueOf(i2));
        }
    }

    public final void g() {
        this.e = gbd.a().a();
    }
}
