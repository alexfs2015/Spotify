package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.nowplayingbar.domain.model.Track;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nwy reason: default package */
public class nwy extends jor implements jol, a, udv {
    public nyf T;
    public jqs U;
    private b<nxn, nxd> V;
    public nwz a;
    public nya b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static nwy a(fpt fpt) {
        nwy nwy = new nwy();
        a.a((Fragment) nwy, gjb.a(udt.ar));
        fpu.a((Fragment) nwy, fpt);
        return nwy;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nyf nyf = this.T;
        ViewGroup viewGroup2 = viewGroup;
        nye nye = new nye((LayoutInflater) nyf.a(layoutInflater, 1), viewGroup2, (kkn) nyf.a(new $$Lambda$nwy$tnklI9t0dHOn2apzNlyRR11w(this), 3), (Resources) nyf.a(nyf.a.get(), 4), (jzd) nyf.a(nyf.b.get(), 5), (nyg) nyf.a(nyf.c.get(), 6));
        nwz nwz = this.a;
        this.V = kkb.a(nwz.a(), nxn.a);
        nya nya = this.b;
        this.V.a(kkg.a($$Lambda$ZSGZkK1DKangux3jvv5nNcUMBis.INSTANCE, new $$Lambda$nwy$eKA6M5VnSjVOYfdYkj28H5PaE(nye, new nxz((wlc) nya.a(new $$Lambda$nwy$29w_8GqkArZBo9FPZy3La7XApg(this), 1), (vol) nya.a(nya.a.get(), 2), (nxx) nya.a(nya.b.get(), 3)))));
        return nye.a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ nyc ah() {
        nxn nxn = (nxn) this.V.e();
        fay.a(nxn.a() instanceof b, (Object) "NowPlayingBarLoggingModel can only be created from a NowPlayingBarModel that has tracks");
        b bVar = (b) nxn.a();
        Track b2 = bVar.b.b();
        return new nyb(b2.b(), b2.f(), bVar.c.a(), nxn.b());
    }

    public final void z() {
        super.z();
        this.V.c();
    }

    public final void A() {
        this.V.d();
        super.A();
    }

    public final void ax_() {
        this.V.b();
        super.ax_();
    }

    public final udr ag() {
        return udt.ar;
    }

    public final String e() {
        return PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR.name();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR, null);
    }

    public final sih ae_() {
        return ViewUris.W;
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR;
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        jqs jqs = this.U;
        if (jqs != null) {
            jqs.a(z);
        }
    }
}
