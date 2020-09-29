package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import io.reactivex.Completable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: orc reason: default package */
final class orc {
    uyz a;
    boolean b;
    final AtomicReference<String> c = new AtomicReference<>("item_unknown");
    private final PlayOrigin d;
    private final ohf e;
    private final oiv f;

    public orc(PlayOrigin playOrigin, oiv oiv, ohf ohf) {
        this.d = playOrigin;
        this.e = ohf;
        this.f = oiv;
    }

    public final Completable a(String str) {
        Boolean bool;
        if (this.a == null) {
            this.c.set(str);
            return Completable.a();
        }
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, str, null, 0);
        boolean z = ((Boolean) this.e.a().a(Boolean.FALSE)).booleanValue() || "item_shuffle_play".equals(str);
        Builder builder = new Builder();
        if (z) {
            if (this.e.f() && b(str)) {
                builder.skipTo(playOptionsSkipTo);
            }
        } else if (b(str)) {
            builder.skipTo(playOptionsSkipTo);
        }
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = (Boolean) this.e.a().d();
        }
        builder.playerOptionsOverride(bool, (Boolean) this.e.b().d(), null);
        a g = ImmutableMap.g();
        if (!(!this.b && this.a.k()) && this.e.c()) {
            g = g.b(Metadata.KEY_SHUFFLE_ALGORITHM, Metadata.SHUFFLE_ALGORITHM_WEIGHTED);
        }
        if (this.e.d()) {
            g = g.b("autoplay_candidate", "false").b(Metadata.LICENSE, Metadata.LICENSE_ON_DEMAND_WHEN_FREE);
        }
        String p = this.a.p();
        if (!TextUtils.isEmpty(p)) {
            g = g.b(Metadata.FORMAT_LIST_TYPE, p);
        }
        ImmutableSet.a j = ImmutableSet.j();
        if (this.e.e()) {
            j.b(PlayerProviders.RESUME_POINT);
        }
        if (this.e.f()) {
            j.a((E[]) new String[]{PlayerProviders.MFT_INJECT_FILLER_TRACKS, PlayerProviders.MFT_INJECT_RANDOM_TRACKS, PlayerProviders.MFT_DISALLOW_RESTART_PLAY});
        }
        builder.suppressions(new PlayerSuppressions((Set<String>) j.a()));
        return this.f.a(builder.build(), this.d, g.b());
    }

    private static boolean b(String str) {
        return str != null && !"item_shuffle_play".equals(str) && !"item_not_set".equals(str) && !"item_unknown".equals(str);
    }
}
