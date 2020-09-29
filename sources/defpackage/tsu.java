package defpackage;

import android.widget.ProgressBar;
import com.google.common.base.Optional;

/* renamed from: tsu reason: default package */
public final class tsu implements ijc {
    private final ProgressBar a;
    private final jut<ProgressBar> b = new jut<>(this.a, Optional.e());

    public tsu(ProgressBar progressBar) {
        this.a = progressBar;
    }

    public final void a(long j) {
        this.a.setMax((int) j);
    }

    public final void a(long j, long j2, float f) {
        this.b.b(j, j2, f);
    }
}
