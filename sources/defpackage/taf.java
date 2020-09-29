package defpackage;

import android.content.Intent;

/* renamed from: taf reason: default package */
public final class taf implements gli<Intent> {
    private final String a;

    public taf(String str) {
        this.a = (String) fbp.a(str);
    }

    public static gli<Intent> b() {
        return new taf("android.intent.action.VIEW");
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("an intent with the action ");
        sb.append(this.a);
        return sb.toString();
    }

    public final /* synthetic */ boolean a(Object obj) {
        return this.a.equals(((Intent) obj).getAction());
    }
}
