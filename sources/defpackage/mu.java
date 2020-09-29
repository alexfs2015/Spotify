package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: mu reason: default package */
public final class mu extends ke {
    private boolean T = false;
    private Dialog U;
    private nh V;

    public mu() {
        a(true);
    }

    private nh ae() {
        af();
        return this.V;
    }

    private void af() {
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
            this.U = new mz(n());
            ((mz) this.U).a(ae());
        } else {
            this.U = new mt(n());
            ((mt) this.U).a(ae());
        }
        return this.U;
    }

    public final void a(nh nhVar) {
        if (nhVar != null) {
            af();
            if (!this.V.equals(nhVar)) {
                this.V = nhVar;
                Bundle bundle = this.i;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", nhVar.a);
                g(bundle);
                Dialog dialog = this.U;
                if (dialog != null) {
                    if (this.T) {
                        ((mz) dialog).a(nhVar);
                        return;
                    }
                    ((mt) dialog).a(nhVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
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
                ((mz) dialog).a();
            } else {
                ((mt) dialog).a();
            }
        }
    }
}
