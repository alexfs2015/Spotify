package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.music.libs.ageverification.AgeVerificationDialogActivity;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: rnq reason: default package */
public class rnq extends jpm implements a {
    private BroadcastReceiver T = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            rnq.this.a.b(intent);
            rnq.this.b = tzd.a((tzm) intent.getParcelableExtra("extra_dialog_view_model"), tze.a((CharSequence) ""));
            rnq.this.Y.a((jpm) rnq.this);
        }
    };
    protected ueb a;
    /* access modifiers changed from: private */
    public tzd b;

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void z() {
        super.z();
        this.a.a(this.T, new IntentFilter("com.spotify.music.internal.intent.view.AGE_VERIFICATION_DIALOG"));
    }

    public final void A() {
        super.A();
        this.a.a(this.T);
    }

    public final void c() {
        super.c();
        startActivityForResult(AgeVerificationDialogActivity.a(n(), this.b), this.Z);
    }

    public static rnq e() {
        return new rnq();
    }

    public final sih ae_() {
        return ViewUris.T;
    }
}
