package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;

/* renamed from: ocb reason: default package */
public final class ocb {
    public final ocl a;
    public final obt b;
    public final kfb c;
    public final ocj d;
    public final Scheduler e;

    ocb(ocl ocl, obt obt, kfb kfb, ocj ocj, Scheduler scheduler) {
        this.a = ocl;
        this.b = obt;
        this.c = kfb;
        this.d = ocj;
        this.e = scheduler;
    }

    public static ObservableTransformer<b, oby> a(obt obt) {
        return new $$Lambda$ocb$z8GRsnfVJBzJ0JlOSE9Cn9ni4WU(obt);
    }

    public static ObservableTransformer<d, oby> a(ocj ocj) {
        return new $$Lambda$ocb$87uXmArkl9Ga_zPpX9SwpNMBCfw(ocj);
    }

    public static Consumer<e> a(kfb kfb) {
        return new $$Lambda$ocb$t4nzfmyddCpmNBBpTrv9JZkI_JE(kfb);
    }

    public static Consumer<c> a(ocl ocl) {
        return new $$Lambda$ocb$nQkF97RI5qa5nSi3eFKLvgrZek(ocl);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ocl ocl, c cVar) {
        if (cVar.a == PartnerType.WAZE) {
            ocl.b();
        } else if (cVar.a == PartnerType.GOOGLE_MAPS) {
            ocl.a();
        } else {
            Logger.e("Unrecognized partner app: %s", cVar.a.toString());
        }
    }

    public static Consumer<a> b(ocl ocl) {
        return new $$Lambda$ocb$zOiKtQLrMW4luyxvtWqZZqHjGSg(ocl);
    }
}
