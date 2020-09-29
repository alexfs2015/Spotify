package defpackage;

import com.spotify.music.genie.omakasse.OmakaseRequest;
import com.spotify.music.genie.omakasse.OmakaseResponse;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: rhf reason: default package */
public final class rhf {
    private final rhg a;

    public rhf(ghm ghm) {
        this.a = (rhg) ghm.a(rhg.class);
    }

    public final Single<String> a() {
        return this.a.a(OmakaseRequest.create(true, 1)).a((Function<? super T, ? extends SingleSource<? extends R>>) $$Lambda$rhf$vM5UP_TTpyjuB__pHcbBSZmSwE8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleSource a(OmakaseResponse omakaseResponse) {
        List uriList = omakaseResponse.getUriList();
        if (uriList == null || uriList.isEmpty()) {
            return Single.a(new Throwable("Omakase url list empty or unavailable"));
        }
        return Single.b(uriList.get(0));
    }
}
