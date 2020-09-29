package defpackage;

import com.spotify.music.feedback.FeedbackResponse;

/* renamed from: rjq reason: default package */
public final class rjq implements wig<gmm<FeedbackResponse>> {
    private final wzi<gmn> a;

    private rjq(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static gmm<FeedbackResponse> a(gmn gmn) {
        return (gmm) wil.a(gmn.a(FeedbackResponse.class), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static rjq a(wzi<gmn> wzi) {
        return new rjq(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((gmn) this.a.get());
    }
}
