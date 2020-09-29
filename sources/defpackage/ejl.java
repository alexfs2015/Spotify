package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;

/* renamed from: ejl reason: default package */
public final class ejl extends AsyncTask<Uri, Long, Bitmap> {
    private static final ein a = new ein("FetchBitmapTask", 0);
    private final ehb b;
    private final egy c;

    public ejl(Context context, int i, int i2, egy egy) {
        this(context, i, i2, false, egy);
    }

    private ejl(Context context, int i, int i2, boolean z, egy egy) {
        this.b = eiw.a(context.getApplicationContext(), this, new egz(this, 0), i, i2, false);
        this.c = egy;
    }

    public ejl(Context context, egy egy) {
        this(context, 0, 0, false, egy);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Bitmap doInBackground(Uri... uriArr) {
        if (uriArr.length == 1 && uriArr[0] != null) {
            try {
                return this.b.a(uriArr[0]);
            } catch (RemoteException e) {
                a.a(e, "Unable to call %s on %s.", "doFetch", ehb.class.getSimpleName());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        egy egy = this.c;
        if (egy != null) {
            egy.a(bitmap);
        }
    }
}
