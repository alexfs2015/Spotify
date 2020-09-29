package androidx.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    final ArrayDeque<l> a;
    private final Runnable b;

    class LifecycleOnBackPressedCancellable implements j, lk {
        private final Lifecycle a;
        private final l b;
        private j c;

        LifecycleOnBackPressedCancellable(Lifecycle lifecycle, l lVar) {
            this.a = lifecycle;
            this.b = lVar;
            lifecycle.a(this);
        }

        public final void a() {
            this.a.b(this);
            this.b.b(this);
            j jVar = this.c;
            if (jVar != null) {
                jVar.a();
                this.c = null;
            }
        }

        public final void a(lm lmVar, Event event) {
            if (event == Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                l lVar = this.b;
                onBackPressedDispatcher.a.add(lVar);
                a aVar = new a(lVar);
                lVar.a(aVar);
                this.c = aVar;
                return;
            }
            if (event == Event.ON_STOP) {
                j jVar = this.c;
                if (jVar != null) {
                    jVar.a();
                }
            } else if (event == Event.ON_DESTROY) {
                a();
            }
        }
    }

    class a implements j {
        private final l a;

        a(l lVar) {
            this.a = lVar;
        }

        public final void a() {
            OnBackPressedDispatcher.this.a.remove(this.a);
            this.a.b(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = new ArrayDeque<>();
        this.b = runnable;
    }

    public final void a() {
        Iterator descendingIterator = this.a.descendingIterator();
        while (descendingIterator.hasNext()) {
            l lVar = (l) descendingIterator.next();
            if (lVar.a) {
                lVar.b();
                return;
            }
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void a(lm lmVar, l lVar) {
        Lifecycle Y_ = lmVar.Y_();
        if (Y_.a() != State.DESTROYED) {
            lVar.a(new LifecycleOnBackPressedCancellable(Y_, lVar));
        }
    }
}
