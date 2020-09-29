package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.InputStream;

/* renamed from: vrv reason: default package */
public class vrv extends vsm {
    protected final Context a;

    public vrv(Context context) {
        this.a = context;
    }

    public boolean a(vsk vsk) {
        return "content".equals(vsk.d.getScheme());
    }

    public a a(vsk vsk, int i) {
        return new a(b(vsk), LoadedFrom.DISK);
    }

    /* access modifiers changed from: protected */
    public final InputStream b(vsk vsk) {
        return this.a.getContentResolver().openInputStream(vsk.d);
    }
}
