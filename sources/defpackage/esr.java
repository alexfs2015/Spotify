package defpackage;

import android.os.Binder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: esr reason: default package */
public final class esr extends erf {
    /* access modifiers changed from: 0000 */
    public final evt a;
    private Boolean b;
    private String c;

    public esr(evt evt) {
        this(evt, 0);
    }

    private esr(evt evt, byte b2) {
        bxo.a(evt);
        this.a = evt;
        this.c = null;
    }

    private final void a(Runnable runnable) {
        bxo.a(runnable);
        if (!((Boolean) erd.W.a()).booleanValue() || !this.a.p().f()) {
            this.a.p().a(runnable);
        } else {
            runnable.run();
        }
    }

    private final void a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.c) && !cak.a(this.a.m(), Binder.getCallingUid())) {
                            if (!bsr.a(this.a.m()).a(Binder.getCallingUid())) {
                                z2 = false;
                                this.b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.a.q().c.a("Measurement Service called with invalid calling package. appId", ern.a(str));
                    throw e;
                }
            }
            if (this.c == null && bsq.uidHasPackageName(this.a.m(), Binder.getCallingUid(), str)) {
                this.c = str;
            }
            if (!str.equals(this.c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        String str2 = "Measurement Service called without app package";
        this.a.q().c.a(str2);
        throw new SecurityException(str2);
    }

    private final void e(ewh ewh) {
        bxo.a(ewh);
        a(ewh.a, false);
        this.a.b.e().b(ewh.b, ewh.r);
    }

    public final List<ewa> a(ewh ewh, boolean z) {
        e(ewh);
        try {
            List<ewc> list = (List) this.a.p().a((Callable<V>) new eti<V>(this, ewh)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ewc ewc : list) {
                if (z || !ewd.e(ewc.c)) {
                    arrayList.add(new ewa(ewc));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get user attributes. appId", ern.a(ewh.a), e);
            return null;
        }
    }

    public final List<ewl> a(String str, String str2, ewh ewh) {
        e(ewh);
        try {
            return (List) this.a.p().a((Callable<V>) new eta<V>(this, ewh, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List<ewl> a(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.a.p().a((Callable<V>) new etb<V>(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List<ewa> a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<ewc> list = (List) this.a.p().a((Callable<V>) new esz<V>(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ewc ewc : list) {
                if (z || !ewd.e(ewc.c)) {
                    arrayList.add(new ewa(ewc));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get user attributes. appId", ern.a(str), e);
            return Collections.emptyList();
        }
    }

    public final List<ewa> a(String str, String str2, boolean z, ewh ewh) {
        e(ewh);
        try {
            List<ewc> list = (List) this.a.p().a((Callable<V>) new esy<V>(this, ewh, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ewc ewc : list) {
                if (z || !ewd.e(ewc.c)) {
                    arrayList.add(new ewa(ewc));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get user attributes. appId", ern.a(ewh.a), e);
            return Collections.emptyList();
        }
    }

    public final void a(long j, String str, String str2, String str3) {
        etk etk = new etk(this, str2, str3, str, j);
        a((Runnable) etk);
    }

    public final void a(erb erb, ewh ewh) {
        bxo.a(erb);
        e(ewh);
        a((Runnable) new etd(this, erb, ewh));
    }

    public final void a(erb erb, String str, String str2) {
        bxo.a(erb);
        bxo.a(str);
        a(str, true);
        a((Runnable) new ete(this, erb, str));
    }

    public final void a(ewa ewa, ewh ewh) {
        bxo.a(ewa);
        e(ewh);
        if (ewa.a() == null) {
            a((Runnable) new etg(this, ewa, ewh));
        } else {
            a((Runnable) new eth(this, ewa, ewh));
        }
    }

    public final void a(ewh ewh) {
        e(ewh);
        a((Runnable) new etj(this, ewh));
    }

    public final void a(ewl ewl) {
        bxo.a(ewl);
        bxo.a(ewl.c);
        a(ewl.a, true);
        ewl ewl2 = new ewl(ewl);
        if (ewl.c.a() == null) {
            a((Runnable) new esw(this, ewl2));
        } else {
            a((Runnable) new esx(this, ewl2));
        }
    }

    public final void a(ewl ewl, ewh ewh) {
        bxo.a(ewl);
        bxo.a(ewl.c);
        e(ewh);
        ewl ewl2 = new ewl(ewl);
        ewl2.a = ewh.a;
        if (ewl.c.a() == null) {
            a((Runnable) new est(this, ewl2, ewh));
        } else {
            a((Runnable) new esu(this, ewl2, ewh));
        }
    }

    public final byte[] a(erb erb, String str) {
        bxo.a(str);
        bxo.a(erb);
        a(str, true);
        this.a.q().j.a("Log and bundle. event", this.a.b.f().a(erb.a));
        long c2 = this.a.l().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.p().b((Callable<V>) new etf<V>(this, erb, str)).get();
            if (bArr == null) {
                this.a.q().c.a("Log and bundle returned null. appId", ern.a(str));
                bArr = new byte[0];
            }
            this.a.q().j.a("Log and bundle processed. event, size, time_ms", this.a.b.f().a(erb.a), Integer.valueOf(bArr.length), Long.valueOf((this.a.l().c() / 1000000) - c2));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to log and bundle. appId, event, error", ern.a(str), this.a.b.f().a(erb.a), e);
            return null;
        }
    }

    public final void b(ewh ewh) {
        e(ewh);
        a((Runnable) new ess(this, ewh));
    }

    public final String c(ewh ewh) {
        e(ewh);
        return this.a.d(ewh);
    }

    public final void d(ewh ewh) {
        a(ewh.a, false);
        a((Runnable) new etc(this, ewh));
    }
}
