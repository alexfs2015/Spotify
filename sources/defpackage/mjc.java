package defpackage;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.mobile.android.connect.view.ConnectView;
import java.util.EnumSet;

/* renamed from: mjc reason: default package */
public final class mjc implements gue {
    private final ConnectView a;
    private final gto b;
    private final fqn c;

    public mjc(ConnectView connectView, int i, gto gto, fqn fqn) {
        this.a = connectView;
        ConnectView connectView2 = this.a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        connectView2.c = z;
        this.a.f();
        this.b = gto;
        this.c = fqn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, View view) {
        aVar.a();
        this.b.a(this.c);
    }

    public final void a() {
        Logger.b("#NPB setConnectButtonNoDevicesAvailable (Noop)", new Object[0]);
    }

    public final void a(Tech tech) {
        this.a.a(tech);
    }

    public final void a(Tech tech, String str) {
        this.a.a(tech, str);
    }

    public final void a(a aVar) {
        this.a.setOnClickListener(new $$Lambda$mjc$9ka6pJelLHWTyRqUmg5zzPEKQFs(this, aVar));
    }

    public final void a(EnumSet<Tech> enumSet) {
        this.a.a();
    }

    public final void b() {
        Logger.b("#NPB hideConnectButtonNoDevicesAvailable (Noop)", new Object[0]);
    }
}
