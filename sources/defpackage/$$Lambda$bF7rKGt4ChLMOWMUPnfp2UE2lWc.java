package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$bF7rKGt4ChLMOWMUPnfp2UE2lWc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$bF7rKGt4ChLMOWMUPnfp2UE2lWc implements Predicate {
    public static final /* synthetic */ $$Lambda$bF7rKGt4ChLMOWMUPnfp2UE2lWc INSTANCE = new $$Lambda$bF7rKGt4ChLMOWMUPnfp2UE2lWc();

    private /* synthetic */ $$Lambda$bF7rKGt4ChLMOWMUPnfp2UE2lWc() {
    }

    public final boolean test(Object obj) {
        return ((Ad) obj).isVoiceAd();
    }
}
