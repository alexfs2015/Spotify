package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;

/* renamed from: lym reason: default package */
public class lym extends jrd implements b, NavigationItem, fzq, jqx, szs, uqq {
    public gwm T;
    public rly U;
    public mdq V;
    public mby W;
    public siq X;
    public ssl Y;
    public String a;
    public boolean b;

    public static lym a(String str, String str2, String str3, fqn fqn) {
        lym lym = new lym();
        Bundle bundle = lym.i;
        if (bundle == null) {
            bundle = new Bundle();
            lym.g(bundle);
        }
        bundle.putString("username", str2);
        bundle.putString("title", str);
        bundle.putString("view_uri", str3);
        fqo.a((Fragment) lym, fqn);
        a.a((Fragment) lym, rta.w);
        return lym;
    }

    public final void A() {
        this.Y.b();
        super.A();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string = ((Bundle) fbp.a(this.i)).getString("username");
        if (!fbo.a(string)) {
            this.X.a(string).a();
        }
        return this.V.e();
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
        super.a(menu, menuInflater);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle != null) {
            bundle.setClassLoader(q().getClassLoader());
            Parcelable parcelable = (Parcelable) fbp.a(bundle.getParcelable("browse_hubs_state"));
            mby mby = this.W;
            fbp.a(parcelable);
            Parcelable parcelable2 = (Parcelable) fbp.a(parcelable);
            if (parcelable2 instanceof sap) {
                sap sap = (sap) parcelable2;
                gwp gwp = mby.c;
                mby.e = sap.a;
                hcs a2 = mby.d.a(mby.e);
                if (a2 != null) {
                    gwp.a(a2, false);
                }
                gwp.a(sap.b);
            }
        }
    }

    public final void a(fzn fzn) {
        this.V.a(fzn);
    }

    public final void aP_() {
        super.aP_();
        this.W.c();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return mdk.b(this.a);
    }

    public final rmf af() {
        return rmf.a((a) this.U);
    }

    public final uqm ag() {
        return uqo.U;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FIND;
    }

    public final boolean ai() {
        return this.b;
    }

    public final gkq aj() {
        return mdk.a(this.a);
    }

    public final boolean ak() {
        if (!this.b) {
            return false;
        }
        this.V.g();
        return true;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(!this.b);
    }

    public final boolean b() {
        return this.V.f();
    }

    public final String e() {
        return mdk.b(this.a).toString();
    }

    public final void e(Bundle bundle) {
        mby mby = this.W;
        gwp gwp = mby.c;
        mby.d.a(mby.e, (hcs) mby.c.d.a());
        bundle.putParcelable("browse_hubs_state", new sap(mby.e, gwp.a()));
        super.e(bundle);
    }

    public final void h() {
        super.h();
        mby mby = this.W;
        mby.b.b();
        mby.a.c();
    }

    public final void z() {
        super.z();
        this.Y.a();
    }
}
