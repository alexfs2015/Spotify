package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.spotify.music.R;

/* renamed from: luk reason: default package */
public final class luk {
    public final byte[] a;

    public luk(Context context) {
        this.a = luh.a(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.placeholder_playlist), 50, 50, false), CompressFormat.PNG, 90);
    }
}
