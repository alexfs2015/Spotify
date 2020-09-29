package defpackage;

import android.app.Service;
import android.content.Context;
import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: hip reason: default package */
public final class hip extends hgc<ConnectManager> {

    /* renamed from: hip$a */
    public interface a extends defpackage.hgc.a<ConnectManager> {
    }

    hip(Context context, Class<? extends Service> cls, a aVar) {
        super(context, cls, aVar, context.getClass().getSimpleName());
    }

    public final void a() {
        if (d()) {
            h();
        } else {
            super.a();
        }
    }
}
