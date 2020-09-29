package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: mfb reason: default package */
public final class mfb implements wig<mfa> {
    private final wzi<Resources> a;
    private final wzi<xim<HubsJsonViewModel>> b;
    private final wzi<xil> c;
    private final wzi<xil> d;
    private final wzi<rof> e;

    private mfb(wzi<Resources> wzi, wzi<xim<HubsJsonViewModel>> wzi2, wzi<xil> wzi3, wzi<xil> wzi4, wzi<rof> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static mfb a(wzi<Resources> wzi, wzi<xim<HubsJsonViewModel>> wzi2, wzi<xil> wzi3, wzi<xil> wzi4, wzi<rof> wzi5) {
        mfb mfb = new mfb(wzi, wzi2, wzi3, wzi4, wzi5);
        return mfb;
    }

    public final /* synthetic */ Object get() {
        mfa mfa = new mfa((Resources) this.a.get(), (xim) this.b.get(), (xil) this.c.get(), (xil) this.d.get(), (rof) this.e.get());
        return mfa;
    }
}
