package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.marquee.MarqueeService;

/* renamed from: hzu reason: default package */
public final class hzu implements c {
    private final hzt a;
    private final hzw b;
    private boolean c;

    public final String c() {
        return "Marquee";
    }

    public hzu(hzt hzt, hzw hzw) {
        this.a = hzt;
        this.b = hzw;
    }

    public final void ai_() {
        Logger.b("[Marquee] - onSessionStarted", new Object[0]);
        hzt hzt = this.a;
        hzt.c.a(MarqueeService.a(hzt.b), hzt.d, MarqueeService.class.getSimpleName());
        this.b.a();
        this.c = true;
    }

    public final void aj_() {
        Logger.b("[Marquee] - onSessionEnded", new Object[0]);
        if (this.c) {
            hzt hzt = this.a;
            if (hzt.a != null) {
                hzt.a.a();
                hzt.a = null;
            }
            hzt.c.a(hzt.d, MarqueeService.class.getSimpleName());
            this.b.a.bf_();
            this.c = false;
        }
    }
}
