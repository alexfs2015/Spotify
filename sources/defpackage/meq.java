package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.mobile.android.connect.view.ConnectView;
import java.util.EnumSet;

/* renamed from: meq reason: default package */
public final class meq implements gse {
    private final ConnectView a;

    public meq(ConnectView connectView, int i) {
        this.a = connectView;
        ConnectView connectView2 = this.a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        connectView2.c = z;
        this.a.f();
    }

    public final void a(Tech tech, String str) {
        this.a.a(tech, str);
    }

    public final void a(EnumSet<Tech> enumSet) {
        this.a.a();
    }

    public final void a() {
        Logger.b("#NPB setConnectButtonNoDevicesAvailable (Noop)", new Object[0]);
    }

    public final void b() {
        Logger.b("#NPB hideConnectButtonNoDevicesAvailable (Noop)", new Object[0]);
    }

    public final void a(Tech tech) {
        this.a.a(tech);
    }

    public final void a(a aVar) {
        this.a.setOnClickListener(new $$Lambda$meq$o8nLoOl1bSUH9yOwoYsEEgnfBc(aVar));
    }
}
