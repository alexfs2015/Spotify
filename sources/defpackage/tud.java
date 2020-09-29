package defpackage;

import com.spotify.pageloader.NetworkErrorReason;
import io.reactivex.Observable;
import io.reactivex.Single;

/* renamed from: tud reason: default package */
public final class tud implements wig<tub> {
    private final wzi<Single<NetworkErrorReason>> a;
    private final wzi<Observable<gcl>> b;
    private final wzi<sgb> c;

    public static tub a(Single<NetworkErrorReason> single, Observable<gcl> observable, sgb sgb) {
        return (tub) wil.a(CC.a(single, observable, sgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Single) this.a.get(), (Observable) this.b.get(), (sgb) this.c.get());
    }
}
