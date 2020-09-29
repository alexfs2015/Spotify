package defpackage;

import android.content.Intent;

/* renamed from: rwc reason: default package */
public final class rwc implements a {
    private final glm a;
    private final String b;
    private final long c;

    public rwc(glm glm, String str, long j) {
        this.a = glm;
        this.b = str;
        this.c = j;
    }

    public final void a(long j, long j2, Intent intent) {
        boolean z = false;
        if (j2 - j < this.c) {
            if (!(intent == null || intent.getComponent() == null)) {
                if ("android.intent.action.MAIN".equals(intent.getAction()) && intent.getComponent().getClassName().equals(this.b) && intent.getData() == null) {
                    z = true;
                }
            }
            if (!z) {
                this.a.a("non_default_uri_requested", (String) null);
            }
        } else {
            this.a.a("no_main_activity", (String) null);
        }
    }
}
