package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Suppliers;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.spotify.music.R;

/* renamed from: prw reason: default package */
public class prw extends jrd implements d, fzq, jqx, uqq {
    public fzt T;
    public ToolbarMenuHelper U;
    public utg V;
    public izh W;
    public szp X;
    private b<psg, pse> Y;
    private final fbu<sso> Z = Suppliers.a((fbu<T>) new $$Lambda$prw$xUIo0AKSDqPVoXMu52SOoC6v4vc<T>(this));
    public prx a;
    public pso b;

    public static jqx a(String str, String str2, fqn fqn) {
        Bundle bundle = new Bundle();
        bundle.putString("key_profile_uri", str);
        bundle.putString("key_current_username", str2);
        prw prw = new prw();
        prw.g(bundle);
        fqo.a((Fragment) prw, fqn);
        return prw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ah() {
        psg psg = (psg) this.Y.e();
        String r = psg.r();
        int i = psg.k() ? R.string.share_to_external_profile_own_message : R.string.share_to_external_profile_others_message;
        this.W.a(ae_().toString(), !TextUtils.isEmpty(psg.c()) ? Uri.parse(psg.c()) : Uri.EMPTY, (String) null, r, "", a(i), jqg.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ai() {
        this.X.a("spotify:findfriends");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ sso ak() {
        return sso.a((String) fbp.a(this.i.getString("key_profile_uri")));
    }

    public final void A() {
        super.A();
        this.Y.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c(true);
        psg psg = bundle != null ? (psg) bundle.getParcelable("KEY_STATE") : null;
        if (psg == null) {
            String decode = Uri.decode(jva.a((String) fbp.a(this.i.getString("key_profile_uri"))).c());
            psg = psg.p.p().a(decode).d(decode.equals(Uri.decode(this.i.getString("key_current_username")))).a();
        }
        pso pso = this.b;
        psn psn = new psn((Activity) pso.a(pso.a.get(), 1), (LayoutInflater) pso.a(layoutInflater, 2), viewGroup, (BadgesFactory) pso.a(pso.b.get(), 4), (jyx) pso.a(pso.c.get(), 5), pso.d);
        this.Y = knc.a(this.a.a(psg.a()), psg, knm.a());
        this.Y.a(psn);
        return psn.a;
    }

    public final void a(Menu menu) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        boolean z = true;
        fzn.a(utg.a("", ae_().toString(), true), SpotifyIconV2.USER, false, true);
        psg psg = (psg) this.Y.e();
        fzn.b(psg.r());
        if (psg.k()) {
            this.T.g(fzn, new $$Lambda$prw$oQIy2Y3oDfajcfj43dnJfocajuo(this));
        }
        this.T.a(fzn, new $$Lambda$prw$GweRgFoTYjFG0UIpSUwUddDgKm8(this));
        if (psg.k() || !psg.e() || psg.f().isEmpty()) {
            z = false;
        }
        if (z) {
            this.U.a(fzn, ae_(), psg.f());
        }
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return (sso) this.Z.get();
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PROFILE, null);
    }

    public final uqm ag() {
        return uqo.bd;
    }

    public final gkq aj() {
        return PageIdentifiers.PROFILE;
    }

    public final void aw_() {
        super.aw_();
        this.Y.b();
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return ae_().toString();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("KEY_STATE", (Parcelable) this.Y.e());
    }

    public final void z() {
        super.z();
        this.Y.c();
    }
}
