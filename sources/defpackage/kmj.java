package defpackage;

import android.app.Activity;
import com.spotify.music.activesessionbanner.ActiveSessionBannerLogger;

/* renamed from: kmj reason: default package */
public final class kmj implements vua<kmo> {
    private final wlc<kml> a;
    private final wlc<kmq> b;
    private final wlc<knh> c;
    private final wlc<ActiveSessionBannerLogger> d;
    private final wlc<knj> e;
    private final wlc<Activity> f;

    public static kmo a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Activity activity) {
        return (kmo) vuf.a(CC.a((kml) obj, (kmq) obj2, (knh) obj3, (ActiveSessionBannerLogger) obj4, (knj) obj5, activity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), (Activity) this.f.get());
    }
}
