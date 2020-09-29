package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class AdActivity extends Activity {
    private ccz a;

    private final void a() {
        ccz ccz = this.a;
        if (ccz != null) {
            try {
                ccz.l();
            } catch (RemoteException e) {
                cpn.b("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.a.a(i, i2, intent);
        } catch (Exception e) {
            cpn.b("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.a != null) {
                z = this.a.e();
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.a.a(cbj.a(configuration));
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dpw b = dqe.b();
        Intent intent = getIntent();
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        boolean z = false;
        if (!intent.hasExtra(str)) {
            cpn.a("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra(str, false);
        }
        this.a = (ccz) dpw.a((Context) this, z, (a<T>) new dqd<T>(b, this));
        ccz ccz = this.a;
        String str2 = "#007 Could not call remote method.";
        if (ccz == null) {
            e = null;
        } else {
            try {
                ccz.a(bundle);
                return;
            } catch (RemoteException e) {
                e = e;
            }
        }
        cpn.b(str2, e);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.a != null) {
                this.a.k();
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.a != null) {
                this.a.i();
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.a != null) {
                this.a.f();
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.a != null) {
                this.a.h();
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.a != null) {
                this.a.b(bundle);
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.a != null) {
                this.a.g();
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.a != null) {
                this.a.j();
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
