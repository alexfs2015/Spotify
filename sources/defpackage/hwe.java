package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.Observable;

/* renamed from: hwe reason: default package */
public final class hwe implements vua<Observable<RolloutFlag>> {
    private final wlc<hec> a;

    private hwe(wlc<hec> wlc) {
        this.a = wlc;
    }

    public static hwe a(wlc<hec> wlc) {
        return new hwe(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((hec) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
