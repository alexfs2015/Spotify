package defpackage;

import android.content.Context;
import android.os.Bundle;
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

/* renamed from: noj reason: default package */
public class noj extends jrd implements c, d, NavigationItem, fzq, jqx, szs, uqq {
    public szp T;
    public ToolbarMenuHelper U;
    private sso V;
    public njy a;
    public gwm b;

    public static noj a(fqn fqn, String str, String str2) {
        noj noj = new noj();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        if (str2 != null) {
            bundle.putString("space-id", str2);
        }
        noj.g(bundle);
        fqo.a((Fragment) noj, fqn);
        return noj;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c(true);
        return this.a.b();
    }

    public final void a(Context context) {
        this.V = ViewUris.d;
        super.a(context);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        this.U.a(this.V, fzn, this.T);
    }

    public final void aP_() {
        super.aP_();
        this.a.a();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return this.V;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.NOW, null);
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
        return PageIdentifiers.NOW;
    }

    public final boolean ak() {
        this.a.b.f();
        return true;
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return PageIdentifiers.NOW.name();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.a.b(bundle);
    }

    public final void h() {
        super.h();
        this.a.a.a();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.a.a(bundle);
    }
}
