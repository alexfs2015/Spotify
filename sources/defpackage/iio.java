package defpackage;

import android.media.AudioManager;

/* renamed from: iio reason: default package */
public final class iio implements wig<iin> {
    private final wzi<hzr> a;
    private final wzi<AudioManager> b;

    private iio(wzi<hzr> wzi, wzi<AudioManager> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static iio a(wzi<hzr> wzi, wzi<AudioManager> wzi2) {
        return new iio(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new iin((hzr) this.a.get(), (AudioManager) this.b.get());
    }
}
