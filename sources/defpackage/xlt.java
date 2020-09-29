package defpackage;

import java.util.ArrayList;

/* renamed from: xlt reason: default package */
public class xlt {
    private int a;
    private Object[] b;
    private int c;
    public Object[] f;
    public volatile int g;

    public xlt(int i) {
        this.a = i;
    }

    public final void a(Object obj) {
        if (this.g == 0) {
            this.f = new Object[(this.a + 1)];
            Object[] objArr = this.f;
            this.b = objArr;
            objArr[0] = obj;
            this.c = 1;
            this.g = 1;
            return;
        }
        int i = this.c;
        int i2 = this.a;
        if (i == i2) {
            Object[] objArr2 = new Object[(i2 + 1)];
            objArr2[0] = obj;
            this.b[i2] = objArr2;
            this.b = objArr2;
            this.c = 1;
            this.g++;
            return;
        }
        this.b[i] = obj;
        this.c = i + 1;
        this.g++;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.g;
        ArrayList arrayList = new ArrayList(i2 + 1);
        Object[] objArr = this.f;
        int i3 = 0;
        while (true) {
            int i4 = 0;
            while (i3 < i2) {
                arrayList.add(objArr[i4]);
                i3++;
                i4++;
                if (i4 == i) {
                    objArr = objArr[i];
                }
            }
            return arrayList.toString();
        }
    }
}
