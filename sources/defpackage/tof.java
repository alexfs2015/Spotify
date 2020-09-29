package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: tof reason: default package */
public final class tof implements vua<MediaType> {
    private static final tof a = new tof();

    public static tof a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (MediaType) vuf.a(MediaType.AUDIO, "Cannot return null from a non-@Nullable @Provides method");
    }
}
