package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;

/* renamed from: tgv reason: default package */
public final class tgv implements wig<Flowable<OrientationMode>> {
    private static final tgv a = new tgv();

    public static tgv a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(Flowable.b(OrientationMode.UNSPECIFIED), "Cannot return null from a non-@Nullable @Provides method");
    }
}
