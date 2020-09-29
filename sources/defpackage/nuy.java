package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;

/* renamed from: nuy reason: default package */
public class nuy extends jor implements jol, a {
    private static String T = ((String) ((juc) fay.a(jud.a(LinkType.NAVIGATION_APPS_SETTINGS))).a.get(0));
    public static final Short a = Short.valueOf(7331);
    private final sih U = sih.a(T);
    public b<nvn, nvl> b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "navigation_apps_settings";
    }

    public static jol ah() {
        return new nuy();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nvs nvs = new nvs(layoutInflater, viewGroup);
        this.b.a(nvs);
        return nvs.a;
    }

    public final void z() {
        super.z();
        if (!this.b.a()) {
            this.b.c();
        }
    }

    public final void A() {
        super.A();
        this.b.d();
    }

    public final void ax_() {
        super.ax_();
        this.b.b();
    }

    public final String b(Context context) {
        return context.getResources().getString(R.string.partner_settings_title);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SETTINGS_APPS, null);
    }

    public final udr ag() {
        return udt.d;
    }

    public final sih ae_() {
        return this.U;
    }
}
