package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: mw reason: default package */
public final class mw extends ke {
    private boolean T = false;
    private Dialog U;
    private nh V;

    public mw() {
        a(true);
    }

    private void ae() {
        if (this.V == null) {
            Bundle bundle = this.i;
            if (bundle != null) {
                this.V = nh.a(bundle.getBundle("selector"));
            }
            if (this.V == null) {
                this.V = nh.c;
            }
        }
    }

    public final Dialog a(Bundle bundle) {
        if (this.T) {
            this.U = new na(n());
            ((na) this.U).a(this.V);
        } else {
            this.U = new mv(n());
        }
        return this.U;
    }

    public final void a(nh nhVar) {
        if (nhVar != null) {
            ae();
            if (!this.V.equals(nhVar)) {
                this.V = nhVar;
                Bundle bundle = this.i;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", nhVar.a);
                g(bundle);
                Dialog dialog = this.U;
                if (dialog != null && this.T) {
                    ((na) dialog).a(nhVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void h() {
        super.h();
        Dialog dialog = this.U;
        if (dialog != null && !this.T) {
            ((mv) dialog).f(false);
        }
    }

    public final void i(boolean z) {
        if (this.U == null) {
            this.T = z;
            return;
        }
        throw new IllegalStateException("This must be called before creating dialog");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.U;
        if (dialog != null) {
            if (this.T) {
                ((na) dialog).a();
                return;
            }
            ((mv) dialog).a();
        }
    }
}
