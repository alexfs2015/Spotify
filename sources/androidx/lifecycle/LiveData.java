package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    public static final Object b = new Object();
    final Object a = new Object();
    public int c = 0;
    public volatile Object d = b;
    volatile Object e = b;
    private db<lo<? super T>, a> f = new db<>();
    private int g = -1;
    private boolean h;
    private boolean i;
    private final Runnable j = new Runnable() {
        public final void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.e;
                LiveData.this.e = LiveData.b;
            }
            LiveData.this.b(obj);
        }
    };

    class LifecycleBoundObserver extends a implements lf {
        private lh d;

        LifecycleBoundObserver(lh lhVar, lo<? super T> loVar) {
            super(loVar);
            this.d = lhVar;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a() {
            return this.d.Y_().a().a(State.STARTED);
        }

        public final void a(lh lhVar, Event event) {
            if (this.d.Y_().a() == State.DESTROYED) {
                LiveData.this.a(this.a);
            } else {
                a(a());
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(lh lhVar) {
            return this.d == lhVar;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            this.d.Y_().b(this);
        }
    }

    abstract class a {
        final lo<? super T> a;
        boolean b;
        int c = -1;

        /* access modifiers changed from: 0000 */
        public abstract boolean a();

        /* access modifiers changed from: 0000 */
        public boolean a(lh lhVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void b() {
        }

        a(lo<? super T> loVar) {
            this.a = loVar;
        }

        /* access modifiers changed from: 0000 */
        public final void a(boolean z) {
            if (z != this.b) {
                this.b = z;
                int i = 1;
                boolean z2 = LiveData.this.c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.c;
                if (!this.b) {
                    i = -1;
                }
                liveData.c = i2 + i;
                if (z2 && this.b) {
                    LiveData.this.a();
                }
                if (LiveData.this.c == 0 && !this.b) {
                    LiveData.this.b();
                }
                if (this.b) {
                    LiveData.this.a(this);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    private void b(a aVar) {
        if (aVar.b) {
            if (!aVar.a()) {
                aVar.a(false);
                return;
            }
            int i2 = aVar.c;
            int i3 = this.g;
            if (i2 < i3) {
                aVar.c = i3;
                aVar.a.onChanged(this.d);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (aVar == null) {
                d a2 = this.f.a();
                while (a2.hasNext()) {
                    b((a) ((Entry) a2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(aVar);
                aVar = null;
            }
        } while (this.i);
        this.h = false;
    }

    public final void a(lh lhVar, lo<? super T> loVar) {
        a("observe");
        if (lhVar.Y_().a() != State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lhVar, loVar);
            a aVar = (a) this.f.a(loVar, lifecycleBoundObserver);
            if (aVar != null && !aVar.a(lhVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (aVar == null) {
                lhVar.Y_().a(lifecycleBoundObserver);
            }
        }
    }

    public void a(lo<? super T> loVar) {
        a("removeObserver");
        a aVar = (a) this.f.b(loVar);
        if (aVar != null) {
            aVar.b();
            aVar.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.e == b;
            this.e = t;
        }
        if (z) {
            cx.a().b(this.j);
        }
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
        a("setValue");
        this.g++;
        this.d = t;
        a(null);
    }

    private static void a(String str) {
        if (!cx.a().a.c()) {
            StringBuilder sb = new StringBuilder("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
