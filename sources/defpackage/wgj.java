package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: wgj reason: default package */
public final class wgj {
    private final wgu a;
    private final Context b;

    public wgj(wgu wgu, Context context) {
        this.a = (wgu) fbp.a(wgu);
        this.b = (Context) fbp.a(context.getApplicationContext());
    }

    /* access modifiers changed from: private */
    public Void a(String str, String str2) {
        Intent intent = new Intent("image-load-event");
        intent.putExtra("event", str);
        intent.putExtra("uri", str2);
        mh.a(this.b).a(intent);
        return null;
    }

    private wgr a(wgr wgr, Uri uri) {
        return new wgi(this.a.a, new $$Lambda$wgj$OS2sKjhZV1gRy06v_W74NiqgzOI(this), wgr, uri);
    }

    public final wgr a(Uri uri) {
        if (uri != null) {
            a("uri_started", uri.toString());
        }
        return a(this.a.a(uri), uri);
    }
}
