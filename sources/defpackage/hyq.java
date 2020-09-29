package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.Observable;

/* renamed from: hyq reason: default package */
public final class hyq implements wig<Observable<RolloutFlag>> {
    private final wzi<hgy> a;

    private hyq(wzi<hgy> wzi) {
        this.a = wzi;
    }

    public static hyq a(wzi<hgy> wzi) {
        return new hyq(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((hgy) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
