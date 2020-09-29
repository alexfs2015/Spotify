package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.user.model.DecoratedUser;
import java.util.Map;

/* renamed from: qxg reason: default package */
public final class qxg {
    private a a;

    /* renamed from: qxg$a */
    interface a {
        qxh createUserDecorator(Policy policy);
    }

    private qxg(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ DecoratedUser a(String str, Map map) {
        return (DecoratedUser) map.get(str);
    }

    public static qxg a(RxResolver rxResolver, xil xil, xil xil2) {
        return new qxg(new $$Lambda$qxg$fAY6u1PJ5L1smwNnq6qYcnmEeKA(rxResolver, xil, xil2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qxh a(RxResolver rxResolver, xil xil, xil xil2, Policy policy) {
        return new qxh(rxResolver, policy, xil, xil2);
    }

    public final xii<DecoratedUser> a(String str, Policy policy) {
        return this.a.createUserDecorator(policy).a(str).e((xiy<? super T, ? extends R>) new $$Lambda$qxg$5psfGMZlhoIQmPMA7BLek3j5cLc<Object,Object>(str));
    }
}
