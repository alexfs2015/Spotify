package defpackage;

import android.os.Parcelable;

/* renamed from: tzd reason: default package */
public abstract class tzd implements Parcelable {
    public abstract tzm a();

    public abstract tze b();

    public static tzd a(tzm tzm, tze tze) {
        return new tyv(tzm, tze);
    }
}
