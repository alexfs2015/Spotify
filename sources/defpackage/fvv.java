package defpackage;

import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import java.util.Arrays;

/* renamed from: fvv reason: default package */
public final class fvv {
    public static TransformationSet a(View view) {
        return ((d) fwq.a(0.0f, 1.0f).a().a(1.0f, 0.0f).a((TimeInterpolator) ftn.a).a(fwo.a(view, View.ALPHA)).a(1.0f, 0.8f).a(fwo.a(view, Arrays.asList(new Property[]{View.SCALE_X, View.SCALE_Y}))).a()).a;
    }
}
