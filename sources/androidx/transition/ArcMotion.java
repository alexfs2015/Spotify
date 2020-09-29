package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {
    private static final float a = ((float) Math.tan(Math.toRadians(35.0d)));
    private float b = 0.0f;
    private float c = 0.0f;
    private float d = 70.0f;
    private float e = 0.0f;
    private float f = 0.0f;
    private float g = a;

    public ArcMotion() {
    }

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qu.h);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        float a2 = gc.a(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f);
        this.c = a2;
        this.f = a(a2);
        float a3 = gc.a(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f);
        this.b = a3;
        this.e = a(a3);
        float a4 = gc.a(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f);
        this.d = a4;
        this.g = a(a4);
        obtainStyledAttributes.recycle();
    }

    private static float a(float f2) {
        if (f2 >= 0.0f && f2 <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f2 / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public final Path a(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        Path path = new Path();
        path.moveTo(f2, f3);
        float f11 = f4 - f2;
        float f12 = f5 - f3;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = (f2 + f4) / 2.0f;
        float f15 = (f3 + f5) / 2.0f;
        float f16 = 0.25f * f13;
        boolean z = f3 > f5;
        if (Math.abs(f11) < Math.abs(f12)) {
            float abs = Math.abs(f13 / (f12 * 2.0f));
            if (z) {
                f7 = abs + f5;
                f8 = f4;
            } else {
                f7 = abs + f3;
                f8 = f2;
            }
            f6 = this.f;
        } else {
            float f17 = f13 / (f11 * 2.0f);
            if (z) {
                f10 = f3;
                f9 = f17 + f2;
            } else {
                f9 = f4 - f17;
                f10 = f5;
            }
            f6 = this.e;
        }
        float f18 = f16 * f6 * f6;
        float f19 = f14 - f8;
        float f20 = f15 - f7;
        float f21 = (f19 * f19) + (f20 * f20);
        float f22 = this.g;
        float f23 = f16 * f22 * f22;
        if (f21 < f18) {
            f23 = f18;
        } else if (f21 <= f23) {
            f23 = 0.0f;
        }
        if (f23 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f23 / f21));
            f8 = ((f8 - f14) * sqrt) + f14;
            f7 = f15 + (sqrt * (f7 - f15));
        }
        path.cubicTo((f2 + f8) / 2.0f, (f3 + f7) / 2.0f, (f8 + f4) / 2.0f, (f7 + f5) / 2.0f, f4, f5);
        return path;
    }
}
