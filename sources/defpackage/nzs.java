package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nzs reason: default package */
public class nzs extends jrd implements jqx, a {
    public nzt a;
    public nzq b;

    public static nzs a(fqn fqn) {
        nzs nzs = new nzs();
        fqo.a((Fragment) nzs, fqn);
        return nzs;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.a.e();
    }

    public final void aP_() {
        super.aP_();
        this.b.a();
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return ViewUris.ao;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.MADE_FOR_YOU, null);
    }

    public final uqm ag() {
        return uqo.ap;
    }

    public final String b(Context context) {
        return context.getString(R.string.made_for_you_hub_title);
    }

    public final String e() {
        return "made-for-you-hub";
    }

    public final void h() {
        super.h();
        this.b.a.bd_();
    }
}
