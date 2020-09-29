package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: aks reason: default package */
public class aks extends AsyncTask<Void, Void, List<aku>> {
    private static final String a = aks.class.getCanonicalName();
    private final HttpURLConnection b;
    private final akt c;
    private Exception d;

    public aks(akt akt) {
        this(null, akt);
    }

    private aks(HttpURLConnection httpURLConnection, akt akt) {
        this.c = akt;
        this.b = null;
    }

    private List<aku> a() {
        try {
            return this.b == null ? akr.a(this.c) : akr.a(this.b, this.c);
        } catch (Exception e) {
            this.d = e;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((List) obj);
        Exception exc = this.d;
        if (exc != null) {
            ank.b(a, String.format("onPostExecute: exception encountered during request: %s", new Object[]{exc.getMessage()}));
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
        if (akq.c()) {
            ank.b(a, String.format("execute async task: %s", new Object[]{this}));
        }
        if (this.c.a == null) {
            this.c.a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{RequestAsyncTask: ");
        sb.append(" connection: ");
        sb.append(this.b);
        sb.append(", requests: ");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
