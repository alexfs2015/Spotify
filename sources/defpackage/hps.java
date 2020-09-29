package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: hps reason: default package */
public final class hps extends hpr {
    private final hqy a;
    private final String b;
    private final Set<rzt> c = new HashSet();
    private xip d;

    public hps(hqy hqy, String str, rzt rzt) {
        this.a = (hqy) fbp.a(hqy);
        this.b = (String) fbp.a(str);
        this.c.add(fbp.a(rzt));
    }

    /* access modifiers changed from: protected */
    public final void a(String str, AudioStream audioStream) {
        for (rzt rzt : this.c) {
            hqy hqy = this.a;
            String str2 = this.b;
            hqy.a.a(hqy.a(str2, rzt, "end_stream", jwy.a(str), audioStream.name().toLowerCase(Locale.US)));
            Logger.a("LogHelper.logExternalAccessoryEndStream sessionId: %s playbackId: %s", str2, str);
        }
    }

    public final void a(xii<PlayerState> xii) {
        b();
        this.d = xii.a((xis<? super T>) new $$Lambda$1jkNUAbuqB6Ahd6AVBO5r4Kqc<Object>(this), (xis<Throwable>) $$Lambda$hps$hpmVT4T_nDAWWyjZph12tXSWTVs.INSTANCE);
    }

    public final void b() {
        xip xip = this.d;
        if (xip != null && !xip.isUnsubscribed()) {
            this.d.unsubscribe();
            this.d = null;
        }
    }
}
