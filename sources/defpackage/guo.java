package defpackage;

import com.spotify.music.libs.album.model.Album;

/* renamed from: guo reason: default package */
public final class guo {
    public final wzi<gmm<Album>> a;

    public guo(wzi<gmm<Album>> wzi) {
        this.a = (wzi) a(wzi, 1);
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
