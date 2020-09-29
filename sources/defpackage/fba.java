package defpackage;

import com.google.common.base.AbstractIterator;
import com.google.common.base.AbstractIterator.State;
import java.util.Iterator;

/* renamed from: fba reason: default package */
public final class fba {
    public final faq a;
    public final boolean b;
    public final b c;
    final int d;

    /* renamed from: fba$a */
    static abstract class a extends AbstractIterator<String> {
        final CharSequence b;
        private faq c;
        private boolean d;
        private int e = 0;
        private int f;

        /* access modifiers changed from: 0000 */
        public abstract int a(int i);

        /* access modifiers changed from: 0000 */
        public abstract int b(int i);

        protected a(fba fba, CharSequence charSequence) {
            this.c = fba.a;
            this.d = fba.b;
            this.f = fba.d;
            this.b = charSequence;
        }

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
    }

    /* renamed from: fba$b */
    interface b {
        Iterator<String> a(fba fba, CharSequence charSequence);
    }

    private fba(b bVar) {
        this(bVar, false, faq.a(), Integer.MAX_VALUE);
    }

    public fba(b bVar, boolean z, faq faq, int i) {
        this.c = bVar;
        this.b = z;
        this.a = faq;
        this.d = i;
    }

    public static fba a(char c2) {
        final faq a2 = faq.a(c2);
        fay.a(a2);
        return new fba(new b() {
            public final /* synthetic */ Iterator a(fba fba, CharSequence charSequence) {
                return new a(fba, charSequence) {
                    /* access modifiers changed from: 0000 */
                    public final int b(int i) {
                        return i + 1;
                    }

                    /* access modifiers changed from: 0000 */
                    public final int a(int i) {
                        return a2.a(this.b, i);
                    }
                };
            }
        });
    }

    public static fba a(final String str) {
        fay.a(str.length() != 0, (Object) "The separator may not be the empty string.");
        if (str.length() == 1) {
            return a(str.charAt(0));
        }
        return new fba(new b() {
            public final /* synthetic */ Iterator a(fba fba, CharSequence charSequence) {
                return new a(fba, charSequence) {
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

    public final fba a() {
        return new fba(this.c, true, this.a, this.d);
    }

    public final fba b() {
        faq b2 = faq.b();
        fay.a(b2);
        return new fba(this.c, this.b, b2, this.d);
    }

    public final Iterable<String> a(final CharSequence charSequence) {
        fay.a(charSequence);
        return new Iterable<String>() {
            public final Iterator<String> iterator() {
                return fba.this.b(charSequence);
            }

            public final String toString() {
                StringBuilder a2 = fau.a(", ").a(new StringBuilder("["), iterator());
                a2.append(']');
                return a2.toString();
            }
        };
    }

    public Iterator<String> b(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }
}
