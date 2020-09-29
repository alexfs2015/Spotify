package defpackage;

import android.widget.ProgressBar;
import com.google.common.base.Optional;

/* renamed from: tic reason: default package */
public final class tic implements igp {
    private final ProgressBar a;
    private final jsm<ProgressBar> b = new jsm<>(this.a, Optional.e());

    public tic(ProgressBar progressBar) {
        this.a = progressBar;
    }

    public final void a(long j) {
        this.a.setMax((int) j);
    }

    public final void a(long j, long j2, float f) {
        this.b.b(j, j2, f);
    }
}
