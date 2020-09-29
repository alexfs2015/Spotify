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

/* renamed from: gpj reason: default package */
public class gpj extends ezk {
    public gpv T;
    private a U;

    /* renamed from: gpj$a */
    public interface a {
        void f_(int i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        this.T.a(gpp.a(new d(), new f(), new c()));
        startActivityForResult(MagiclinkSetPasswordActivity.a(view.getContext(), str), 567);
    }

    public static void a(kk kkVar, a aVar) {
        Fragment a2 = kkVar.a("magiclink_bottom_sheet_dialog");
        if (a2 != null) {
            ((gpj) a2).U = aVar;
        }
    }

    public static void a(kk kkVar, String str, a aVar) {
        gpj gpj = new gpj();
        Bundle bundle = new Bundle();
        bundle.putString("arg_oneTimeToken", str);
        gpj.g(bundle);
        gpj.a(kkVar, "magiclink_bottom_sheet_dialog");
        gpj.U = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.T.a(gpp.a(new d(), new f(), new c()));
        c();
    }

    public final Dialog a(Bundle bundle) {
        ezj ezj = new ezj(o(), R.style.MagicLinkBottomSheetDialogTheme);
        View inflate = LayoutInflater.from(o()).inflate(R.layout.magic_link_welcome_dialog, null);
        String string = ((Bundle) fbp.a(this.i)).getString("arg_oneTimeToken", null);
        this.T.a(gpp.a(new d()));
        inflate.findViewById(R.id.button_set_password).setOnClickListener(new $$Lambda$gpj$QxzGPRLqe1jcOIlTLouzlBKfCNM(this, string));
        inflate.findViewById(R.id.button_not_now).setOnClickListener(new $$Lambda$gpj$X77oDgo69SZu1jtinpXzEpUd4t4(this));
        ezj.setContentView(inflate);
        return ezj;
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

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final int aa_() {
        return R.style.MagicLinkBottomSheetDialogTheme;
    }
}
