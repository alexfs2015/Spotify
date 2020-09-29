package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mzd reason: default package */
public class mzd extends jor implements d, fyw, jol, rfq {
    public shy T;
    public wlc<mzb> U;
    public rfn V;
    public uiz W;
    private boolean X;
    private sih Y;
    private String Z;
    public mzz a;
    private rfo aa;
    public mzv b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public static mzd a(String str, fpt fpt, boolean z, String str2) {
        sih a2 = ViewUris.u.a(str);
        mzd mzd = new mzd();
        Bundle bundle = new Bundle();
        bundle.putParcelable("track_view_uri", a2);
        bundle.putBoolean("is_autoplay", z);
        bundle.putString(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("share_id", str2);
        }
        mzd.g(bundle);
        fpu.a((Fragment) mzd, fpt);
        return mzd;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.b();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.a.b = bundle != null ? bundle.getParcelable("view_state") : null;
    }

    public final void g() {
        super.g();
        this.b.a((nab) this.a, (rfq) this, this.Y.toString(), this.X, this.W.n(), this.Z, uos.a(p().getResources().getString(R.string.on_demand_share_education_label), CrashReportManager.TIME_WINDOW).c(R.color.white).b(R.color.black).a());
    }

    public final void z() {
        super.z();
        this.T.a();
    }

    public final void A() {
        this.T.b();
        super.A();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("view_state", this.a.a.a());
    }

    public final void h() {
        super.h();
        this.b.a.c();
    }

    public final String b(Context context) {
        return context.getString(R.string.track_default_title);
    }

    public final String e() {
        return PageIdentifiers.FREE_TIER_TRACK.name();
    }

    public final udr ag() {
        return udt.ae;
    }

    public final sih ae_() {
        return this.Y;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FREE_TIER_TRACK, null);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void a(rfo rfo) {
        this.aa = rfo;
        c(true);
        ez.a((Activity) fay.a(p()));
    }

    public final void a(fyt fyt) {
        if (this.aa != null) {
            this.V.a(this.Y.toString(), fyt, this.aa, rfs.o().a(((Context) fay.a(n())).getString(R.string.track_default_title)).a(SpotifyIconV2.TRACK).b(true).c(true).d(true).a());
        }
    }

    public final void a(Context context) {
        this.Y = (sih) ((Bundle) fay.a(this.i)).getParcelable("track_view_uri");
        String str = "is_autoplay";
        this.X = ((Bundle) fay.a(this.i)).getBoolean(str, false);
        String str2 = "share_id";
        this.Z = this.i.getString(str2);
        super.a(context);
        this.i.remove(str);
        if (!TextUtils.isEmpty(str2)) {
            this.i.remove(str2);
        }
    }
}
