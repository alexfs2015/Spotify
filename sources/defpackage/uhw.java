package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.music.freetiercommon.uicomponents.Rows.c;

/* renamed from: uhw reason: default package */
public final class uhw {
    public final c a;
    public final Context b;
    public final int c = vfj.b(16.0f, this.b.getResources());
    public final float d;
    private final szp e;

    public uhw(c cVar, szp szp, Context context) {
        this.a = cVar;
        this.e = szp;
        this.b = context;
        int b2 = vfj.b(48.0f, this.b.getResources());
        this.d = ((float) this.c) / ((float) b2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        this.e.a(str);
    }

    public final void a(String str) {
        this.a.getView().setOnClickListener(new $$Lambda$uhw$KKEzXaXwKVrR8ClSJR8WfR1blg(this, str));
    }
}
