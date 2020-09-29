package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.music.freetiercommon.uicomponents.Rows.c;

/* renamed from: tvt reason: default package */
public final class tvt {
    public final c a;
    public final Context b;
    public final int c = uts.b(16.0f, this.b.getResources());
    public final float d;
    private final spi e;

    public tvt(c cVar, spi spi, Context context) {
        this.a = cVar;
        this.e = spi;
        this.b = context;
        int b2 = uts.b(48.0f, this.b.getResources());
        this.d = ((float) this.c) / ((float) b2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        this.e.a(str);
    }

    public final void a(String str) {
        this.a.getView().setOnClickListener(new $$Lambda$tvt$dnhaybp8OOA8hno31vXTn499MIg(this, str));
    }
}
