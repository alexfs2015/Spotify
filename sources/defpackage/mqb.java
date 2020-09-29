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

/* renamed from: mqb reason: default package */
public class mqb extends jrd implements NavigationItem, jqx, mqg, a, uqq {
    private mqo T;
    public mqe a;
    public mqq b;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new mqo((Context) fbp.a(n()), viewGroup, this.b).getView();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.T = (mqo) fqz.a(view, mqo.class);
        mqp mqp = this.T.a;
        mqe mqe = this.a;
        mqe.getClass();
        mqp.b = new $$Lambda$KUf14XmDH576co58Mz3R4zfDzY(mqe);
    }

    public final void a(boolean z) {
        this.T.a(z);
    }

    public final void a(boolean z, boolean z2) {
        mqp mqp = this.T.a;
        gcp<Boolean> gcp = mqp.b;
        mqp.b = null;
        mqp.a.setChecked(z);
        if (!z2) {
            mqp.a.jumpDrawablesToCurrentState();
        }
        mqp.b = gcp;
    }

    public final void aP_() {
        super.aP_();
        this.a.a((mqg) this);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.N;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.DATASAVERMODE_SETTINGS, null);
    }

    public final uqm ag() {
        return uqo.K;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FREE_TIER_HOME;
    }

    public final gkq aj() {
        return PageIdentifiers.DATASAVERMODE_SETTINGS;
    }

    public final String b(Context context) {
        return context.getString(R.string.data_saver_mode_settings_title);
    }

    public final String e() {
        return "data-saver-mode-settings";
    }

    public final void h() {
        mqe mqe = this.a;
        mqe.a.bd_();
        mqe.b = null;
        super.h();
    }
}
