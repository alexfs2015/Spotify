package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;

/* renamed from: bmy reason: default package */
public final class bmy {
    private static bzr a = new bzr("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        String str = "config";
        bundle.putParcelable(str, signInConfiguration);
        intent.putExtra(str, bundle);
        return intent;
    }

    public static bsz<Status> a(bsy bsy, Context context, boolean z) {
        a.a("Revoking access", new Object[0]);
        bms.a(context).a("refreshToken");
        bnc.a(context).a();
        for (bsy d : bsy.a()) {
            d.d();
        }
        btj.b();
        return bsy.b(new bmz(bsy));
    }
}
