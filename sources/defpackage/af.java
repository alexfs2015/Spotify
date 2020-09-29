package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

/* renamed from: af reason: default package */
class af extends ad {
    private a b;
    private boolean c;

    /* renamed from: af$a */
    static class a extends b {
        private int[][] a;

        a(a aVar, af afVar, Resources resources) {
            super(aVar, afVar, resources);
            if (aVar != null) {
                this.a = aVar.a;
            } else {
                this.a = new int[this.d.length][];
            }
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            int[][] iArr = this.a;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.a;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.a = iArr2;
        }

        /* access modifiers changed from: 0000 */
        public final int a(int[] iArr, Drawable drawable) {
            int a2 = a(drawable);
            this.a[a2] = iArr;
            return a2;
        }

        /* access modifiers changed from: 0000 */
        public final int b(int[] iArr) {
            int[][] iArr2 = this.a;
            int i = this.e;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new af(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new af(this, resources);
        }

        public final void b(int i, int i2) {
            super.b(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.a, 0, iArr, 0, i);
            this.a = iArr;
        }
    }

    public boolean isStateful() {
        return true;
    }

    af() {
        this(null, null);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b2 = this.b.b(iArr);
        if (b2 < 0) {
            b2 = this.b.b(StateSet.WILD_CARD);
        }
        return a(b2) || onStateChange;
    }

    static int[] a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.c && super.mutate() == this) {
            this.b.a();
            this.c = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public a b() {
        return new a(this.b, this, null);
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        super.a(bVar);
        if (bVar instanceof a) {
            this.b = (a) bVar;
        }
    }

    af(a aVar, Resources resources) {
        a((b) new a(aVar, this, resources));
        onStateChange(getState());
    }

    af(a aVar) {
    }
}
