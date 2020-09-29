package defpackage;

import com.spotify.music.libs.album.model.Album;

/* renamed from: gsp reason: default package */
public final class gsp {
    public final wlc<gky<Album>> a;

    public gsp(wlc<gky<Album>> wlc) {
        this.a = (wlc) a(wlc, 1);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
