package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.music.libs.ageverification.AgeVerificationDialogActivity;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: rww reason: default package */
public class rww extends jry implements a {
    private BroadcastReceiver T = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            rww.this.a.b(intent);
            rww.this.b = uly.a((umh) intent.getParcelableExtra("extra_dialog_view_model"), ulz.a((CharSequence) ""));
            rww.this.Y.a((jry) rww.this);
        }
    };
    protected mip a;
    /* access modifiers changed from: private */
    public uly b;

    public static rww e() {
        return new rww();
    }

    public final void A() {
        super.A();
        this.a.a(this.T);
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final sso ae_() {
        return ViewUris.S;
    }

    public final void c() {
        super.c();
        startActivityForResult(AgeVerificationDialogActivity.a(n(), this.b), this.Z);
    }

    public final void z() {
        super.z();
        this.a.a(this.T, new IntentFilter("com.spotify.music.internal.intent.view.AGE_VERIFICATION_DIALOG"));
    }
}
