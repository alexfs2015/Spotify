package defpackage;

import android.content.Context;

/* renamed from: bck reason: default package */
public final class bck implements a {
    private final Context a;
    private final bcu b;
    private final a c;

    public bck(Context context, a aVar) {
        this(context, (bcu) null, aVar);
    }

    private bck(Context context, bcu bcu, a aVar) {
        this.a = context.getApplicationContext();
        this.b = bcu;
        this.c = aVar;
    }

    public bck(Context context, String str) {
        this(context, str, (bcu) null);
    }

    private bck(Context context, String str, bcu bcu) {
        this(context, (bcu) null, (a) new bcm(str, null));
    }

    public final /* synthetic */ bce a() {
        bcj bcj = new bcj(this.a, this.c.a());
        bcu bcu = this.b;
        if (bcu != null) {
            bcj.a(bcu);
        }
        return bcj;
    }
}
