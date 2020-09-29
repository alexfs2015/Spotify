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
    private db<lt<? super T>, a> f = new db<>();
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

    class LifecycleBoundObserver extends a implements lk {
        private lm d;

        LifecycleBoundObserver(lm lmVar, lt<? super T> ltVar) {
            super(ltVar);
            this.d = lmVar;
        }

        public final void a(lm lmVar, Event event) {
            if (this.d.Y_().a() == State.DESTROYED) {
                LiveData.this.a(this.a);
            } else {
                a(a());
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean a() {
            return this.d.Y_().a().a(State.STARTED);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(lm lmVar) {
            return this.d == lmVar;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            this.d.Y_().b(this);
        }
    }

    abstract class a {
        final lt<? super T> a;
        boolean b;
        int c = -1;

        a(lt<? super T> ltVar) {
            this.a = ltVar;
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

        /* access modifiers changed from: 0000 */
        public abstract boolean a();

        /* access modifiers changed from: 0000 */
        public boolean a(lm lmVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void b() {
        }
    }

    private static void a(String str) {
        if (!cx.a().a.c()) {
            StringBuilder sb = new StringBuilder("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
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

    /* access modifiers changed from: protected */
    public void a() {
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

    public final void a(lm lmVar, lt<? super T> ltVar) {
        a("observe");
        if (lmVar.Y_().a() != State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lmVar, ltVar);
            a aVar = (a) this.f.a(ltVar, lifecycleBoundObserver);
            if (aVar != null && !aVar.a(lmVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (aVar == null) {
                lmVar.Y_().a(lifecycleBoundObserver);
            }
        }
    }

    public void a(lt<? super T> ltVar) {
        a("removeObserver");
        a aVar = (a) this.f.b(ltVar);
        if (aVar != null) {
            aVar.b();
            aVar.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
        a("setValue");
        this.g++;
        this.d = t;
        a(null);
    }
}
