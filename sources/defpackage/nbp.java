package defpackage;

import com.spotify.music.follow.FollowManager.a;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.Map;

/* renamed from: nbp reason: default package */
public final class nbp implements c<hcs, ho<hcs, roq>> {
    private static final xiz<hcs, a, ho<hcs, roq>> d = $$Lambda$nbp$3EHlj00C_1AGw3TuosH7vPwxVI.INSTANCE;
    private final String a;
    private final ipf b;
    private final nbu c;

    public nbp(String str, ipf ipf, nbu nbu) {
        this.a = (String) fbp.a(str);
        this.b = (ipf) fbp.a(ipf);
        this.c = (nbu) fbp.a(nbu);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ vku a(Map map) {
        vku vku = (vku) map.get(this.a);
        if (vku != null) {
            return vku;
        }
        throw new RuntimeException("No decoration found for artist");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(nbu nbu, vku vku) {
        String uri = vku.getUri();
        a aVar = new a(vku.getUri(), 0, 0, vku.isFollowed(), vku.isDismissed());
        return wit.a((ObservableSource<T>) nbu.a(uri, aVar), BackpressureStrategy.BUFFER);
    }

    public final /* synthetic */ Object call(Object obj) {
        return xii.a((xii) obj, xim.a(this.b.a(null, this.a).c(new $$Lambda$nbp$2OPVyGGW5Po7uMzlqt71YB95An0(this))).h(new $$Lambda$nbp$O7nVZ4I8s__dlsJp6qfZXXpvTQ(this.c)), d);
    }
}
