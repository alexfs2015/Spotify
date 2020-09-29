package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.util.SortOption;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

/* renamed from: nju reason: default package */
public final class nju implements wig<Observable<vlb<vkt>>> {
    private final wzi<iqp> a;
    private final wzi<Scheduler> b;

    private nju(wzi<iqp> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nju a(wzi<iqp> wzi, wzi<Scheduler> wzi2) {
        return new nju(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        iqp iqp = (iqp) this.a.get();
        Scheduler scheduler = (Scheduler) this.b.get();
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        String str = "name";
        String str2 = "link";
        String str3 = "covers";
        decorationPolicy.setAlbumAttributes(ImmutableMap.g().b("addTime", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b());
        Policy policy = new Policy(decorationPolicy);
        iqp.c = new SortOption("recentlyPlayedRank");
        iqp.a(false, true, false);
        iqp.a = Boolean.TRUE;
        iqp.a(Integer.valueOf(0), Integer.valueOf(20));
        return (Observable) wil.a(iqp.a(policy).b(200, TimeUnit.MILLISECONDS, scheduler), "Cannot return null from a non-@Nullable @Provides method");
    }
}
