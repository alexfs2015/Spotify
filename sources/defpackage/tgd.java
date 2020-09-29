package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;

/* renamed from: tgd reason: default package */
public final class tgd implements wig<Flowable<OrientationMode>> {
    private static final tgd a = new tgd();

    public static tgd a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(Flowable.b(OrientationMode.UNSPECIFIED), "Cannot return null from a non-@Nullable @Provides method");
    }
}
