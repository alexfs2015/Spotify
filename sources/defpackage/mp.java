package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: mp reason: default package */
public final class mp extends jz {
    private boolean T = false;
    private Dialog U;
    private nc V;

    public mp() {
        a(true);
    }

    private nc ae() {
        af();
        return this.V;
    }

    private void af() {
        if (this.V == null) {
            Bundle bundle = this.i;
            if (bundle != null) {
                this.V = nc.a(bundle.getBundle("selector"));
            }
            if (this.V == null) {
                this.V = nc.c;
            }
        }
    }

    public final void i(boolean z) {
        if (this.U == null) {
            this.T = z;
            return;
        }
        throw new IllegalStateException("This must be called before creating dialog");
    }

    public final void a(nc ncVar) {
        if (ncVar != null) {
            af();
            if (!this.V.equals(ncVar)) {
                this.V = ncVar;
                Bundle bundle = this.i;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", ncVar.a);
                g(bundle);
                Dialog dialog = this.U;
                if (dialog != null) {
                    if (this.T) {
                        ((mu) dialog).a(ncVar);
                        return;
                    }
                    ((mo) dialog).a(ncVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final Dialog a(Bundle bundle) {
        if (this.T) {
            this.U = new mu(n());
            ((mu) this.U).a(ae());
        } else {
            this.U = new mo(n());
            ((mo) this.U).a(ae());
        }
        return this.U;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.U;
        if (dialog != null) {
            if (this.T) {
                ((mu) dialog).a();
            } else {
                ((mo) dialog).a();
            }
        }
    }
}
