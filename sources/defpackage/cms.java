package defpackage;

import java.util.Comparator;

/* renamed from: cms reason: default package */
final class cms implements Comparator<byte[]> {
    cms() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
