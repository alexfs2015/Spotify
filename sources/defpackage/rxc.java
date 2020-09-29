package defpackage;

import android.content.Context;
import com.spotify.music.libs.bluetooth.BluetoothCategorizer;
import io.reactivex.Scheduler;

/* renamed from: rxc reason: default package */
public final class rxc implements wig<BluetoothCategorizer> {
    private final wzi<Context> a;
    private final wzi<rxf> b;
    private final wzi<jyg> c;
    private final wzi<Scheduler> d;

    private rxc(wzi<Context> wzi, wzi<rxf> wzi2, wzi<jyg> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rxc a(wzi<Context> wzi, wzi<rxf> wzi2, wzi<jyg> wzi3, wzi<Scheduler> wzi4) {
        return new rxc(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new BluetoothCategorizer((Context) this.a.get(), (rxf) this.b.get(), (jyg) this.c.get(), (Scheduler) this.d.get());
    }
}
