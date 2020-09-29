package defpackage;

import android.net.Uri.Builder;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.feedback.FeedbackResponse;
import io.reactivex.Completable;

/* renamed from: ram reason: default package */
public final class ram {
    private final RxResolver a;
    private final gky<FeedbackResponse> b;

    public ram(RxResolver rxResolver, gky<FeedbackResponse> gky) {
        this.a = rxResolver;
        this.b = gky;
    }

    public final Completable a(String str, String str2, String str3, String str4, String str5) {
        return this.a.resolve(RequestBuilder.post(a("like", str, str2, str3, str5, "local").appendQueryParameter("view_uri", str4).build().toString()).build()).g();
    }

    public final Completable b(String str, String str2, String str3, String str4, String str5) {
        return this.a.resolve(RequestBuilder.post(a("dislike", str, str2, str3, str4, str5).build().toString()).build()).g();
    }

    public final Completable a(String str, String str2, String str3, String str4) {
        return this.a.resolve(RequestBuilder.delete(a().appendQueryParameter("uri", str).appendQueryParameter("context_uri", str2).appendQueryParameter("feature", str4).appendQueryParameter("reason", "local").appendQueryParameter("subcontext_uri", str3).build().toString()).build()).g();
    }

    private static Builder a() {
        return new Builder().scheme("sp").authority("feedback").appendEncodedPath("v1/feedback");
    }

    private static Builder a(String str, String str2, String str3, String str4, String str5, String str6) {
        return a().appendEncodedPath(str).appendQueryParameter("uri", str2).appendQueryParameter("context_uri", str3).appendQueryParameter("subcontext_uri", str4).appendQueryParameter("feature", str5).appendQueryParameter("reason", str6);
    }
}
