package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: jfk reason: default package */
public final class jfk extends jfm {
    public final Intent a(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }

    public final Bundle a(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("ACCESS_TOKEN", str);
        bundle.putString("RESPONSE_TYPE", "token");
        bundle.putInt("EXPIRES_IN", i);
        return bundle;
    }

    public final Bundle a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("CODE", str);
        bundle.putString("RESPONSE_TYPE", "code");
        bundle.putString("STATE", str2);
        return bundle;
    }
}
