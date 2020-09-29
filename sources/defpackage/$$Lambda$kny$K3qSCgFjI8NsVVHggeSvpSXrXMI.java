package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.Completable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kny$K3qSCgFjI8NsVVHggeSvpSXrXMI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kny$K3qSCgFjI8NsVVHggeSvpSXrXMI implements Function {
    private final /* synthetic */ SlotApi f$0;

    public /* synthetic */ $$Lambda$kny$K3qSCgFjI8NsVVHggeSvpSXrXMI(SlotApi slotApi) {
        this.f$0 = slotApi;
    }

    public final Object apply(Object obj) {
        return Completable.b(this.f$0.a(AdSlot.STREAM.getSlotId(), Intent.CLEAR), this.f$0.a(AdSlot.PREROLL.getSlotId(), Intent.CLEAR)).a(new b()).g($$Lambda$kny$cOZnhtHdhSftD2Jjru_cHN6W9c.INSTANCE).d();
    }
}
