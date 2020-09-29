package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import rx.internal.operators.EmptyObservableHolder;

/* renamed from: gtz reason: default package */
public final class gtz {
    private final gsu a;
    private final wlc<hde> b;

    public gtz(gsu gsu, wlc<hde> wlc) {
        this.a = gsu;
        this.b = wlc;
    }

    public final wud<PlayerContext> a() {
        return vun.a((ObservableSource<T>) ((hde) this.b.get()).a(), BackpressureStrategy.BUFFER).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$gtz$7lCEjHsdIaymBL1MG0KMmHbzzXs<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(RecentlyPlayedItems recentlyPlayedItems) {
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
                return ((gst) a2.c()).resolve();
            }
        }
        return EmptyObservableHolder.a();
    }
}
