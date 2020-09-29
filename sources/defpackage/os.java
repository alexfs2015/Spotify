package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* renamed from: os reason: default package */
public final class os<T> {
    private T[] a;
    private T[] b;
    private int c;
    private int d;
    private int e;
    private b f;
    private a g;
    private int h;
    private final Class<T> i;

    /* renamed from: os$a */
    public static class a<T2> extends b<T2> {
        final b<T2> a;
        final nx b = new nx(this.a);

        public a(b<T2> bVar) {
            this.a = bVar;
        }

        public final void a(int i, int i2) {
            this.b.a(i, i2);
        }

        public final void a(int i, int i2, Object obj) {
            this.b.a(i, i2, obj);
        }

        public final boolean a(T2 t2, T2 t22) {
            return this.a.a(t2, t22);
        }

        public final void b(int i, int i2) {
            this.b.b(i, i2);
        }

        public final boolean b(T2 t2, T2 t22) {
            return this.a.b(t2, t22);
        }

        public final Object c(T2 t2, T2 t22) {
            return this.a.c(t2, t22);
        }

        public final void c(int i, int i2) {
            this.b.c(i, i2);
        }

        public final int compare(T2 t2, T2 t22) {
            return this.a.compare(t2, t22);
        }

        public final void d(int i, int i2) {
            this.b.a(i, i2, null);
        }
    }

    /* renamed from: os$b */
    public static abstract class b<T2> implements Comparator<T2>, ok {
        public void a(int i, int i2, Object obj) {
            d(i, i2);
        }

        public abstract boolean a(T2 t2, T2 t22);

        public abstract boolean b(T2 t2, T2 t22);

        public Object c(T2 t2, T2 t22) {
            return null;
        }

        public abstract int compare(T2 t2, T2 t22);

        public abstract void d(int i, int i2);
    }

    public os(Class<T> cls, b<T> bVar) {
        this(cls, bVar, 10);
    }

    private os(Class<T> cls, b<T> bVar, int i2) {
        this.i = cls;
        this.a = (Object[]) Array.newInstance(cls, 10);
        this.f = bVar;
        this.h = 0;
    }

    private void d() {
        if (this.b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public final void a() {
        d();
        b bVar = this.f;
        if (!(bVar instanceof a)) {
            if (this.g == null) {
                this.g = new a(bVar);
            }
            this.f = this.g;
        }
    }

    public final void a(Collection<T> collection) {
        int i2;
        T[] array = collection.toArray((Object[]) Array.newInstance(this.i, collection.size()));
        d();
        if (array.length != 0 && array.length > 0) {
            int i3 = 0;
            if (array.length == 0) {
                i2 = 0;
            } else {
                Arrays.sort(array, this.f);
                i2 = 1;
                int i4 = 0;
                for (int i5 = 1; i5 < array.length; i5++) {
                    T t = array[i5];
                    if (this.f.compare(array[i4], t) == 0) {
                        int i6 = i4;
                        while (true) {
                            if (i6 >= i2) {
                                i6 = -1;
                                break;
                            } else if (this.f.b(array[i6], t)) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        if (i6 != -1) {
                            array[i6] = t;
                        } else {
                            if (i2 != i5) {
                                array[i2] = t;
                            }
                            i2++;
                        }
                    } else {
                        if (i2 != i5) {
                            array[i2] = t;
                        }
                        i4 = i2;
                        i2++;
                    }
                }
            }
            if (this.h == 0) {
                this.a = array;
                this.h = i2;
                this.f.a(0, i2);
                return;
            }
            boolean z = !(this.f instanceof a);
            if (z) {
                a();
            }
            this.b = this.a;
            this.c = 0;
            int i7 = this.h;
            this.d = i7;
            this.a = (Object[]) Array.newInstance(this.i, i7 + i2 + 10);
            this.e = 0;
            while (true) {
                if (this.c >= this.d && i3 >= i2) {
                    break;
                }
                int i8 = this.c;
                int i9 = this.d;
                if (i8 == i9) {
                    int i10 = i2 - i3;
                    System.arraycopy(array, i3, this.a, this.e, i10);
                    this.e += i10;
                    this.h += i10;
                    this.f.a(this.e - i10, i10);
                    break;
                } else if (i3 == i2) {
                    int i11 = i9 - i8;
                    System.arraycopy(this.b, i8, this.a, this.e, i11);
                    this.e += i11;
                    break;
                } else {
                    T t2 = this.b[i8];
                    T t3 = array[i3];
                    int compare = this.f.compare(t2, t3);
                    if (compare > 0) {
                        T[] tArr = this.a;
                        int i12 = this.e;
                        this.e = i12 + 1;
                        tArr[i12] = t3;
                        this.h++;
                        i3++;
                        this.f.a(this.e - 1, 1);
                    } else if (compare != 0 || !this.f.b(t2, t3)) {
                        T[] tArr2 = this.a;
                        int i13 = this.e;
                        this.e = i13 + 1;
                        tArr2[i13] = t2;
                        this.c++;
                    } else {
                        T[] tArr3 = this.a;
                        int i14 = this.e;
                        this.e = i14 + 1;
                        tArr3[i14] = t3;
                        i3++;
                        this.c++;
                        if (!this.f.a(t2, t3)) {
                            b bVar = this.f;
                            bVar.a(this.e - 1, 1, bVar.c(t2, t3));
                        }
                    }
                }
            }
            this.b = null;
            if (z) {
                b();
            }
        }
    }

    public final void b() {
        d();
        b bVar = this.f;
        if (bVar instanceof a) {
            ((a) bVar).b.a();
        }
        b bVar2 = this.f;
        a aVar = this.g;
        if (bVar2 == aVar) {
            this.f = aVar.a;
        }
    }

    public final void c() {
        d();
        int i2 = this.h;
        if (i2 != 0) {
            Arrays.fill(this.a, 0, i2, null);
            this.h = 0;
            this.f.b(0, i2);
        }
    }
}
