package defpackage;

import android.content.Intent;

/* renamed from: ofy reason: default package */
public final class ofy {
    public gco<Intent, Integer, Boolean> a = $$Lambda$ofy$1UyiaRAGMdz8Gntjz8SW8bAOYw.INSTANCE;
    public a b = $$Lambda$ofy$Ry8gG7TxP3dFIYPOKRyUjSuk.INSTANCE;

    /* renamed from: ofy$a */
    public interface a {
        boolean onActivityResult(int i, int i2, Intent intent);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i, int i2, Intent intent) {
        return false;
    }

    public final void a() {
        this.a = $$Lambda$ofy$TXwmAmIECoQ1JnAVGbAbeq77xts.INSTANCE;
    }

    public final boolean a(Intent intent, int i) {
        return ((Boolean) this.a.apply(intent, Integer.valueOf(i))).booleanValue();
    }
}
