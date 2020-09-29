package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;

/* renamed from: ifs reason: default package */
public final class ifs implements wig<ifr> {
    private final wzi<SlotApi> a;

    private ifs(wzi<SlotApi> wzi) {
        this.a = wzi;
    }

    public static ifs a(wzi<SlotApi> wzi) {
        return new ifs(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ifr((SlotApi) this.a.get());
    }
}
