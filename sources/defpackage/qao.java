package defpackage;

import android.app.Activity;
import com.spotify.music.follow.FollowManager;

/* renamed from: qao reason: default package */
public final class qao implements wig<qan> {
    private final wzi<Activity> a;
    private final wzi<jmr> b;
    private final wzi<mfo> c;
    private final wzi<FollowManager> d;
    private final wzi<hec> e;

    private qao(wzi<Activity> wzi, wzi<jmr> wzi2, wzi<mfo> wzi3, wzi<FollowManager> wzi4, wzi<hec> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static qao a(wzi<Activity> wzi, wzi<jmr> wzi2, wzi<mfo> wzi3, wzi<FollowManager> wzi4, wzi<hec> wzi5) {
        qao qao = new qao(wzi, wzi2, wzi3, wzi4, wzi5);
        return qao;
    }

    public final /* synthetic */ Object get() {
        qan qan = new qan((Activity) this.a.get(), (jmr) this.b.get(), (mfo) this.c.get(), (FollowManager) this.d.get(), (hec) this.e.get());
        return qan;
    }
}
