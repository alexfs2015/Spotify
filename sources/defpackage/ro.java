package defpackage;

import android.view.View;

/* renamed from: ro reason: default package */
public abstract class ro extends qx {
    private static final String[] a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    static int a(qz qzVar, int i) {
        if (qzVar == null) {
            return -1;
        }
        int[] iArr = (int[]) qzVar.a.get("android:visibilityPropagation:center");
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }

    public static int b(qz qzVar) {
        if (qzVar == null) {
            return 8;
        }
        Integer num = (Integer) qzVar.a.get("android:visibilityPropagation:visibility");
        if (num == null) {
            return 8;
        }
        return num.intValue();
    }

    public final void a(qz qzVar) {
        View view = qzVar.b;
        Integer num = (Integer) qzVar.a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        qzVar.a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        qzVar.a.put("android:visibilityPropagation:center", iArr);
    }

    public final String[] a() {
        return a;
    }
}
