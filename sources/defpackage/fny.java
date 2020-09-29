package defpackage;

import io.reactivex.functions.Predicate;

/* renamed from: fny reason: default package */
final class fny<T> {
    final int a = 4;
    Object[] b = this.d;
    int c;
    private final Object[] d = new Object[5];

    /* renamed from: fny$a */
    public interface a<T> extends Predicate<T> {
        boolean test(T t);
    }

    fny(int i) {
    }

    /* access modifiers changed from: 0000 */
    public final void a(a<? super T> aVar) {
        int i = this.a;
        for (Object[] objArr = this.d; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null || aVar.test(objArr2)) {
                    break;
                }
            }
        }
    }
}
