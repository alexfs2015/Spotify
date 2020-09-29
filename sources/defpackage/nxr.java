package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.Observable;

/* renamed from: nxr reason: default package */
public class nxr extends jrd implements gpa, nxz {
    private static final ScreenIdentifier W = ScreenIdentifier.LOGIN;
    public ura T;
    public ftm U;
    public gnb V;
    private Button X;
    private EditText Y;
    private EditText Z;
    public a a;
    private TextView aa;
    public uun b;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        this.T.a(false);
        gaw.a(this.X);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = keyEvent != null && keyEvent.getKeyCode() == 66;
        boolean z2 = i == 6;
        if (!z && !z2) {
            return false;
        }
        gaw.a(this.X);
        return true;
    }

    public static nxr b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EMAIL_OR_USERNAME", str);
        nxr nxr = new nxr();
        nxr.g(bundle);
        return nxr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.V.a("manual_login", (String) null);
        this.a.a(e(), ae());
    }

    public static nxr c() {
        return new nxr();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a(e());
    }

    public final void A() {
        super.A();
        gaw.b(this.Y);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = (View) fbp.a(layoutInflater.inflate(R.layout.fragment_login_sthlm_black, viewGroup, false));
        this.X = (Button) fbp.a(view.findViewById(R.id.login_button));
        this.Z = (EditText) fbp.a(view.findViewById(R.id.username_text));
        this.Y = (EditText) fbp.a(view.findViewById(R.id.password_text));
        this.aa = (TextView) fbp.a(view.findViewById(R.id.login_error_message));
        ((Button) view.findViewById(R.id.request_magiclink_lower_button)).setOnClickListener(new $$Lambda$nxr$tAbErWld4Mu7FpIV9LKeg8EoEN8(this));
        return view;
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.Y.setOnEditorActionListener(new $$Lambda$nxr$8EejCg3fPhNsplcbo0GJqNBDaw(this));
        this.X.setOnClickListener(new $$Lambda$nxr$E7Y7Dk1PGuvMkEzFXbEN4zpgIs(this));
        Bundle bundle2 = this.i;
        String str = "";
        if (bundle2 != null) {
            str = bundle2.getString("EMAIL_OR_USERNAME", str);
        }
        this.Z.setText(str);
        this.a.a((Observable<CharSequence>) fop.a(this.Z), (Observable<CharSequence>) fop.a(this.Y));
    }

    public void a(boolean z) {
        this.X.setEnabled(z);
    }

    public final String ae() {
        return this.Y.getText().toString();
    }

    public final void af() {
        this.U.a(a((int) R.string.login_error_unknown_error)).a(a(17039370), null).a().a();
    }

    public final void ag() {
        this.U.a(a((int) R.string.disable_offline_mode_dialog_title), a((int) R.string.disable_offline_mode_dialog_body)).b(a((int) R.string.disable_offline_mode_dialog_button_cancel), null).a(a((int) R.string.disable_offline_mode_dialog_button_connect), new $$Lambda$nxr$d51KkA0GmQHMgvPhrEjImJ92VrQ(this)).a().a();
    }

    public final void ah() {
        this.U.a(a((int) R.string.error_login_abroad_restriction)).a(a(17039370), null).a().a();
    }

    public final void ai() {
        this.aa.setText(null);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle == null) {
            this.b.a(W);
        }
    }

    public final void c(String str) {
        this.Z.setText(str);
    }

    public final void d(int i) {
        this.X.setText(i);
    }

    public final void d(String str) {
        this.Y.setText(str);
    }

    public final String e() {
        return this.Z.getText().toString();
    }

    public final void e(int i) {
        this.aa.setText(i);
    }

    public final void e(String str) {
        gpm.b(t(), str);
        this.b.a(ScreenIdentifier.LOGIN, DialogIdentifier.RESET_PASSWORD_GET_HELP);
    }
}
