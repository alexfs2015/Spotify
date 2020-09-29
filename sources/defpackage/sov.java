package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: sov reason: default package */
public final class sov {
    private final Context a;

    public sov(Context context) {
        this.a = context;
    }

    public final sou a(Intent intent, jol jol) {
        return new a().a(jol.b(this.a)).a(jst.a(intent.getDataString())).c(intent.getStringExtra("tag")).d(jol.ag().a()).a();
    }
}
