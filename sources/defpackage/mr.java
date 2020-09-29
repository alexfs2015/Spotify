package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: mr reason: default package */
public final class mr extends jz {
    private boolean T = false;
    private Dialog U;
    private nc V;

    public mr() {
        a(true);
    }

    private void ae() {
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
            ae();
            if (!this.V.equals(ncVar)) {
                this.V = ncVar;
                Bundle bundle = this.i;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", ncVar.a);
                g(bundle);
                Dialog dialog = this.U;
                if (dialog != null && this.T) {
                    ((mv) dialog).a(ncVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final Dialog a(Bundle bundle) {
        if (this.T) {
            this.U = new mv(n());
            ((mv) this.U).a(this.V);
        } else {
            this.U = new mq(n());
        }
        return this.U;
    }

    public final void h() {
        super.h();
        Dialog dialog = this.U;
        if (dialog != null && !this.T) {
            ((mq) dialog).f(false);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.U;
        if (dialog != null) {
            if (this.T) {
                ((mv) dialog).a();
                return;
            }
            ((mq) dialog).a();
        }
    }
}
