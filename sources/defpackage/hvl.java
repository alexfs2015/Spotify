package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.util.SortOption;
import io.reactivex.Observable;

/* renamed from: hvl reason: default package */
public final class hvl implements wig<Observable<vlb<vkt>>> {
    private final wzi<iqp> a;

    private hvl(wzi<iqp> wzi) {
        this.a = wzi;
    }

    public static hvl a(wzi<iqp> wzi) {
        return new hvl(wzi);
    }

    public final /* synthetic */ Object get() {
        iqp iqp = (iqp) this.a.get();
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        String str = "name";
        String str2 = "link";
        String str3 = "covers";
        decorationPolicy.setAlbumAttributes(ImmutableMap.g().b("addTime", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b());
        Policy policy = new Policy(decorationPolicy);
        iqp.c = new SortOption("recentlyPlayedRank");
        iqp.a(false, true, false);
        return (Observable) wil.a(iqp.a(policy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
