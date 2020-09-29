package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;

/* renamed from: rir reason: default package */
public final class rir {
    private final wzi<rbg> a;

    public rir(wzi<rbg> wzi) {
        this.a = (wzi) a((T) wzi, 1);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final riq a(rca<Type, MusicItem> rca, RecyclerView recyclerView) {
        return new riq((rca) a((T) rca, 1), (RecyclerView) a((T) recyclerView, 2), (rbg) a((T) this.a.get(), 3));
    }
}
