package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.collect.Sets;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.messages.VoiceAdLog;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity.a;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.music.spotlets.voice.VoiceInteractionReferral;

/* renamed from: ngl reason: default package */
public class ngl extends jor implements d, NavigationItem, fyw, jol, spl, udv {
    public sie T;
    public wlc<ngj> U;
    public spi V;
    public ToolbarMenuHelper W;
    public jvr X;
    public ukj Y;
    public gdz<fko> Z;
    public fpt a;
    public jrp aa;
    public ify ab;
    public hze ac;
    public SpSharedPreferences<Object> ad;
    private final sih ae = ViewUris.f;
    public nej b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final boolean ai() {
        return true;
    }

    public final String b(Context context) {
        return "";
    }

    public static ngl a(fpt fpt, String str, String str2, String str3) {
        ngl ngl = new ngl();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        if (!fax.a(str2)) {
            bundle.putString("space-id", str2);
        }
        if (!fax.a(str3)) {
            bundle.putString("redirect_uri", str3);
        }
        ngl.g(bundle);
        fpu.a((Fragment) ngl, fpt);
        return ngl;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
        if (((Boolean) this.a.a(hwb.a)).booleanValue() && this.ac.c.a(hze.b, true) && !TextUtils.equals((CharSequence) this.a.a(hwb.p), "Control") && VERSION.SDK_INT >= 23) {
            this.ac.c.a().a(hze.b, false).a();
            if (!this.X.a((Context) p(), "android.permission.RECORD_AUDIO")) {
                String str = (String) this.a.a(hwb.p);
                if (TextUtils.equals(str, "SINGLE")) {
                    al();
                } else if (TextUtils.equals(str, "DOUBLE")) {
                    a aVar = new a(p());
                    aVar.a.d = aVar.a.a.getText(R.string.voice_permission_prompt_title);
                    aVar.a.f = aVar.a.a.getText(R.string.voice_permission_prompt_body);
                    a b2 = aVar.a(R.string.voice_permission_prompt_button_positive, new $$Lambda$ngl$kLYMCQw0XkTdNOBP782bF2fQ884(this)).b(R.string.voice_permission_prompt_button_negative, new $$Lambda$ngl$jSRyuk1T1NboiO8UIrd7nLqI410(this));
                    b2.a.k = false;
                    b2.b();
                }
            }
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.b.b();
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void g() {
        super.g();
        this.b.a();
    }

    public final void z() {
        super.z();
        this.T.a();
    }

    public final void A() {
        super.A();
        this.T.b();
    }

    public final void h() {
        super.h();
        this.b.a.a();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.b.a(bundle);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.b.b(bundle);
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FREE_TIER_HOME;
    }

    public final String e() {
        return PageIdentifiers.FREE_TIER_HOME.name();
    }

    public final udr ag() {
        return udt.aa;
    }

    public final gjf aj() {
        return PageIdentifiers.FREE_TIER_HOME;
    }

    public final sih ae_() {
        return this.ae;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FREE_TIER_HOME, null);
    }

    public final boolean ak() {
        this.b.b.f();
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        al();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        a(false);
    }

    private void al() {
        this.X.a(1, this, Sets.a((E[]) new String[]{"android.permission.RECORD_AUDIO"}));
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == 1 && i2 == -1) {
            a a2 = PermissionsRequestActivity.a(intent);
            if (a2 != null) {
                if (a2.a()) {
                    this.ad.a().a(ukz.a, true).b();
                    this.Y.a(p(), this.a, VoiceInteractionReferral.UNKNOWN.name(), null);
                    this.Z.a(VoiceAdLog.k().a("mic_permission_accept").a(this.aa.a()).b("").g());
                    return;
                }
                a(true);
            }
        }
    }

    private void a(boolean z) {
        ify.a((Fragment) this);
        this.Z.a(VoiceAdLog.k().a("mic_permission_deny").a(this.aa.a()).b(z ? "second" : "first").g());
    }

    public final void a(fyt fyt) {
        this.W.a(this.ae, fyt, this.V);
    }
}
