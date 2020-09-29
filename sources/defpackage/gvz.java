package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import rx.internal.operators.EmptyObservableHolder;

/* renamed from: gvz reason: default package */
public final class gvz {
    private final gut a;
    private final wzi<hga> b;

    public gvz(gut gut, wzi<hga> wzi) {
        this.a = gut;
        this.b = wzi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(RecentlyPlayedItems recentlyPlayedItems) {
        String str;
        int i = 0;
        while (true) {
            if (i >= recentlyPlayedItems.length - 1) {
                str = null;
                break;
            }
            if (!"video".equals(((RecentlyPlayedItem) recentlyPlayedItems.items.get(i)).mediaType)) {
                str = ((RecentlyPlayedItem) recentlyPlayedItems.items.get(i)).getUri();
                break;
            }
            i++;
        }
        if (str != null) {
            Optional a2 = this.a.a(str);
            if (a2.b()) {
                return ((gus) a2.c()).resolve();
            }
        }
        return EmptyObservableHolder.a();
    }

    public final xii<PlayerContext> a() {
        return wit.a((ObservableSource<T>) ((hga) this.b.get()).a(), BackpressureStrategy.BUFFER).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$gvz$TTKzEux3nxR9FoN4h6uOGbHgRDw<Object,Object>(this));
    }
}
