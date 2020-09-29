package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;

/* renamed from: ozp reason: default package */
final class ozp {
    static final a c;
    final String a;
    final vje b;

    static {
        String str = "formatListType";
        String str2 = "containsTracks";
        String str3 = "containsEpisodes";
        String str4 = "containsAudioEpisodes";
        String str5 = "isOnDemandInFree";
        HeaderPolicy a2 = HeaderPolicy.builder().a(ImmutableMap.g().b("link", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b()).b(ImmutableMap.f()).c(ImmutableMap.f()).a();
        c = a.t().a(true).a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(a2).a(ListPolicy.builder().a(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).e(ImmutableMap.f()).d(ImmutableMap.f()).a()).a()).a())).i(vkg.a(0, 0)).a();
    }

    ozp(String str, vje vje) {
        this.a = str;
        this.b = vje;
    }
}
