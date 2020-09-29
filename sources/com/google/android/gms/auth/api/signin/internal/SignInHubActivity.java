package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

public class SignInHubActivity extends ka {
    private static boolean g = false;
    private boolean h = false;
    private SignInConfiguration i;
    private boolean j;
    /* access modifiers changed from: private */
    public int k;
    /* access modifiers changed from: private */
    public Intent l;

    class a implements defpackage.ly.a<Void> {
        private a() {
        }

        public final mb<Void> a() {
            return new bme(SignInHubActivity.this, bsh.a());
        }

        public final /* synthetic */ void a(mb mbVar, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.k, SignInHubActivity.this.l);
            SignInHubActivity.this.finish();
        }

        /* synthetic */ a(SignInHubActivity signInHubActivity, byte b) {
            this();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            c(12500);
            return;
        }
        String str = "com.google.android.gms.auth.GOOGLE_SIGN_IN";
        String str2 = "AuthSignInClient";
        if (action.equals(str) || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String str3 = "config";
            this.i = (SignInConfiguration) intent.getBundleExtra(str3).getParcelable(str3);
            if (this.i == null) {
                Log.e(str2, "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                this.j = bundle.getBoolean("signingInGoogleApiClients");
                if (this.j) {
                    this.k = bundle.getInt("signInResultCode");
                    this.l = (Intent) bundle.getParcelable("signInResultData");
                    f();
                }
            } else if (g) {
                setResult(0);
                c(12502);
            } else {
                g = true;
                Intent intent2 = new Intent(action);
                if (action.equals(str)) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra(str3, this.i);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.h = true;
                    c(17);
                }
            }
        } else {
            String str4 = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            Log.e(str2, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.j);
        if (this.j) {
            bundle.putInt("signInResultCode", this.k);
            bundle.putParcelable("signInResultData", this.l);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.h) {
            setResult(0);
            if (i2 == 40962) {
                if (intent != null) {
                    String str = "signInAccount";
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(str);
                    if (signInAccount == null || signInAccount.a == null) {
                        String str2 = "errorCode";
                        if (intent.hasExtra(str2)) {
                            int intExtra = intent.getIntExtra(str2, 8);
                            if (intExtra == 13) {
                                intExtra = 12501;
                            }
                            c(intExtra);
                            return;
                        }
                    } else {
                        GoogleSignInAccount googleSignInAccount = signInAccount.a;
                        bml.a(this).a(this.i.a, googleSignInAccount);
                        intent.removeExtra(str);
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.j = true;
                        this.k = i3;
                        this.l = intent;
                        f();
                        return;
                    }
                }
                c(8);
            }
        }
    }

    private final void c(int i2) {
        Status status = new Status(i2);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        g = false;
    }

    private final void f() {
        ly.a(this).a(0, null, new a(this, 0));
        g = false;
    }
}
