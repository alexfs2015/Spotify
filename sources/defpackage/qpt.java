package defpackage;

import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Request;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Response;
import io.reactivex.Single;

/* renamed from: qpt reason: default package */
public final class qpt implements vrj<Request, Response> {
    private final a a;

    /* renamed from: qpt$a */
    interface a {
        @wtr(a = "speakeasy/v1/context")
        Single<Response> a(@wtd Request request);
    }

    public final /* bridge */ /* synthetic */ Single a(Object obj) {
        return this.a.a((Request) obj);
    }

    public qpt(ghm ghm) {
        this.a = (a) ghm.a(a.class);
    }
}
