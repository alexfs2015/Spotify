package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: mcw reason: default package */
public final class mcw implements mcn {
    private final a a;

    /* renamed from: mcw$a */
    public interface a {
        void c(Intent intent);
    }

    public mcw(a aVar) {
        this.a = aVar;
    }

    public final void a(Uri uri) {
        this.a.c(new Intent("android.intent.action.VIEW", uri));
    }
}
