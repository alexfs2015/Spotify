package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;

/* renamed from: bns reason: default package */
final class bns extends a<bmx, GoogleSignInOptions> {
    bns() {
    }

    public final /* synthetic */ f a(Context context, Looper looper, bwy bwy, Object obj, b bVar, c cVar) {
        bmx bmx = new bmx(context, looper, bwy, (GoogleSignInOptions) obj, bVar, cVar);
        return bmx;
    }

    public final /* synthetic */ List a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.a();
    }
}
