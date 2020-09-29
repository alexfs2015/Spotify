package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.playlist.models.Show;
import java.util.Map;

/* renamed from: sgx reason: default package */
public final class sgx {
    public final xim<sgv> a;

    /* renamed from: sgx$a */
    public interface a {
        void a(Throwable th);

        void a(sgv sgv);
    }

    public sgx(String str, RxResolver rxResolver, xil xil, xil xil2) {
        Logger.b("Creating new SimpleShowDataLoader", new Object[0]);
        jva a2 = jva.a(str);
        if (a2.b == LinkType.SHOW_SHOW) {
            sgm sgm = new sgm(rxResolver, xil, xil2);
            sgm.a = true;
            this.a = sgm.a(null, str).c(new $$Lambda$sgx$JbWyXS8yZaZt1eYv20WCKIaBdCg(str));
        } else if (a2.b == LinkType.SHOW_EPISODE) {
            sgj sgj = new sgj(rxResolver, xil, xil2);
            sgj.a = true;
            this.a = sgj.a(null, str).c(new $$Lambda$sgx$jHYFVfO2am1a_6ANKpQantq31yo(str));
        } else {
            StringBuilder sb = new StringBuilder("Unhandled link type! Link is ");
            sb.append(a2);
            throw new AssertionError(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ sgv a(String str, Map map) {
        vkv vkv = (vkv) map.get(str);
        if (vkv != null) {
            Show t = vkv.t();
            if (t != null) {
                return new sgo(t, Optional.b(vkv));
            }
        }
        StringBuilder sb = new StringBuilder("Episode ");
        sb.append(str);
        sb.append(" or show not found");
        throw new RuntimeException(sb.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ sgv b(String str, Map map) {
        Show show = (Show) map.get(str);
        if (show != null) {
            return new sgo(show, Optional.e());
        }
        StringBuilder sb = new StringBuilder("Show ");
        sb.append(str);
        sb.append(" not found");
        throw new RuntimeException(sb.toString());
    }

    public final xip a(a aVar) {
        xim<sgv> xim = this.a;
        aVar.getClass();
        $$Lambda$5BGyFLP24Sev61v1qyc7pQGclds r1 = new $$Lambda$5BGyFLP24Sev61v1qyc7pQGclds(aVar);
        aVar.getClass();
        return xim.a((xis<? super T>) r1, (xis<Throwable>) new $$Lambda$83rv_c3CpKhjADuTI1RxIVbs4<Throwable>(aVar));
    }
}
