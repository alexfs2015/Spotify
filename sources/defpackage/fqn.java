package defpackage;

import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: fqn reason: default package */
public interface fqn extends Parcelable {
    <T extends Serializable> T a(fqm<T> fqm);

    boolean a();

    boolean a(fqn fqn, fqm<?> fqm);

    <T extends Serializable> boolean b(fqm<T> fqm);
}
