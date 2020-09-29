package defpackage;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: mg reason: default package */
public class mg<D> {
    private int a;
    private boolean b = true;
    a<D> c;
    protected Context d;
    public boolean e = false;
    public boolean f = false;
    boolean g = false;
    boolean h = false;

    /* renamed from: mg$a */
    public interface a<D> {
        void c(D d);
    }

    public mg(Context context) {
        this.d = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public final void a(int i, a<D> aVar) {
        if (this.c == null) {
            this.c = aVar;
            this.a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.c);
        if (this.e || this.g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.f || this.b) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f);
            printWriter.print(" mReset=");
            printWriter.println(this.b);
        }
    }

    public final void a(a<D> aVar) {
        a<D> aVar2 = this.c;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (aVar2 == aVar) {
            this.c = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return false;
    }

    public final void e() {
        this.e = true;
        this.b = false;
        this.f = false;
        f();
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    public final boolean g() {
        return b();
    }

    public final void h() {
        a();
    }

    public final void i() {
        this.b = true;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        hl.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
