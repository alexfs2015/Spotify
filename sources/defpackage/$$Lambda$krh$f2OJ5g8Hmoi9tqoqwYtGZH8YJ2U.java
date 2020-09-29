package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.Completable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$krh$f2OJ5g8Hmoi9tqoqwYtGZH8YJ2U reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krh$f2OJ5g8Hmoi9tqoqwYtGZH8YJ2U implements Function {
    private final /* synthetic */ SlotApi f$0;

    public /* synthetic */ $$Lambda$krh$f2OJ5g8Hmoi9tqoqwYtGZH8YJ2U(SlotApi slotApi) {
        this.f$0 = slotApi;
    }

    public final Object apply(Object obj) {
        return Completable.b(this.f$0.a(AdSlot.STREAM.getSlotId(), Intent.CLEAR), this.f$0.a(AdSlot.PREROLL.getSlotId(), Intent.CLEAR)).a(new b()).g($$Lambda$krh$BTwkn9mtaLxsAkwmmfBQdGh5Nis.INSTANCE).d();
    }
}
