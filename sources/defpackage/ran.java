package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.feedback.FeedbackResponse;

/* renamed from: ran reason: default package */
public final class ran implements vua<ram> {
    private final wlc<RxResolver> a;
    private final wlc<gky<FeedbackResponse>> b;

    private ran(wlc<RxResolver> wlc, wlc<gky<FeedbackResponse>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ran a(wlc<RxResolver> wlc, wlc<gky<FeedbackResponse>> wlc2) {
        return new ran(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ram((RxResolver) this.a.get(), (gky) this.b.get());
    }
}
