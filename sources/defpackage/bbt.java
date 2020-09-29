package defpackage;

import android.content.Context;

/* renamed from: bbt reason: default package */
public final class bbt implements a {
    private final Context a;
    private final bcd b;
    private final a c;

    public bbt(Context context, String str) {
        this(context, str, (bcd) null);
    }

    private bbt(Context context, String str, bcd bcd) {
        this(context, (bcd) null, (a) new bbv(str, null));
    }

    public bbt(Context context, a aVar) {
        this(context, (bcd) null, aVar);
    }

    private bbt(Context context, bcd bcd, a aVar) {
        this.a = context.getApplicationContext();
        this.b = bcd;
        this.c = aVar;
    }

    public final /* synthetic */ bbn a() {
        bbs bbs = new bbs(this.a, this.c.a());
        bcd bcd = this.b;
        if (bcd != null) {
            bbs.a(bcd);
        }
        return bbs;
    }
}
