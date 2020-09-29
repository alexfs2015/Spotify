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

/* renamed from: maz reason: default package */
public class maz extends jor implements jol, a {
    public mbi a;
    public mbk b;

    public final Fragment ae() {
        return this;
    }

    public static jol a(String str, String str2, fpt fpt, boolean z) {
        sih sih;
        if (z) {
            sih = ViewUris.l;
        } else {
            sih = ViewUris.m.a(str);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_root", z);
        bundle.putParcelable("uri", sih);
        bundle.putString("title", str2);
        maz maz = new maz();
        maz.g(bundle);
        fpu.a((Fragment) maz, fpt);
        return maz;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.b.a();
    }

    public final void g() {
        super.g();
        this.a.a(this.b);
    }

    public final void h() {
        super.h();
        this.a.a.bf_();
    }

    public final String e() {
        return ae_().toString();
    }

    public final String b(Context context) {
        String string = ((Bundle) fay.a(this.i)).getString("title");
        return TextUtils.isEmpty(string) ? context.getString(R.string.charts_title_charts) : string;
    }

    public final udr ag() {
        if (((Bundle) fay.a(this.i)).getBoolean("is_root")) {
            return udt.r;
        }
        return udt.q;
    }

    public final rdh af() {
        boolean z = ((Bundle) fay.a(this.i)).getBoolean("is_root");
        sih ae_ = ae_();
        if (ae_.toString().endsWith(":regional")) {
            return rdh.a(PageIdentifiers.CHARTS_REGIONAL, null);
        }
        if (ae_.toString().endsWith(":viral")) {
            return rdh.a(PageIdentifiers.CHARTS_VIRAL, null);
        }
        if (z) {
            return rdh.a(PageIdentifiers.CHARTS, null);
        }
        return rdh.a("ChartsFragment");
    }

    public final sih ae_() {
        return (sih) fay.a(((Bundle) fay.a(this.i)).getParcelable("uri"));
    }
}
