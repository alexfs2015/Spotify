package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: szc reason: default package */
public final class szc {
    private final Context a;

    public szc(Context context) {
        this.a = context;
    }

    public final szb a(Intent intent, jqx jqx) {
        return new a().a(jqx.b(this.a)).a(jva.a(intent.getDataString())).c(intent.getStringExtra("tag")).d(jqx.ag().a()).a();
    }
}
