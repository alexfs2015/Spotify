package defpackage;

/* renamed from: pjq reason: default package */
public abstract class pjq {

    /* renamed from: pjq$a */
    public static final class a extends pjq {
        public final String a;

        a(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LoadProfileData{username=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pjq$b */
    public static final class b extends pjq {
        public final String a;
        public final String b;
        public final String c;

        b(String str, String str2, String str3) {
            this.a = (String) gcr.a(str);
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && gcr.a(bVar.b, this.b) && gcr.a(bVar.c, this.c);
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (this.a.hashCode() + 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NavigateToEditProfile{username=");
            sb.append(this.a);
            sb.append(", displayName=");
            sb.append(this.b);
            sb.append(", imageUrl=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    pjq() {
    }
}
