package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import com.spotify.music.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: fw reason: default package */
public final class fw {
    public static ColorStateList a(Resources resources, int i, Theme theme) {
        try {
            return a(resources, (XmlPullParser) resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return b(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    private static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        TypedArray typedArray;
        AttributeSet attributeSet2 = attributeSet;
        Theme theme2 = theme;
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next != 2 || depth2 > depth || !xmlPullParser.getName().equals("item")) {
                Resources resources2 = resources;
            } else {
                int[] iArr3 = a.a;
                if (theme2 == null) {
                    typedArray = resources.obtainAttributes(attributeSet2, iArr3);
                } else {
                    Resources resources3 = resources;
                    typedArray = theme2.obtainStyledAttributes(attributeSet2, iArr3, 0, 0);
                }
                int color = typedArray.getColor(a.b, -65281);
                float f = 1.0f;
                if (typedArray.hasValue(a.c)) {
                    f = typedArray.getFloat(a.c, 1.0f);
                } else if (typedArray.hasValue(a.d)) {
                    f = typedArray.getFloat(a.d, 1.0f);
                }
                typedArray.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                    if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == R.attr.alpha)) {
                        int i5 = i3 + 1;
                        if (!attributeSet2.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr4, i3);
                iArr2 = ga.a(iArr2, i2, (Math.round(((float) Color.alpha(color)) * f) << 24) | (color & 16777215));
                iArr = (int[][]) ga.a((T[]) iArr, i2, trimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2][];
        System.arraycopy(iArr2, 0, iArr5, 0, i2);
        System.arraycopy(iArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
