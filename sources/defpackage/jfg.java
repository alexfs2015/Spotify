package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationActivity;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import java.util.Locale;

/* renamed from: jfg reason: default package */
public final class jfg {
    public static Intent a(Context context, AuthorizationRequest authorizationRequest) {
        Intent addCategory = new Intent(context, AuthorizationActivity.class).setAction("com.spotify.mobile.android.sso.action.ACTIVITY").setPackage(context.getPackageName()).addCategory("android.intent.category.DEFAULT");
        addCategory.putExtra("VERSION", 1);
        addCategory.putExtra("CLIENT_ID", authorizationRequest.c());
        addCategory.putExtra("CLIENT_IDENTITY", authorizationRequest.f());
        addCategory.putExtra("REDIRECT_URI", authorizationRequest.b());
        addCategory.putExtra("RESPONSE_TYPE", authorizationRequest.e().toString().toLowerCase(Locale.ENGLISH));
        addCategory.putExtra("SCOPES", authorizationRequest.a());
        if (authorizationRequest.g() != null) {
            addCategory.putExtra("STATE", authorizationRequest.g());
        }
        return addCategory;
    }
}
