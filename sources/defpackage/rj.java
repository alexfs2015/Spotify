package defpackage;

import android.view.View;

/* renamed from: rj reason: default package */
public abstract class rj extends qs {
    private static final String[] a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public final void a(qu quVar) {
        View view = quVar.b;
        Integer num = (Integer) quVar.a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        quVar.a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        quVar.a.put("android:visibilityPropagation:center", iArr);
    }

    public final String[] a() {
        return a;
    }

    public static int b(qu quVar) {
        if (quVar == null) {
            return 8;
        }
        Integer num = (Integer) quVar.a.get("android:visibilityPropagation:visibility");
        if (num == null) {
            return 8;
        }
        return num.intValue();
    }

    static int a(qu quVar, int i) {
        if (quVar == null) {
            return -1;
        }
        int[] iArr = (int[]) quVar.a.get("android:visibilityPropagation:center");
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }
}
