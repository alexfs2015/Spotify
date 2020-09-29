package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mfc reason: default package */
public class mfc extends jrd implements jqx, a {
    public mfl a;
    public mfn b;

    public static jqx a(String str, String str2, fqn fqn, boolean z) {
        sso a2 = z ? ViewUris.k : ViewUris.l.a(str);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_root", z);
        bundle.putParcelable("uri", a2);
        bundle.putString("title", str2);
        mfc mfc = new mfc();
        mfc.g(bundle);
        fqo.a((Fragment) mfc, fqn);
        return mfc;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.b.a();
    }

    public final void aP_() {
        super.aP_();
        this.a.a(this.b);
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return (sso) fbp.a(((Bundle) fbp.a(this.i)).getParcelable("uri"));
    }

    public final rmf af() {
        boolean z = ((Bundle) fbp.a(this.i)).getBoolean("is_root");
        sso ae_ = ae_();
        return ae_.toString().endsWith(":regional") ? rmf.a(PageIdentifiers.CHARTS_REGIONAL, null) : ae_.toString().endsWith(":viral") ? rmf.a(PageIdentifiers.CHARTS_VIRAL, null) : z ? rmf.a(PageIdentifiers.CHARTS, null) : rmf.a("ChartsFragment");
    }

    public final uqm ag() {
        return ((Bundle) fbp.a(this.i)).getBoolean("is_root") ? uqo.r : uqo.q;
    }

    public final String b(Context context) {
        String string = ((Bundle) fbp.a(this.i)).getString("title");
        return TextUtils.isEmpty(string) ? context.getString(R.string.charts_title_charts) : string;
    }

    public final String e() {
        return ae_().toString();
    }

    public final void h() {
        super.h();
        this.a.a.bd_();
    }
}
