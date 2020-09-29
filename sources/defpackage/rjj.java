package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.feedback.FeedbackResponse;

/* renamed from: rjj reason: default package */
public final class rjj implements wig<rji> {
    private final wzi<RxResolver> a;
    private final wzi<gmm<FeedbackResponse>> b;

    private rjj(wzi<RxResolver> wzi, wzi<gmm<FeedbackResponse>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rjj a(wzi<RxResolver> wzi, wzi<gmm<FeedbackResponse>> wzi2) {
        return new rjj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rji((RxResolver) this.a.get(), (gmm) this.b.get());
    }
}
