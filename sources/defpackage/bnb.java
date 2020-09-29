package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;

/* renamed from: bnb reason: default package */
final class bnb extends a<bmg, GoogleSignInOptions> {
    bnb() {
    }

    public final /* synthetic */ f a(Context context, Looper looper, bwh bwh, Object obj, b bVar, c cVar) {
        bmg bmg = new bmg(context, looper, bwh, (GoogleSignInOptions) obj, bVar, cVar);
        return bmg;
    }

    public final /* synthetic */ List a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.a();
    }
}
