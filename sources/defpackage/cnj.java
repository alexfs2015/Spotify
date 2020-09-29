package defpackage;

import java.util.Comparator;

/* renamed from: cnj reason: default package */
final class cnj implements Comparator<byte[]> {
    cnj() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
