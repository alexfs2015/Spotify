package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.view.WindowManager.BadTokenException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.Credential.a;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.ResolvableApiException;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

/* renamed from: waq reason: default package */
public final class waq {
    public gbo a;
    public wau b;
    private final kf c;
    private final gbp d;
    private final bso e;
    private bmh f;

    public waq(kf kfVar, bso bso) {
        this(kfVar, bso, new gbq());
    }

    public waq(kf kfVar, bso bso, gbp gbp) {
        this.a = new l();
        this.c = kfVar;
        this.e = bso;
        this.d = gbp;
        int a2 = this.e.a((Context) kfVar);
        this.d.a(gbr.a(this.a, (gbt) new a(a2)));
        if (a2 == 0) {
            this.f = new bmh((Activity) kfVar, (a) new a().b().a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ResolvableApiException resolvableApiException, wau wau, DialogInterface dialogInterface, int i) {
        this.d.a(gbr.a(this.a, new n(), new i()));
        try {
            resolvableApiException.a(this.c, 1002);
            this.d.a(gbr.a(this.a, (gbt) new q()));
        } catch (SendIntentException e2) {
            this.d.a(gbr.a(this.a, (gbt) new p()));
            wau.ar_();
            Assertion.b("Failed to start smartlock save credentials resolution", (Throwable) e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(exz exz) {
        if (exz.b()) {
            this.d.a(gbr.a(this.a, (gbt) new c()));
        } else {
            this.d.a(gbr.a(this.a, (gbt) new b()));
        }
    }

    private void a(wau wau, Credential credential) {
        if (b(credential)) {
            this.d.a(gbr.a(this.a, (gbt) new i()));
            wau.a(credential);
            return;
        }
        this.d.a(gbr.a(this.a, (gbt) new d()));
        wau.d();
        if (credential != null) {
            a(credential);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wau wau, String str, exz exz) {
        if (exz.b()) {
            wau.ar_();
            this.d.a(gbr.a(this.a, (gbt) new r()));
            return;
        }
        Exception e2 = exz.e();
        if (e2 instanceof ResolvableApiException) {
            ResolvableApiException resolvableApiException = (ResolvableApiException) e2;
            this.b = wau;
            if (resolvableApiException.a() == 6) {
                try {
                    if (!this.c.isFinishing()) {
                        ftl a2 = "https://www.facebook.com".equals(str) ? fts.a(this.c, this.c.getString(R.string.smartlock_nudge_heading_facebook), this.c.getString(R.string.smartlock_nudge_body_facebook)) : fts.a(this.c, this.c.getString(R.string.smartlock_nudge_heading_spotify), this.c.getString(R.string.smartlock_nudge_body_spotify));
                        this.d.a(gbr.a(this.a, (gbj) new i()));
                        a2.e = false;
                        a2.a(this.c.getString(R.string.smartlock_nudge_cta), new $$Lambda$waq$IznW303QcIGTXT5ghgmdbreQOPs(this, resolvableApiException, wau)).a().a();
                    }
                } catch (BadTokenException e3) {
                    Assertion.b("Failed to show smartlock nudge dialog as Activity is dead", (Throwable) e3);
                }
            } else {
                try {
                    resolvableApiException.a(this.c, 1002);
                    this.d.a(gbr.a(this.a, (gbt) new q()));
                } catch (SendIntentException e4) {
                    this.d.a(gbr.a(this.a, (gbt) new p()));
                    wau.ar_();
                    Assertion.b("Failed to start smartlock save credentials resolution", (Throwable) e4);
                }
            }
        } else {
            wau.ar_();
            this.d.a(gbr.a(this.a, (gbt) new p()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wau wau, boolean z, exz exz) {
        if (exz.b()) {
            Credential credential = null;
            bme bme = (bme) exz.d();
            if (bme != null) {
                credential = bme.a();
            }
            a(wau, credential);
            return;
        }
        Exception e2 = exz.e();
        if (!(e2 instanceof ResolvableApiException)) {
            wau.d();
            this.d.a(gbr.a(this.a, (gbt) new e()));
        } else if (!z) {
            Logger.e(e2, "Smartlock - failed to retrieve credentials", new Object[0]);
            this.d.a(gbr.a(this.a, (gbt) new g()));
            wau.d();
        } else {
            ResolvableApiException resolvableApiException = (ResolvableApiException) e2;
            if (resolvableApiException.a() == 6) {
                try {
                    this.b = wau;
                    resolvableApiException.a(this.c, 1001);
                    this.d.a(gbr.a(this.a, (gbt) new f()));
                } catch (SendIntentException e3) {
                    this.d.a(gbr.a(this.a, (gbt) new e()));
                    wau.d();
                    Assertion.b("Failed to start smartlock save credentials resolution", (Throwable) e3);
                }
            } else if (resolvableApiException.a() == 4) {
                this.d.a(gbr.a(this.a, (gbt) new h()));
                wau.d();
            } else {
                StringBuilder sb = new StringBuilder("Unhandled smartlock resolution: ");
                sb.append(resolvableApiException.a());
                Assertion.b(sb.toString(), (Throwable) e2);
                this.d.a(gbr.a(this.a, (gbt) new e()));
                wau.d();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String[] strArr, wau wau, boolean z, exz exz) {
        if (exz.b()) {
            a aVar = new a();
            if (strArr == null) {
                strArr = new String[0];
            }
            aVar.b = strArr;
            aVar.a = true;
            if (aVar.b == null) {
                aVar.b = new String[0];
            }
            if (aVar.a || aVar.b.length != 0) {
                bxn.a(bma.c.a(((bmh) fbp.a(this.f)).g, new bmd(aVar, 0)), new bme()).a((exw<TResult>) new $$Lambda$waq$2wfP8oo9Y5H5YLfJhkcdweufTDs<TResult>(this, wau, z));
                return;
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
        this.d.a(gbr.a(this.a, (gbt) new m()));
        wau.d();
    }

    public static boolean a(int i) {
        return i == 1003 || i == 1001 || i == 1002;
    }

    private static boolean b(Credential credential) {
        if (credential != null && !fbo.a(credential.a)) {
            if (fbo.a(credential.c) && !fbo.a(credential.b)) {
                return true;
            }
            if ("https://www.facebook.com".equals(credential.c)) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        bmh bmh = this.f;
        if (bmh != null) {
            bmh.a();
        }
    }

    public final void a(int i, int i2, Intent intent) {
        wau wau = this.b;
        if (wau != null) {
            String str = "com.google.android.gms.credentials.Credential";
            switch (i) {
                case 1001:
                    if (i2 != -1) {
                        this.d.a(gbr.a(this.a, (gbt) new e()));
                        this.b.d();
                        break;
                    } else {
                        a(wau, (Credential) intent.getParcelableExtra(str));
                        return;
                    }
                case 1002:
                    if (i2 == -1) {
                        this.d.a(gbr.a(this.a, (gbt) new n()));
                    } else {
                        this.d.a(gbr.a(this.a, (gbt) new o()));
                    }
                    this.b.ar_();
                    return;
                case 1003:
                    if (i2 == -1) {
                        wau.a((Credential) intent.getParcelableExtra(str));
                        this.d.a(gbr.a(this.a, (gbt) new l()));
                        return;
                    }
                    wau.d();
                    this.d.a(gbr.a(this.a, (gbt) new j()));
                    return;
                default:
                    StringBuilder sb = new StringBuilder("Unknown requestCode: ");
                    sb.append(i);
                    Assertion.c(sb.toString());
                    break;
            }
        }
    }

    public final void a(Credential credential) {
        bmh bmh = this.f;
        if (bmh != null) {
            bmh.a(credential).a((exw<TResult>) new $$Lambda$waq$LwvUrpPd9WA2AwmcOC0WsS251Q<TResult>(this));
        }
    }

    public final void a(String str, String str2, String str3, wau wau) {
        Credential credential;
        if (this.f == null) {
            wau.ar_();
            return;
        }
        a aVar = new a(str);
        if ("".equalsIgnoreCase(str3)) {
            aVar.a = str2;
            credential = aVar.a();
        } else {
            aVar.b = str3;
            credential = aVar.a();
        }
        bxn.a(bma.c.a(this.f.g, credential)).a((exw<TResult>) new $$Lambda$waq$s7WXQ1Ya99wFeCYRLVsFaU5yvQ<TResult>(this, wau, str3));
    }

    public final void a(wau wau, boolean z) {
        a(wau, false, "", "https://www.facebook.com");
    }

    public final void a(wau wau, boolean z, String... strArr) {
        bmh bmh = this.f;
        if (bmh == null) {
            wau.d();
        } else {
            this.e.a((bsx<?>) bmh, (bsx<?>[]) new bsx[0]).a((exw<TResult>) new $$Lambda$waq$CAmaq_k2jWoknAIA17igOliKq0M<TResult>(this, strArr, wau, z));
        }
    }

    public final boolean a(wau wau) {
        if (this.f == null) {
            return false;
        }
        HintRequest.a aVar = new HintRequest.a();
        CredentialPickerConfig.a aVar2 = new CredentialPickerConfig.a();
        aVar2.a = true;
        aVar.c = (CredentialPickerConfig) bxo.a(aVar2.a());
        aVar.a = true;
        if (aVar.b == null) {
            aVar.b = new String[0];
        }
        if (aVar.a || aVar.b.length != 0) {
            HintRequest hintRequest = new HintRequest(aVar, 0);
            try {
                this.b = wau;
                this.d.a(gbr.a(this.a, (gbt) new k()));
                kf kfVar = this.c;
                bmh bmh = this.f;
                Context context = bmh.a;
                a aVar3 = (a) bmh.c;
                bxo.a(context, (Object) "context must not be null");
                bxo.a(hintRequest, (Object) "request must not be null");
                Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", null);
                Parcel obtain = Parcel.obtain();
                hintRequest.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
                kfVar.startIntentSenderForResult(PendingIntent.getActivity(context, 2000, putExtra, 134217728).getIntentSender(), 1003, null, 0, 0, 0);
                return true;
            } catch (SendIntentException e2) {
                this.d.a(gbr.a(this.a, (gbt) new j()));
                Assertion.a("Could not start email picker Intent", (Throwable) e2);
                return false;
            }
        } else {
            throw new IllegalStateException("At least one authentication method must be specified");
        }
    }
}
