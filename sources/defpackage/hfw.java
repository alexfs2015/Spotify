package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: hfw reason: default package */
public final class hfw {
    private static final Paint a = new Paint(3);
    private static final Rect[] b = {new Rect(0, 0, PlaybackSpeed.PLAYBACK_SPEED_150, PlaybackSpeed.PLAYBACK_SPEED_150), new Rect(PlaybackSpeed.PLAYBACK_SPEED_150, 0, 300, PlaybackSpeed.PLAYBACK_SPEED_150), new Rect(0, PlaybackSpeed.PLAYBACK_SPEED_150, PlaybackSpeed.PLAYBACK_SPEED_150, 300), new Rect(PlaybackSpeed.PLAYBACK_SPEED_150, PlaybackSpeed.PLAYBACK_SPEED_150, 300, 300)};

    private static int a(FileDescriptor fileDescriptor, float f, float f2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        if (((float) options.outHeight) <= f2 && ((float) options.outWidth) <= f) {
            return 1;
        }
        return Math.min(Math.round(((float) options.outHeight) / f2), Math.round(((float) options.outWidth) / f));
    }

    private static Bitmap a(String[] strArr, hpl hpl, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(300, 300, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = 0;
        while (i2 < strArr.length) {
            try {
                Options a2 = a(hpl, strArr[i2], (int) PlaybackSpeed.PLAYBACK_SPEED_150);
                if (a2 == null) {
                    break;
                }
                ParcelFileDescriptor a3 = hpl.a(strArr[i2]);
                if (a3 == null) {
                    break;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(a3.getFileDescriptor(), null, a2);
                a3.close();
                if (decodeFileDescriptor == null) {
                    break;
                }
                fbp.a(decodeFileDescriptor);
                fbp.a(canvas);
                fbp.a(i2 >= 0 && i2 <= 3);
                canvas.drawBitmap(decodeFileDescriptor, null, b[i2], a);
                decodeFileDescriptor.recycle();
                i2++;
            } catch (IOException unused) {
            }
        }
        if (i2 == 4) {
            return createBitmap;
        }
        createBitmap.recycle();
        return null;
    }

    private static Options a(hpl hpl, String str, int i) {
        ParcelFileDescriptor a2 = hpl.a(str);
        if (a2 == null) {
            return null;
        }
        FileDescriptor fileDescriptor = a2.getFileDescriptor();
        Options options = new Options();
        options.inJustDecodeBounds = false;
        float f = (float) i;
        options.inSampleSize = a(fileDescriptor, f, f);
        a2.close();
        return options;
    }

    public static ParcelFileDescriptor a(String str, hjg hjg) {
        fbp.a(a(str));
        fbp.a(hjg);
        fbp.a(a(str));
        fbp.a(a(str));
        if (!str.startsWith("spotify:mosaic:")) {
            str = c(str);
        }
        String[] split = str.substring(15).split(":");
        String[] strArr = new String[split.length];
        boolean z = false;
        for (int i = 0; i < split.length; i++) {
            String c = c(split[i]);
            if (split[i].startsWith("localfileimage")) {
                StringBuilder sb = new StringBuilder("spotify:");
                sb.append(Uri.decode(split[i]));
                strArr[i] = b(sb.toString());
            } else {
                if (!c.startsWith("http://") && !c.startsWith("https://")) {
                    String str2 = "spotify:image:";
                    if (!c.startsWith(str2)) {
                        StringBuilder sb2 = new StringBuilder(str2);
                        sb2.append(split[i]);
                        strArr[i] = b(sb2.toString());
                    }
                }
                strArr[i] = b(c);
            }
        }
        hjg.b();
        try {
            if (strArr.length > 0 && strArr.length != 4) {
                return hjg.d().a(strArr[0]);
            }
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (strArr.length <= 0) {
                hjg.c();
                return null;
            }
            hjg.c();
            try {
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                parcelFileDescriptor = createPipe[0];
                ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                fbp.a(strArr);
                fbp.a(hjg);
                fbp.a(parcelFileDescriptor2);
                if (strArr.length == 4) {
                    z = true;
                }
                fbp.a(z);
                a c2 = wit.a(((hhc) gih.a(hhc.class)).a()).c();
                c2.a(new $$Lambda$hfw$mEul2uThQTzel7Eofhfe5bw2MGw(hjg, strArr, parcelFileDescriptor2, c2));
            } catch (IOException unused) {
            }
            return parcelFileDescriptor;
        } finally {
            hjg.c();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(hjg hjg, String[] strArr, ParcelFileDescriptor parcelFileDescriptor, a aVar) {
        hjg.b();
        Bitmap a2 = a(strArr, hjg.d(), 300);
        if (a2 == null) {
            a2 = b(strArr, hjg.d(), 300);
        }
        if (a2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                a2.compress(CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            a2.recycle();
        }
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            Logger.e(e, "Unable to close", new Object[0]);
        }
        hjg.c();
        aVar.unsubscribe();
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        String str2 = "spotify:mosaic:";
        return str.startsWith(str2) || c(str).startsWith(str2);
    }

    private static Bitmap b(String[] strArr, hpl hpl, int i) {
        String str;
        int length = strArr.length;
        int i2 = 0;
        Options options = null;
        while (true) {
            if (i2 >= length) {
                str = null;
                break;
            }
            str = strArr[i2];
            try {
                options = a(hpl, str, 300);
                if (options != null) {
                    break;
                }
                i2++;
            } catch (IOException unused) {
            }
        }
        if (options == null) {
            return null;
        }
        ParcelFileDescriptor a2 = hpl.a(str);
        if (a2 == null) {
            return null;
        }
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(a2.getFileDescriptor(), null, options);
        try {
            a2.close();
        } catch (IOException unused2) {
        }
        return decodeFileDescriptor;
    }

    private static String b(String str) {
        return Base64.encodeToString(str.getBytes(fbi.c), 0);
    }

    private static String c(String str) {
        fbp.a(!str.startsWith("spotify:mosaic:"));
        try {
            return new String(Base64.decode(Uri.decode(str), 0), fbi.c);
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }
}
