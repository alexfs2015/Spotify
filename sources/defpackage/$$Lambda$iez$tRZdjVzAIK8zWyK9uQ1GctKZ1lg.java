package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$iez$tRZdjVzAIK8zWyK9uQ1GctKZ1lg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iez$tRZdjVzAIK8zWyK9uQ1GctKZ1lg implements Function {
    private final /* synthetic */ Ad f$0;

    public /* synthetic */ $$Lambda$iez$tRZdjVzAIK8zWyK9uQ1GctKZ1lg(Ad ad) {
        this.f$0 = ad;
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((long) this.f$0.getSkippableAdDelay()) - (((Long) obj).longValue() / 1000));
    }
}
