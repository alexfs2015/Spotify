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

/* renamed from: obl reason: default package */
public class obl extends jrd implements jqx, a {
    private static String T = ((String) ((jwk) fbp.a(jwl.a(LinkType.NAVIGATION_APPS_SETTINGS))).a.get(0));
    public static final Short a = Short.valueOf(7331);
    private final sso U = sso.a(T);
    public b<oca, oby> b;

    public static jqx ah() {
        return new obl();
    }

    public final void A() {
        super.A();
        this.b.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ocf ocf = new ocf(layoutInflater, viewGroup);
        this.b.a(ocf);
        return ocf.a;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return this.U;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SETTINGS_APPS, null);
    }

    public final uqm ag() {
        return uqo.d;
    }

    public final void aw_() {
        super.aw_();
        this.b.b();
    }

    public final String b(Context context) {
        return context.getResources().getString(R.string.partner_settings_title);
    }

    public final String e() {
        return "navigation_apps_settings";
    }

    public final void z() {
        super.z();
        if (!this.b.a()) {
            this.b.c();
        }
    }
}
