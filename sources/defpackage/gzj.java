package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.c;

/* renamed from: gzj reason: default package */
public final class gzj implements c {
    private final c b;
    private final c c;

    private gzj(c cVar, c cVar2) {
        this.b = (c) fay.a(cVar);
        this.c = (c) fay.a(cVar2);
    }

    public static c a(c cVar, c cVar2) {
        return new gzj(cVar, cVar2);
    }

    public final gur a(gum gum, Context context) {
        return (jtc.a(context) ? this.b : this.c).a(gum, context);
    }

    public final gur a(gum gum, Context context, m mVar) {
        return (jtc.a(context) ? this.b : this.c).a(gum, context, mVar);
    }
}
