package androidx.work;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {
    public Context a;
    public WorkerParameters b;
    public boolean c;
    private volatile boolean d;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a reason: collision with other inner class name */
        public static final class C0004a extends a {
            public final se a;

            public C0004a() {
                this(se.a);
            }

            private C0004a(se seVar) {
                this.a = seVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0004a) obj).a);
            }

            public final int hashCode() {
                return (C0004a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Failure {mOutputData=");
                sb.append(this.a);
                sb.append('}');
                return sb.toString();
            }
        }

        public static final class b extends a {
            public final String toString() {
                return "Retry";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }
        }

        public static final class c extends a {
            public final se a;

            public c() {
                this(se.a);
            }

            public c(se seVar) {
                this.a = seVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success {mOutputData=");
                sb.append(this.a);
                sb.append('}');
                return sb.toString();
            }
        }

        a() {
        }
    }

    public abstract fek<a> c();

    public void e() {
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.a = context;
            this.b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final UUID a() {
        return this.b.a;
    }

    public final se b() {
        return this.b.b;
    }

    public final void d() {
        this.d = true;
        e();
    }

    public final Executor f() {
        return this.b.c;
    }
}
