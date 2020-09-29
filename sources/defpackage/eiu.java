package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;

/* renamed from: eiu reason: default package */
public final class eiu extends AsyncTask<Uri, Long, Bitmap> {
    private static final ehw a = new ehw("FetchBitmapTask", 0);
    private final egk b;
    private final egh c;

    public eiu(Context context, egh egh) {
        this(context, 0, 0, false, egh);
    }

    public eiu(Context context, int i, int i2, egh egh) {
        this(context, i, i2, false, egh);
    }

    private eiu(Context context, int i, int i2, boolean z, egh egh) {
        this.b = eif.a(context.getApplicationContext(), this, new egi(this, 0), i, i2, false);
        this.c = egh;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Bitmap doInBackground(Uri... uriArr) {
        if (uriArr.length == 1 && uriArr[0] != null) {
            try {
                return this.b.a(uriArr[0]);
            } catch (RemoteException e) {
                a.a(e, "Unable to call %s on %s.", "doFetch", egk.class.getSimpleName());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        egh egh = this.c;
        if (egh != null) {
            egh.a(bitmap);
        }
    }
}
