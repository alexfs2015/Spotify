package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;

/* renamed from: mli reason: default package */
public class mli extends jor implements NavigationItem, jol, mln, a, udv {
    private mlv T;
    public mll a;
    public mlx b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "data-saver-mode-settings";
    }

    public final void a(boolean z) {
        this.T.a(z);
    }

    public final void a(boolean z, boolean z2) {
        mlw mlw = this.T.a;
        gbr<Boolean> gbr = mlw.b;
        mlw.b = null;
        mlw.a.setChecked(z);
        if (!z2) {
            mlw.a.jumpDrawablesToCurrentState();
        }
        mlw.b = gbr;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new mlv((Context) fay.a(n()), viewGroup, this.b).getView();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.T = (mlv) fqf.a(view, mlv.class);
        mlw mlw = this.T.a;
        mll mll = this.a;
        mll.getClass();
        mlw.b = new $$Lambda$RcUBladbmwYgUM3bgSFfoXzoKys(mll);
    }

    public final void g() {
        super.g();
        this.a.a((mln) this);
    }

    public final void h() {
        mll mll = this.a;
        mll.a.bf_();
        mll.b = null;
        super.h();
    }

    public final sih ae_() {
        return ViewUris.O;
    }

    public final gjf aj() {
        return PageIdentifiers.DATASAVERMODE_SETTINGS;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FREE_TIER_HOME;
    }

    public final String b(Context context) {
        return context.getString(R.string.data_saver_mode_settings_title);
    }

    public final udr ag() {
        return udt.K;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.DATASAVERMODE_SETTINGS, null);
    }
}
