package defpackage;

/* renamed from: awv reason: default package */
public abstract class awv implements a {
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 splice command: type=");
        sb.append(getClass().getSimpleName());
        return sb.toString();
    }
}
