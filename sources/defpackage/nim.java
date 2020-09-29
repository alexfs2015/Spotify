package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.hiddencontent.loader.BansLoader;
import java.util.List;

/* renamed from: nim reason: default package */
public final class nim {
    private final iqv a;
    private final BansLoader b;
    private final nio<vku> c;

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

    public nim(iqv iqv, BansLoader bansLoader, nio<vku> nio) {
        this.a = iqv;
        this.b = bansLoader;
        this.c = nio;
        this.a.a(true);
        this.a.a(way.e().a("addTime").a());
    }

    public final xii<List<vku>> a() {
        return this.b.a().e((xiy<? super T, ? extends R>) $$Lambda$nim$Psg9N1ke1N2F_7r6lHSCVLaFo.INSTANCE);
    }
}
