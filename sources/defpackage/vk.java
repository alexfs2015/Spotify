package defpackage;

import androidx.work.WorkerParameters.a;

/* renamed from: vk reason: default package */
public final class vk implements Runnable {
    private tj a;
    private String b;
    private a c;

    public vk(tj tjVar, String str, a aVar) {
        this.a = tjVar;
        this.b = str;
        this.c = aVar;
    }

    public final void run() {
        this.a.f.a(this.b, this.c);
    }
}
