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

/* renamed from: nin reason: default package */
public class nin extends jor implements c, d, NavigationItem, fyw, jol, spl, udv {
    public spi T;
    public ToolbarMenuHelper U;
    private sih V;
    public nej a;
    public gum b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final boolean ai() {
        return true;
    }

    public final String b(Context context) {
        return "";
    }

    public static nin a(fpt fpt, String str, String str2) {
        nin nin = new nin();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        if (str2 != null) {
            bundle.putString("space-id", str2);
        }
        nin.g(bundle);
        fpu.a((Fragment) nin, fpt);
        return nin;
    }

    public final void a(Context context) {
        this.V = ViewUris.e;
        super.a(context);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c(true);
        return this.a.b();
    }

    public final void g() {
        super.g();
        this.a.a();
    }

    public final void h() {
        super.h();
        this.a.a.a();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.a.a(bundle);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.a.b(bundle);
    }

    public final String e() {
        return PageIdentifiers.NOW.name();
    }

    public final udr ag() {
        return udt.aW;
    }

    public final gjf aj() {
        return PageIdentifiers.NOW;
    }

    public final sih ae_() {
        return this.V;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.START_PAGE;
    }

    public final boolean ak() {
        this.a.b.f();
        return true;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.NOW, null);
    }

    public final void a(fyt fyt) {
        this.U.a(this.V, fyt, this.T);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }
}
