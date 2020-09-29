package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;
import io.reactivex.Scheduler;

/* renamed from: lxy reason: default package */
public final class lxy {
    Scheduler a;
    Scheduler b;
    private final lyh c;
    private final lyj d;
    private final hwi e = new hwi();
    private final jty f;

    public lxy(Context context, lyh lyh, jty jty) {
        this.c = lyh;
        this.d = new lyj(context);
        this.f = jty;
    }

    public final lyb a(Context context, hqr hqr, hpt hpt, Picasso picasso, String str) {
        lyb lyb = new lyb(context, str, this.c, this, hpt, hqr, this.d, picasso, this.a, this.b, this.f, this.e);
        return lyb;
    }
}
