package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;

/* renamed from: trx reason: default package */
public final class trx implements wig<Flowable<OrientationMode>> {
    private final wzi<Flowable<Boolean>> a;

    private trx(wzi<Flowable<Boolean>> wzi) {
        this.a = wzi;
    }

    public static trx a(wzi<Flowable<Boolean>> wzi) {
        return new trx(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
