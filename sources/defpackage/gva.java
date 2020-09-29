package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;

/* renamed from: gva reason: default package */
public final class gva implements gus {
    private static final SortOption d = new SortOption("addTime", (int) R.string.sort_order_recently_added);
    private final RxResolver a;
    private final String b;
    private final boolean c;

    public gva(jva jva, RxResolver rxResolver, boolean z) {
        this.b = jva.h();
        this.a = (RxResolver) fbp.a(rxResolver);
        this.c = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(iri iri) {
        vlf[] vlfArr = (vlf[]) iri.getItems();
        ArrayList arrayList = new ArrayList(vlfArr.length);
        for (vlf vlf : vlfArr) {
            if (gvb.c(vlf)) {
                arrayList.add(PlayerTrack.create(((vlf) fbp.a(vlf)).getUri(), gvb.b(vlf), gvb.a(vlf), null, null));
            }
        }
        return PlayerContext.create(this.b, (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]));
    }

    public final xii<PlayerContext> resolve() {
        irb irb = new irb(this.a, "@");
        irb.a(false, this.c, false);
        irb.c = d;
        return wit.a((ObservableSource<T>) irb.a(), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) new $$Lambda$gva$tCz40QAqYWzSrRHTow2MvyPo7w<Object,Object>(this));
    }
}
