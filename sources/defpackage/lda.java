package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;

/* renamed from: lda reason: default package */
public final class lda implements vua<Flowable<OrientationMode>> {
    private static final lda a = new lda();

    public static lda a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(Flowable.b(OrientationMode.UNSPECIFIED), "Cannot return null from a non-@Nullable @Provides method");
    }
}
