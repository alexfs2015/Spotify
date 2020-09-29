package defpackage;

import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.List;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: pvp reason: default package */
public final class pvp {
    private final guo a;
    private final iqn b;

    public pvp(guo guo, iqn iqn) {
        this.a = guo;
        this.b = iqn;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(String str, irf irf) {
        vlf[] vlfArr = (vlf[]) irf.getItems();
        ArrayList a2 = Lists.a(vlfArr.length);
        for (vlf vlf : vlfArr) {
            List artists = vlf.getArtists();
            if (artists != null && !artists.isEmpty()) {
                a2.add(PlayerTrack.create(vlf.getUri(), str, ((vku) artists.get(0)).getUri()));
            }
        }
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(String str, jva jva) {
        if (jva.b == LinkType.ALBUM) {
            return xim.a(new gun((gmm) guo.a(this.a.a.get(), 1), (String) guo.a(jva.f(), 2)).a());
        } else if (jva.b == LinkType.COLLECTION_ALBUM) {
            return wit.a((ObservableSource<T>) this.b.a(str).a(), BackpressureStrategy.BUFFER).a(1).e((xiy<? super T, ? extends R>) new $$Lambda$pvp$8eyHBhK3sR0DlRrwlHXsVQ8wP9g<Object,Object>(str));
        } else {
            StringBuilder sb = new StringBuilder("Unsupported album uri:");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final xim<List<PlayerTrack>> a(String str) {
        return ScalarSynchronousObservable.d(jva.a(str)).h(new $$Lambda$pvp$SxEvUEbDng2NTP6t0YgELUBqo(this, str)).a();
    }
}
