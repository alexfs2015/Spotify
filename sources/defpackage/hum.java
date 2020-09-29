package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Observable;

/* renamed from: hum reason: default package */
public final class hum implements wig<hul> {
    private final wzi<Observable<String>> a;
    private final wzi<RxResolver> b;
    private final wzi<hrc> c;

    private hum(wzi<Observable<String>> wzi, wzi<RxResolver> wzi2, wzi<hrc> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hum a(wzi<Observable<String>> wzi, wzi<RxResolver> wzi2, wzi<hrc> wzi3) {
        return new hum(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hul((Observable) this.a.get(), (RxResolver) this.b.get(), (hrc) this.c.get());
    }
}
