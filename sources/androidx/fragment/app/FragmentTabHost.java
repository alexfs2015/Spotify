package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements OnTabChangeListener {
    private final ArrayList<b> a = new ArrayList<>();
    private int b;
    private OnTabChangeListener c;
    private b d;
    private boolean e;

    static class a extends BaseSavedState {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };
        String a;

        a(Parcelable parcelable) {
            super(parcelable);
        }

        a(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.a);
            sb.append("}");
            return sb.toString();
        }
    }

    static final class b {
        final String a;
        final Class<?> b;
        final Bundle c;
        Fragment d;
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.b = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.c = onTabChangeListener;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [kf] */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [km] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [km] */
    /* JADX WARNING: type inference failed for: r4v4, types: [km] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v2
      assigns: []
      uses: []
      mth insns count: 40
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r7 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = r7.getCurrentTabTag()
            java.util.ArrayList<androidx.fragment.app.FragmentTabHost$b> r1 = r7.a
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r4 = r2
        L_0x0010:
            if (r3 >= r1) goto L_0x0045
            java.util.ArrayList<androidx.fragment.app.FragmentTabHost$b> r5 = r7.a
            java.lang.Object r5 = r5.get(r3)
            androidx.fragment.app.FragmentTabHost$b r5 = (androidx.fragment.app.FragmentTabHost.b) r5
            java.lang.String r6 = r5.a
            androidx.fragment.app.Fragment r6 = r2.a(r6)
            r5.d = r6
            androidx.fragment.app.Fragment r6 = r5.d
            if (r6 == 0) goto L_0x0042
            androidx.fragment.app.Fragment r6 = r5.d
            boolean r6 = r6.B
            if (r6 != 0) goto L_0x0042
            java.lang.String r6 = r5.a
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0037
            r7.d = r5
            goto L_0x0042
        L_0x0037:
            if (r4 != 0) goto L_0x003d
            km r4 = r2.a()
        L_0x003d:
            androidx.fragment.app.Fragment r5 = r5.d
            r4.b(r5)
        L_0x0042:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0045:
            r1 = 1
            r7.e = r1
            km r0 = r7.a(r0, r4)
            if (r0 == 0) goto L_0x0054
            r0.b()
            r2.b()
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentTabHost.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.a = getCurrentTabTag();
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCurrentTabByTag(aVar.a);
    }

    @Deprecated
    public void onTabChanged(String str) {
        if (this.e) {
            km a2 = a(str, null);
            if (a2 != null) {
                a2.b();
            }
        }
        OnTabChangeListener onTabChangeListener = this.c;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.Context, kf] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [android.content.Context, kf]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [kf, android.content.Context]
      mth insns count: 33
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.km a(java.lang.String r4, defpackage.km r5) {
        /*
            r3 = this;
            androidx.fragment.app.FragmentTabHost$b r4 = r3.a(r4)
            androidx.fragment.app.FragmentTabHost$b r0 = r3.d
            if (r0 == r4) goto L_0x0050
            r0 = 0
            if (r5 != 0) goto L_0x000f
            km r5 = r0.a()
        L_0x000f:
            androidx.fragment.app.FragmentTabHost$b r1 = r3.d
            if (r1 == 0) goto L_0x001e
            androidx.fragment.app.Fragment r1 = r1.d
            if (r1 == 0) goto L_0x001e
            androidx.fragment.app.FragmentTabHost$b r1 = r3.d
            androidx.fragment.app.Fragment r1 = r1.d
            r5.b(r1)
        L_0x001e:
            if (r4 == 0) goto L_0x004e
            androidx.fragment.app.Fragment r1 = r4.d
            if (r1 != 0) goto L_0x0049
            kd r1 = r0.g()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Class<?> r2 = r4.b
            java.lang.String r2 = r2.getName()
            androidx.fragment.app.Fragment r0 = r1.c(r0, r2)
            r4.d = r0
            androidx.fragment.app.Fragment r0 = r4.d
            android.os.Bundle r1 = r4.c
            r0.g(r1)
            int r0 = r3.b
            androidx.fragment.app.Fragment r1 = r4.d
            java.lang.String r2 = r4.a
            r5.a(r0, r1, r2)
            goto L_0x004e
        L_0x0049:
            androidx.fragment.app.Fragment r0 = r4.d
            r5.c(r0)
        L_0x004e:
            r3.d = r4
        L_0x0050:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentTabHost.a(java.lang.String, km):km");
    }

    private b a(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.a.get(i);
            if (bVar.a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }
}
