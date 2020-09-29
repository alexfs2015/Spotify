package defpackage;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* renamed from: bkj reason: default package */
final class bkj implements Callable<String> {
    private final /* synthetic */ bkg a;

    bkj(bkg bkg) {
        this.a = bkg;
    }

    public final /* synthetic */ Object call() {
        if (((Boolean) dqe.f().a(dtg.cA)).booleanValue()) {
            CookieManager c = bkc.g().c(this.a.e.c);
            if (c != null) {
                return c.getCookie("=");
            }
        }
        return "";
    }
}
