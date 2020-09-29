package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lrs reason: default package */
public class lrs extends jrd implements d, fzq, jqx, uqq, vaz {
    private static final sso Z = sso.a("spotify:empty");
    public lsr T;
    public jpc U;
    public jos V;
    public ToolbarMenuHelper W;
    public jyx X;
    public jtz Y;
    public lrt a;
    private sso aa = Z;
    private lss ab;
    public lsq b;

    public static lrs a(String str, String str2, String str3, boolean z, fqn fqn) {
        sso a2 = ViewUris.aI.a((String) fbp.a(str));
        Bundle bundle = new Bundle();
        bundle.putParcelable("album_uri", (Parcelable) fbp.a(a2));
        bundle.putString("title", str2);
        bundle.putString("autoplay_track_uri", str3);
        bundle.putBoolean("autoplay", z);
        lrs lrs = new lrs();
        lrs.g(bundle);
        fqo.a((Fragment) lrs, (fqn) fbp.a(fqn));
        return lrs;
    }

    public static boolean b(Intent intent) {
        return intent != null && intent.hasExtra("album_uri");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        lst lst = new lst((Context) fbp.a(p()), this.aa, this, this.U, this.V, this.W, this.X, this.Y);
        this.ab = lst;
        lrt lrt = this.a;
        lrt.i = (lss) fbp.a(this.ab);
        lrt.i.a((lsd) lrt);
        lrt.i.b();
        return this.ab.a();
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
        lsq lsq = this.b;
        lsr lsr = this.T;
        lrt lrt = this.a;
        lsl b2 = lrt.e != null ? lrt.e.b() : null;
        if (b2 != null) {
            fzn.b(b2.b());
            fzn.c(b2.c());
            fzn.a(b2.d(), SpotifyIconV2.ALBUM, false, b2.e());
            lsr.b(fzn, b2.f(), b2.c());
            lsr.a(fzn, b2);
            if (lsq.a.a()) {
                lsr.a(fzn, b2.a(), b2.b());
            }
            lsr.a(fzn, b2.a());
            lsr.b(fzn, b2);
            lsr.c(fzn, b2);
        }
        lrt lrt2 = this.a;
        if (lrt2.e != null) {
            lrt2.i.a(fzn);
        }
    }

    public final void aP_() {
        super.aP_();
        lrt lrt = this.a;
        lrt.f = lrt.d();
        lrt.h = lrt.f();
        lrt.g = lrt.e();
        lrt.d.a((a) lrt.c);
        lrt.d.a();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        if (this.aa.equals(Z)) {
            this.aa = (sso) fbp.a(this.i.getParcelable("album_uri"));
        }
        return this.aa;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.ALBUM, null);
    }

    public final uqm ag() {
        return uqo.b;
    }

    public final gkq aj() {
        return PageIdentifiers.ALBUM;
    }

    public final Uri at_() {
        return Uri.parse(this.aa.toString());
    }

    public final void aw_() {
        super.aw_();
        lrt lrt = this.a;
        lrt.e = null;
        lrt.i.f();
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aa = ae_();
        c(true);
    }

    public final String e() {
        return this.aa.toString();
    }

    public final void h() {
        lrt lrt = this.a;
        lrt.f.unsubscribe();
        lrt.h.unsubscribe();
        lrt.g.unsubscribe();
        lrt.d.b(lrt.c);
        lrt.d.b();
        super.h();
    }
}
