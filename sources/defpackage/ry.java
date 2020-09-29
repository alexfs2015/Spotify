package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ry reason: default package */
public final class ry implements Interpolator {
    private float[] a;
    private float[] b;

    public ry(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private ry(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a2 = gc.a(resources, theme, attributeSet, rs.l);
        String str = "pathData";
        if (gc.a(xmlPullParser, str)) {
            String a3 = gc.a(a2, xmlPullParser, str, 4);
            Path a4 = ge.a(a3);
            if (a4 != null) {
                a(a4);
            } else {
                StringBuilder sb = new StringBuilder("The path is null, which is created from ");
                sb.append(a3);
                throw new InflateException(sb.toString());
            }
        } else {
            String str2 = "controlX1";
            if (gc.a(xmlPullParser, str2)) {
                String str3 = "controlY1";
                if (gc.a(xmlPullParser, str3)) {
                    float a5 = gc.a(a2, xmlPullParser, str2, 0, 0.0f);
                    float a6 = gc.a(a2, xmlPullParser, str3, 1, 0.0f);
                    String str4 = "controlX2";
                    boolean a7 = gc.a(xmlPullParser, str4);
                    String str5 = "controlY2";
                    if (a7 != gc.a(xmlPullParser, str5)) {
                        throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                    } else if (!a7) {
                        Path path = new Path();
                        path.moveTo(0.0f, 0.0f);
                        path.quadTo(a5, a6, 1.0f, 1.0f);
                        a(path);
                    } else {
                        float a8 = gc.a(a2, xmlPullParser, str4, 2, 0.0f);
                        float a9 = gc.a(a2, xmlPullParser, str5, 3, 0.0f);
                        Path path2 = new Path();
                        path2.moveTo(0.0f, 0.0f);
                        path2.cubicTo(a5, a6, a8, a9, 1.0f, 1.0f);
                        a(path2);
                    }
                } else {
                    throw new InflateException("pathInterpolator requires the controlY1 attribute");
                }
            } else {
                throw new InflateException("pathInterpolator requires the controlX1 attribute");
            }
        }
        a2.recycle();
    }

    private void a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.a = new float[min];
            this.b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.a[i2] = fArr[0];
                this.b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.a[0])) <= 1.0E-5d && ((double) Math.abs(this.b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.b[i3] - 1.0f)) <= 1.0E-5d) {
                    int i4 = 0;
                    float f = 0.0f;
                    while (i < min) {
                        float[] fArr2 = this.a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            StringBuilder sb = new StringBuilder("The Path cannot loop back on itself, x :");
                            sb.append(f2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.a[0]);
            String str = ",";
            sb2.append(str);
            sb2.append(this.b[0]);
            sb2.append(" end:");
            int i6 = min - 1;
            sb2.append(this.a[i6]);
            sb2.append(str);
            sb2.append(this.b[i6]);
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("The Path has a invalid length ");
        sb3.append(length);
        throw new IllegalArgumentException(sb3.toString());
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.b[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.b;
        float f4 = fArr2[i];
        return f4 + (f3 * (fArr2[length] - f4));
    }
}
