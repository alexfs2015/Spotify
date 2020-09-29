package defpackage;

import android.media.AudioManager;

/* renamed from: rzx reason: default package */
public final class rzx implements wig<rzw> {
    private final wzi<AudioManager> a;

    private rzx(wzi<AudioManager> wzi) {
        this.a = wzi;
    }

    public static rzx a(wzi<AudioManager> wzi) {
        return new rzx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rzw(wif.b(this.a));
    }
}
