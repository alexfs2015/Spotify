package defpackage;

import android.view.View;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: fxb reason: default package */
public abstract class fxb extends c implements fxe, fxh {
    private final View a;
    private final TransformationSet b = fwp.a(this.a);

    public fxb(View view) {
        this.a = (View) fbp.a(view);
    }

    public void a(int i, float f) {
        this.b.a(f);
    }

    public View getView() {
        return this.a;
    }
}
