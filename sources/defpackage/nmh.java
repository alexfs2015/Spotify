package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
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
import com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity.a;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.music.spotlets.voice.VoiceInteractionReferral;

/* renamed from: nmh reason: default package */
public class nmh extends jrd implements d, NavigationItem, fzq, jqx, szs, uqq {
    public ssl T;
    public wzi<nmf> U;
    public szp V;
    public ToolbarMenuHelper W;
    public jxz X;
    public uvu Y;
    public gfk<fli> Z;
    public fqn a;
    public jtz aa;
    public iil ab;
    public ibq ac;
    public SpSharedPreferences<Object> ad;
    private final sso ae = ViewUris.e;
    public njy b;

    /* renamed from: nmh$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[VoiceMicPermissionABFlag.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag[] r0 = com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag r1 = com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag.SINGLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag r1 = com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag.DOUBLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag r1 = com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag.CONTROL     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag r1 = com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag.AD     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nmh.AnonymousClass1.<clinit>():void");
        }
    }

    public static nmh a(fqn fqn, String str, String str2, String str3) {
        nmh nmh = new nmh();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        if (!fbo.a(str2)) {
            bundle.putString("space-id", str2);
        }
        if (!fbo.a(str3)) {
            bundle.putString("redirect_uri", str3);
        }
        nmh.g(bundle);
        fqo.a((Fragment) nmh, fqn);
        return nmh;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        a(false);
    }

    private void a(boolean z) {
        this.ab.a((Fragment) this);
        this.Z.a(VoiceAdLog.k().a("mic_permission_deny").a(this.aa.a()).b(z ? "deny_system_prompt" : "deny_custom_prompt").g());
    }

    private void al() {
        this.X.a(1, this, Sets.a((E[]) new String[]{"android.permission.RECORD_AUDIO"}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        al();
    }

    public final void A() {
        super.A();
        this.T.b();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.b.b();
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == 1 && i2 == -1) {
            a a2 = PermissionsRequestActivity.a(intent);
            if (a2 != null) {
                if (a2.a()) {
                    this.ad.a().a(uwd.a, true).b();
                    this.Y.a(p(), this.a, VoiceInteractionReferral.UNKNOWN.name(), null);
                    this.Z.a(VoiceAdLog.k().a("mic_permission_accept").a(this.aa.a()).b("").g());
                    return;
                }
                a(true);
            }
        }
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        this.W.a(this.ae, fzn, this.V);
    }

    public final void aP_() {
        super.aP_();
        this.b.a();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return this.ae;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.FREE_TIER_HOME, null);
    }

    public final uqm ag() {
        return uqo.aa;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FREE_TIER_HOME;
    }

    public final boolean ai() {
        return true;
    }

    public final gkq aj() {
        return PageIdentifiers.FREE_TIER_HOME;
    }

    public final boolean ak() {
        this.b.b.f();
        return true;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
        if (((Boolean) this.a.a(hyn.a)).booleanValue() && this.ac.c.a(ibq.b, true) && VERSION.SDK_INT >= 23 && !this.X.a((Context) p(), "android.permission.RECORD_AUDIO")) {
            int i = AnonymousClass1.a[((VoiceMicPermissionABFlag) this.a.a(hyn.p)).ordinal()];
            if (i == 1) {
                this.ac.a(false);
                al();
            } else if (i == 2) {
                this.ac.a(false);
                a aVar = new a(p());
                aVar.a.d = aVar.a.a.getText(R.string.voice_permission_prompt_title);
                aVar.a.f = aVar.a.a.getText(R.string.voice_permission_prompt_body);
                a b2 = aVar.a(R.string.voice_permission_prompt_button_positive, new $$Lambda$nmh$YTxtcATGKgpTLqJD2KVvzPxdc(this)).b(R.string.voice_permission_prompt_button_negative, new $$Lambda$nmh$Fmcz4IWR2JLCAyhU0SEVUTix2pk(this));
                b2.a.k = false;
                b2.b();
            }
        }
    }

    public final String e() {
        return PageIdentifiers.FREE_TIER_HOME.name();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.b.b(bundle);
    }

    public final void h() {
        super.h();
        this.b.a.a();
    }

    public final void j(Bundle bundle) {
        super.j(bundle);
        this.b.a(bundle);
    }

    public final void z() {
        super.z();
        this.T.a();
    }
}
