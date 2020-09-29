package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ihm$4zX07w1ywuOdguhpE8qIHboEoA4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ihm$4zX07w1ywuOdguhpE8qIHboEoA4 implements Function {
    private final /* synthetic */ Ad f$0;

    public /* synthetic */ $$Lambda$ihm$4zX07w1ywuOdguhpE8qIHboEoA4(Ad ad) {
        this.f$0 = ad;
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((long) this.f$0.getSkippableAdDelay()) - (((Long) obj).longValue() / 1000));
    }
}
