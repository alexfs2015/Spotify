package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: prh reason: default package */
public class prh extends jrd implements jqx, a, uqq {
    public pqj T;
    public lbr U;
    private b<prr, prp> V;
    public prj a;
    public prv b;

    /* renamed from: prh$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_FOLLOWERS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_FOLLOWING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST_OVERVIEW     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_ARTISTS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.prh.AnonymousClass1.<clinit>():void");
        }
    }

    public static prh b(String str) {
        prh prh = new prh();
        pri.b(prh).putString("uri", str);
        return prh;
    }

    public final void A() {
        super.A();
        this.V.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pru pru = new pru((LayoutInflater) prv.a(layoutInflater, 1), viewGroup, (ppy) prv.a(this.b.a.get(), 3));
        pqi a2 = this.T.a(pri.a(this));
        prr prr = bundle != null ? (prr) bundle.getParcelable("KEY_STATE") : null;
        if (prr == null) {
            prr = prr.d.d().a(a2.a()).a();
        }
        this.U.a(this, a2.a());
        this.V = knc.a(this.a.a(a2), prr, knm.a());
        this.V.a(pru);
        return pru.a;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return sso.a(pri.a(this));
    }

    public final rmf af() {
        int i = AnonymousClass1.a[jva.a(pri.a(this)).b.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? rmf.a(PageIdentifiers.UNKNOWN, null) : rmf.a(PageIdentifiers.PROFILE_ARTISTS, null) : rmf.a(PageIdentifiers.PROFILE_PLAYLISTS, null) : rmf.a(PageIdentifiers.PROFILE_FOLLOWING, null) : rmf.a(PageIdentifiers.PROFILE_FOLLOWERS, null);
    }

    public final uqm ag() {
        return uqo.be;
    }

    public final gkq aj() {
        int i = AnonymousClass1.a[jva.a(pri.a(this)).b.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? PageIdentifiers.UNKNOWN : PageIdentifiers.PROFILE_ARTISTS : PageIdentifiers.PROFILE_PLAYLISTS : PageIdentifiers.PROFILE_FOLLOWING : PageIdentifiers.PROFILE_FOLLOWERS;
    }

    public final void aw_() {
        super.aw_();
        this.V.b();
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return sso.a(pri.a(this)).toString();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("KEY_STATE", (Parcelable) this.V.e());
    }

    public final void z() {
        super.z();
        this.V.c();
    }
}
