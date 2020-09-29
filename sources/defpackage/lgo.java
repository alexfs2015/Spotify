package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;

/* renamed from: lgo reason: default package */
public final class lgo implements wig<Flowable<OrientationMode>> {
    private static final lgo a = new lgo();

    public static lgo a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(Flowable.b(OrientationMode.UNSPECIFIED), "Cannot return null from a non-@Nullable @Provides method");
    }
}
