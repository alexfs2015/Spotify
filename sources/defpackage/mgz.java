package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: mgz reason: default package */
public final class mgz implements mgq {
    private final a a;

    /* renamed from: mgz$a */
    public interface a {
        void c(Intent intent);
    }

    public mgz(a aVar) {
        this.a = aVar;
    }

    public final void a(Uri uri) {
        this.a.c(new Intent("android.intent.action.VIEW", uri));
    }
}
