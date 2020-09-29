package defpackage;

import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;

/* renamed from: idt reason: default package */
public final class idt implements c {
    private final iby a;

    public idt(iby iby) {
        this.a = iby;
    }

    public final void a() {
    }

    public final void a(ViewGroup viewGroup) {
    }

    public final void b() {
        Logger.b("[MarqueeBackgroundStatePlugin] onUIHidden()", new Object[0]);
        iby iby = this.a;
        Logger.b("[MarqueeBackgroundStateObserver] onAppBackgrounded", new Object[0]);
        iby.a.onNext(new a());
    }
}
