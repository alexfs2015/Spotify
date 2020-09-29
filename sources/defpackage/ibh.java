package defpackage;

import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;

/* renamed from: ibh reason: default package */
public final class ibh implements c {
    private final hzm a;

    public final void a() {
    }

    public final void a(ViewGroup viewGroup) {
    }

    public ibh(hzm hzm) {
        this.a = hzm;
    }

    public final void b() {
        Logger.b("[MarqueeBackgroundStatePlugin] onUIHidden()", new Object[0]);
        hzm hzm = this.a;
        Logger.b("[MarqueeBackgroundStateObserver] onAppBackgrounded", new Object[0]);
        hzm.a.onNext(new a());
    }
}
