package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;
import io.reactivex.Scheduler;

/* renamed from: ltz reason: default package */
public final class ltz {
    Scheduler a;
    Scheduler b;
    private final lui c;
    private final luk d;
    private final htw e = new htw();

    public ltz(Context context, lui lui) {
        this.c = lui;
        this.d = new luk(context);
    }

    public final luc a(Context context, hop hop, hne hne, Picasso picasso, String str) {
        luc luc = new luc(context, str, this.c, this, hne, hop, this.d, picasso, this.a, this.b, this.e);
        return luc;
    }
}
