package defpackage;

import android.view.View;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.mobile.android.connect.view.ConnectView;
import java.util.EnumSet;

/* renamed from: pun reason: default package */
public final class pun implements gue {
    private final ConnectView a;
    private final gto b;
    private final fqn c;

    public pun(gto gto, fqn fqn, ConnectView connectView) {
        this.a = connectView;
        this.b = gto;
        this.c = fqn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, View view) {
        aVar.a();
        this.b.a(this.c);
    }

    public final void a() {
        this.a.setVisibility(0);
        this.a.b();
    }

    public final void a(Tech tech) {
        this.a.setVisibility(0);
        this.a.a(tech);
    }

    public final void a(Tech tech, String str) {
        this.a.setVisibility(0);
        this.a.a(tech, str);
    }

    public final void a(a aVar) {
        this.a.setOnClickListener(new $$Lambda$pun$UG2rCZvrw2ifjkSBfxzHIN9ps6k(this, aVar));
    }

    public final void a(EnumSet<Tech> enumSet) {
        this.a.setVisibility(0);
        this.a.a();
    }

    public final void b() {
        this.a.setVisibility(8);
    }
}
