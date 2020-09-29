package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nwf reason: default package */
public class nwf extends ke implements OnClickListener, jqx, b, a, uqq {
    public a T;

    public static nwf ah() {
        return new nwf();
    }

    public final Dialog a(Bundle bundle) {
        Context context = (Context) fbp.a(n());
        p a = new a(context, 2132017714).a(LayoutInflater.from(context).inflate(R.layout.fragment_language_picker_no_skip_dialog, null)).a(R.string.skip_dialog_continue, this).a();
        this.T.a();
        return a;
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void aP_() {
        super.aP_();
        this.T.a(this);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.O;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.LANGUAGEPICKER_NOSKIPDIALOG, ViewUris.O.toString());
    }

    public final uqm ag() {
        return uqo.H;
    }

    public final gkq aj() {
        return PageIdentifiers.LANGUAGEPICKER_NOSKIPDIALOG;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(false);
    }

    public final String e() {
        return uqo.H.a();
    }

    public final void h() {
        super.h();
        this.T.b();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.T.c();
            return;
        }
        throw new IllegalArgumentException("Unsupported dialog button");
    }
}
