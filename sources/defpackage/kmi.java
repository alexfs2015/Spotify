package defpackage;

import android.app.Activity;
import com.spotify.music.activesessionbanner.ActiveSessionBannerLogger;

/* renamed from: kmi reason: default package */
public final class kmi implements vua<kmo> {
    private final wlc<kml> a;
    private final wlc<kmq> b;
    private final wlc<kna> c;
    private final wlc<ActiveSessionBannerLogger> d;
    private final wlc<knc> e;
    private final wlc<Activity> f;

    public static kmo a(Object obj, Object obj2, Object obj3, Object obj4, knc knc, Activity activity) {
        return (kmo) vuf.a(CC.a((kml) obj, (kmq) obj2, (kna) obj3, (ActiveSessionBannerLogger) obj4, knc, activity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), (knc) this.e.get(), (Activity) this.f.get());
    }
}
