package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: rpj reason: default package */
public final class rpj {
    public final a a;
    public final Context b;
    public final fpt c;

    /* renamed from: rpj$a */
    public interface a {
        Intent getIntent(Context context, fpt fpt);
    }

    public rpj(Context context, a aVar, fpt fpt) {
        this.b = context;
        this.a = aVar;
        this.c = fpt;
    }
}
