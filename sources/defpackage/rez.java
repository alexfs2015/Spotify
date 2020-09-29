package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;

/* renamed from: rez reason: default package */
public final class rez implements rey {
    private final Flowable<PlayerState> a;
    private final heg b;

    public final /* synthetic */ Object call(Object obj) {
        return wud.a((wud) obj, vun.a((wrf<T>) this.a).f($$Lambda$s7vez6vRc_C5e28uHCZYajeVDaw.INSTANCE).f($$Lambda$uwfNFy89iqzdKkVAKajTsxSqelQ.INSTANCE).c(Optional.e()).a(vun.a(this.b.c())).b(), (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$IsWfUxqRyLo8oS1oxXT3uz58BB4<Object,Object,Object>(this));
    }

    public rez(Flowable<PlayerState> flowable, heg heg) {
        this.a = flowable;
        this.b = heg;
    }

    /* access modifiers changed from: 0000 */
    public final gzz a(gzz gzz, Optional<PlayerTrack> optional) {
        return new hau(new $$Lambda$rez$ZMJogre62cs5G2iL60lnQLjfFDA(optional.b() ? ((PlayerTrack) optional.c()).uri() : "")).a(gzz);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzt a(String str, gzt gzt) {
        if (!"glue2:trackRow".equals(gzt.componentId().id()) && !HubsGlueRow.ENTITY.id().equals(gzt.componentId().id())) {
            if (!"row:trackWithDownloadProgress".equals(gzt.componentId().id())) {
                return null;
            }
        }
        a builder = gzt.toBuilder();
        String string = gzt.metadata().string("uri");
        boolean z = string != null && string.equals(str);
        String str2 = "hubs:glue:highlight";
        if (z) {
            return builder.c(str2, "1").a();
        }
        return builder.c(str2, Ad.DEFAULT_SKIPPABLE_AD_DELAY).a();
    }
}
