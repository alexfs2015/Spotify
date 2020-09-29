package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;

/* renamed from: gtb reason: default package */
public final class gtb implements gst {
    private static final SortOption d = new SortOption("addTime", (int) R.string.sort_order_recently_added);
    private final RxResolver a;
    private final String b;
    private final boolean c;

    public gtb(jst jst, RxResolver rxResolver, boolean z) {
        this.b = jst.h();
        this.a = (RxResolver) fay.a(rxResolver);
        this.c = z;
    }

    public final wud<PlayerContext> resolve() {
        ioo ioo = new ioo(this.a, "@");
        ioo.a(false, this.c, false);
        ioo.c = d;
        return vun.a((ObservableSource<T>) ioo.a(), BackpressureStrategy.BUFFER).f(new $$Lambda$gtb$lllBcvPROXqScCXUJMAjz5d05A(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(iov iov) {
        uzc[] uzcArr = (uzc[]) iov.getItems();
        ArrayList arrayList = new ArrayList(uzcArr.length);
        for (uzc uzc : uzcArr) {
            if (gtc.c(uzc)) {
                arrayList.add(PlayerTrack.create(((uzc) fay.a(uzc)).getUri(), gtc.b(uzc), gtc.a(uzc), null, null));
            }
        }
        return PlayerContext.create(this.b, (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]));
    }
}
