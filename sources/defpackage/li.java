package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map.Entry;

/* renamed from: li reason: default package */
public final class li extends Lifecycle {
    private da<lg, a> a = new da<>();
    private State b;
    private final WeakReference<lh> c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<State> g = new ArrayList<>();

    /* renamed from: li$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0086 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                androidx.lifecycle.Lifecycle$Event[] r5 = androidx.lifecycle.Lifecycle.Event.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                a = r5
                int[] r5 = a     // Catch:{ NoSuchFieldError -> 0x0053 }
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005d }
                androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x005d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0067 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0071 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007b }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0086 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0091 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.li.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: li$a */
    static class a {
        State a;
        private lf b;

        a(lg lgVar, State state) {
            this.b = ll.a((Object) lgVar);
            this.a = state;
        }

        /* access modifiers changed from: 0000 */
        public final void a(lh lhVar, Event event) {
            State b2 = li.b(event);
            this.a = li.a(this.a, b2);
            this.b.a(lhVar, event);
            this.a = b2;
        }
    }

    public li(lh lhVar) {
        this.c = new WeakReference<>(lhVar);
        this.b = State.INITIALIZED;
    }

    public final void a(Event event) {
        a(b(event));
    }

    public void a(State state) {
        if (this.b != state) {
            this.b = state;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            d();
            this.e = false;
        }
    }

    private boolean b() {
        if (this.a.e == 0) {
            return true;
        }
        State state = ((a) this.a.b.getValue()).a;
        State state2 = ((a) this.a.c.getValue()).a;
        if (state == state2 && this.b == state2) {
            return true;
        }
        return false;
    }

    private State c(lg lgVar) {
        da<lg, a> daVar = this.a;
        State state = null;
        Entry entry = daVar.c(lgVar) ? ((c) daVar.a.get(lgVar)).d : null;
        State state2 = entry != null ? ((a) entry.getValue()).a : null;
        if (!this.g.isEmpty()) {
            ArrayList<State> arrayList = this.g;
            state = (State) arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.b, state2), state);
    }

    public final void a(lg lgVar) {
        a aVar = new a(lgVar, this.b == State.DESTROYED ? State.DESTROYED : State.INITIALIZED);
        if (((a) this.a.a(lgVar, aVar)) == null) {
            lh lhVar = (lh) this.c.get();
            if (lhVar != null) {
                boolean z = this.d != 0 || this.e;
                State c2 = c(lgVar);
                this.d++;
                while (aVar.a.compareTo(c2) < 0 && this.a.c(lgVar)) {
                    b(aVar.a);
                    aVar.a(lhVar, c(aVar.a));
                    c();
                    c2 = c(lgVar);
                }
                if (!z) {
                    d();
                }
                this.d--;
            }
        }
    }

    private void c() {
        ArrayList<State> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void b(State state) {
        this.g.add(state);
    }

    public final void b(lg lgVar) {
        this.a.b(lgVar);
    }

    public final State a() {
        return this.b;
    }

    static State b(Event event) {
        switch (event) {
            case ON_CREATE:
            case ON_STOP:
                return State.CREATED;
            case ON_START:
            case ON_PAUSE:
                return State.STARTED;
            case ON_RESUME:
                return State.RESUMED;
            case ON_DESTROY:
                return State.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder("Unexpected event value ");
                sb.append(event);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private static Event c(State state) {
        int i = AnonymousClass1.b[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Event.ON_START;
            }
            if (i == 3) {
                return Event.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                StringBuilder sb = new StringBuilder("Unexpected state value ");
                sb.append(state);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return Event.ON_CREATE;
    }

    private void a(lh lhVar) {
        d a2 = this.a.a();
        while (a2.hasNext() && !this.f) {
            Entry entry = (Entry) a2.next();
            a aVar = (a) entry.getValue();
            while (aVar.a.compareTo(this.b) < 0 && !this.f && this.a.c(entry.getKey())) {
                b(aVar.a);
                aVar.a(lhVar, c(aVar.a));
                c();
            }
        }
    }

    private void b(lh lhVar) {
        Event event;
        da<lg, a> daVar = this.a;
        b bVar = new b(daVar.c, daVar.b);
        daVar.d.put(bVar, Boolean.FALSE);
        while (bVar.hasNext() && !this.f) {
            Entry entry = (Entry) bVar.next();
            a aVar = (a) entry.getValue();
            while (aVar.a.compareTo(this.b) > 0 && !this.f && this.a.c(entry.getKey())) {
                State state = aVar.a;
                int i = AnonymousClass1.b[state.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        event = Event.ON_DESTROY;
                    } else if (i == 3) {
                        event = Event.ON_STOP;
                    } else if (i == 4) {
                        event = Event.ON_PAUSE;
                    } else if (i != 5) {
                        StringBuilder sb = new StringBuilder("Unexpected state value ");
                        sb.append(state);
                        throw new IllegalArgumentException(sb.toString());
                    } else {
                        throw new IllegalArgumentException();
                    }
                    b(b(event));
                    aVar.a(lhVar, event);
                    c();
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    private void d() {
        lh lhVar = (lh) this.c.get();
        if (lhVar != null) {
            while (!b()) {
                this.f = false;
                if (this.b.compareTo(((a) this.a.b.getValue()).a) < 0) {
                    b(lhVar);
                }
                c<K, V> cVar = this.a.c;
                if (!this.f && cVar != null && this.b.compareTo(((a) cVar.getValue()).a) > 0) {
                    a(lhVar);
                }
            }
            this.f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    static State a(State state, State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }
}
