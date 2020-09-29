package defpackage;

import android.os.AsyncTask;

/* renamed from: rkh reason: default package */
final class rkh extends AsyncTask<Void, Void, Void> {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return null;
    }

    rkh() {
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        jrh.b("This dummy task must be called from the main thread");
        super.onPreExecute();
    }
}
