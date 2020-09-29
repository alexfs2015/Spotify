package defpackage;

import com.spotify.music.follow.resolver.RxFollowersCountResolver.Counts;
import io.reactivex.functions.BiFunction;
import java.util.List;
import java.util.Map;

/* renamed from: -$$Lambda$rcu$h9O7sn_y-hQYKhRUvW4sOvvIw3k reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$rcu$h9O7sn_yhQYKhRUvW4sOvvIw3k implements BiFunction {
    private final /* synthetic */ List f$0;

    public /* synthetic */ $$Lambda$rcu$h9O7sn_yhQYKhRUvW4sOvvIw3k(List list) {
        this.f$0 = list;
    }

    public final Object apply(Object obj, Object obj2) {
        return rcu.a(this.f$0, (Counts) obj, (Map) obj2);
    }
}
