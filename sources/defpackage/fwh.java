package defpackage;

import android.view.View;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: fwh reason: default package */
public abstract class fwh extends c implements fwk, fwn {
    private final View a;
    private final TransformationSet b = fvv.a(this.a);

    public fwh(View view) {
        this.a = (View) fay.a(view);
    }

    public View getView() {
        return this.a;
    }

    public void a(int i, float f) {
        this.b.a(f);
    }
}
