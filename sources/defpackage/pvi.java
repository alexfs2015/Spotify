package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import io.reactivex.Flowable;

/* renamed from: pvi reason: default package */
public class pvi extends jor implements NavigationItem, jol, a {
    public gur T;
    public gum U;
    public gup V;
    public rda W;
    public qat X;
    public String a;
    public boolean b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.T.e();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle != null) {
            bundle.setClassLoader(q().getClassLoader());
            Parcelable parcelable = (Parcelable) fay.a(bundle.getParcelable("search_drilldown_state"));
            qat qat = this.X;
            Parcelable parcelable2 = (Parcelable) fay.a(parcelable);
            if (parcelable2 instanceof rri) {
                rri rri = (rri) parcelable2;
                qat.g = rri.a;
                gzz a2 = qat.h.a(qat.g);
                if (a2 != null) {
                    qat.a.a(a2, false);
                }
                qat.a.a(rri.b);
            }
            qat.j = (gzz) qat.a.d.a();
        }
    }

    public final void e(Bundle bundle) {
        qat qat = this.X;
        qat.h.a(qat.g, (gzz) qat.a.d.a());
        bundle.putParcelable("search_drilldown_state", new rri(qat.g, qat.a.a()));
        super.e(bundle);
    }

    public final void g() {
        super.g();
        qat qat = this.X;
        qat.b.a();
        qat.b.a(qat.a);
        qat qat2 = this.X;
        qat2.i.c();
        Flowable a2 = qat2.f.a(qat2.e, (sdf) qat2);
        sed sed = qat2.d;
        sec sec = new sec((Flowable) sed.a(sed.a.get(), 1), (Flowable) sed.a(sed.b.get(), 2), (Flowable) sed.a(a2, 3));
        qat2.a(Flowable.a((wrf<? extends T>) sec.c, (wrf<? extends T>) sec.a, (wrf<? extends T>) sec.b));
    }

    public final void h() {
        super.h();
        this.X.i.c();
        qat qat = this.X;
        qat.b.b();
        qat.b.b(qat.a);
        this.X.c.d();
    }

    public final String e() {
        return ae_().toString();
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FIND;
    }

    public final udr ag() {
        return this.b ? udt.j : udt.aN;
    }

    public final sih ae_() {
        return ViewUris.ai.a(this.a);
    }

    public final rdh af() {
        return rdh.a((a) this.W);
    }
}
