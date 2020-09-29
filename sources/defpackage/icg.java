package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.marquee.MarqueeService;

/* renamed from: icg reason: default package */
public final class icg implements c {
    private final icf a;
    private final ici b;
    private boolean c;

    public icg(icf icf, ici ici) {
        this.a = icf;
        this.b = ici;
    }

    public final void ai_() {
        Logger.b("[Marquee] - onSessionStarted", new Object[0]);
        icf icf = this.a;
        icf.c.a(MarqueeService.a(icf.b), icf.d, MarqueeService.class.getSimpleName());
        this.b.a();
        this.c = true;
    }

    public final void aj_() {
        Logger.b("[Marquee] - onSessionEnded", new Object[0]);
        if (this.c) {
            icf icf = this.a;
            if (icf.a != null) {
                icf.a.a();
                icf.a = null;
            }
            icf.c.a(icf.d, MarqueeService.class.getSimpleName());
            this.b.a.bd_();
            this.c = false;
        }
    }

    public final String c() {
        return "Marquee";
    }
}
