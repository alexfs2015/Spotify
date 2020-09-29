package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: ejk reason: default package */
public final class ejk implements egy {
    public ejm a;
    private final Context b;
    private final boz c;
    private Uri d;
    private ejl e;
    private eha f;
    private Bitmap g;
    private boolean h;

    public ejk(Context context) {
        this(context, new boz(-1, 0, 0));
    }

    public ejk(Context context, boz boz) {
        this.b = context;
        this.c = boz;
        this.f = new eha();
        b();
    }

    private final void b() {
        ejl ejl = this.e;
        if (ejl != null) {
            ejl.cancel(true);
            this.e = null;
        }
        this.d = null;
        this.g = null;
        this.h = false;
    }

    public final void a() {
        b();
        this.a = null;
    }

    public final void a(Bitmap bitmap) {
        this.g = bitmap;
        this.h = true;
        ejm ejm = this.a;
        if (ejm != null) {
            ejm.a(this.g);
        }
        this.e = null;
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            b();
            return true;
        } else if (uri.equals(this.d)) {
            return this.h;
        } else {
            b();
            this.d = uri;
            if (this.c.a == 0 || this.c.b == 0) {
                this.e = new ejl(this.b, this);
            } else {
                this.e = new ejl(this.b, this.c.a, this.c.b, this);
            }
            this.e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{this.d});
            return false;
        }
    }
}
