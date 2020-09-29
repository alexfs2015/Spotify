package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.podcast.endpoints.policy.DecorationPolicy;
import com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy;
import com.spotify.podcast.endpoints.policy.KeyValuePolicy;
import com.spotify.podcast.endpoints.policy.Policy;

/* renamed from: uaq reason: default package */
public final class uaq {
    static final a a;
    final vlx b;

    static {
        a g = ImmutableMap.g();
        String str = "link";
        g.b(str, Boolean.TRUE);
        String str2 = "name";
        g.b(str2, Boolean.TRUE);
        g.b("offline", Boolean.TRUE);
        g.b("isNew", Boolean.TRUE);
        g.b("isInListenLater", Boolean.TRUE);
        g.b("isPlayed", Boolean.TRUE);
        g.b("length", Boolean.TRUE);
        g.b("timeLeft", Boolean.TRUE);
        g.b("playable", Boolean.TRUE);
        g.b("available", Boolean.TRUE);
        String str3 = "covers";
        g.b(str3, Boolean.TRUE);
        g.b("isExplicit", Boolean.TRUE);
        g.b("freezeFrames", Boolean.TRUE);
        g.b("manifestId", Boolean.TRUE);
        g.b("mediaTypeEnum", Boolean.TRUE);
        g.b("description", Boolean.TRUE);
        g.b("publishDate", Boolean.TRUE);
        a g2 = ImmutableMap.g();
        g2.b(str2, Boolean.TRUE);
        g2.b(str, Boolean.TRUE);
        g2.b("inCollection", Boolean.TRUE);
        g2.b(str3, Boolean.TRUE);
        a = new a().a(Optional.e()).b(Optional.b(vmd.a)).c(Optional.e()).d(Optional.e()).e(Optional.e()).f(Optional.b(Boolean.TRUE)).g(Optional.e()).h(Optional.e()).i(Optional.e()).j(Optional.e()).a(500).a(Optional.b(Policy.builder().a(DecorationPolicy.builder().a(EpisodeDecorationPolicy.builder().a(KeyValuePolicy.builder().a(g2.b()).a()).a(g.b()).a()).a()).a())).g(Optional.b(Boolean.TRUE)).i(Optional.b(Boolean.TRUE)).d(Optional.b(Double.valueOf(0.1d))).e(Optional.b(Integer.valueOf(120))).j(Optional.b(Integer.valueOf(10))).h(Optional.b(Integer.valueOf(30))).c(Optional.b(new vlu(0, 3))).a();
    }

    public uaq(vlx vlx) {
        this.b = vlx;
    }
}
