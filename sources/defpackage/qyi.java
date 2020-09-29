package defpackage;

import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Request;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Response;
import io.reactivex.Single;

/* renamed from: qyi reason: default package */
public final class qyi implements wes<Request, Response> {
    private final a a;

    /* renamed from: qyi$a */
    interface a {
        @xhw(a = "speakeasy/v1/context")
        Single<Response> a(@xhi Request request);
    }

    public qyi(gix gix) {
        this.a = (a) gix.a(a.class);
    }

    public final /* bridge */ /* synthetic */ Single a(Object obj) {
        return this.a.a((Request) obj);
    }
}
