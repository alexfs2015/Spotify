package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.effortlesslogin.EffortlessLoginActivity;
import com.spotify.music.R;

/* renamed from: gek reason: default package */
public class gek extends ezk {
    public gbp T;
    private Optional<a> U = Optional.e();

    /* renamed from: gek$a */
    public interface a {
        void a();
    }

    private void a(a aVar) {
        this.U = Optional.b(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        this.T.a(gbr.a(new i(), new l(), new j()));
        startActivityForResult(EffortlessLoginActivity.a(o(), str), 11533);
    }

    public static void a(kk kkVar, a aVar) {
        Fragment a2 = kkVar.a("EffortlessLoginBottomSheetDialog");
        if (a2 != null) {
            ((gek) a2).a(aVar);
        }
    }

    public static void a(kk kkVar, String str, a aVar) {
        gek gek = new gek();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        gek.g(bundle);
        gek.a(kkVar, "EffortlessLoginBottomSheetDialog");
        gek.a(aVar);
    }

    private void ae() {
        this.T.a(gbr.a(new i(), new k(), new j()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        ae();
        c();
    }

    public final Dialog a(Bundle bundle) {
        this.T.a(gbr.a((gbo) new i()));
        String string = this.i != null ? this.i.getString("username") : null;
        ezj ezj = new ezj(o(), R.style.EffortlessLoginBottomSheetDialogTheme);
        View inflate = LayoutInflater.from(o()).inflate(R.layout.effortless_login_dialog, null);
        TextView textView = (TextView) inflate.findViewById(R.id.textview_username);
        if (string != null) {
            textView.setText(Html.fromHtml(String.format(o().getResources().getString(R.string.effortlesslogin_username), new Object[]{string})));
        } else {
            textView.setVisibility(8);
        }
        ((Button) inflate.findViewById(R.id.button_positive)).setOnClickListener(new $$Lambda$gek$sWdYy7pXPHTIJ_wyYuWCBST06zU(this, string));
        ((Button) inflate.findViewById(R.id.button_negative)).setOnClickListener(new $$Lambda$gek$DLUAjkn7nFpRjMGMmopixaOtPyk(this));
        ezj.setContentView(inflate);
        return ezj;
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == 11533 && i2 == -1 && this.U.b()) {
            ((a) this.U.c()).a();
        }
        c();
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final int aa_() {
        return R.style.EffortlessLoginBottomSheetDialogTheme;
    }

    public void onCancel(DialogInterface dialogInterface) {
        ae();
        super.onCancel(dialogInterface);
    }
}
