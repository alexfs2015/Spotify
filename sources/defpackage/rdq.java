package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: rdq reason: default package */
public class rdq extends jor implements d, jol, a, udv {
    private b<reh, ref> T;
    private sih U;
    public rdt a;
    public reo b;

    public final Fragment ae() {
        return this;
    }

    public final String b(Context context) {
        return "";
    }

    public static jol a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("user_uri", str);
        bundle.putString("username", str2);
        rdq rdq = new rdq();
        rdq.g(bundle);
        return rdq;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.T = kjt.a(this.a.a(), reh.a, kkd.a());
        this.T.a(this.b);
        return this.b.a.e();
    }

    public final void z() {
        super.z();
        this.T.c();
    }

    public final void A() {
        super.A();
        this.T.d();
    }

    public final void ax_() {
        super.ax_();
        this.T.b();
    }

    public final String e() {
        return this.U.toString();
    }

    public final udr ag() {
        return udt.bd;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PROFILE, null);
    }

    public final sih ae_() {
        return this.U;
    }

    public final gjf aj() {
        return PageIdentifiers.FREE_TIER_OTHER_USER_PROFILE;
    }

    public final void a(Context context) {
        this.U = sih.a((String) fay.a(((Bundle) fay.a(this.i)).getString("user_uri")));
        super.a(context);
    }
}
