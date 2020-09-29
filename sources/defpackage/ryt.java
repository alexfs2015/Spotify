package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ryt reason: default package */
public final class ryt {
    public final a a;
    public final Context b;
    public final fqn c;

    /* renamed from: ryt$a */
    public interface a {
        Intent getIntent(Context context, fqn fqn);
    }

    public ryt(Context context, a aVar, fqn fqn) {
        this.b = context;
        this.a = aVar;
        this.c = fqn;
    }
}
