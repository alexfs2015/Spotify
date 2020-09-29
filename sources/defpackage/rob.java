package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;

/* renamed from: rob reason: default package */
public final class rob implements roa {
    private final Flowable<PlayerState> a;
    private final hhc b;

    public rob(Flowable<PlayerState> flowable, hhc hhc) {
        this.a = flowable;
        this.b = hhc;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcm a(String str, hcm hcm) {
        if (!"glue2:trackRow".equals(hcm.componentId().id()) && !HubsGlueRow.ENTITY.id().equals(hcm.componentId().id())) {
            if (!"row:trackWithDownloadProgress".equals(hcm.componentId().id())) {
                return null;
            }
        }
        a builder = hcm.toBuilder();
        String string = hcm.metadata().string("uri");
        boolean z = string != null && string.equals(str);
        String str2 = "hubs:glue:highlight";
        return z ? builder.c(str2, "1").a() : builder.c(str2, Ad.DEFAULT_SKIPPABLE_AD_DELAY).a();
    }

    /* access modifiers changed from: 0000 */
    public final hcs a(hcs hcs, Optional<PlayerTrack> optional) {
        return new hdn(new $$Lambda$rob$qDKI6yTeE2OoghjSaP0mqdZQ0Tk(optional.b() ? ((PlayerTrack) optional.c()).uri() : "")).a(hcs);
    }

    public final /* synthetic */ Object call(Object obj) {
        return xii.a((xii) obj, wit.a((xfk<T>) this.a).e((xiy<? super T, ? extends R>) $$Lambda$CU4HsHLF6o7BOT68dmlohDtLFvQ.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$R2nWGexXoOjRz0TYFkAW3YKIuo.INSTANCE).c(Optional.e()).a(wit.a(this.b.c())).b(), (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$VuF4AYfTbLE8iBefIrtXo8_6I<Object,Object,Object>(this));
    }
}
