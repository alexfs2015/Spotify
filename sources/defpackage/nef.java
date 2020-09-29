package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.util.SortOption;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

/* renamed from: nef reason: default package */
public final class nef implements vua<Observable<uyy<uyq>>> {
    private final wlc<ioc> a;
    private final wlc<Scheduler> b;

    private nef(wlc<ioc> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nef a(wlc<ioc> wlc, wlc<Scheduler> wlc2) {
        return new nef(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        ioc ioc = (ioc) this.a.get();
        Scheduler scheduler = (Scheduler) this.b.get();
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        String str = "name";
        String str2 = "link";
        String str3 = "covers";
        decorationPolicy.setAlbumAttributes(ImmutableMap.g().b("addTime", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b());
        Policy policy = new Policy(decorationPolicy);
        ioc.c = new SortOption("recentlyPlayedRank");
        ioc.a(false, true, false);
        ioc.a = Boolean.TRUE;
        ioc.a(Integer.valueOf(0), Integer.valueOf(20));
        return (Observable) vuf.a(ioc.a(policy).b(200, TimeUnit.MILLISECONDS, scheduler), "Cannot return null from a non-@Nullable @Provides method");
    }
}
