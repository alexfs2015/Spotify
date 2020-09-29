package defpackage;

import android.os.Binder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: esa reason: default package */
public final class esa extends eqo {
    /* access modifiers changed from: 0000 */
    public final evc a;
    private Boolean b;
    private String c;

    public esa(evc evc) {
        this(evc, 0);
    }

    private esa(evc evc, byte b2) {
        bwx.a(evc);
        this.a = evc;
        this.c = null;
    }

    public final void b(evq evq) {
        e(evq);
        a((Runnable) new esb(this, evq));
    }

    public final void a(eqk eqk, evq evq) {
        bwx.a(eqk);
        e(evq);
        a((Runnable) new esm(this, eqk, evq));
    }

    public final void a(eqk eqk, String str, String str2) {
        bwx.a(eqk);
        bwx.a(str);
        a(str, true);
        a((Runnable) new esn(this, eqk, str));
    }

    public final byte[] a(eqk eqk, String str) {
        bwx.a(str);
        bwx.a(eqk);
        a(str, true);
        this.a.q().j.a("Log and bundle. event", this.a.b.f().a(eqk.a));
        long c2 = this.a.l().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.p().b((Callable<V>) new eso<V>(this, eqk, str)).get();
            if (bArr == null) {
                this.a.q().c.a("Log and bundle returned null. appId", eqw.a(str));
                bArr = new byte[0];
            }
            this.a.q().j.a("Log and bundle processed. event, size, time_ms", this.a.b.f().a(eqk.a), Integer.valueOf(bArr.length), Long.valueOf((this.a.l().c() / 1000000) - c2));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to log and bundle. appId, event, error", eqw.a(str), this.a.b.f().a(eqk.a), e);
            return null;
        }
    }

    public final void a(evj evj, evq evq) {
        bwx.a(evj);
        e(evq);
        if (evj.a() == null) {
            a((Runnable) new esp(this, evj, evq));
        } else {
            a((Runnable) new esq(this, evj, evq));
        }
    }

    public final List<evj> a(evq evq, boolean z) {
        e(evq);
        try {
            List<evl> list = (List) this.a.p().a((Callable<V>) new esr<V>(this, evq)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (evl evl : list) {
                if (z || !evm.e(evl.c)) {
                    arrayList.add(new evj(evl));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get user attributes. appId", eqw.a(evq.a), e);
            return null;
        }
    }

    public final void a(evq evq) {
        e(evq);
        a((Runnable) new ess(this, evq));
    }

    private final void e(evq evq) {
        bwx.a(evq);
        a(evq.a, false);
        this.a.b.e().b(evq.b, evq.r);
    }

    private final void a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.c) && !bzt.a(this.a.m(), Binder.getCallingUid())) {
                            if (!bsa.a(this.a.m()).a(Binder.getCallingUid())) {
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
                    this.a.q().c.a("Measurement Service called with invalid calling package. appId", eqw.a(str));
                    throw e;
                }
            }
            if (this.c == null && brz.uidHasPackageName(this.a.m(), Binder.getCallingUid(), str)) {
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

    public final void a(long j, String str, String str2, String str3) {
        est est = new est(this, str2, str3, str, j);
        a((Runnable) est);
    }

    public final String c(evq evq) {
        e(evq);
        return this.a.d(evq);
    }

    public final void a(evu evu, evq evq) {
        bwx.a(evu);
        bwx.a(evu.c);
        e(evq);
        evu evu2 = new evu(evu);
        evu2.a = evq.a;
        if (evu.c.a() == null) {
            a((Runnable) new esc(this, evu2, evq));
        } else {
            a((Runnable) new esd(this, evu2, evq));
        }
    }

    public final void a(evu evu) {
        bwx.a(evu);
        bwx.a(evu.c);
        a(evu.a, true);
        evu evu2 = new evu(evu);
        if (evu.c.a() == null) {
            a((Runnable) new esf(this, evu2));
        } else {
            a((Runnable) new esg(this, evu2));
        }
    }

    public final List<evj> a(String str, String str2, boolean z, evq evq) {
        e(evq);
        try {
            List<evl> list = (List) this.a.p().a((Callable<V>) new esh<V>(this, evq, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (evl evl : list) {
                if (z || !evm.e(evl.c)) {
                    arrayList.add(new evj(evl));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get user attributes. appId", eqw.a(evq.a), e);
            return Collections.emptyList();
        }
    }

    public final List<evj> a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<evl> list = (List) this.a.p().a((Callable<V>) new esi<V>(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (evl evl : list) {
                if (z || !evm.e(evl.c)) {
                    arrayList.add(new evj(evl));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get user attributes. appId", eqw.a(str), e);
            return Collections.emptyList();
        }
    }

    public final List<evu> a(String str, String str2, evq evq) {
        e(evq);
        try {
            return (List) this.a.p().a((Callable<V>) new esj<V>(this, evq, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List<evu> a(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.a.p().a((Callable<V>) new esk<V>(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final void d(evq evq) {
        a(evq.a, false);
        a((Runnable) new esl(this, evq));
    }

    private final void a(Runnable runnable) {
        bwx.a(runnable);
        if (!((Boolean) eqm.W.a()).booleanValue() || !this.a.p().f()) {
            this.a.p().a(runnable);
        } else {
            runnable.run();
        }
    }
}
