package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lsa reason: default package */
public class lsa extends jor implements jol, a {
    public String T;
    public String U;
    public lts a;
    public ltm b;

    /* renamed from: lsa$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ALBUM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.ARTIST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lsa.AnonymousClass1.<clinit>():void");
        }
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public static lsa a(String str, String str2, fpt fpt) {
        lsa lsa = new lsa();
        fpu.a((Fragment) lsa, fpt);
        Bundle bundle = (Bundle) fay.a(lsa.i);
        bundle.putString("key_ac_search_uri", str);
        bundle.putString("key_ac_search_title", str2);
        lsa.g(bundle);
        return lsa;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.b.e();
    }

    public final void g() {
        super.g();
        this.b.a(this.a);
    }

    public final void h() {
        super.h();
        ltm ltm = this.b;
        ltm.a.unsubscribe();
        ltm.b = null;
    }

    public final String b(Context context) {
        return this.U;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("assisted-curation-search-entity:");
        sb.append(this.T);
        return sb.toString();
    }

    public final udr ag() {
        return udt.k;
    }

    public final sih ae_() {
        String string = ((Bundle) fay.a(this.i)).getString("key_ac_search_uri");
        int i = AnonymousClass1.a[jst.a(string).b.ordinal()];
        if (i == 1) {
            return ViewUris.E;
        }
        if (i == 2) {
            return ViewUris.F;
        }
        if (lrz.a(string)) {
            return ViewUris.F;
        }
        StringBuilder sb = new StringBuilder("Bad uri: ");
        sb.append(string);
        throw new RuntimeException(sb.toString());
    }

    public final rdh af() {
        String string = ((Bundle) fay.a(this.i)).getString("key_ac_search_uri");
        int i = AnonymousClass1.a[jst.a(string).b.ordinal()];
        if (i == 1) {
            return rdh.a(PageIdentifiers.ASSISTED_CURATION_SEARCH_ALBUM_ENTITY, null);
        }
        if (i == 2) {
            return rdh.a(PageIdentifiers.ASSISTED_CURATION_SEARCH_ARTIST_ENTITY, null);
        }
        if (lrz.a(string)) {
            return rdh.a(PageIdentifiers.ASSISTED_CURATION_SEARCH_ARTIST_ENTITY, null);
        }
        StringBuilder sb = new StringBuilder("Bad uri: ");
        sb.append(string);
        throw new RuntimeException(sb.toString());
    }
}
