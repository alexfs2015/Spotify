package defpackage;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* renamed from: bjs reason: default package */
final class bjs implements Callable<String> {
    private final /* synthetic */ bjp a;

    bjs(bjp bjp) {
        this.a = bjp;
    }

    public final /* synthetic */ Object call() {
        if (((Boolean) dpn.f().a(dsp.cA)).booleanValue()) {
            CookieManager c = bjl.g().c(this.a.e.c);
            if (c != null) {
                return c.getCookie("googleads.g.doubleclick.net");
            }
        }
        return "";
    }
}
