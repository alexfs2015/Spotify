package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.Optional;

/* renamed from: oge reason: default package */
public final class oge {
    private static final String[] b = {"api_server_url", "auth_server_url"};
    final Context a;

    public oge(Context context) {
        this.a = context;
    }

    static Intent a() {
        Intent intent = new Intent("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT");
        intent.putExtra("client_id", "q3voa1im9e");
        intent.putExtra("client_secret", "foo");
        intent.putExtra("progress_theme", "dark");
        return intent;
    }

    static Intent a(Optional<String> optional) {
        Intent intent = new Intent("com.msc.action.samsungaccount.REQUEST_ACCESSTOKEN");
        if (optional.b()) {
            intent.putExtra("expired_access_token", (String) optional.c());
        }
        intent.putExtra("client_id", "q3voa1im9e");
        intent.putExtra("client_secret", "foo");
        intent.putExtra("additional", b);
        intent.putExtra("progress_theme", "dark");
        return intent;
    }
}
