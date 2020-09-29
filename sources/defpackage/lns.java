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

/* renamed from: lns reason: default package */
public class lns extends jor implements d, fyw, jol, udv, upu {
    private static final sih X = sih.a("spotify:empty");
    public lor T;
    public jmq U;
    public jmg V;
    public ToolbarMenuHelper W;
    private sih Y = X;
    private los Z;
    public lnt a;
    public loq b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static lns a(String str, String str2, String str3, boolean z, fpt fpt) {
        sih a2 = ViewUris.aJ.a((String) fay.a(str));
        Bundle bundle = new Bundle();
        bundle.putParcelable("album_uri", (Parcelable) fay.a(a2));
        bundle.putString("title", str2);
        bundle.putString("autoplay_track_uri", str3);
        bundle.putBoolean("autoplay", z);
        lns lns = new lns();
        lns.g(bundle);
        fpu.a((Fragment) lns, (fpt) fay.a(fpt));
        return lns;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.Y = ae_();
        c(true);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        lot lot = new lot((Context) fay.a(p()), this.Y, this, this.U, this.V, this.W);
        this.Z = lot;
        lnt lnt = this.a;
        lnt.i = (los) fay.a(this.Z);
        lnt.i.a((lod) lnt);
        lnt.i.b();
        return this.Z.a();
    }

    public final void g() {
        super.g();
        lnt lnt = this.a;
        lnt.f = lnt.d();
        lnt.h = lnt.f();
        lnt.g = lnt.e();
        lnt.d.a((a) lnt.c);
        lnt.d.a();
    }

    public final void h() {
        lnt lnt = this.a;
        lnt.f.unsubscribe();
        lnt.h.unsubscribe();
        lnt.g.unsubscribe();
        lnt.d.b(lnt.c);
        lnt.d.b();
        super.h();
    }

    public final void ax_() {
        super.ax_();
        lnt lnt = this.a;
        lnt.e = null;
        lnt.i.f();
    }

    public final Uri au_() {
        return Uri.parse(this.Y.toString());
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        loq loq = this.b;
        lor lor = this.T;
        lnt lnt = this.a;
        lol b2 = lnt.e != null ? lnt.e.b() : null;
        if (b2 != null) {
            fyt.b(b2.b());
            fyt.c(b2.c());
            fyt.a(b2.d(), SpotifyIconV2.ALBUM, false, b2.e());
            lor.b(fyt, b2.f(), b2.c());
            lor.a(fyt, b2);
            if (loq.a.a()) {
                lor.a(fyt, b2.a(), b2.b());
            }
            lor.a(fyt, b2.a());
            lor.b(fyt, b2);
            lor.c(fyt, b2);
        }
        lnt lnt2 = this.a;
        if (lnt2.e != null) {
            lnt2.i.a(fyt);
        }
    }

    public final sih ae_() {
        if (this.Y.equals(X)) {
            this.Y = (sih) fay.a(this.i.getParcelable("album_uri"));
        }
        return this.Y;
    }

    public final String e() {
        return this.Y.toString();
    }

    public final udr ag() {
        return udt.b;
    }

    public final gjf aj() {
        return PageIdentifiers.ALBUM;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.ALBUM, null);
    }

    public static boolean b(Intent intent) {
        return intent != null && intent.hasExtra("album_uri");
    }
}
