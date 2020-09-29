package defpackage;

import android.os.AsyncTask;

/* renamed from: rtn reason: default package */
final class rtn extends AsyncTask<Void, Void, Void> {
    rtn() {
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        jtr.b("This dummy task must be called from the main thread");
        super.onPreExecute();
    }
}
