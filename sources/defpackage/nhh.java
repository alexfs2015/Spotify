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
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.c;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;

/* renamed from: nhh reason: default package */
public class nhh extends jor implements c, d, NavigationItem, fyw, jol, spl, udv {
    public gup T;
    public sie U;
    public spi V;
    public ToolbarMenuHelper W;
    private b<nhz, nhx> X;
    public nhg a;
    public nfd b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final boolean ai() {
        return true;
    }

    public final String b(Context context) {
        return "";
    }

    public static nhh a(fpt fpt, String str) {
        nhh nhh = new nhh();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        nhh.g(bundle);
        fpu.a((Fragment) nhh, fpt);
        return nhh;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nim nim = new nim(this.b, this.T);
        this.X = this.a.a(nhz.a);
        this.X.a(nim);
        return nim.a.a;
    }

    public final void z() {
        super.z();
        this.U.a();
    }

    public final void g() {
        super.g();
        this.X.c();
    }

    public final void A() {
        super.A();
        this.U.b();
    }

    public final void h() {
        super.h();
        this.X.d();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.T.a();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.T.a((Parcelable) bundle);
    }

    public final void ax_() {
        super.ax_();
        this.X.b();
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        this.W.a(ViewUris.e, fyt, this.V);
    }

    public final String e() {
        return PageIdentifiers.HOME.name();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.HOME, null);
    }

    public final sih ae_() {
        return ViewUris.e;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.START_PAGE;
    }

    public final boolean ak() {
        this.b.f();
        return true;
    }

    public final udr ag() {
        return udt.aW;
    }

    public final gjf aj() {
        return PageIdentifiers.HOME;
    }
}
