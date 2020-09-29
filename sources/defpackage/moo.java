package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: moo reason: default package */
public class moo extends jor implements jol, udv {
    private static final gjf T = new gjf() {
        public final String a() {
            return "feed";
        }
    };
    private b<rsh, rsc> U;
    public rrp a;
    public Picasso b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "spotify:feed";
    }

    public static moo c() {
        return new moo();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        moz moz = new moz(layoutInflater, viewGroup, this.b);
        rsh rsh = rsh.a;
        if (bundle != null) {
            rsh = rsh.a;
        }
        this.U = this.a.a(rsh);
        this.U.a(kkg.a($$Lambda$kkWhHk17PtbUF7YNXa7Ss0t4.INSTANCE, moz));
        return moz.a;
    }

    public final void z() {
        super.z();
        this.U.c();
    }

    public final void A() {
        this.U.d();
        super.A();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
    }

    public final void ax_() {
        this.U.b();
        super.ax_();
    }

    public final String b(Context context) {
        return context.getString(R.string.feed_what_is_new);
    }

    public final rdh af() {
        return rdh.a(T, null);
    }

    public final udr ag() {
        return udt.T;
    }

    public final gjf aj() {
        return T;
    }
}
