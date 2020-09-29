package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: uaf reason: default package */
public final class uaf implements wig<MediaType> {
    private static final uaf a = new uaf();

    public static uaf a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (MediaType) wil.a(MediaType.AUDIO, "Cannot return null from a non-@Nullable @Provides method");
    }
}
