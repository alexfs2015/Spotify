package defpackage;

import android.app.Service;
import android.content.Context;
import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: gtb reason: default package */
public final class gtb extends hiy<ConnectManager> {

    /* renamed from: gtb$a */
    public interface a extends defpackage.hiy.a<ConnectManager> {
    }

    gtb(Context context, Class<? extends Service> cls, a aVar, hjw hjw) {
        super(context, cls, aVar, context.getClass().getSimpleName(), hjw);
    }

    public final void a() {
        if (c()) {
            g();
        } else {
            super.a();
        }
    }
}
