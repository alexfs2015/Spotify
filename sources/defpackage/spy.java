package defpackage;

import android.content.Intent;

/* renamed from: spy reason: default package */
public final class spy implements gjx<Intent> {
    private final String a;

    public final /* synthetic */ boolean a(Object obj) {
        return this.a.equals(((Intent) obj).getAction());
    }

    public spy(String str) {
        this.a = (String) fay.a(str);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("an intent with the action ");
        sb.append(this.a);
        return sb.toString();
    }

    public static gjx<Intent> b() {
        return new spy("android.intent.action.VIEW");
    }
}
