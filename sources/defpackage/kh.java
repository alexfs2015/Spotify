package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: kh reason: default package */
public final class kh {
    final kj<?> a;

    kh(kj<?> kjVar) {
        this.a = kjVar;
    }

    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.d.onCreateView(view, str, context, attributeSet);
    }

    public final Fragment a(String str) {
        return this.a.d.b(str);
    }

    public final void a() {
        this.a.d.n();
    }

    public final boolean b() {
        return this.a.d.l();
    }
}
