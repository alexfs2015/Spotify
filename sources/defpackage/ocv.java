package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: ocv reason: default package */
public class ocv extends jrd implements jqx, uqq {
    private b<sbo, sbj> T;
    public saw a;
    public Picasso b;

    public static ocv a(fqn fqn, String str) {
        ocv ocv = new ocv();
        Bundle bundle = new Bundle();
        bundle.putString("spotify:new-release-feed", str);
        ocv.g(bundle);
        fqo.a((Fragment) ocv, fqn);
        return ocv;
    }

    public final void A() {
        this.T.d();
        super.A();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        odd odd = new odd(layoutInflater, viewGroup, this.b);
        this.T = this.a.a(sbo.a);
        this.T.a(odd);
        return odd.a;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.NEWRELEASESFEED, null);
    }

    public final uqm ag() {
        return uqo.at;
    }

    public final gkq aj() {
        return PageIdentifiers.NEWRELEASESFEED;
    }

    public final void aw_() {
        this.T.b();
        super.aw_();
    }

    public final String b(Context context) {
        return context.getString(R.string.new_releases);
    }

    public final String e() {
        return "spotify:new-release-feed";
    }

    public final void z() {
        super.z();
        this.T.c();
    }
}
