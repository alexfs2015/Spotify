package defpackage;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abi reason: default package */
public final class abi implements ace<aah> {
    private int a;

    public abi(int i) {
        this.a = i;
    }

    private void a(aah aah, List<Float> list) {
        int i;
        aah aah2 = aah;
        List<Float> list2 = list;
        int i2 = this.a << 2;
        if (list.size() > i2) {
            int size = (list.size() - i2) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i3 = 0;
            while (i2 < list.size()) {
                if (i2 % 2 == 0) {
                    dArr[i3] = (double) ((Float) list2.get(i2)).floatValue();
                } else {
                    dArr2[i3] = (double) ((Float) list2.get(i2)).floatValue();
                    i3++;
                }
                i2++;
            }
            for (int i4 = 0; i4 < aah2.b.length; i4++) {
                int i5 = aah2.b[i4];
                double d = (double) aah2.a[i4];
                int i6 = 1;
                while (true) {
                    if (i6 >= dArr.length) {
                        i = (int) (dArr2[dArr2.length - 1] * 255.0d);
                        break;
                    }
                    int i7 = i6 - 1;
                    double d2 = dArr[i7];
                    double d3 = dArr[i6];
                    if (dArr[i6] >= d) {
                        Double.isNaN(d);
                        double d4 = (d - d2) / (d3 - d2);
                        double d5 = dArr2[i7];
                        i = (int) ((d5 + (d4 * (dArr2[i6] - d5))) * 255.0d);
                        break;
                    }
                    i6++;
                }
                aah2.b[i4] = Color.argb(i, Color.red(i5), Color.green(i5), Color.blue(i5));
            }
        }
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i = this.a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < (this.a << 2); i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        aah aah = new aah(fArr, iArr);
        a(aah, (List<Float>) arrayList);
        return aah;
    }
}
