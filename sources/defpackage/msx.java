package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: msx reason: default package */
public class msx extends jrd implements jqx, uqq {
    private static final gkq T = new gkq() {
        public final String a() {
            return "feed";
        }
    };
    private b<sbo, sbj> U;
    public saw a;
    public Picasso b;

    public static msx c() {
        return new msx();
    }

    public final void A() {
        this.U.d();
        super.A();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mti mti = new mti(layoutInflater, viewGroup, this.b);
        sbo sbo = sbo.a;
        if (bundle != null) {
            sbo = sbo.a;
        }
        this.U = this.a.a(sbo);
        this.U.a(knp.a($$Lambda$bXipyF_9Y0e7lUCiy1mJTp1i_wE.INSTANCE, mti));
        return mti.a;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(T, null);
    }

    public final uqm ag() {
        return uqo.T;
    }

    public final gkq aj() {
        return T;
    }

    public final void aw_() {
        this.U.b();
        super.aw_();
    }

    public final String b(Context context) {
        return context.getString(R.string.feed_what_is_new);
    }

    public final String e() {
        return "spotify:feed";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
    }

    public final void z() {
        super.z();
        this.U.c();
    }
}
