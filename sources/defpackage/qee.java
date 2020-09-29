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

/* renamed from: qee reason: default package */
public class qee extends jrd implements NavigationItem, jqx, a {
    public gwr T;
    public gwm U;
    public gwp V;
    public rly W;
    public qjr X;
    public String a;
    public boolean b;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.T.e();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle != null) {
            bundle.setClassLoader(q().getClassLoader());
            Parcelable parcelable = (Parcelable) fbp.a(bundle.getParcelable("search_drilldown_state"));
            qjr qjr = this.X;
            Parcelable parcelable2 = (Parcelable) fbp.a(parcelable);
            if (parcelable2 instanceof sap) {
                sap sap = (sap) parcelable2;
                qjr.g = sap.a;
                hcs a2 = qjr.h.a(qjr.g);
                if (a2 != null) {
                    qjr.a.a(a2, false);
                }
                qjr.a.a(sap.b);
            }
            qjr.j = (hcs) qjr.a.d.a();
        }
    }

    public final void aP_() {
        super.aP_();
        qjr qjr = this.X;
        qjr.b.a();
        qjr.b.a(qjr.a);
        qjr qjr2 = this.X;
        qjr2.i.c();
        Flowable a2 = qjr2.f.a(qjr2.e, (snm) qjr2);
        sok sok = qjr2.d;
        soj soj = new soj((Flowable) sok.a(sok.a.get(), 1), (Flowable) sok.a(sok.b.get(), 2), (Flowable) sok.a(a2, 3));
        qjr2.a(Flowable.a((xfk<? extends T>) soj.c, (xfk<? extends T>) soj.a, (xfk<? extends T>) soj.b));
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.ah.a(this.a);
    }

    public final rmf af() {
        return rmf.a((a) this.W);
    }

    public final uqm ag() {
        return this.b ? uqo.j : uqo.aN;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FIND;
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return ae_().toString();
    }

    public final void e(Bundle bundle) {
        qjr qjr = this.X;
        qjr.h.a(qjr.g, (hcs) qjr.a.d.a());
        bundle.putParcelable("search_drilldown_state", new sap(qjr.g, qjr.a.a()));
        super.e(bundle);
    }

    public final void h() {
        super.h();
        this.X.i.c();
        qjr qjr = this.X;
        qjr.b.b();
        qjr.b.b(qjr.a);
        this.X.c.d();
    }
}
