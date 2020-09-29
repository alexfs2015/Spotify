package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: tsz reason: default package */
public final class tsz implements tsw {
    private final spi a;
    private final ttf b;
    private final tvw c;

    public tsz(spi spi, ttf ttf, tvw tvw) {
        this.a = spi;
        this.b = ttf;
        this.c = tvw;
    }

    public final void a(uys uys, uys[] uysArr, String str, int i) {
        if (uys.w() == MediaType.AUDIO) {
            this.a.a(uys.getUri());
            this.c.a(uys.getUri(), str, i);
            return;
        }
        this.b.a(uys, uysArr, str, i);
    }
}
