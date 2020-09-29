package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: krr reason: default package */
public class krr extends ssu implements jqx {
    public kse a;

    public static krr b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        krr krr = new krr();
        krr.g(bundle);
        return krr;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final boolean a(Uri uri) {
        kse kse = this.a;
        if (!(uri.toString().startsWith("https://play.google.com/store/apps/details?") && uri.getQueryParameterNames().contains("id"))) {
            return false;
        }
        kse.a.handleIntent(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.ANCHORFUNNEL, null);
    }

    public final uqm ag() {
        return uqo.c;
    }

    public final void ah() {
        d((String) fbp.a(((Bundle) fbp.a(this.i, (Object) "AnchorFunnelLandingPageFragment started without arguments")).getString("url"), (Object) "AnchorFunnelLandingPageFragment arguments are missing URL parameter"));
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "anchor-funnel-landing-page";
    }
}
