package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;

/* renamed from: lun reason: default package */
public class lun extends jor implements b, NavigationItem, fyw, jol, spl, udv {
    public gum T;
    public rda U;
    public lzp V;
    public lxx W;
    public rzc X;
    public sie Y;
    public String a;
    public boolean b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static lun a(String str, String str2, String str3, fpt fpt) {
        lun lun = new lun();
        Bundle bundle = lun.i;
        if (bundle == null) {
            bundle = new Bundle();
            lun.g(bundle);
        }
        bundle.putString("username", str2);
        bundle.putString("title", str);
        bundle.putString("view_uri", str3);
        fpu.a((Fragment) lun, fpt);
        a.a((Fragment) lun, rju.w);
        return lun;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(!this.b);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle != null) {
            bundle.setClassLoader(q().getClassLoader());
            Parcelable parcelable = (Parcelable) fay.a(bundle.getParcelable("browse_hubs_state"));
            lxx lxx = this.W;
            fay.a(parcelable);
            Parcelable parcelable2 = (Parcelable) fay.a(parcelable);
            if (parcelable2 instanceof rri) {
                rri rri = (rri) parcelable2;
                gup gup = lxx.c;
                lxx.e = rri.a;
                gzz a2 = lxx.d.a(lxx.e);
                if (a2 != null) {
                    gup.a(a2, false);
                }
                gup.a(rri.b);
            }
        }
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
        super.a(menu, menuInflater);
    }

    public final void a(fyt fyt) {
        this.V.a(fyt);
    }

    public final void z() {
        super.z();
        this.Y.a();
    }

    public final void A() {
        this.Y.b();
        super.A();
    }

    public final void g() {
        super.g();
        this.W.c();
    }

    public final void h() {
        super.h();
        lxx lxx = this.W;
        lxx.b.b();
        lxx.a.c();
    }

    public final void e(Bundle bundle) {
        lxx lxx = this.W;
        gup gup = lxx.c;
        lxx.d.a(lxx.e, (gzz) lxx.c.d.a());
        bundle.putParcelable("browse_hubs_state", new rri(lxx.e, gup.a()));
        super.e(bundle);
    }

    public final boolean ai() {
        return this.b;
    }

    public final boolean ak() {
        if (!this.b) {
            return false;
        }
        this.V.g();
        return true;
    }

    public final boolean aQ_() {
        return this.V.f();
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FIND;
    }

    public final udr ag() {
        return udt.U;
    }

    public final sih ae_() {
        return lzj.b(this.a);
    }

    public final rdh af() {
        return rdh.a((a) this.U);
    }

    public final gjf aj() {
        return lzj.a(this.a);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string = ((Bundle) fay.a(this.i)).getString("username");
        if (!fax.a(string)) {
            this.X.a(string).a();
        }
        return this.V.e();
    }

    public final String e() {
        return lzj.b(this.a).toString();
    }
}
