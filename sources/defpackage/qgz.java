package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.music.features.speakercompanion.entityfeedback.EntityFeedbackActivity;
import com.spotify.music.features.speakercompanion.model.EntityFeedback;

/* renamed from: qgz reason: default package */
public class qgz extends jpm implements b {
    private boolean T;
    public a a;
    private Intent b;

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.T = bundle.getBoolean("dialog_queued", false);
        }
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void z() {
        super.z();
        this.a.a(this);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("dialog_queued", this.T);
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.T = false;
    }

    public final void c() {
        super.c();
        Intent intent = this.b;
        if (intent != null) {
            startActivityForResult(intent, this.Z);
        }
    }

    public static qgz a(fpt fpt) {
        qgz qgz = new qgz();
        fpu.a((Fragment) qgz, fpt);
        return qgz;
    }

    public final void a(EntityFeedback entityFeedback) {
        ka p = p();
        if (p != null) {
            this.b = EntityFeedbackActivity.a(p, entityFeedback);
            if (this.Y != null && !this.T) {
                this.T = true;
                this.Y.a((jpm) this);
            }
        }
    }
}
