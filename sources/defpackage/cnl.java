package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zza;
import com.spotify.cosmos.router.Request;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

@cey
/* renamed from: cnl reason: default package */
public final class cnl {
    private static eab a;
    private static final Object b = new Object();

    static {
        new cnm();
    }

    public cnl(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        a(context);
    }

    private static eab a(Context context) {
        eab eab;
        eab eab2;
        synchronized (b) {
            if (a == null) {
                dsp.a(context);
                if (((Boolean) dpn.f().a(dsp.cG)).booleanValue()) {
                    eab2 = cng.a(context);
                } else {
                    eab2 = new eab((dbq) new cns(new File(context.getCacheDir(), "volley"), 0), (drl) new ckr((cjq) new ctv()), 0);
                    eab2.a();
                }
                a = eab2;
            }
            eab = a;
        }
        return eab;
    }

    @Deprecated
    public final <T> cpr<T> a(String str, cnr<T> cnr) {
        cqc cqc = new cqc();
        a.a(new cnu(str, cqc));
        return cpg.a(cpg.a((cpr<A>) cqc, (cpc<A, B>) new cno<A,B>(cnr), (Executor) cmb.a), Throwable.class, (cpb<? super X, ? extends V>) new cnn<Object,Object>(cnr), cpx.b);
    }

    public final cpr<String> a(String str, Map<String, String> map) {
        return a(0, str, map, null);
    }

    public final cpr<String> a(int i, String str, Map<String, String> map, byte[] bArr) {
        cnt cnt = new cnt(0);
        cnp cnp = new cnp(str, cnt);
        cop cop = new cop(null);
        cnq cnq = new cnq(i, str, cnt, cnp, bArr, map, cop);
        if (cop.c()) {
            try {
                cop.a(str, Request.GET, cnq.b(), cnq.a());
            } catch (zza e) {
                e.getMessage();
                cow.a(5);
            }
        }
        a.a(cnq);
        return cnt;
    }
}
