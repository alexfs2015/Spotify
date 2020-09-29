package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qpe$qpIfLzU4iXg_p23PkGxFTsDRC34 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qpe$qpIfLzU4iXg_p23PkGxFTsDRC34 implements Consumer {
    public static final /* synthetic */ $$Lambda$qpe$qpIfLzU4iXg_p23PkGxFTsDRC34 INSTANCE = new $$Lambda$qpe$qpIfLzU4iXg_p23PkGxFTsDRC34();

    private /* synthetic */ $$Lambda$qpe$qpIfLzU4iXg_p23PkGxFTsDRC34() {
    }

    public final void accept(Object obj) {
        Logger.e("Error: %s", ((Throwable) obj).getMessage());
    }
}
