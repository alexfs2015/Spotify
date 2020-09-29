package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: koi reason: default package */
public class koi extends sin implements jol {
    public kov a;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "anchor-funnel-landing-page";
    }

    public static koi b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        koi koi = new koi();
        koi.g(bundle);
        return koi;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.ANCHORFUNNEL, null);
    }

    public final udr ag() {
        return udt.c;
    }

    public final boolean a(Uri uri) {
        kov kov = this.a;
        if (!(uri.toString().startsWith("https://play.google.com/store/apps/details?") && uri.getQueryParameterNames().contains("id"))) {
            return false;
        }
        kov.a.handleIntent(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    public final void ah() {
        d((String) fay.a(((Bundle) fay.a(this.i, (Object) "AnchorFunnelLandingPageFragment started without arguments")).getString("url"), (Object) "AnchorFunnelLandingPageFragment arguments are missing URL parameter"));
    }
}
