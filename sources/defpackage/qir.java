package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;

/* renamed from: qir reason: default package */
public class qir extends jrd implements a, NavigationItem, jqx, b, a, szs {
    public gwm T;
    public qlu U;
    public qjt V;
    public squ W;
    public sin X;
    public lbr Y;
    private qlt Z;
    public String a;
    private gwp aa;
    public boolean b;

    /* access modifiers changed from: private */
    public /* synthetic */ void aj() {
        this.V.d();
    }

    public final void A() {
        super.A();
        this.V.b();
        this.V.h();
        this.V.i();
        this.Y.a(null);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.Z = this.U.a(viewGroup);
        this.aa = new gwp(this.T, this.Z);
        this.Z.a((qek) new $$Lambda$qir$Nx5a0pfhLgUW8hKr5Ey74Tyio3k(this));
        this.V.a(this.aa, this.Z);
        squ squ = this.W;
        qlt qlt = this.Z;
        squ.a = qlt;
        return qlt.e();
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.V.a(i, i2, intent);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle != null) {
            bundle.setClassLoader(q().getClassLoader());
            this.V.a((Parcelable) fbp.a(bundle.getParcelable("search_state")));
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return skr.a(w() ? this.V.j() : this.a);
    }

    public final rmf af() {
        return rmf.a(this.b ? PageIdentifiers.ASSISTED_CURATION_SEARCH : PageIdentifiers.SEARCH, null);
    }

    public final uqm ag() {
        return this.b ? uqo.j : uqo.aN;
    }

    public final NavigationGroup ah() {
        return this.b ? NavigationGroup.FREE_TIER_COLLECTION : NavigationGroup.FIND;
    }

    public final boolean ai() {
        return false;
    }

    public final boolean ak() {
        return false;
    }

    public final void aw_() {
        this.V.c();
        super.aw_();
    }

    public final String b(Context context) {
        return context.getString(R.string.search_title, new Object[]{w() ? this.V.j() : this.a});
    }

    public final String e() {
        return ae_().toString();
    }

    public final void e(Bundle bundle) {
        bundle.putParcelable("search_state", this.V.e());
        srp.a((Fragment) this);
        super.e(bundle);
    }

    public boolean onToolbarUpButtonPressed() {
        return this.V.k();
    }

    public final void z() {
        super.z();
        this.V.f();
        this.V.a();
        this.V.g();
        this.Y.a(this.V);
    }
}
