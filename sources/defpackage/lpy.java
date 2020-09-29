package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.internal.CallbackManagerImpl;
import com.spotify.music.R;
import java.util.Collection;

/* renamed from: lpy reason: default package */
public class lpy extends jrd implements b {
    public ftm T;
    public kk U;
    public waq V;
    public qoo W;
    private akm X = new CallbackManagerImpl();
    private boolean Y;
    private View Z;
    public saf a;
    public a b;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        a();
    }

    public static lpy ae() {
        return new lpy();
    }

    private void af() {
        any a2 = this.a.a();
        a2.a(this.X, (ako<aoa>) this.b);
        a2.a((Fragment) this, (Collection<String>) saf.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            af();
        } else {
            a();
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = (View) fbp.a(layoutInflater.inflate(R.layout.fragment_sso_login, viewGroup, false));
        this.Z = view.findViewById(R.id.logging_in);
        return view;
    }

    public final void a() {
        this.V.a();
        if (v()) {
            this.U.c();
        } else {
            this.Y = true;
        }
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.X.a(i, i2, intent);
        if (p() != null && i2 == 0) {
            a();
        }
    }

    public final void a(OnClickListener onClickListener, OnClickListener onClickListener2) {
        this.T.a(a((int) R.string.disable_offline_mode_dialog_title), a((int) R.string.disable_offline_mode_dialog_body)).b(a((int) R.string.disable_offline_mode_dialog_button_cancel), onClickListener).a(a((int) R.string.disable_offline_mode_dialog_button_connect), onClickListener2).a().a();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle == null) {
            af();
        }
    }

    public final void aP_() {
        super.aP_();
        this.b.a((b) this);
    }

    public final void as_() {
        if (p() != null && u()) {
            qoo qoo = this.W;
            $$Lambda$lpy$4BWc42onUPWQECTaxPeo547XNK8 r6 = new $$Lambda$lpy$4BWc42onUPWQECTaxPeo547XNK8(this);
            qoo.a(R.string.facebook_error_dialog_title, qoo.a.getString(R.string.facebook_error_dialog_body), 17039370, 0, r6);
            qoo.b.a(gbr.a((gbo) new l(), (gbj) new b()));
        }
    }

    public final void b() {
        this.Z.setVisibility(0);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.Y = false;
    }

    public final void c() {
        this.Z.setVisibility(8);
    }

    public final void e() {
        if (p() != null && u()) {
            qoo qoo = this.W;
            $$Lambda$lpy$6PKTjPM9N2pdqjXEwdG4OPM0Vjw r6 = new $$Lambda$lpy$6PKTjPM9N2pdqjXEwdG4OPM0Vjw(this);
            l lVar = new l();
            qoo.a(R.string.error_dialog_no_network_title, qoo.a.getString(R.string.error_dialog_no_network_body), R.string.choose_username_alert_retry, R.string.choose_username_alert_close, r6);
            qoo.b.a(gbr.a((gbo) lVar, (gbj) new c()));
        }
    }

    public final void z() {
        super.z();
        if (this.Y) {
            this.U.c();
            this.Y = false;
        }
    }
}
