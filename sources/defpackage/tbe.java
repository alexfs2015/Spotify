package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.music.features.placebobanner.models.PlaceboBannerView;
import com.spotify.music.inappmessaging.MessageRequest;

/* renamed from: tbe reason: default package */
public final class tbe {
    private final rka a;

    public tbe(rka rka) {
        this.a = rka;
    }

    public final void a(ImmutableSet<String> immutableSet) {
        if (immutableSet.contains(DisallowReasons.MFT)) {
            this.a.a(MessageRequest.a("upsell", "skip-limit-reached", PlaceboBannerView.V1));
        }
    }
}
