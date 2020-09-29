package defpackage;

import android.os.Bundle;

/* renamed from: kfs reason: default package */
public abstract class kfs extends vtv {
    public khh a;

    public static Bundle a(kdo kdo) {
        Bundle bundle = new Bundle();
        bundle.putString("story_id", kdp.a(kdo));
        return bundle;
    }

    public void g() {
        super.g();
        this.a.a((khg) new a(c()));
    }

    public void h() {
        this.a.a((khg) new d(c()));
        super.h();
    }

    private String c() {
        return (String) fay.a(l().getString("story_id"));
    }
}
