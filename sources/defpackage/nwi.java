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

/* renamed from: nwi reason: default package */
public class nwi extends jor implements jol, udv {
    private b<rsh, rsc> T;
    public rrp a;
    public Picasso b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "spotify:new-release-feed";
    }

    public static nwi a(fpt fpt, String str) {
        nwi nwi = new nwi();
        Bundle bundle = new Bundle();
        bundle.putString("spotify:new-release-feed", str);
        nwi.g(bundle);
        fpu.a((Fragment) nwi, fpt);
        return nwi;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nwq nwq = new nwq(layoutInflater, viewGroup, this.b);
        this.T = this.a.a(rsh.a);
        this.T.a(nwq);
        return nwq.a;
    }

    public final void z() {
        super.z();
        this.T.c();
    }

    public final void A() {
        this.T.d();
        super.A();
    }

    public final void ax_() {
        this.T.b();
        super.ax_();
    }

    public final gjf aj() {
        return PageIdentifiers.NEWRELEASESFEED;
    }

    public final String b(Context context) {
        return context.getString(R.string.new_releases);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.NEWRELEASESFEED, null);
    }

    public final udr ag() {
        return udt.at;
    }
}
