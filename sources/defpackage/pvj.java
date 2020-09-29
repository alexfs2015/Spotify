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

/* renamed from: pvj reason: default package */
public class pvj extends jor implements a, NavigationItem, jol, b, a, spl {
    public gum T;
    public qcr U;
    public qav V;
    public sgn W;
    public ryz X;
    public kyi Y;
    private qcq Z;
    public String a;
    private gup aa;
    public boolean b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final boolean ai() {
        return false;
    }

    public final boolean ak() {
        return false;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.Z = this.U.a(viewGroup);
        this.aa = new gup(this.T, this.Z);
        this.Z.a((pvo) new $$Lambda$pvj$Z7HLT8RBR50Z4G0aZUcvfktaQ0(this));
        this.V.a(this.aa, this.Z);
        sgn sgn = this.W;
        qcq qcq = this.Z;
        sgn.a = qcq;
        return qcq.e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aj() {
        this.V.d();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle != null) {
            bundle.setClassLoader(q().getClassLoader());
            this.V.a((Parcelable) fay.a(bundle.getParcelable("search_state")));
        }
    }

    public final void e(Bundle bundle) {
        bundle.putParcelable("search_state", this.V.e());
        shi.a((Fragment) this);
        super.e(bundle);
    }

    public final void z() {
        super.z();
        this.V.f();
        this.V.a();
        this.V.g();
        this.Y.a(this.V);
    }

    public final void A() {
        super.A();
        this.V.b();
        this.V.h();
        this.V.i();
        this.Y.a(null);
    }

    public final void ax_() {
        this.V.c();
        super.ax_();
    }

    public final String b(Context context) {
        return context.getString(R.string.search_title, new Object[]{w() ? this.V.j() : this.a});
    }

    public final String e() {
        return ae_().toString();
    }

    public final udr ag() {
        return this.b ? udt.j : udt.aN;
    }

    public final sih ae_() {
        return sak.a(w() ? this.V.j() : this.a);
    }

    public final NavigationGroup ah() {
        if (this.b) {
            return NavigationGroup.FREE_TIER_COLLECTION;
        }
        return NavigationGroup.FIND;
    }

    public final rdh af() {
        return rdh.a(this.b ? PageIdentifiers.ASSISTED_CURATION_SEARCH : PageIdentifiers.SEARCH, null);
    }

    public boolean onToolbarUpButtonPressed() {
        return this.V.k();
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.V.a(i, i2, intent);
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }
}
