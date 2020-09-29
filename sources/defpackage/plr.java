package defpackage;

import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.mobile.android.connect.view.ConnectView;
import java.util.EnumSet;

/* renamed from: plr reason: default package */
public final class plr implements gse {
    private final ConnectView a;

    public plr(ConnectView connectView) {
        this.a = connectView;
    }

    public final void a(Tech tech, String str) {
        this.a.setVisibility(0);
        this.a.a(tech, str);
    }

    public final void a(EnumSet<Tech> enumSet) {
        this.a.setVisibility(0);
        this.a.a();
    }

    public final void a() {
        this.a.setVisibility(0);
        this.a.b();
    }

    public final void b() {
        this.a.setVisibility(8);
    }

    public final void a(Tech tech) {
        this.a.setVisibility(0);
        this.a.a(tech);
    }

    public final void a(a aVar) {
        this.a.setOnClickListener(new $$Lambda$plr$qGonQDaLush0FYwUId7axOdDnhY(aVar));
    }
}
