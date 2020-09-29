package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: odl reason: default package */
public class odl extends jrd implements jqx, a, uqq {
    public jtd T;
    private b<oea, odq> U;
    public odm a;
    public oer b;

    public static odl a(fqn fqn) {
        odl odl = new odl();
        a.a((Fragment) odl, gkm.a(uqo.ar));
        fqo.a((Fragment) odl, fqn);
        return odl;
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        jtd jtd = this.T;
        if (jtd != null) {
            jtd.a(z);
        }
    }

    public final void A() {
        this.U.d();
        super.A();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        oer oer = this.b;
        ViewGroup viewGroup2 = viewGroup;
        oeq oeq = new oeq((LayoutInflater) oer.a(layoutInflater, 1), viewGroup2, (knw) oer.a(new $$Lambda$odl$TYTNjh_43OOasOQKt4dsRhkvrY(this), 3), (Resources) oer.a(oer.a.get(), 4), (kbd) oer.a(oer.b.get(), 5), (oes) oer.a(oer.c.get(), 6), (oel) oer.a(oer.d.get(), 7));
        odm odm = this.a;
        this.U = knk.a(odm.a(), oea.a);
        this.U.a(knp.a($$Lambda$i13KOya76_2aBEVG7DgjzXStX78.INSTANCE, oeq));
        return oeq.a;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.V;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR, null);
    }

    public final uqm ag() {
        return uqo.ar;
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR;
    }

    public final void aw_() {
        this.U.b();
        super.aw_();
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR.name();
    }

    public final void z() {
        super.z();
        this.U.c();
    }
}
