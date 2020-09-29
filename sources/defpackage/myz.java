package defpackage;

import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import java.util.Arrays;

/* renamed from: myz reason: default package */
public final class myz implements fwk, fwn {
    private final View a;
    private final View b;
    private final TransformationSet c;
    private final TransformationSet d;

    public myz(View view, View view2, View view3, View view4) {
        this.a = (View) fay.a(view);
        this.b = (View) fay.a(view3);
        this.c = ((d) fwq.a(0.0f, 1.0f).a().a(1.0f, 0.0f).a((TimeInterpolator) ftn.a).a(fwo.a(view2, View.ALPHA)).a(1.0f, 0.9f).a(fwo.a(view2, Arrays.asList(new Property[]{View.SCALE_X, View.SCALE_Y}))).a()).a;
        this.d = fvv.a(view4);
    }

    public final View getView() {
        return this.a;
    }

    public final void a(int i, float f) {
        this.c.a(f);
        this.d.a(f);
        this.b.setTranslationY((float) (-i));
    }
}
