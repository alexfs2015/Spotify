package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;

/* renamed from: qzv reason: default package */
public final class qzv {
    private final wlc<qsr> a;

    public qzv(wlc<qsr> wlc) {
        this.a = (wlc) a((T) wlc, 1);
    }

    public final qzu a(qtl<Type, MusicItem> qtl, RecyclerView recyclerView) {
        return new qzu((qtl) a((T) qtl, 1), (RecyclerView) a((T) recyclerView, 2), (qsr) a((T) this.a.get(), 3));
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
