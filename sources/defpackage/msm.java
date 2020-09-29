package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: msm reason: default package */
public class msm extends jor implements d, fyw, jol, rfq, udv {
    public mvi T;
    public wlc<msn> U;
    public rfn V;
    public rfs W;
    public ljw X;
    private final a Y = new a();
    private rfo Z;
    public String a;
    private boolean aa;
    private fyt ab;
    public mvq b;

    /* renamed from: msm$a */
    public class a {
        public a() {
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public static msm a(String str, fpt fpt, boolean z) {
        return a(str, fpt, false, null);
    }

    public static msm a(String str, fpt fpt, boolean z, String str2) {
        ViewUris.aJ.a(str);
        msm msm = new msm();
        Bundle bundle = new Bundle();
        bundle.putString("album_view_uri", str);
        bundle.putString("autoplay_track_uri", str2);
        bundle.putBoolean("is_autoplay_uri", z);
        msm.g(bundle);
        fpu.a((Fragment) msm, fpt);
        return msm;
    }

    public final void a(Context context) {
        super.a(context);
        this.i.remove("is_autoplay_uri");
        this.i.remove("autoplay_track_uri");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.T.b();
        return this.b.b.e();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.b.c = bundle != null ? bundle.getParcelable("view_state") : null;
    }

    public final void g() {
        this.X.a();
        super.g();
        this.T.a(this.b, this);
        this.aa = true;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("view_state", this.b.a.a());
    }

    public final void h() {
        super.h();
        this.T.a();
        this.aa = false;
        this.X.b();
    }

    public final String b(Context context) {
        return context.getString(R.string.album_title_default);
    }

    public final gjf aj() {
        return PageIdentifiers.FREE_TIER_ALBUM;
    }

    public final String e() {
        return PageIdentifiers.FREE_TIER_ALBUM.name();
    }

    public final udr ag() {
        return udt.X;
    }

    public final sih ae_() {
        return ViewUris.aJ.a(this.a);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FREE_TIER_ALBUM, null);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        rfo rfo = this.Z;
        if (rfo != null) {
            this.V.a(this.a, fyt, rfo, this.W);
            this.ab = fyt;
        }
    }

    public final void a(rfo rfo) {
        this.Z = rfo;
        c(true);
        ez.a(p());
    }
}
