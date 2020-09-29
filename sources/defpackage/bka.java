package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bka reason: default package */
final class bka extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ bjw a;

    private bka(bjw bjw) {
        this.a = bjw;
    }

    /* synthetic */ bka(bjw bjw, byte b) {
        this(bjw);
    }

    private final String a() {
        try {
            this.a.h = (dio) this.a.c.get(((Long) dqe.f().a(dtg.cx)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            cpn.a(5);
        }
        return this.a.c();
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
}
