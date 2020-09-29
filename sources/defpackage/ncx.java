package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.hiddencontent.loader.BansLoader;
import java.util.List;

/* renamed from: ncx reason: default package */
public final class ncx {
    private final ioi a;
    private final BansLoader b;
    private final ncz<uyr> c;

    static {
        ListPolicy listPolicy = new ListPolicy();
        String str = "name";
        String str2 = "portraits";
        String str3 = "isFollowed";
        String str4 = "isBanned";
        listPolicy.setListAttributes(ImmutableMap.g().b("link", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b());
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        new Policy(decorationPolicy);
    }

    public ncx(ioi ioi, BansLoader bansLoader, ncz<uyr> ncz) {
        this.a = ioi;
        this.b = bansLoader;
        this.c = ncz;
        this.a.a(true);
        this.a.a(vns.e().a("addTime").a());
    }

    public final wud<List<uyr>> a() {
        return this.b.a().f($$Lambda$ncx$byRGcaK3aQUWPm3W3wAaHyPslEA.INSTANCE);
    }
}
