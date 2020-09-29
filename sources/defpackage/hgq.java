package defpackage;

import io.reactivex.Observable;
import java.util.Map;

/* renamed from: hgq reason: default package */
public final class hgq implements wig<hgz> {
    private final wzi<Observable<Map<String, String>>> a;

    private hgq(wzi<Observable<Map<String, String>>> wzi) {
        this.a = wzi;
    }

    public static hgq a(wzi<Observable<Map<String, String>>> wzi) {
        return new hgq(wzi);
    }

    public final /* synthetic */ Object get() {
        return (hgz) wil.a(new hgz((Observable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
