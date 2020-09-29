package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.FacebookException;

/* renamed from: amb reason: default package */
public final class amb extends jz {
    public Dialog T;

    public final void b(Bundle bundle) {
        amy amy;
        super.b(bundle);
        if (this.T == null) {
            ka p = p();
            Bundle b = amr.b(p.getIntent());
            String str = "FacebookDialogFragment";
            if (!b.getBoolean("is_fallback", false)) {
                String string = b.getString("action");
                Bundle bundle2 = b.getBundle("params");
                if (amw.a(string)) {
                    amw.b(str, "Cannot start a WebDialog with an empty/missing 'actionName'");
                    p.finish();
                    return;
                }
                a aVar = new a(p, string, bundle2);
                aVar.c = new c() {
                    public final void a(Bundle bundle, FacebookException facebookException) {
                        amb.this.a(bundle, facebookException);
                    }
                };
                amy = aVar.a();
            } else {
                String string2 = b.getString("url");
                if (amw.a(string2)) {
                    amw.b(str, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    p.finish();
                    return;
                }
                amy = ame.a(p, string2, String.format("fb%s://bridge/", new Object[]{akc.k()}));
                amy.b = new c() {
                    public final void a(Bundle bundle, FacebookException facebookException) {
                        amb.a(amb.this, bundle);
                    }
                };
            }
            this.T = amy;
        }
    }

    public final Dialog a(Bundle bundle) {
        if (this.T == null) {
            a((Bundle) null, (FacebookException) null);
            this.a = false;
        }
        return this.T;
    }

    public final void z() {
        super.z();
        Dialog dialog = this.T;
        if (dialog instanceof amy) {
            ((amy) dialog).a();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.T instanceof amy) && v()) {
            ((amy) this.T).a();
        }
    }

    /* access modifiers changed from: private */
    public void a(Bundle bundle, FacebookException facebookException) {
        ka p = p();
        p.setResult(facebookException == null ? -1 : 0, amr.a(p.getIntent(), bundle, facebookException));
        p.finish();
    }

    public final void ax_() {
        if (this.b != null && this.C) {
            this.b.setDismissMessage(null);
        }
        super.ax_();
    }

    static /* synthetic */ void a(amb amb, Bundle bundle) {
        ka p = amb.p();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        p.setResult(-1, intent);
        p.finish();
    }
}
