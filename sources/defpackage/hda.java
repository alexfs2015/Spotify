package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: hda reason: default package */
public class hda implements Parcelable, hcr {
    public static final Creator<hda> CREATOR = new Creator<hda>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ArrayList createStringArrayList = parcel.createStringArrayList();
            return hda.create(readString, (List<String>) createStringArrayList != null ? ImmutableList.a((Collection<? extends E>) createStringArrayList) : ImmutableList.d());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hda[i];
        }
    };
    private static final hda EMPTY = create((String) null, (List<String>) ImmutableList.d());
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hda$a */
    final class a extends defpackage.hcr.a {
        public final String a;
        public final ImmutableList<String> b;

        private a(String str, ImmutableList<String> immutableList) {
            this.a = str;
            this.b = (ImmutableList) fbp.a(immutableList);
        }

        /* synthetic */ a(hda hda, String str, ImmutableList immutableList, byte b2) {
            this(str, immutableList);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fbn.a(this.a, aVar.a) && fbn.a(this.b, aVar.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }
    }

    protected hda(String str, ImmutableList<String> immutableList) {
        this.mImpl = new a(this, str, immutableList, 0);
    }

    public static defpackage.hcr.a builder() {
        return EMPTY.toBuilder();
    }

    public static hda create(String str, List<String> list) {
        return new hda(str, hdi.a(list));
    }

    public static hda create(String str, String... strArr) {
        return create(str, Arrays.asList(strArr));
    }

    public static hda immutable(hcr hcr) {
        return hcr instanceof hda ? (hda) hcr : create(hcr.uri(), hcr.actions());
    }

    static hda immutableOrNull(hcr hcr) {
        if (hcr != null) {
            return immutable(hcr);
        }
        return null;
    }

    public List<String> actions() {
        return this.mImpl.b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hda)) {
            return false;
        }
        return fbn.a(this.mImpl, ((hda) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }

    public defpackage.hcr.a toBuilder() {
        return this.mImpl;
    }

    public String uri() {
        return this.mImpl.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImpl.a);
        ImmutableList<String> immutableList = this.mImpl.b;
        if (immutableList.isEmpty()) {
            immutableList = null;
        }
        parcel.writeStringList(immutableList);
    }
}
