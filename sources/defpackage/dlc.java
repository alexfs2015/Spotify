package defpackage;

import android.view.View;

/* renamed from: dlc reason: default package */
public final class dlc implements dmi {
    private final View a;
    private final clq b;

    public dlc(View view, clq clq) {
        this.a = view;
        this.b = clq;
    }

    public final View a() {
        return this.a;
    }

    public final boolean b() {
        return this.b == null || this.a == null;
    }

    public final dmi c() {
        return this;
    }
}
