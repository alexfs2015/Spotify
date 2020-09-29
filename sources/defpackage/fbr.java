package defpackage;

import com.google.common.base.AbstractIterator;
import com.google.common.base.AbstractIterator.State;
import java.util.Iterator;

/* renamed from: fbr reason: default package */
public final class fbr {
    public final fbh a;
    public final boolean b;
    public final b c;
    final int d;

    /* renamed from: fbr$a */
    static abstract class a extends AbstractIterator<String> {
        final CharSequence b;
        private fbh c;
        private boolean d;
        private int e = 0;
        private int f;

        protected a(fbr fbr, CharSequence charSequence) {
            this.c = fbr.a;
            this.d = fbr.b;
            this.f = fbr.d;
            this.b = charSequence;
        }

        /* access modifiers changed from: 0000 */
        public abstract int a(int i);

        public final /* synthetic */ Object a() {
            int i;
            int i2 = this.e;
            while (true) {
                int i3 = this.e;
                if (i3 != -1) {
                    int a = a(i3);
                    if (a == -1) {
                        a = this.b.length();
                        this.e = -1;
                    } else {
                        this.e = b(a);
                    }
                    int i4 = this.e;
                    if (i4 == i2) {
                        this.e = i4 + 1;
                        if (this.e > this.b.length()) {
                            this.e = -1;
                        }
                    } else {
                        while (i2 < a && this.c.b(this.b.charAt(i2))) {
                            i2++;
                        }
                        while (i > i2 && this.c.b(this.b.charAt(i - 1))) {
                            a = i - 1;
                        }
                        if (!this.d || i2 != i) {
                            int i5 = this.f;
                        } else {
                            i2 = this.e;
                        }
                    }
                } else {
                    this.a = State.DONE;
                    return null;
                }
            }
            int i52 = this.f;
            if (i52 == 1) {
                i = this.b.length();
                this.e = -1;
                while (i > i2 && this.c.b(this.b.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.f = i52 - 1;
            }
            return this.b.subSequence(i2, i).toString();
        }

        /* access modifiers changed from: 0000 */
        public abstract int b(int i);
    }

    /* renamed from: fbr$b */
    interface b {
        Iterator<String> a(fbr fbr, CharSequence charSequence);
    }

    private fbr(b bVar) {
        this(bVar, false, fbh.a(), Integer.MAX_VALUE);
    }

    public fbr(b bVar, boolean z, fbh fbh, int i) {
        this.c = bVar;
        this.b = z;
        this.a = fbh;
        this.d = i;
    }

    public static fbr a(char c2) {
        final fbh a2 = fbh.a(c2);
        fbp.a(a2);
        return new fbr(new b() {
            public final /* synthetic */ Iterator a(fbr fbr, CharSequence charSequence) {
                return new a(fbr, charSequence) {
                    /* access modifiers changed from: 0000 */
                    public final int a(int i) {
                        return a2.a(this.b, i);
                    }

                    /* access modifiers changed from: 0000 */
                    public final int b(int i) {
                        return i + 1;
                    }
                };
            }
        });
    }

    public static fbr a(final String str) {
        fbp.a(str.length() != 0, (Object) "The separator may not be the empty string.");
        return str.length() == 1 ? a(str.charAt(0)) : new fbr(new b() {
            public final /* synthetic */ Iterator a(fbr fbr, CharSequence charSequence) {
                return new a(fbr, charSequence) {
                    public final int a(int i) {
                        int length = str.length();
                        int length2 = this.b.length() - length;
                        while (i <= length2) {
                            int i2 = 0;
                            while (i2 < length) {
                                if (this.b.charAt(i2 + i) == str.charAt(i2)) {
                                    i2++;
                                } else {
                                    i++;
                                }
                            }
                            return i;
                        }
                        return -1;
                    }

                    public final int b(int i) {
                        return i + str.length();
                    }
                };
            }
        });
    }

    public final fbr a() {
        return new fbr(this.c, true, this.a, this.d);
    }

    public final Iterable<String> a(final CharSequence charSequence) {
        fbp.a(charSequence);
        return new Iterable<String>() {
            public final Iterator<String> iterator() {
                return fbr.this.b(charSequence);
            }

            public final String toString() {
                StringBuilder a2 = fbl.a(", ").a(new StringBuilder("["), iterator());
                a2.append(']');
                return a2.toString();
            }
        };
    }

    public final fbr b() {
        fbh b2 = fbh.b();
        fbp.a(b2);
        return new fbr(this.c, this.b, b2, this.d);
    }

    public Iterator<String> b(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }
}
