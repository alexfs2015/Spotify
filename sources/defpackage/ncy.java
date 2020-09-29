package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.hiddencontent.loader.BansLoader;
import java.util.Collections;
import java.util.List;

/* renamed from: ncy reason: default package */
public final class ncy {
    public final ioo a;
    private final BansLoader b;
    private final ncz<uzc> c;

    static {
        ListPolicy listPolicy = new ListPolicy();
        String str = "name";
        String str2 = "previewId";
        String str3 = "inCollection";
        String str4 = "isBanned";
        String str5 = "isExplicit";
        String str6 = "playable";
        listPolicy.setListAttributes(ImmutableMap.g().b("link", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b());
        listPolicy.setArtistsAttributes(Collections.singletonMap(str, Boolean.TRUE));
        listPolicy.setAlbumAttributes(ImmutableMap.g().b(str, Boolean.TRUE).b("covers", Boolean.TRUE).b());
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        new Policy(decorationPolicy);
    }

    public ncy(ioo ioo, BansLoader bansLoader, ncz<uzc> ncz) {
        this.a = ioo;
        this.b = bansLoader;
        this.c = ncz;
        this.a.a(vns.e().a("addTime").a());
    }

    public final wud<List<uzc>> a() {
        return this.b.a().f($$Lambda$ncy$BBPoWLGX1XGhVd1igy2rYUpBcxE.INSTANCE);
    }
}
