package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.util.SortOption;
import io.reactivex.Observable;

/* renamed from: hsx reason: default package */
public final class hsx implements vua<Observable<uyy<uyq>>> {
    private final wlc<ioc> a;

    private hsx(wlc<ioc> wlc) {
        this.a = wlc;
    }

    public static hsx a(wlc<ioc> wlc) {
        return new hsx(wlc);
    }

    public final /* synthetic */ Object get() {
        ioc ioc = (ioc) this.a.get();
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        String str = "name";
        String str2 = "link";
        String str3 = "covers";
        decorationPolicy.setAlbumAttributes(ImmutableMap.g().b("addTime", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b());
        Policy policy = new Policy(decorationPolicy);
        ioc.c = new SortOption("recentlyPlayedRank");
        ioc.a(false, true, false);
        return (Observable) vuf.a(ioc.a(policy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
