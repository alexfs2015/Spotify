package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.c;

/* renamed from: hcc reason: default package */
public final class hcc implements c {
    private final c b;
    private final c c;

    private hcc(c cVar, c cVar2) {
        this.b = (c) fbp.a(cVar);
        this.c = (c) fbp.a(cVar2);
    }

    public static c a(c cVar, c cVar2) {
        return new hcc(cVar, cVar2);
    }

    public final gwr a(gwm gwm, Context context) {
        return (jvi.a(context) ? this.b : this.c).a(gwm, context);
    }

    public final gwr a(gwm gwm, Context context, m mVar) {
        return (jvi.a(context) ? this.b : this.c).a(gwm, context, mVar);
    }
}
