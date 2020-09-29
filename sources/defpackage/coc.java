package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zza;
import com.spotify.cosmos.router.Request;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

@cfp
/* renamed from: coc reason: default package */
public final class coc {
    private static eas a;
    private static final Object b = new Object();

    static {
        new cod();
    }

    public coc(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        a(context);
    }

    private static eas a(Context context) {
        eas eas;
        eas eas2;
        synchronized (b) {
            if (a == null) {
                dtg.a(context);
                if (((Boolean) dqe.f().a(dtg.cG)).booleanValue()) {
                    eas2 = cnx.a(context);
                } else {
                    eas2 = new eas((dch) new coj(new File(context.getCacheDir(), "volley"), 0), (dsc) new cli((ckh) new cum()), 0);
                    eas2.a();
                }
                a = eas2;
            }
            eas = a;
        }
        return eas;
    }

    public final cqi<String> a(int i, String str, Map<String, String> map, byte[] bArr) {
        cok cok = new cok(0);
        cog cog = new cog(str, cok);
        cpg cpg = new cpg(null);
        coh coh = new coh(i, str, cok, cog, bArr, map, cpg);
        if (cpg.c()) {
            try {
                cpg.a(str, Request.GET, coh.b(), coh.a());
            } catch (zza e) {
                e.getMessage();
                cpn.a(5);
            }
        }
        a.a(coh);
        return cok;
    }

    @Deprecated
    public final <T> cqi<T> a(String str, coi<T> coi) {
        cqt cqt = new cqt();
        a.a(new col(str, cqt));
        return cpx.a(cpx.a((cqi<A>) cqt, (cpt<A, B>) new cof<A,B>(coi), (Executor) cms.a), Throwable.class, (cps<? super X, ? extends V>) new coe<Object,Object>(coi), cqo.b);
    }

    public final cqi<String> a(String str, Map<String, String> map) {
        return a(0, str, map, null);
    }
}
