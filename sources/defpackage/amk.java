package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Locale;

/* renamed from: amk reason: default package */
public final class amk {
    Context a;
    Uri b;
    b c;
    boolean d;
    Object e;

    /* renamed from: amk$a */
    public static class a {
        Context a;
        Uri b;
        public b c;
        public boolean d;
        public Object e;

        public a(Context context, Uri uri) {
            amx.a((Object) uri, "imageUri");
            this.a = context;
            this.b = uri;
        }

        public final amk a() {
            return new amk(this, 0);
        }
    }

    /* renamed from: amk$b */
    public interface b {
        void a(aml aml);
    }

    /* synthetic */ amk(a aVar, byte b2) {
        this(aVar);
    }

    public static Uri a(String str, int i, int i2) {
        amx.a(str, "userId");
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (max == 0 && max2 == 0) {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        Builder path = Uri.parse(amu.b()).buildUpon().path(String.format(Locale.US, "%s/%s/picture", new Object[]{akc.h(), str}));
        if (max2 != 0) {
            path.appendQueryParameter("height", String.valueOf(max2));
        }
        if (max != 0) {
            path.appendQueryParameter("width", String.valueOf(max));
        }
        path.appendQueryParameter("migration_overrides", "{october_2012:true}");
        return path.build();
    }

    private amk(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e == null ? new Object() : aVar.e;
    }
}
