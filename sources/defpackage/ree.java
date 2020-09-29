package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader.AlbumRecsResponse;

/* renamed from: ree reason: default package */
public final class ree implements wig<gmm<AlbumRecsResponse>> {
    private final wzi<gmn> a;

    private ree(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static ree a(wzi<gmn> wzi) {
        return new ree(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(AlbumRecsResponse.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
