package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: ucw reason: default package */
public class ucw extends jor implements a, ucy, udv {
    private udk T;
    private b<udf, udd> U;
    public ucx a;
    public udl b;

    public static ucw e() {
        return new ucw();
    }

    public static String b(Context context) {
        return context.getResources().getString(R.string.social_listening_participant_list_title);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        udl udl = this.b;
        this.T = new udk((LayoutInflater) udl.a(layoutInflater, 1), viewGroup, (ucu) udl.a(udl.a.get(), 3), (uci) udl.a(udl.b.get(), 4));
        if (this.U == null) {
            a d = udf.a.d();
            ucx ucx = this.a;
            this.U = kjt.a(ucx.a(), d.a(), kkd.a());
        }
        this.U.a(this.T);
        return this.T.a;
    }

    public final void ax_() {
        super.ax_();
        this.U.b();
        this.T = null;
    }

    public final void z() {
        super.z();
        this.U.c();
    }

    public final void A() {
        super.A();
        this.U.d();
    }

    public final void ae() {
        q().onBackPressed();
    }

    public void af() {
        q().finish();
    }

    public final sih ae_() {
        return ViewUris.cc;
    }

    public final gjf aj() {
        return PageIdentifiers.SOCIAL_LISTENING_PARTICIPANTLIST;
    }
}
