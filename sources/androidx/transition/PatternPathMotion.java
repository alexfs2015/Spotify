package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {
    private Path a;
    private final Path b = new Path();
    private final Matrix c = new Matrix();

    public PatternPathMotion() {
        this.b.lineTo(1.0f, 0.0f);
        this.a = this.b;
    }

    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qu.i);
        try {
            String a2 = gc.a(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (a2 != null) {
                Path a3 = ge.a(a2);
                PathMeasure pathMeasure = new PathMeasure(a3, false);
                float[] fArr = new float[2];
                pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
                float f = fArr[0];
                float f2 = fArr[1];
                pathMeasure.getPosTan(0.0f, fArr, null);
                float f3 = fArr[0];
                float f4 = fArr[1];
                if (f3 == f) {
                    if (f4 == f2) {
                        throw new IllegalArgumentException("pattern must not end at the starting point");
                    }
                }
                this.c.setTranslate(-f3, -f4);
                float f5 = f - f3;
                float f6 = f2 - f4;
                float a4 = 1.0f / a(f5, f6);
                this.c.postScale(a4, a4);
                this.c.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
                a3.transform(this.c, this.b);
                this.a = a3;
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static float a(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public final Path a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float a2 = a(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.c.setScale(a2, a2);
        this.c.postRotate((float) Math.toDegrees(atan2));
        this.c.postTranslate(f, f2);
        Path path = new Path();
        this.b.transform(this.c, path);
        return path;
    }
}
