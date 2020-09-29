package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.magiclink.setpassword.MagiclinkSetPasswordActivity;
import com.spotify.music.R;

/* renamed from: gnu reason: default package */
public class gnu extends eyt {
    public gog T;
    private a U;

    /* renamed from: gnu$a */
    public interface a {
        void f_(int i);
    }

    public final int aa_() {
        return R.style.MagicLinkBottomSheetDialogTheme;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final Dialog a(Bundle bundle) {
        eys eys = new eys(o(), R.style.MagicLinkBottomSheetDialogTheme);
        View inflate = LayoutInflater.from(o()).inflate(R.layout.magic_link_welcome_dialog, null);
        String string = ((Bundle) fay.a(this.i)).getString("arg_oneTimeToken", null);
        this.T.a(goa.a(new d()));
        inflate.findViewById(R.id.button_set_password).setOnClickListener(new $$Lambda$gnu$1JEmdg_KTxmodplGEXo6r8ylUAI(this, string));
        inflate.findViewById(R.id.button_not_now).setOnClickListener(new $$Lambda$gnu$SubjO1In1X8kK2zSI1_esCrC1LI(this));
        eys.setContentView(inflate);
        return eys;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        this.T.a(goa.a(new d(), new f(), new c()));
        startActivityForResult(MagiclinkSetPasswordActivity.a(view.getContext(), str), 567);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.T.a(goa.a(new d(), new f(), new c()));
        c();
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == 567) {
            a aVar = this.U;
            if (aVar != null) {
                if (i2 == -1) {
                    aVar.f_(1);
                } else if (intent != null) {
                    if ("REASON_TOKEN_EXPIRED".equals(intent.getStringExtra("REASON"))) {
                        this.U.f_(2);
                    }
                }
            }
            c();
        }
    }

    public static void a(kf kfVar, String str, a aVar) {
        gnu gnu = new gnu();
        Bundle bundle = new Bundle();
        bundle.putString("arg_oneTimeToken", str);
        gnu.g(bundle);
        gnu.a(kfVar, "magiclink_bottom_sheet_dialog");
        gnu.U = aVar;
    }

    public static void a(kf kfVar, a aVar) {
        Fragment a2 = kfVar.a("magiclink_bottom_sheet_dialog");
        if (a2 != null) {
            ((gnu) a2).U = aVar;
        }
    }
}
