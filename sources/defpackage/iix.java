package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.image.ImageFormat;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: iix reason: default package */
public final class iix {
    final Picasso a;
    public final Set<b> b = new HashSet(5);
    public boolean c;
    private final Handler d = new Handler(Looper.getMainLooper());

    /* renamed from: iix$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ImageFormat.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.spotlets.appprotocol.image.ImageFormat[] r0 = com.spotify.mobile.android.spotlets.appprotocol.image.ImageFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.spotlets.appprotocol.image.ImageFormat r1 = com.spotify.mobile.android.spotlets.appprotocol.image.ImageFormat.PNG     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.spotlets.appprotocol.image.ImageFormat r1 = com.spotify.mobile.android.spotlets.appprotocol.image.ImageFormat.JPEG     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.iix.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: iix$a */
    public interface a {
        void a();

        void a(byte[] bArr);

        void b();
    }

    /* renamed from: iix$b */
    public final class b implements vsr {
        final Uri a;
        final int b;
        final int c;
        private final ImageFormat e;
        private final a f;
        private boolean g;
        private final boolean h;

        public final void b(Drawable drawable) {
        }

        b(a aVar, Uri uri, ImageFormat imageFormat, int i, int i2, boolean z) {
            Logger.a("Loading %s image with uri = \"%s\", size = %d x %d.", imageFormat, uri, Integer.valueOf(i), Integer.valueOf(i2));
            this.f = aVar;
            this.a = uri;
            this.e = imageFormat;
            this.c = i;
            this.b = i2;
            this.h = z;
        }

        public final void a() {
            if (this.h) {
                Logger.d("Throttled an outstanding image request with uri = \"%s\".", this.a);
                this.g = true;
                this.f.b();
                synchronized (iix.this.b) {
                    iix.this.b.remove(this);
                }
            }
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            CompressFormat compressFormat;
            fay.a(!bitmap.isRecycled());
            if (!this.g && !iix.this.c) {
                ImageFormat imageFormat = this.e;
                double width = (double) (bitmap.getWidth() * bitmap.getHeight() * 3);
                Double.isNaN(width);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) (width * 0.5d));
                int i = AnonymousClass1.a[imageFormat.ordinal()];
                if (i == 1) {
                    compressFormat = CompressFormat.PNG;
                } else if (i == 2) {
                    compressFormat = CompressFormat.JPEG;
                } else {
                    throw new IllegalArgumentException("Invalid image format.");
                }
                bitmap.compress(compressFormat, 90, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Logger.b("Loaded image with uri = \"%s\", size = %d bytes.", this.a, Integer.valueOf(byteArray.length));
                this.f.a(byteArray);
            }
            synchronized (iix.this.b) {
                iix.this.b.remove(this);
            }
            fay.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            if (!this.g && !iix.this.c) {
                Logger.e("Failed to load image with uri = \"%s\".", this.a);
                this.f.a();
            }
            synchronized (iix.this.b) {
                iix.this.b.remove(this);
            }
        }
    }

    /* renamed from: iix$c */
    static class c implements vst {
        private final int a;
        private final int b;

        c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final Bitmap a(Bitmap bitmap) {
            if (bitmap != null && bitmap.getWidth() == this.a && bitmap.getHeight() == this.b) {
                return bitmap;
            }
            float min = Math.min(((float) this.a) / ((float) bitmap.getWidth()), ((float) this.b) / ((float) bitmap.getHeight()));
            Bitmap createBitmap = Bitmap.createBitmap((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), Config.ARGB_8888);
            Matrix matrix = new Matrix();
            matrix.setScale(min, min);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(2));
            if (!bitmap.equals(createBitmap)) {
                bitmap.recycle();
            }
            return createBitmap;
        }

        public final String a() {
            return String.format(Locale.ENGLISH, "%s%d", new Object[]{c.class.getName(), Integer.valueOf(this.b)});
        }
    }

    public iix(Picasso picasso) {
        this.a = picasso;
    }

    public final void a(Uri uri, ImageFormat imageFormat, int i, int i2, boolean z, a aVar) {
        if (this.c) {
            Logger.e("Can't load images after the loader has been stopped.", new Object[0]);
            return;
        }
        b bVar = new b(aVar, uri, imageFormat, i, i2, z);
        synchronized (this.b) {
            this.b.add(bVar);
        }
        this.d.post(new $$Lambda$iix$8oJ1SQ3Ni0O3vGIa0_ggfGmGdYM(this, uri, bVar, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, b bVar, a aVar) {
        try {
            Logger.a("Attempting to load image with uri: \"%s\".", uri);
            iix.this.a.a(bVar.a).a((vst) new c(bVar.c, bVar.b)).a((vsr) bVar);
        } catch (Exception e) {
            Logger.e(e, "Exception while trying to load image with uri = \"%s\".", uri);
            synchronized (this.b) {
                this.b.remove(bVar);
                aVar.a();
            }
        }
    }

    public final void a() {
        this.c = true;
        synchronized (this.b) {
            this.b.clear();
        }
    }
}
