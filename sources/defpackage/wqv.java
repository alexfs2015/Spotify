package defpackage;

import java.nio.channels.SelectionKey;
import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: wqv reason: default package */
final class wqv extends AbstractSet<SelectionKey> {
    private SelectionKey[] a = new SelectionKey[1024];
    private int b;
    private SelectionKey[] c = ((SelectionKey[]) this.a.clone());
    private int d;
    private boolean e = true;

    wqv() {
    }

    /* access modifiers changed from: 0000 */
    public final SelectionKey[] a() {
        if (this.e) {
            this.e = false;
            SelectionKey[] selectionKeyArr = this.a;
            selectionKeyArr[this.b] = null;
            this.d = 0;
            return selectionKeyArr;
        }
        this.e = true;
        SelectionKey[] selectionKeyArr2 = this.c;
        selectionKeyArr2[this.d] = null;
        this.b = 0;
        return selectionKeyArr2;
    }

    public final /* synthetic */ boolean add(Object obj) {
        SelectionKey selectionKey = (SelectionKey) obj;
        if (selectionKey == null) {
            return false;
        }
        if (this.e) {
            int i = this.b;
            SelectionKey[] selectionKeyArr = this.a;
            int i2 = i + 1;
            selectionKeyArr[i] = selectionKey;
            this.b = i2;
            if (i2 == selectionKeyArr.length) {
                SelectionKey[] selectionKeyArr2 = new SelectionKey[(selectionKeyArr.length << 1)];
                System.arraycopy(selectionKeyArr, 0, selectionKeyArr2, 0, this.b);
                this.a = selectionKeyArr2;
            }
        } else {
            int i3 = this.d;
            SelectionKey[] selectionKeyArr3 = this.c;
            int i4 = i3 + 1;
            selectionKeyArr3[i3] = selectionKey;
            this.d = i4;
            if (i4 == selectionKeyArr3.length) {
                SelectionKey[] selectionKeyArr4 = new SelectionKey[(selectionKeyArr3.length << 1)];
                System.arraycopy(selectionKeyArr3, 0, selectionKeyArr4, 0, this.d);
                this.c = selectionKeyArr4;
            }
        }
        return true;
    }

    public final boolean contains(Object obj) {
        return false;
    }

    public final Iterator<SelectionKey> iterator() {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        return false;
    }

    public final int size() {
        return this.e ? this.b : this.d;
    }
}
