package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;

/* renamed from: ibk reason: default package */
public final class ibk implements wig<ibj> {
    private final wzi<SlotApi> a;
    private final wzi<hzu> b;

    private ibk(wzi<SlotApi> wzi, wzi<hzu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ibk a(wzi<SlotApi> wzi, wzi<hzu> wzi2) {
        return new ibk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ibj((SlotApi) this.a.get(), (hzu) this.b.get());
    }
}
