package defpackage;

import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: alf reason: default package */
public class alf {
    private static final String a = alf.class.getCanonicalName();
    private static WeakReference<View> b = new WeakReference<>(null);
    private static Method c = null;

    private static List<View> g(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x014b, code lost:
        if (r4 != false) goto L_0x014d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0152 A[SYNTHETIC, Splitter:B:109:0x0152] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x015e A[Catch:{ JSONException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0175 A[Catch:{ JSONException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0188 A[Catch:{ JSONException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[Catch:{ JSONException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048 A[Catch:{ JSONException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[Catch:{ JSONException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject a(android.view.View r14, org.json.JSONObject r15) {
        /*
            java.lang.String r0 = b(r14)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r1 = c(r14)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.Object r2 = r14.getTag()     // Catch:{ JSONException -> 0x01a3 }
            java.lang.CharSequence r3 = r14.getContentDescription()     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r4 = "classname"
            java.lang.Class r5 = r14.getClass()     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r5 = r5.getCanonicalName()     // Catch:{ JSONException -> 0x01a3 }
            r15.put(r4, r5)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r4 = "classtypebitmask"
            boolean r5 = r14 instanceof android.widget.ImageView     // Catch:{ JSONException -> 0x01a3 }
            r6 = 0
            if (r5 == 0) goto L_0x0026
            r5 = 2
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            boolean r7 = h(r14)     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x002f
            r5 = r5 | 32
        L_0x002f:
            android.view.ViewParent r7 = r14.getParent()     // Catch:{ JSONException -> 0x01a3 }
            boolean r8 = r7 instanceof android.widget.AdapterView     // Catch:{ JSONException -> 0x01a3 }
            r9 = 1
            if (r8 != 0) goto L_0x003f
            boolean r7 = r7 instanceof defpackage.id     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r7 = 0
            goto L_0x0040
        L_0x003f:
            r7 = 1
        L_0x0040:
            if (r7 == 0) goto L_0x0044
            r5 = r5 | 512(0x200, float:7.175E-43)
        L_0x0044:
            boolean r7 = r14 instanceof android.widget.TextView     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x0067
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r5 = r5 | r9
            boolean r7 = r14 instanceof android.widget.Button     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x0060
            r5 = r5 | 4
            boolean r7 = r14 instanceof android.widget.Switch     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x0058
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0060
        L_0x0058:
            boolean r7 = r14 instanceof android.widget.CheckBox     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x0060
            r7 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r7
        L_0x0060:
            boolean r7 = r14 instanceof android.widget.EditText     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x0096
            r5 = r5 | 2048(0x800, float:2.87E-42)
            goto L_0x0096
        L_0x0067:
            boolean r7 = r14 instanceof android.widget.Spinner     // Catch:{ JSONException -> 0x01a3 }
            if (r7 != 0) goto L_0x0094
            boolean r7 = r14 instanceof android.widget.DatePicker     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x0070
            goto L_0x0094
        L_0x0070:
            boolean r7 = r14 instanceof android.widget.RatingBar     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x0078
            r7 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 | r7
            goto L_0x0096
        L_0x0078:
            boolean r7 = r14 instanceof android.widget.RadioGroup     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x007f
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x007f:
            boolean r7 = r14 instanceof android.view.ViewGroup     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x0096
            java.lang.ref.WeakReference<android.view.View> r7 = b     // Catch:{ JSONException -> 0x01a3 }
            java.lang.Object r7 = r7.get()     // Catch:{ JSONException -> 0x01a3 }
            android.view.View r7 = (android.view.View) r7     // Catch:{ JSONException -> 0x01a3 }
            boolean r7 = a(r14, r7)     // Catch:{ JSONException -> 0x01a3 }
            if (r7 == 0) goto L_0x0096
            r5 = r5 | 64
            goto L_0x0096
        L_0x0094:
            r5 = r5 | 4096(0x1000, float:5.74E-42)
        L_0x0096:
            r15.put(r4, r5)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r4 = "id"
            int r5 = r14.getId()     // Catch:{ JSONException -> 0x01a3 }
            r15.put(r4, r5)     // Catch:{ JSONException -> 0x01a3 }
            boolean r4 = r14 instanceof android.widget.TextView     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x014e
            r4 = r14
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ JSONException -> 0x01a3 }
            int r7 = r4.getInputType()     // Catch:{ JSONException -> 0x01a3 }
            r8 = 128(0x80, float:1.794E-43)
            if (r7 != r8) goto L_0x00b5
            r7 = 1
            goto L_0x00bb
        L_0x00b5:
            android.text.method.TransformationMethod r7 = r4.getTransformationMethod()     // Catch:{ JSONException -> 0x01a3 }
            boolean r7 = r7 instanceof android.text.method.PasswordTransformationMethod     // Catch:{ JSONException -> 0x01a3 }
        L_0x00bb:
            if (r7 != 0) goto L_0x014d
            java.lang.String r7 = b(r4)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r8 = "\\s"
            java.lang.String r7 = r7.replaceAll(r8, r5)     // Catch:{ JSONException -> 0x01a3 }
            int r8 = r7.length()     // Catch:{ JSONException -> 0x01a3 }
            r10 = 12
            if (r8 < r10) goto L_0x00ff
            r10 = 19
            if (r8 <= r10) goto L_0x00d4
            goto L_0x00ff
        L_0x00d4:
            int r8 = r8 - r9
            r10 = 0
            r11 = 0
        L_0x00d7:
            if (r8 < 0) goto L_0x00f9
            char r12 = r7.charAt(r8)     // Catch:{ JSONException -> 0x01a3 }
            r13 = 48
            if (r12 < r13) goto L_0x00ff
            r13 = 57
            if (r12 <= r13) goto L_0x00e6
            goto L_0x00ff
        L_0x00e6:
            int r12 = r12 + -48
            if (r11 == 0) goto L_0x00f3
            int r12 = r12 << 1
            r13 = 9
            if (r12 <= r13) goto L_0x00f3
            int r12 = r12 % 10
            int r12 = r12 + r9
        L_0x00f3:
            int r10 = r10 + r12
            r11 = r11 ^ 1
            int r8 = r8 + -1
            goto L_0x00d7
        L_0x00f9:
            int r10 = r10 % 10
            if (r10 != 0) goto L_0x00ff
            r7 = 1
            goto L_0x0100
        L_0x00ff:
            r7 = 0
        L_0x0100:
            if (r7 != 0) goto L_0x014d
            int r7 = r4.getInputType()     // Catch:{ JSONException -> 0x01a3 }
            r8 = 96
            if (r7 != r8) goto L_0x010c
            r7 = 1
            goto L_0x010d
        L_0x010c:
            r7 = 0
        L_0x010d:
            if (r7 != 0) goto L_0x014d
            int r7 = r4.getInputType()     // Catch:{ JSONException -> 0x01a3 }
            r8 = 112(0x70, float:1.57E-43)
            if (r7 != r8) goto L_0x0119
            r7 = 1
            goto L_0x011a
        L_0x0119:
            r7 = 0
        L_0x011a:
            if (r7 != 0) goto L_0x014d
            int r7 = r4.getInputType()     // Catch:{ JSONException -> 0x01a3 }
            r8 = 3
            if (r7 != r8) goto L_0x0125
            r7 = 1
            goto L_0x0126
        L_0x0125:
            r7 = 0
        L_0x0126:
            if (r7 != 0) goto L_0x014d
            int r7 = r4.getInputType()     // Catch:{ JSONException -> 0x01a3 }
            r8 = 32
            if (r7 != r8) goto L_0x0132
            r4 = 1
            goto L_0x014b
        L_0x0132:
            java.lang.String r4 = b(r4)     // Catch:{ JSONException -> 0x01a3 }
            if (r4 == 0) goto L_0x014a
            int r7 = r4.length()     // Catch:{ JSONException -> 0x01a3 }
            if (r7 != 0) goto L_0x013f
            goto L_0x014a
        L_0x013f:
            java.util.regex.Pattern r7 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ JSONException -> 0x01a3 }
            java.util.regex.Matcher r4 = r7.matcher(r4)     // Catch:{ JSONException -> 0x01a3 }
            boolean r4 = r4.matches()     // Catch:{ JSONException -> 0x01a3 }
            goto L_0x014b
        L_0x014a:
            r4 = 0
        L_0x014b:
            if (r4 == 0) goto L_0x014e
        L_0x014d:
            r6 = 1
        L_0x014e:
            java.lang.String r4 = "text"
            if (r6 != 0) goto L_0x015e
            java.lang.String r0 = defpackage.amw.c(r0)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r0 = defpackage.amw.a(r0, r5)     // Catch:{ JSONException -> 0x01a3 }
            r15.put(r4, r0)     // Catch:{ JSONException -> 0x01a3 }
            goto L_0x0166
        L_0x015e:
            r15.put(r4, r5)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r0 = "is_user_input"
            r15.put(r0, r9)     // Catch:{ JSONException -> 0x01a3 }
        L_0x0166:
            java.lang.String r0 = "hint"
            java.lang.String r1 = defpackage.amw.c(r1)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r1 = defpackage.amw.a(r1, r5)     // Catch:{ JSONException -> 0x01a3 }
            r15.put(r0, r1)     // Catch:{ JSONException -> 0x01a3 }
            if (r2 == 0) goto L_0x0186
            java.lang.String r0 = "tag"
            java.lang.String r1 = r2.toString()     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r1 = defpackage.amw.c(r1)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r1 = defpackage.amw.a(r1, r5)     // Catch:{ JSONException -> 0x01a3 }
            r15.put(r0, r1)     // Catch:{ JSONException -> 0x01a3 }
        L_0x0186:
            if (r3 == 0) goto L_0x0199
            java.lang.String r0 = "description"
            java.lang.String r1 = r3.toString()     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r1 = defpackage.amw.c(r1)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r1 = defpackage.amw.a(r1, r5)     // Catch:{ JSONException -> 0x01a3 }
            r15.put(r0, r1)     // Catch:{ JSONException -> 0x01a3 }
        L_0x0199:
            org.json.JSONObject r14 = i(r14)     // Catch:{ JSONException -> 0x01a3 }
            java.lang.String r0 = "dimension"
            r15.put(r0, r14)     // Catch:{ JSONException -> 0x01a3 }
            goto L_0x01a9
        L_0x01a3:
            r14 = move-exception
            java.lang.String r0 = a
            defpackage.amw.a(r0, r14)
        L_0x01a9:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alf.a(android.view.View, org.json.JSONObject):org.json.JSONObject");
    }

    public static JSONObject a(View view) {
        if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
            b = new WeakReference<>(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = a(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List g = g(view);
            for (int i = 0; i < g.size(); i++) {
                jSONArray.put(a((View) g.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e) {
            Log.e(a, "Failed to create JSONObject for view.", e);
        }
        return jSONObject;
    }

    private static boolean h(View view) {
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(view);
                if (obj == null) {
                    return false;
                }
                Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                if (declaredField2 == null || ((OnClickListener) declaredField2.get(obj)) == null) {
                    return false;
                }
                return true;
            }
        } catch (Exception e) {
            Log.e(a, "Failed to check if the view is clickable.", e);
        }
        return false;
    }

    public static String b(View view) {
        Object obj = null;
        if (view instanceof TextView) {
            obj = ((TextView) view).getText();
            if (view instanceof Switch) {
                obj = ((Switch) view).isChecked() ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY;
            }
        } else if (view instanceof Spinner) {
            Spinner spinner = (Spinner) view;
            if (spinner.getCount() > 0) {
                Object selectedItem = spinner.getSelectedItem();
                if (selectedItem != null) {
                    obj = selectedItem.toString();
                }
            }
        } else {
            int i = 0;
            if (view instanceof DatePicker) {
                DatePicker datePicker = (DatePicker) view;
                obj = String.format("%04d-%02d-%02d", new Object[]{Integer.valueOf(datePicker.getYear()), Integer.valueOf(datePicker.getMonth()), Integer.valueOf(datePicker.getDayOfMonth())});
            } else if (view instanceof TimePicker) {
                TimePicker timePicker = (TimePicker) view;
                obj = String.format("%02d:%02d", new Object[]{Integer.valueOf(timePicker.getCurrentHour().intValue()), Integer.valueOf(timePicker.getCurrentMinute().intValue())});
            } else if (view instanceof RadioGroup) {
                RadioGroup radioGroup = (RadioGroup) view;
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                int childCount = radioGroup.getChildCount();
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = radioGroup.getChildAt(i);
                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                        obj = ((RadioButton) childAt).getText();
                        break;
                    }
                    i++;
                }
            } else if (view instanceof RatingBar) {
                obj = String.valueOf(((RatingBar) view).getRating());
            }
        }
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public static String c(View view) {
        CharSequence charSequence = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    private static JSONObject i(View view) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("top", view.getTop());
            jSONObject.put("left", view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e) {
            Log.e(a, "Failed to create JSONObject for dimension.", e);
        }
        return jSONObject;
    }

    public static AccessibilityDelegate d(View view) {
        try {
            return (AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    public static OnTouchListener e(View view) {
        OnTouchListener onTouchListener;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
                onTouchListener = (OnTouchListener) declaredField2.get(obj);
            } else {
                onTouchListener = null;
            }
            return onTouchListener;
        } catch (NoSuchFieldException e) {
            amw.a(a, (Exception) e);
            return null;
        } catch (ClassNotFoundException e2) {
            amw.a(a, (Exception) e2);
            return null;
        } catch (IllegalAccessException e3) {
            amw.a(a, (Exception) e3);
            return null;
        }
    }

    public static boolean a(View view, View view2) {
        if (view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
            View a2 = a(j(view), view2);
            if (a2 != null && a2.getId() == view.getId()) {
                return true;
            }
        }
        return false;
    }

    private static float[] j(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new float[]{(float) iArr[0], (float) iArr[1]};
    }

    private static View a(float[] fArr, View view) {
        if (c == null) {
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e) {
                amw.a(a, (Exception) e);
            } catch (NoSuchMethodException e2) {
                amw.a(a, (Exception) e2);
            }
        }
        Method method = c;
        if (!(method == null || view == null)) {
            try {
                View view2 = (View) method.invoke(null, new Object[]{fArr, view});
                if (view2 != null && view2.getId() > 0) {
                    View view3 = (View) view2.getParent();
                    if (view3 != null) {
                        return view3;
                    }
                    return null;
                }
            } catch (IllegalAccessException e3) {
                amw.a(a, (Exception) e3);
            } catch (InvocationTargetException e4) {
                amw.a(a, (Exception) e4);
            }
        }
        return null;
    }

    public static View f(View view) {
        while (view != null) {
            if (!view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        return null;
    }
}
