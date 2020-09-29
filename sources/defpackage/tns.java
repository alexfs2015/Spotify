package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: tns reason: default package */
public final class tns implements vua<MediaType> {
    private static final tns a = new tns();

    public static tns a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (MediaType) vuf.a(MediaType.AUDIO, "Cannot return null from a non-@Nullable @Provides method");
    }
}
