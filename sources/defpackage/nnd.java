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

/* renamed from: nnd reason: default package */
public class nnd extends jrd implements c, d, NavigationItem, fzq, jqx, szs, uqq {
    public gwp T;
    public ssl U;
    public szp V;
    public ToolbarMenuHelper W;
    private b<nnv, nnt> X;
    public nnc a;
    public nks b;

    public static nnd a(fqn fqn, String str) {
        nnd nnd = new nnd();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        nnd.g(bundle);
        fqo.a((Fragment) nnd, fqn);
        return nnd;
    }

    public final void A() {
        super.A();
        this.U.b();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        noi noi = new noi(this.b, this.T);
        this.X = this.a.a(nnv.a);
        this.X.a(noi);
        return noi.a.a;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        this.W.a(ViewUris.d, fzn, this.V);
    }

    public final void aP_() {
        super.aP_();
        this.X.c();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.d;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.HOME, null);
    }

    public final uqm ag() {
        return uqo.aW;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.START_PAGE;
    }

    public final boolean ai() {
        return true;
    }

    public final gkq aj() {
        return PageIdentifiers.HOME;
    }

    public final boolean ak() {
        this.b.f();
        return true;
    }

    public final void aw_() {
        super.aw_();
        this.X.b();
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final String e() {
        return PageIdentifiers.HOME.name();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.T.a();
    }

    public final void h() {
        super.h();
        this.X.d();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.T.a((Parcelable) bundle);
    }

    public final void z() {
        super.z();
        this.U.a();
    }
}
