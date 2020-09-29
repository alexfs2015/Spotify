package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.hiddencontent.loader.BansLoader;
import java.util.Collections;
import java.util.List;

/* renamed from: nin reason: default package */
public final class nin {
    public final irb a;
    private final BansLoader b;
    private final nio<vlf> c;

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

    public nin(irb irb, BansLoader bansLoader, nio<vlf> nio) {
        this.a = irb;
        this.b = bansLoader;
        this.c = nio;
        this.a.a(way.e().a("addTime").a());
    }

    public final xii<List<vlf>> a() {
        return this.b.a().e((xiy<? super T, ? extends R>) $$Lambda$nin$kkFkhlrz3uUJU3zvvgrQfUBe7Ks.INSTANCE);
    }
}
