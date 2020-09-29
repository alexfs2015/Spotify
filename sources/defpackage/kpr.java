package defpackage;

import android.app.Activity;
import com.spotify.music.activesessionbanner.ActiveSessionBannerLogger;

/* renamed from: kpr reason: default package */
public final class kpr implements wig<kpx> {
    private final wzi<kpu> a;
    private final wzi<kpz> b;
    private final wzi<kqj> c;
    private final wzi<ActiveSessionBannerLogger> d;
    private final wzi<kql> e;
    private final wzi<Activity> f;

    public static kpx a(Object obj, Object obj2, Object obj3, Object obj4, kql kql, Activity activity) {
        return (kpx) wil.a(CC.a((kpu) obj, (kpz) obj2, (kqj) obj3, (ActiveSessionBannerLogger) obj4, kql, activity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), (kql) this.e.get(), (Activity) this.f.get());
    }
}
