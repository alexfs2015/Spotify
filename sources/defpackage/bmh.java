package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: bmh reason: default package */
public final class bmh extends bsx<a> {
    public bmh(Activity activity, a aVar) {
        super(activity, bma.a, aVar, (btr) new btg());
    }

    public bmh(Context context, a aVar) {
        super(context, bma.a, aVar, (btr) new btg());
    }

    public final exz<Void> a() {
        return bxn.a(bma.c.a(this.g));
    }

    public final exz<Void> a(Credential credential) {
        return bxn.a(bma.c.b(this.g, credential));
    }
}
