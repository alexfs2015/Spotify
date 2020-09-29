package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.loginflow.LoginActivity;
import com.spotify.mobile.android.sso.util.AfterLoginDummyActivity;

/* renamed from: jij reason: default package */
public final class jij {
    public static Intent a(Context context) {
        Intent a = AfterLoginDummyActivity.a(context.getApplicationContext());
        Intent intent = new Intent("com.spotify.mobile.android.service.action.session.LOGIN");
        intent.setClass(context, LoginActivity.class);
        intent.putExtra("intent", a);
        return intent;
    }
}
