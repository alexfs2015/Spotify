package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: kc reason: default package */
public final class kc {
    final ke<?> a;

    kc(ke<?> keVar) {
        this.a = keVar;
    }

    public final Fragment a(String str) {
        return this.a.d.b(str);
    }

    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.d.onCreateView(view, str, context, attributeSet);
    }

    public final void a() {
        this.a.d.m();
    }

    public final boolean b() {
        return this.a.d.k();
    }
}
