package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;

/* renamed from: svw reason: default package */
public final class svw implements vua<Flowable<OrientationMode>> {
    private static final svw a = new svw();

    public static svw a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(Flowable.b(OrientationMode.UNSPECIFIED), "Cannot return null from a non-@Nullable @Provides method");
    }
}
