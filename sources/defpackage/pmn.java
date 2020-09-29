package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.c;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: pmn reason: default package */
public class pmn extends jrd implements c, d, jqx, a, szs {
    public gwr T;
    private b<pnm, pnk> U;
    public pmq a;
    public gwp b;

    public static pmn a(fqn fqn) {
        pmn pmn = new pmn();
        fqo.a((Fragment) pmn, fqn);
        return pmn;
    }

    public final void A() {
        super.A();
        this.U.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ppp ppp = new ppp(this.T, this.b);
        ppq ppq = new ppq(o().getResources());
        this.U = knc.a(this.a.a(), pnm.a(false), knm.a());
        b<pnm, pnk> bVar = this.U;
        ppq.getClass();
        bVar.a(knp.a(new $$Lambda$TM9KnBYHov6yYOxlnIAyJ8I9As(ppq), ppp));
        return ppp.a.e();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.aQ;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PREMIUM_DESTINATION, ViewUris.aQ.toString());
    }

    public final uqm ag() {
        return uqo.aG;
    }

    public final boolean ai() {
        return true;
    }

    public final boolean ak() {
        return false;
    }

    public final void aw_() {
        super.aw_();
        this.U.b();
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "premium-hubs-page";
    }

    public final void z() {
        super.z();
        this.U.c();
    }
}
