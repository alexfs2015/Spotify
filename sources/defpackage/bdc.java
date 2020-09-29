package defpackage;

import java.io.DataOutputStream;
import java.util.Map.Entry;
import java.util.TreeSet;

/* renamed from: bdc reason: default package */
final class bdc {
    public final int a;
    public final String b;
    final TreeSet<bdk> c = new TreeSet<>();
    bdh d = bdh.a;
    boolean e;

    public bdc(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int a(int i) {
        int i2;
        int i3;
        int hashCode = (this.a * 31) + this.b.hashCode();
        if (i < 2) {
            long a2 = bdf.a(this.d);
            i3 = hashCode * 31;
            i2 = (int) (a2 ^ (a2 >>> 32));
        } else {
            i3 = hashCode * 31;
            i2 = this.d.hashCode();
        }
        return i3 + i2;
    }

    public final void a(bdk bdk) {
        this.c.add(bdk);
    }

    public final void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.a);
        dataOutputStream.writeUTF(this.b);
        bdh bdh = this.d;
        dataOutputStream.writeInt(bdh.b.size());
        for (Entry entry : bdh.b.entrySet()) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public final boolean a(bda bda) {
        if (!this.c.remove(bda)) {
            return false;
        }
        bda.e.delete();
        return true;
    }

    public final boolean a(bdg bdg) {
        bdh bdh = this.d;
        this.d = bdh.a(bdg);
        return !this.d.equals(bdh);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bdc bdc = (bdc) obj;
            return this.a == bdc.a && this.b.equals(bdc.b) && this.c.equals(bdc.c) && this.d.equals(bdc.d);
        }
    }

    public final int hashCode() {
        return (a(Integer.MAX_VALUE) * 31) + this.c.hashCode();
    }
}
