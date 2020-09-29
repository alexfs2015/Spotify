package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.playlist.models.Show;
import java.util.Map;

/* renamed from: rxn reason: default package */
public final class rxn {
    public final wuh<rxl> a;

    /* renamed from: rxn$a */
    public interface a {
        void a(Throwable th);

        void a(rxl rxl);
    }

    public rxn(String str, RxResolver rxResolver, wug wug, wug wug2) {
        Logger.b("Creating new SimpleShowDataLoader", new Object[0]);
        jst a2 = jst.a(str);
        if (a2.b == LinkType.SHOW_SHOW) {
            rxc rxc = new rxc(rxResolver, wug, wug2);
            rxc.a = true;
            this.a = rxc.a(null, str).c(new $$Lambda$rxn$EsVdhevkSrrh1KngAUDQFiUmCk(str));
        } else if (a2.b == LinkType.SHOW_EPISODE) {
            rwz rwz = new rwz(rxResolver, wug, wug2);
            rwz.a = true;
            this.a = rwz.a(null, str).c(new $$Lambda$rxn$qkD3r55Wat_fTVeuNqESQQGQXdc(str));
        } else {
            StringBuilder sb = new StringBuilder("Unhandled link type! Link is ");
            sb.append(a2);
            throw new AssertionError(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rxl b(String str, Map map) {
        Show show = (Show) map.get(str);
        if (show != null) {
            return new rxe(show, Optional.e());
        }
        StringBuilder sb = new StringBuilder("Show ");
        sb.append(str);
        sb.append(" not found");
        throw new RuntimeException(sb.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rxl a(String str, Map map) {
        uys uys = (uys) map.get(str);
        if (uys != null) {
            Show t = uys.t();
            if (t != null) {
                return new rxe(t, Optional.b(uys));
            }
        }
        StringBuilder sb = new StringBuilder("Episode ");
        sb.append(str);
        sb.append(" or show not found");
        throw new RuntimeException(sb.toString());
    }

    public final wuk a(a aVar) {
        wuh<rxl> wuh = this.a;
        aVar.getClass();
        $$Lambda$3qY1j59_G0qlhiBprmk1Ubhec r1 = new $$Lambda$3qY1j59_G0qlhiBprmk1Ubhec(aVar);
        aVar.getClass();
        return wuh.a((wun<? super T>) r1, (wun<Throwable>) new $$Lambda$YcYhPkVFUeyvvEjhcAoeYAQ2V8<Throwable>(aVar));
    }
}
