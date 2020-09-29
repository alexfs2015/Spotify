package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.music.R;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import java.util.Collection;

/* renamed from: lly reason: default package */
public class lly extends jor implements aka<anm>, b {
    public fss T;
    public kf U;
    public vnk V;
    public qfz W;
    private ajy X = new CallbackManagerImpl();
    private boolean Y;
    private View Z;
    public rqu a;
    public a b;

    public static lly ae() {
        return new lly();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.Y = false;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = (View) fay.a(layoutInflater.inflate(R.layout.fragment_sso_login, viewGroup, false));
        this.Z = view.findViewById(R.id.logging_in);
        return view;
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (bundle == null) {
            af();
        }
    }

    public final void g() {
        super.g();
        this.b.a((b) this);
    }

    public final void z() {
        super.z();
        if (this.Y) {
            this.U.c();
            this.Y = false;
        }
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.X.a(i, i2, intent);
        if (p() != null && i2 == 0) {
            b();
        }
    }

    private void af() {
        ank a2 = this.a.a();
        a2.a(this.X, (aka<anm>) this);
        a2.a((Fragment) this, (Collection<String>) rqu.b);
    }

    public final void as_() {
        if (p() != null && u()) {
            qfz qfz = this.W;
            $$Lambda$lly$Usc8GB_3amybq_ZncnHfUjTVSq0 r6 = new $$Lambda$lly$Usc8GB_3amybq_ZncnHfUjTVSq0(this);
            ScreenIdentifier screenIdentifier = ScreenIdentifier.START;
            qfz.a(R.string.error_dialog_no_network_title, qfz.b.getString(R.string.error_dialog_no_network_body), R.string.choose_username_alert_retry, R.string.choose_username_alert_close, r6);
            qfz.c.a(screenIdentifier, DialogIdentifier.NO_NETWORK_ERROR);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            af();
        } else {
            b();
        }
    }

    public final void e() {
        if (p() != null && u()) {
            qfz qfz = this.W;
            $$Lambda$lly$8MCYCzy7322FippFUrVCwghh2xM r6 = new $$Lambda$lly$8MCYCzy7322FippFUrVCwghh2xM(this);
            qfz.a(R.string.facebook_error_dialog_title, qfz.b.getString(R.string.facebook_error_dialog_body), 17039370, 0, r6);
            qfz.c.a(ScreenIdentifier.START, DialogIdentifier.FACEBOOK_LOGIN_ERROR);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        b();
    }

    public final void b() {
        this.V.a();
        if (v()) {
            this.U.c();
        } else {
            this.Y = true;
        }
    }

    public final void c() {
        this.Z.setVisibility(0);
    }

    public final void at_() {
        this.Z.setVisibility(8);
    }

    public final void a(OnClickListener onClickListener, OnClickListener onClickListener2) {
        this.T.a(a((int) R.string.disable_offline_mode_dialog_title), a((int) R.string.disable_offline_mode_dialog_body)).b(a((int) R.string.disable_offline_mode_dialog_button_cancel), onClickListener).a(a((int) R.string.disable_offline_mode_dialog_button_connect), onClickListener2).a().a();
    }

    public final void a() {
        b();
    }

    public final void a(FacebookException facebookException) {
        if ("net::ERR_INTERNET_DISCONNECTED".equals(facebookException.getMessage())) {
            this.b.a(SpotifyError.DNS);
        } else {
            this.b.a(SpotifyError.UNKNOWN);
        }
    }

    public final /* synthetic */ void a(Object obj) {
        this.b.b();
    }
}
