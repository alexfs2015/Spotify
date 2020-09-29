package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: ake reason: default package */
public class ake extends AsyncTask<Void, Void, List<akg>> {
    private static final String a = ake.class.getCanonicalName();
    private final HttpURLConnection b;
    private final akf c;
    private Exception d;

    /* access modifiers changed from: protected */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((List) obj);
        Exception exc = this.d;
        if (exc != null) {
            amw.b(a, String.format("onPostExecute: exception encountered during request: %s", new Object[]{exc.getMessage()}));
        }
    }

    public ake(akf akf) {
        this(null, akf);
    }

    private ake(HttpURLConnection httpURLConnection, akf akf) {
        this.c = akf;
        this.b = null;
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

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Handler handler;
        super.onPreExecute();
        if (akc.c()) {
            amw.b(a, String.format("execute async task: %s", new Object[]{this}));
        }
        if (this.c.a == null) {
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.c.a = handler;
        }
    }

    private List<akg> a() {
        try {
            if (this.b == null) {
                return akd.a(this.c);
            }
            return akd.a(this.b, this.c);
        } catch (Exception e) {
            this.d = e;
            return null;
        }
    }
}
