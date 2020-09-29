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

/* renamed from: nek reason: default package */
public class nek extends jrd implements d, fzq, jqx, ros {
    public ssf T;
    public wzi<nei> U;
    public rop V;
    public uuk W;
    private boolean X;
    private sso Y;
    private String Z;
    public nfg a;
    private roq aa;
    public nfc b;

    public static nek a(String str, fqn fqn, boolean z, String str2) {
        sso a2 = ViewUris.t.a(str);
        nek nek = new nek();
        Bundle bundle = new Bundle();
        bundle.putParcelable("track_view_uri", a2);
        bundle.putBoolean("is_autoplay", z);
        bundle.putString(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY, str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("share_id", str2);
        }
        nek.g(bundle);
        fqo.a((Fragment) nek, fqn);
        return nek;
    }

    public final void A() {
        this.T.b();
        super.A();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.b();
    }

    public final void a(Context context) {
        this.Y = (sso) ((Bundle) fbp.a(this.i)).getParcelable("track_view_uri");
        String str = "is_autoplay";
        this.X = ((Bundle) fbp.a(this.i)).getBoolean(str, false);
        String str2 = "share_id";
        this.Z = this.i.getString(str2);
        super.a(context);
        this.i.remove(str);
        if (!TextUtils.isEmpty(str2)) {
            this.i.remove(str2);
        }
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        if (this.aa != null) {
            this.V.a(this.Y.toString(), fzn, this.aa, rou.o().a(((Context) fbp.a(n())).getString(R.string.track_default_title)).a(SpotifyIconV2.TRACK).b(true).c(true).d(true).a());
        }
    }

    public final void a(roq roq) {
        this.aa = roq;
        c(true);
        ez.a((Activity) fbp.a(p()));
    }

    public final void aP_() {
        super.aP_();
        this.b.a((nfi) this.a, (ros) this, this.Y.toString(), this.X, this.W.n(), this.Z, uzy.a(p().getResources().getString(R.string.on_demand_share_education_label), CrashReportManager.TIME_WINDOW).c(R.color.white).b(R.color.black).a());
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return this.Y;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FREE_TIER_TRACK, null);
    }

    public final uqm ag() {
        return uqo.ae;
    }

    public final String b(Context context) {
        return context.getString(R.string.track_default_title);
    }

    public final String e() {
        return PageIdentifiers.FREE_TIER_TRACK.name();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("view_state", this.a.a.a());
    }

    public final void h() {
        super.h();
        this.b.a.c();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.a.b = bundle != null ? bundle.getParcelable("view_state") : null;
    }

    public final void z() {
        super.z();
        this.T.a();
    }
}
