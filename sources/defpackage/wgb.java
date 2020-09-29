package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.InputStream;

/* renamed from: wgb reason: default package */
public class wgb extends wgs {
    protected final Context a;

    public wgb(Context context) {
        this.a = context;
    }

    public a a(wgq wgq, int i) {
        return new a(b(wgq), LoadedFrom.DISK);
    }

    public boolean a(wgq wgq) {
        return "content".equals(wgq.d.getScheme());
    }

    /* access modifiers changed from: protected */
    public final InputStream b(wgq wgq) {
        return this.a.getContentResolver().openInputStream(wgq.d);
    }
}
