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
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

/* renamed from: vnk reason: default package */
public final class vnk {
    public static final String a = null;
    public gaw b;
    private final ka c;
    private final gao d;
    private final brx e;
    private blq f;
    private vno g;

    public static boolean a(int i) {
        return i == 1003 || i == 1001 || i == 1002;
    }

    public vnk(ka kaVar, brx brx) {
        this(kaVar, brx, new gap());
    }

    public vnk(ka kaVar, brx brx, gao gao) {
        this.b = new h();
        this.c = kaVar;
        this.e = brx;
        this.d = gao;
        int a2 = this.e.a((Context) kaVar);
        this.d.a(gaq.a(this.b, (gax) new a(a2)));
        if (a2 == 0) {
            this.f = new blq((Activity) kaVar, (a) new a().b().a());
        }
    }

    public final void a(int i, int i2, Intent intent) {
        vno vno = this.g;
        if (vno != null) {
            String str = "com.google.android.gms.credentials.Credential";
            switch (i) {
                case 1001:
                    if (i2 != -1) {
                        this.d.a(gaq.a(this.b, (gax) new e()));
                        this.g.d();
                        break;
                    } else {
                        a(vno, (Credential) intent.getParcelableExtra(str));
                        return;
                    }
                case 1002:
                    if (i2 == -1) {
                        this.d.a(gaq.a(this.b, (gax) new n()));
                    } else {
                        this.d.a(gaq.a(this.b, (gax) new o()));
                    }
                    this.g.a();
                    return;
                case 1003:
                    if (i2 == -1) {
                        vno.a((Credential) intent.getParcelableExtra(str));
                        this.d.a(gaq.a(this.b, (gax) new l()));
                        return;
                    }
                    vno.d();
                    this.d.a(gaq.a(this.b, (gax) new j()));
                    return;
                default:
                    StringBuilder sb = new StringBuilder("Unknown requestCode: ");
                    sb.append(i);
                    Assertion.c(sb.toString());
                    break;
            }
        }
    }

    private void a(vno vno, Credential credential) {
        if (b(credential)) {
            this.d.a(gaq.a(this.b, (gax) new i()));
            vno.a(credential);
            return;
        }
        this.d.a(gaq.a(this.b, (gax) new d()));
        vno.d();
        if (credential != null) {
            a(credential);
        }
    }

    public final void a() {
        blq blq = this.f;
        if (blq != null) {
            blq.a();
        }
    }

    public final void a(vno vno, boolean z) {
        a(vno, false, null, "https://www.facebook.com");
    }

    public final void a(vno vno, boolean z, String... strArr) {
        blq blq = this.f;
        if (blq == null) {
            vno.d();
        } else {
            this.e.a((bsg<?>) blq, (bsg<?>[]) new bsg[0]).a((exf<TResult>) new $$Lambda$vnk$mYboM3zdGjeXclJ2ncAi2POqZ8<TResult>(this, strArr, vno, z));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String[] strArr, vno vno, boolean z, exi exi) {
        if (exi.b()) {
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
                bww.a(blj.c.a(((blq) fay.a(this.f)).g, new blm(aVar, 0)), new bln()).a((exf<TResult>) new $$Lambda$vnk$0C7r_pKOFNm1zPjK0ZQgJN3EcR4<TResult>(this, vno, z));
                return;
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
        this.d.a(gaq.a(this.b, (gax) new m()));
        vno.d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vno vno, boolean z, exi exi) {
        if (exi.b()) {
            Credential credential = null;
            bln bln = (bln) exi.d();
            if (bln != null) {
                credential = bln.a();
            }
            a(vno, credential);
            return;
        }
        Exception e2 = exi.e();
        if (!(e2 instanceof ResolvableApiException)) {
            vno.d();
            this.d.a(gaq.a(this.b, (gax) new e()));
        } else if (!z) {
            this.d.a(gaq.a(this.b, (gax) new g()));
            vno.d();
        } else {
            ResolvableApiException resolvableApiException = (ResolvableApiException) e2;
            if (resolvableApiException.a() == 6) {
                try {
                    this.g = vno;
                    resolvableApiException.a(this.c, 1001);
                    this.d.a(gaq.a(this.b, (gax) new f()));
                } catch (SendIntentException e3) {
                    this.d.a(gaq.a(this.b, (gax) new e()));
                    vno.d();
                    Assertion.b("Failed to start smartlock save credentials resolution", (Throwable) e3);
                }
            } else if (resolvableApiException.a() == 4) {
                this.d.a(gaq.a(this.b, (gax) new h()));
                vno.d();
            } else {
                StringBuilder sb = new StringBuilder("Unhandled smartlock resolution: ");
                sb.append(resolvableApiException.a());
                Assertion.b(sb.toString(), (Throwable) e2);
                this.d.a(gaq.a(this.b, (gax) new e()));
                vno.d();
            }
        }
    }

    public final void a(Credential credential) {
        blq blq = this.f;
        if (blq != null) {
            blq.a(credential).a((exf<TResult>) new $$Lambda$vnk$k4XM9Pk5H3sbNbqO1UZOpF3nAi8<TResult>(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(exi exi) {
        if (exi.b()) {
            this.d.a(gaq.a(this.b, (gax) new c()));
        } else {
            this.d.a(gaq.a(this.b, (gax) new b()));
        }
    }

    public final void a(String str, String str2, String str3, vno vno) {
        if (this.f == null) {
            vno.a();
            return;
        }
        a aVar = new a(str);
        aVar.b = str2;
        aVar.c = str3;
        Credential credential = new Credential(aVar.a, null, null, null, aVar.b, aVar.c, null, null);
        bww.a(blj.c.a(this.f.g, credential)).a((exf<TResult>) new $$Lambda$vnk$Brxj8HXGNi7lUBFpekQQtqlkwyM<TResult>(this, vno, str3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vno vno, String str, exi exi) {
        fsr fsr;
        if (exi.b()) {
            vno.a();
            this.d.a(gaq.a(this.b, (gax) new r()));
            return;
        }
        Exception e2 = exi.e();
        if (e2 instanceof ResolvableApiException) {
            ResolvableApiException resolvableApiException = (ResolvableApiException) e2;
            this.g = vno;
            if (resolvableApiException.a() == 6) {
                try {
                    if (!this.c.isFinishing()) {
                        if ("https://www.facebook.com".equals(str)) {
                            fsr = fsy.a(this.c, this.c.getString(R.string.smartlock_nudge_heading_facebook), this.c.getString(R.string.smartlock_nudge_body_facebook));
                        } else {
                            fsr = fsy.a(this.c, this.c.getString(R.string.smartlock_nudge_heading_spotify), this.c.getString(R.string.smartlock_nudge_body_spotify));
                        }
                        this.d.a(gaq.a(this.b, (gat) new e()));
                        fsr.e = false;
                        fsr.a(this.c.getString(R.string.smartlock_nudge_cta), new $$Lambda$vnk$K_v4ltOqfY2rHUxp9sbhXvAc1og(this, resolvableApiException, vno)).a().a();
                    }
                } catch (BadTokenException e3) {
                    Assertion.b("Failed to show smartlock nudge dialog as Activity is dead", (Throwable) e3);
                }
            } else {
                try {
                    resolvableApiException.a(this.c, 1002);
                    this.d.a(gaq.a(this.b, (gax) new q()));
                } catch (SendIntentException e4) {
                    this.d.a(gaq.a(this.b, (gax) new p()));
                    vno.a();
                    Assertion.b("Failed to start smartlock save credentials resolution", (Throwable) e4);
                }
            }
        } else {
            vno.a();
            this.d.a(gaq.a(this.b, (gax) new p()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ResolvableApiException resolvableApiException, vno vno, DialogInterface dialogInterface, int i) {
        this.d.a(gaq.a(this.b, new i(), new e()));
        try {
            resolvableApiException.a(this.c, 1002);
            this.d.a(gaq.a(this.b, (gax) new q()));
        } catch (SendIntentException e2) {
            this.d.a(gaq.a(this.b, (gax) new p()));
            vno.a();
            Assertion.b("Failed to start smartlock save credentials resolution", (Throwable) e2);
        }
    }

    public final boolean a(vno vno) {
        if (this.f == null) {
            return false;
        }
        HintRequest.a aVar = new HintRequest.a();
        CredentialPickerConfig.a aVar2 = new CredentialPickerConfig.a();
        aVar2.a = true;
        aVar.c = (CredentialPickerConfig) bwx.a(aVar2.a());
        aVar.a = true;
        if (aVar.b == null) {
            aVar.b = new String[0];
        }
        if (aVar.a || aVar.b.length != 0) {
            HintRequest hintRequest = new HintRequest(aVar, 0);
            try {
                this.g = vno;
                this.d.a(gaq.a(this.b, (gax) new k()));
                ka kaVar = this.c;
                blq blq = this.f;
                Context context = blq.a;
                a aVar3 = (a) blq.c;
                bwx.a(context, (Object) "context must not be null");
                bwx.a(hintRequest, (Object) "request must not be null");
                Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", null);
                Parcel obtain = Parcel.obtain();
                hintRequest.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
                kaVar.startIntentSenderForResult(PendingIntent.getActivity(context, 2000, putExtra, 134217728).getIntentSender(), 1003, null, 0, 0, 0);
                return true;
            } catch (SendIntentException e2) {
                this.d.a(gaq.a(this.b, (gax) new j()));
                Assertion.a("Could not start email picker Intent", (Throwable) e2);
                return false;
            }
        } else {
            throw new IllegalStateException("At least one authentication method must be specified");
        }
    }

    private static boolean b(Credential credential) {
        if (credential != null && !fax.a(credential.a)) {
            if (fax.a(credential.c) && !fax.a(credential.b)) {
                return true;
            }
            if ("https://www.facebook.com".equals(credential.c)) {
                return true;
            }
        }
        return false;
    }
}
