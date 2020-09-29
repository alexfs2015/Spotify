package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;

/* renamed from: tmx reason: default package */
public final class tmx implements wig<Flowable<OrientationMode>> {
    private final wzi<Boolean> a;

    private tmx(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    public static tmx a(wzi<Boolean> wzi) {
        return new tmx(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(Flowable.b(((Boolean) this.a.get()).booleanValue() ? OrientationMode.UNSPECIFIED : OrientationMode.PORTRAIT_ONLY), "Cannot return null from a non-@Nullable @Provides method");
    }
}
