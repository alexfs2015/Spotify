package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.FacebookException;

/* renamed from: amp reason: default package */
public final class amp extends ke {
    public Dialog T;

    static /* synthetic */ void a(amp amp, Bundle bundle) {
        kf p = amp.p();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        p.setResult(-1, intent);
        p.finish();
    }

    /* access modifiers changed from: private */
    public void a(Bundle bundle, FacebookException facebookException) {
        kf p = p();
        p.setResult(facebookException == null ? -1 : 0, anf.a(p.getIntent(), bundle, facebookException));
        p.finish();
    }

    public final Dialog a(Bundle bundle) {
        if (this.T == null) {
            a((Bundle) null, (FacebookException) null);
            this.a = false;
        }
        return this.T;
    }

    public final void aw_() {
        if (this.b != null && this.C) {
            this.b.setDismissMessage(null);
        }
        super.aw_();
    }

    public final void b(Bundle bundle) {
        anm anm;
        super.b(bundle);
        if (this.T == null) {
            kf p = p();
            Bundle b = anf.b(p.getIntent());
            String str = "FacebookDialogFragment";
            if (!b.getBoolean("is_fallback", false)) {
                String string = b.getString("action");
                Bundle bundle2 = b.getBundle("params");
                if (ank.a(string)) {
                    ank.b(str, "Cannot start a WebDialog with an empty/missing 'actionName'");
                    p.finish();
                    return;
                }
                a aVar = new a(p, string, bundle2);
                aVar.c = new c() {
                    public final void a(Bundle bundle, FacebookException facebookException) {
                        amp.this.a(bundle, facebookException);
                    }
                };
                anm = aVar.a();
            } else {
                String string2 = b.getString("url");
                if (ank.a(string2)) {
                    ank.b(str, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    p.finish();
                    return;
                }
                anm = ams.a(p, string2, String.format("fb%s://bridge/", new Object[]{akq.k()}));
                anm.b = new c() {
                    public final void a(Bundle bundle, FacebookException facebookException) {
                        amp.a(amp.this, bundle);
                    }
                };
            }
            this.T = anm;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.T instanceof anm) && v()) {
            ((anm) this.T).a();
        }
    }

    public final void z() {
        super.z();
        Dialog dialog = this.T;
        if (dialog instanceof anm) {
            ((anm) dialog).a();
        }
    }
}
