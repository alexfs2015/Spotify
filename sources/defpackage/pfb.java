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

/* renamed from: pfb reason: default package */
public class pfb extends jor implements c, d, jol, a, spl {
    public gur T;
    private b<pga, pfy> U;
    public pfe a;
    public gup b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final boolean ai() {
        return true;
    }

    public final boolean ak() {
        return false;
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "premium-hubs-page";
    }

    public static pfb a(fpt fpt) {
        pfb pfb = new pfb();
        fpu.a((Fragment) pfb, fpt);
        return pfb;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        piy piy = new piy(this.T, this.b);
        piz piz = new piz(o().getResources());
        this.U = kjt.a(this.a.a(), pga.a(false), kkd.a());
        b<pga, pfy> bVar = this.U;
        piz.getClass();
        bVar.a(kkg.a(new $$Lambda$43oxxeDrIFoVAbFghPhMHiR_9vk(piz), piy));
        return piy.a.e();
    }

    public final void z() {
        super.z();
        this.U.c();
    }

    public final void A() {
        super.A();
        this.U.d();
    }

    public final void ax_() {
        super.ax_();
        this.U.b();
    }

    public final udr ag() {
        return udt.aG;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PREMIUM_DESTINATION, ViewUris.aR.toString());
    }

    public final sih ae_() {
        return ViewUris.aR;
    }
}
