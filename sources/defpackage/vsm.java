package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.InputStream;

/* renamed from: vsm reason: default package */
public abstract class vsm {

    /* renamed from: vsm$a */
    public static final class a {
        final LoadedFrom a;
        final Bitmap b;
        final InputStream c;
        final int d;

        public a(Bitmap bitmap, LoadedFrom loadedFrom) {
            this((Bitmap) vsv.a(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public a(InputStream inputStream, LoadedFrom loadedFrom) {
            this(null, (InputStream) vsv.a(inputStream, "stream == null"), loadedFrom, 0);
        }

        public a(Bitmap bitmap, InputStream inputStream, LoadedFrom loadedFrom, int i) {
            boolean z = true;
            boolean z2 = bitmap != null;
            if (inputStream == null) {
                z = false;
            }
            if (z ^ z2) {
                this.b = bitmap;
                this.c = inputStream;
                this.a = (LoadedFrom) vsv.a(loadedFrom, "loadedFrom == null");
                this.d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: protected */
    public int a() {
        return 0;
    }

    public abstract a a(vsk vsk, int i);

    /* access modifiers changed from: protected */
    public boolean a(NetworkInfo networkInfo) {
        return false;
    }

    public abstract boolean a(vsk vsk);

    /* access modifiers changed from: protected */
    public boolean b() {
        return false;
    }

    protected static Options c(vsk vsk) {
        boolean c = vsk.c();
        boolean z = vsk.q != null;
        Options options = null;
        if (c || z) {
            options = new Options();
            options.inJustDecodeBounds = c;
            if (z) {
                options.inPreferredConfig = vsk.q;
            }
        }
        return options;
    }

    static boolean a(Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    static void a(int i, int i2, Options options, vsk vsk) {
        a(i, i2, options.outWidth, options.outHeight, options, vsk);
    }

    protected static void a(int i, int i2, int i3, int i4, Options options, vsk vsk) {
        int i5;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                floor = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor3 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                i5 = vsk.k ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            i5 = (int) floor;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }
}
