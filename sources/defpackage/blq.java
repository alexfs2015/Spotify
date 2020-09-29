package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: blq reason: default package */
public final class blq extends bsg<a> {
    public blq(Context context, a aVar) {
        super(context, blj.a, aVar, (bta) new bsp());
    }

    public blq(Activity activity, a aVar) {
        super(activity, blj.a, aVar, (bta) new bsp());
    }

    public final exi<Void> a(Credential credential) {
        return bww.a(blj.c.b(this.g, credential));
    }

    public final exi<Void> a() {
        return bww.a(blj.c.a(this.g));
    }
}
