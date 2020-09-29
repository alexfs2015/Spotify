package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: hah reason: default package */
public class hah implements Parcelable, gzy {
    public static final Creator<hah> CREATOR = new Creator<hah>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hah[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ImmutableList immutableList;
            String readString = parcel.readString();
            ArrayList createStringArrayList = parcel.createStringArrayList();
            if (createStringArrayList != null) {
                immutableList = ImmutableList.a((Collection<? extends E>) createStringArrayList);
            } else {
                immutableList = ImmutableList.d();
            }
            return hah.create(readString, (List<String>) immutableList);
        }
    };
    private static final hah EMPTY = create((String) null, (List<String>) ImmutableList.d());
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hah$a */
    final class a extends defpackage.gzy.a {
        public final String a;
        public final ImmutableList<String> b;

        /* synthetic */ a(hah hah, String str, ImmutableList immutableList, byte b2) {
            this(str, immutableList);
        }

        private a(String str, ImmutableList<String> immutableList) {
            this.a = str;
            this.b = (ImmutableList) fay.a(immutableList);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return faw.a(this.a, aVar.a) && faw.a(this.b, aVar.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }
    }

    public int describeContents() {
        return 0;
    }

    static hah immutableOrNull(gzy gzy) {
        if (gzy != null) {
            return immutable(gzy);
        }
        return null;
    }

    public static hah immutable(gzy gzy) {
        if (gzy instanceof hah) {
            return (hah) gzy;
        }
        return create(gzy.uri(), gzy.actions());
    }

    public static hah create(String str, String... strArr) {
        return create(str, Arrays.asList(strArr));
    }

    public static hah create(String str, List<String> list) {
        return new hah(str, hap.a(list));
    }

    protected hah(String str, ImmutableList<String> immutableList) {
        this.mImpl = new a(this, str, immutableList, 0);
    }

    public String uri() {
        return this.mImpl.a;
    }

    public List<String> actions() {
        return this.mImpl.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImpl.a);
        ImmutableList<String> immutableList = this.mImpl.b;
        if (immutableList.isEmpty()) {
            immutableList = null;
        }
        parcel.writeStringList(immutableList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hah)) {
            return false;
        }
        return faw.a(this.mImpl, ((hah) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }

    public defpackage.gzy.a toBuilder() {
        return this.mImpl;
    }

    public static defpackage.gzy.a builder() {
        return EMPTY.toBuilder();
    }
}
