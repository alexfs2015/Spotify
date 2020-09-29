package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: jbi reason: default package */
public final class jbi {
    private final Context a;
    private final b b;
    private final a c;
    private final jty d;

    /* renamed from: jbi$a */
    public static class a {
    }

    /* renamed from: jbi$b */
    static class b {
        public static File a(File file, String str) {
            return new File(file, str);
        }
    }

    public jbi(Context context, b bVar, a aVar, jty jty) {
        this.a = context;
        this.b = bVar;
        this.c = aVar;
        this.d = jty;
    }

    public final Optional<Uri> a(Bitmap bitmap) {
        File a2 = a();
        if (a2.exists() || a2.mkdirs()) {
            StringBuilder sb = new StringBuilder();
            sb.append(xdp.a(10));
            sb.append(".png");
            File a3 = b.a(a2, sb.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(a3);
                bitmap.compress(CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                return Optional.b(FileProvider.a(this.a, String.format("%s.%s", new Object[]{this.d.d(), "instagram"}), a3));
            } catch (Exception e) {
                Logger.e(e.getMessage(), new Object[0]);
                return Optional.e();
            }
        } else {
            Logger.e("Could not make shareable directory: %s", a2.toString());
            return Optional.e();
        }
    }

    public File a() {
        return b.a(this.a.getCacheDir(), "shareablesdir");
    }
}
