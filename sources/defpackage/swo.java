package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;

/* renamed from: swo reason: default package */
public final class swo implements vua<Flowable<OrientationMode>> {
    private static final swo a = new swo();

    public static swo a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(Flowable.b(OrientationMode.UNSPECIFIED), "Cannot return null from a non-@Nullable @Provides method");
    }
}
