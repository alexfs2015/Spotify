package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: eit reason: default package */
public final class eit implements egh {
    public eiv a;
    private final Context b;
    private final boi c;
    private Uri d;
    private eiu e;
    private egj f;
    private Bitmap g;
    private boolean h;

    public eit(Context context) {
        this(context, new boi(-1, 0, 0));
    }

    public eit(Context context, boi boi) {
        this.b = context;
        this.c = boi;
        this.f = new egj();
        b();
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            b();
            return true;
        } else if (!uri.equals(this.d)) {
            b();
            this.d = uri;
            if (this.c.a == 0 || this.c.b == 0) {
                this.e = new eiu(this.b, this);
            } else {
                this.e = new eiu(this.b, this.c.a, this.c.b, this);
            }
            eiu eiu = this.e;
            Uri uri2 = this.d;
            eiu.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{uri2});
            return false;
        } else if (this.h) {
            return true;
        } else {
            return false;
        }
    }

    public final void a() {
        b();
        this.a = null;
    }

    public final void a(Bitmap bitmap) {
        this.g = bitmap;
        this.h = true;
        eiv eiv = this.a;
        if (eiv != null) {
            eiv.a(this.g);
        }
        this.e = null;
    }

    private final void b() {
        eiu eiu = this.e;
        if (eiu != null) {
            eiu.cancel(true);
            this.e = null;
        }
        this.d = null;
        this.g = null;
        this.h = false;
    }
}
