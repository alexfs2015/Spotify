package defpackage;

import java.io.DataOutputStream;
import java.util.Map.Entry;
import java.util.TreeSet;

/* renamed from: bcl reason: default package */
final class bcl {
    public final int a;
    public final String b;
    final TreeSet<bct> c = new TreeSet<>();
    bcq d = bcq.a;
    boolean e;

    public bcl(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.a);
        dataOutputStream.writeUTF(this.b);
        bcq bcq = this.d;
        dataOutputStream.writeInt(bcq.b.size());
        for (Entry entry : bcq.b.entrySet()) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public final boolean a(bcp bcp) {
        bcq bcq = this.d;
        this.d = bcq.a(bcp);
        return !this.d.equals(bcq);
    }

    public final void a(bct bct) {
        this.c.add(bct);
    }

    public final boolean a(bcj bcj) {
        if (!this.c.remove(bcj)) {
            return false;
        }
        bcj.e.delete();
        return true;
    }

    public final int a(int i) {
        int i2;
        int i3;
        int hashCode = (this.a * 31) + this.b.hashCode();
        if (i < 2) {
            long a2 = bco.a(this.d);
            i3 = hashCode * 31;
            i2 = (int) (a2 ^ (a2 >>> 32));
        } else {
            i3 = hashCode * 31;
            i2 = this.d.hashCode();
        }
        return i3 + i2;
    }

    public final int hashCode() {
        return (a(Integer.MAX_VALUE) * 31) + this.c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bcl bcl = (bcl) obj;
            return this.a == bcl.a && this.b.equals(bcl.b) && this.c.equals(bcl.c) && this.d.equals(bcl.d);
        }
    }
}
