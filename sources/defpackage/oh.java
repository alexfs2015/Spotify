package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: oh reason: default package */
public final class oh {
    public boolean a = true;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f = 0;
    public int g = 0;
    public boolean h;
    public boolean i;

    public final View a(o oVar) {
        View a2 = oVar.a(this.c, false);
        this.c += this.d;
        return a2;
    }

    public final boolean a(s sVar) {
        int i2 = this.c;
        return i2 >= 0 && i2 < sVar.a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.b);
        sb.append(", mCurrentPosition=");
        sb.append(this.c);
        sb.append(", mItemDirection=");
        sb.append(this.d);
        sb.append(", mLayoutDirection=");
        sb.append(this.e);
        sb.append(", mStartLine=");
        sb.append(this.f);
        sb.append(", mEndLine=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
