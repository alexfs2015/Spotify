package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bjj reason: default package */
final class bjj extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ bjf a;

    private bjj(bjf bjf) {
        this.a = bjf;
    }

    /* synthetic */ bjj(bjf bjf, byte b) {
        this(bjf);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.a.f != null && str != null) {
            this.a.f.loadUrl(str);
        }
    }

    private final String a() {
        try {
            this.a.h = (dhx) this.a.c.get(((Long) dpn.f().a(dsp.cx)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            cow.a(5);
        }
        return this.a.c();
    }
}
