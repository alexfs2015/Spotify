package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;

/* renamed from: iim reason: default package */
public final class iim implements wig<iil> {
    private final wzi<SlotApi> a;
    private final wzi<jxz> b;
    private final wzi<uzw> c;

    private iim(wzi<SlotApi> wzi, wzi<jxz> wzi2, wzi<uzw> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static iim a(wzi<SlotApi> wzi, wzi<jxz> wzi2, wzi<uzw> wzi3) {
        return new iim(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new iil((SlotApi) this.a.get(), (jxz) this.b.get(), (uzw) this.c.get());
    }
}
