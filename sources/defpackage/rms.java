package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: rms reason: default package */
public class rms extends jrd implements d, jqx, a, uqq {
    private b<rnj, rnh> T;
    private sso U;
    public rmv a;
    public rnq b;

    public static jqx a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("user_uri", str);
        bundle.putString("username", str2);
        rms rms = new rms();
        rms.g(bundle);
        return rms;
    }

    public final void A() {
        super.A();
        this.T.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.T = knc.a(this.a.a(), rnj.a, knm.a());
        this.T.a(this.b);
        return this.b.a.e();
    }

    public final void a(Context context) {
        this.U = sso.a((String) fbp.a(((Bundle) fbp.a(this.i)).getString("user_uri")));
        super.a(context);
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return this.U;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PROFILE, null);
    }

    public final uqm ag() {
        return uqo.bd;
    }

    public final gkq aj() {
        return PageIdentifiers.FREE_TIER_OTHER_USER_PROFILE;
    }

    public final void aw_() {
        super.aw_();
        this.T.b();
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return this.U.toString();
    }

    public final void z() {
        super.z();
        this.T.c();
    }
}
