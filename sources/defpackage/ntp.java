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

/* renamed from: ntp reason: default package */
public class ntp extends jor implements jol, a {
    public ntq a;
    public ntn b;

    public final Fragment ae() {
        return this;
    }

    public final String e() {
        return "made-for-you-hub";
    }

    public static ntp a(fpt fpt) {
        ntp ntp = new ntp();
        fpu.a((Fragment) ntp, fpt);
        return ntp;
    }

    public final String b(Context context) {
        return context.getString(R.string.made_for_you_hub_title);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.MADE_FOR_YOU, null);
    }

    public final udr ag() {
        return udt.ap;
    }

    public final sih ae_() {
        return ViewUris.ap;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.a.e();
    }

    public final void g() {
        super.g();
        this.b.a();
    }

    public final void h() {
        super.h();
        this.b.a.bf_();
    }
}
