package defpackage;

import com.spotify.base.java.logging.Logger;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: jht reason: default package */
public class jht {
    private boolean a = false;
    private final String b;
    private StackTraceElement[] c;
    protected final Collection<jhy> d = new CopyOnWriteArrayList();
    public boolean e = false;

    /* access modifiers changed from: protected */
    public void d() {
    }

    public jht(String str) {
        this.b = (String) fay.a(str);
    }

    /* access modifiers changed from: protected */
    public synchronized void af_() {
        this.a = true;
    }

    public final void a(jhy jhy) {
        this.d.add(jhy);
    }

    public final void b(jhy jhy) {
        this.d.remove(jhy);
    }

    /* access modifiers changed from: protected */
    public synchronized void ag_() {
        e();
        if (!this.a) {
            throw new IllegalStateException("Trying to enable the state that has not been started");
        } else if (!this.e) {
            this.e = true;
            Logger.c("%s: enabled", this.b);
            for (jhy a2 : this.d) {
                a2.a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void ah_() {
        e();
        if (!this.a) {
            throw new IllegalStateException("Trying to disable the state that has not been started");
        } else if (this.e) {
            this.e = false;
            Logger.c("%s: disabled", this.b);
            for (jhy b2 : this.d) {
                b2.b();
            }
        }
    }

    public final boolean g() {
        return !this.e;
    }

    private void e() {
        this.c = Thread.currentThread().getStackTrace();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(':');
        sb.append(f());
        return sb.toString();
    }

    private String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e ? "enabled" : "disabled");
        StackTraceElement[] stackTraceElementArr = this.c;
        if (stackTraceElementArr != null) {
            int i = 3;
            if (stackTraceElementArr.length > 3) {
                while (i < this.c.length && i < 7) {
                    sb.append(" <- ");
                    sb.append(this.c[i]);
                    i++;
                }
            }
        }
        return sb.toString();
    }
}
