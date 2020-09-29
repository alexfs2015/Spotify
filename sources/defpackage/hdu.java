package defpackage;

import io.reactivex.Observable;
import java.util.Map;

/* renamed from: hdu reason: default package */
public final class hdu implements vua<hed> {
    private final wlc<Observable<Map<String, String>>> a;

    private hdu(wlc<Observable<Map<String, String>>> wlc) {
        this.a = wlc;
    }

    public static hdu a(wlc<Observable<Map<String, String>>> wlc) {
        return new hdu(wlc);
    }

    public final /* synthetic */ Object get() {
        return (hed) vuf.a(new hed((Observable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
