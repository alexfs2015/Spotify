package defpackage;

import android.content.Intent;

/* renamed from: rqh reason: default package */
public final class rqh {
    public static Intent a(String str, boolean z) {
        Intent intent = new Intent("com.spotify.mobile.android.state.ACTION_CAR_CONNECTED");
        intent.putExtra("source", str);
        intent.putExtra("connected", z);
        return intent;
    }
}
