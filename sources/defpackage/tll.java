package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.music.features.placebobanner.models.PlaceboBannerView;
import com.spotify.music.inappmessaging.MessageRequest;

/* renamed from: tll reason: default package */
public final class tll {
    private final rtg a;

    public tll(rtg rtg) {
        this.a = rtg;
    }

    public final void a(ImmutableSet<String> immutableSet) {
        if (immutableSet.contains(DisallowReasons.MFT)) {
            this.a.a(MessageRequest.a("upsell", "skip-limit-reached", PlaceboBannerView.V1));
        }
    }
}
