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

/* renamed from: nqc reason: default package */
public class nqc extends jz implements OnClickListener, jol, b, a, udv {
    public a T;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static nqc ah() {
        return new nqc();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        a(false);
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final Dialog a(Bundle bundle) {
        Context context = (Context) fay.a(n());
        p a = new a(context, 2132017711).a(LayoutInflater.from(context).inflate(R.layout.fragment_language_picker_no_skip_dialog, null)).a(R.string.skip_dialog_continue, this).a();
        this.T.a();
        return a;
    }

    public final void g() {
        super.g();
        this.T.a(this);
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

    public final udr ag() {
        return udt.H;
    }

    public final sih ae_() {
        return ViewUris.P;
    }

    public final gjf aj() {
        return PageIdentifiers.LANGUAGEPICKER_NOSKIPDIALOG;
    }

    public final String e() {
        return udt.H.a();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.LANGUAGEPICKER_NOSKIPDIALOG, ViewUris.P.toString());
    }
}
