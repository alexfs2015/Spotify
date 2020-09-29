package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: upr reason: default package */
public class upr extends jrd implements a, upt, uqq {
    private uqf T;
    private b<uqa, upy> U;
    public ups a;
    public uqg b;

    public static String b(Context context) {
        return context.getResources().getString(R.string.social_listening_participant_list_title);
    }

    public static upr e() {
        return new upr();
    }

    public final void A() {
        super.A();
        this.U.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        uqg uqg = this.b;
        this.T = new uqf((LayoutInflater) uqg.a(layoutInflater, 1), viewGroup, (upp) uqg.a(uqg.a.get(), 3), (upd) uqg.a(uqg.b.get(), 4));
        if (this.U == null) {
            a d = uqa.a.d();
            ups ups = this.a;
            this.U = knc.a(ups.a(), d.a(), knm.a());
        }
        this.U.a(this.T);
        return this.T.a;
    }

    public final void ae() {
        q().onBackPressed();
    }

    public final sso ae_() {
        return ViewUris.cb;
    }

    public void af() {
        q().finish();
    }

    public final gkq aj() {
        return PageIdentifiers.SOCIAL_LISTENING_PARTICIPANTLIST;
    }

    public final void aw_() {
        super.aw_();
        this.U.b();
        this.T = null;
    }

    public final void z() {
        super.z();
        this.U.c();
    }
}
