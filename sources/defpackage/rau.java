package defpackage;

import com.spotify.music.feedback.FeedbackResponse;

/* renamed from: rau reason: default package */
public final class rau implements vua<gky<FeedbackResponse>> {
    private final wlc<gkz> a;

    private rau(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static rau a(wlc<gkz> wlc) {
        return new rau(wlc);
    }

    public static gky<FeedbackResponse> a(gkz gkz) {
        return (gky) vuf.a(gkz.a(FeedbackResponse.class), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((gkz) this.a.get());
    }
}
