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

/* renamed from: nro reason: default package */
public class nro extends jor implements gnl, nrw {
    private static final ScreenIdentifier W = ScreenIdentifier.LOGIN;
    public ufm T;
    public fss U;
    public glm V;
    private Button X;
    private EditText Y;
    private EditText Z;
    public a a;
    private TextView aa;
    public ujc b;

    public static nro c() {
        return new nro();
    }

    public static nro b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EMAIL_OR_USERNAME", str);
        nro nro = new nro();
        nro.g(bundle);
        return nro;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle == null) {
            this.b.a(W);
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = (View) fay.a(layoutInflater.inflate(R.layout.fragment_login_sthlm_black, viewGroup, false));
        this.X = (Button) fay.a(view.findViewById(R.id.login_button));
        this.Z = (EditText) fay.a(view.findViewById(R.id.username_text));
        this.Y = (EditText) fay.a(view.findViewById(R.id.password_text));
        this.aa = (TextView) fay.a(view.findViewById(R.id.login_error_message));
        ((Button) view.findViewById(R.id.request_magiclink_lower_button)).setOnClickListener(new $$Lambda$nro$V9OK1fLI8abmUzvVCwcEs5yj_g(this));
        return view;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a(e());
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.Y.setOnEditorActionListener(new $$Lambda$nro$X82t0HBc7Mtf6BfFvckHTi9zK_Q(this));
        this.X.setOnClickListener(new $$Lambda$nro$sLtIKzAHSGH6V1OpqWZXsmhW98(this));
        Bundle bundle2 = this.i;
        String str = "";
        if (bundle2 != null) {
            str = bundle2.getString("EMAIL_OR_USERNAME", str);
        }
        this.Z.setText(str);
        this.a.a((Observable<CharSequence>) fnv.a(this.Z), (Observable<CharSequence>) fnv.a(this.Y));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = keyEvent != null && keyEvent.getKeyCode() == 66;
        boolean z2 = i == 6;
        if (!z && !z2) {
            return false;
        }
        gac.a(this.X);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.V.a("manual_login", (String) null);
        this.a.a(e(), ae());
    }

    public final void A() {
        super.A();
        gac.b(this.Y);
    }

    public void a(boolean z) {
        this.X.setEnabled(z);
    }

    public final void c(String str) {
        this.Z.setText(str);
    }

    public final void d(String str) {
        this.Y.setText(str);
    }

    public final String e() {
        return this.Z.getText().toString();
    }

    public final String ae() {
        return this.Y.getText().toString();
    }

    public final void af() {
        this.U.a(a((int) R.string.login_error_unknown_error)).a(a(17039370), null).a().a();
    }

    public final void ag() {
        this.U.a(a((int) R.string.error_dialog_no_network_title), a((int) R.string.error_dialog_no_network_body)).a(o().getResources().getText(17039370), null).a().a();
    }

    public final void ah() {
        this.U.a(a((int) R.string.disable_offline_mode_dialog_title), a((int) R.string.disable_offline_mode_dialog_body)).b(a((int) R.string.disable_offline_mode_dialog_button_cancel), null).a(a((int) R.string.disable_offline_mode_dialog_button_connect), new $$Lambda$nro$M1CeYowUHtsltoHS3Hs8tjvI_ME(this)).a().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        this.T.a(false);
        gac.a(this.X);
    }

    public final void e(String str) {
        gnx.b(t(), str);
        this.b.a(ScreenIdentifier.LOGIN, DialogIdentifier.RESET_PASSWORD_GET_HELP);
    }

    public final void ai() {
        this.U.a(a((int) R.string.error_login_abroad_restriction)).a(a(17039370), null).a().a();
    }

    public final void d(int i) {
        this.X.setText(i);
    }

    public final void e(int i) {
        this.aa.setText(i);
    }

    public final void aj() {
        this.aa.setText(null);
    }
}
