package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;

/* renamed from: hvy reason: default package */
public final class hvy implements hxc {
    private final AdRules a;

    public hvy(AdRules adRules) {
        this.a = adRules;
    }

    public final void a() {
        Logger.b("Enabled ad slot preroll", new Object[0]);
    }

    public final void b() {
        this.a.a(StateType.WATCH_NOW_SLOT, true);
    }

    public final void c() {
        Logger.b("[Marquee] - Enabled ad slot marquee", new Object[0]);
    }

    public final void d() {
        this.a.a(StateType.WATCH_NOW_SLOT, true);
    }

    public final void e() {
        Logger.b("Enabled ad slot mobile screensaver", new Object[0]);
    }
}
