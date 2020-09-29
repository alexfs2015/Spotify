package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.spotify.music.R;

/* renamed from: lyj reason: default package */
public final class lyj {
    public final byte[] a;

    public lyj(Context context) {
        this.a = lyg.a(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.placeholder_playlist), 50, 50, false), CompressFormat.PNG, 90);
    }
}
