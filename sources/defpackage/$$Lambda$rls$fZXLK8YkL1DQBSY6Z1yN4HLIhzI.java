package defpackage;

import com.spotify.music.follow.resolver.RxFollowersCountResolver.Counts;
import io.reactivex.functions.BiFunction;
import java.util.List;
import java.util.Map;

/* renamed from: -$$Lambda$rls$fZXLK8YkL1DQBSY6Z1yN4HLIhzI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rls$fZXLK8YkL1DQBSY6Z1yN4HLIhzI implements BiFunction {
    private final /* synthetic */ List f$0;

    public /* synthetic */ $$Lambda$rls$fZXLK8YkL1DQBSY6Z1yN4HLIhzI(List list) {
        this.f$0 = list;
    }

    public final Object apply(Object obj, Object obj2) {
        return rls.a(this.f$0, (Counts) obj, (Map) obj2);
    }
}
