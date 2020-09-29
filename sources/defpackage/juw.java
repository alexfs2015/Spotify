package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.SensorRecorder;
import io.reactivex.Flowable;

/* renamed from: juw reason: default package */
public final class juw implements wig<SensorRecorder> {
    private final wzi<Context> a;
    private final wzi<jlr> b;
    private final wzi<Flowable<fqn>> c;

    private juw(wzi<Context> wzi, wzi<jlr> wzi2, wzi<Flowable<fqn>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static juw a(wzi<Context> wzi, wzi<jlr> wzi2, wzi<Flowable<fqn>> wzi3) {
        return new juw(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new SensorRecorder((Context) this.a.get(), (jlr) this.b.get(), (Flowable) this.c.get());
    }
}
