package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.user.model.DecoratedUser;
import java.util.Map;

/* renamed from: qox reason: default package */
public final class qox {
    private a a;

    /* renamed from: qox$a */
    interface a {
        qoy createUserDecorator(Policy policy);
    }

    public static qox a(RxResolver rxResolver, wug wug, wug wug2) {
        return new qox(new $$Lambda$qox$ED0GCOdckfYf8wPaaLx3HrzHaGM(rxResolver, wug, wug2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qoy a(RxResolver rxResolver, wug wug, wug wug2, Policy policy) {
        return new qoy(rxResolver, policy, wug, wug2);
    }

    private qox(a aVar) {
        this.a = aVar;
    }

    public final wud<DecoratedUser> a(String str, Policy policy) {
        return this.a.createUserDecorator(policy).a(str).f(new $$Lambda$qox$xljxE7LWtOyjG7y2JtkdB5ZBj8A(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ DecoratedUser a(String str, Map map) {
        return (DecoratedUser) map.get(str);
    }
}
