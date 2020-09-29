package defpackage;

import com.spotify.music.genie.omakasse.OmakaseRequest;
import com.spotify.music.genie.omakasse.OmakaseResponse;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: rqh reason: default package */
public final class rqh {
    private final rqi a;

    public rqh(gix gix) {
        this.a = (rqi) gix.a(rqi.class);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleSource a(OmakaseResponse omakaseResponse) {
        List uriList = omakaseResponse.getUriList();
        return (uriList == null || uriList.isEmpty()) ? Single.a(new Throwable("Omakase url list empty or unavailable")) : Single.b(uriList.get(0));
    }

    public final Single<String> a() {
        return this.a.a(OmakaseRequest.create(true, 1)).a((Function<? super T, ? extends SingleSource<? extends R>>) $$Lambda$rqh$WNOMTbnpwQKuQlNvq_5IbMUSQVQ.INSTANCE);
    }
}
