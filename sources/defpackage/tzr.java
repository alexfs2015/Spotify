package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: tzr reason: default package */
public final class tzr implements wig<MediaType> {
    private static final tzr a = new tzr();

    public static tzr a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (MediaType) wil.a(MediaType.AUDIO, "Cannot return null from a non-@Nullable @Provides method");
    }
}
