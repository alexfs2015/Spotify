package defpackage;

import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;

/* renamed from: raj reason: default package */
public abstract class raj {

    /* renamed from: raj$a */
    public static final class a extends raj {
        public final YourLibraryPageId a;
        public final boolean b;
        public final boolean c;

        a(YourLibraryPageId yourLibraryPageId, boolean z, boolean z2) {
            this.a = (YourLibraryPageId) gec.a(yourLibraryPageId);
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a == this.a && aVar.b == this.b && aVar.c == this.c;
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode()) * 31) + Boolean.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FocusPage{pageId=");
            sb.append(this.a);
            sb.append(", smooth=");
            sb.append(this.b);
            sb.append(", isInitialFocus=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: raj$b */
    public static final class b extends raj {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InvalidateOptionsMenu{}";
        }
    }

    /* renamed from: raj$c */
    public static final class c extends raj {
        public final String a;
        public final String b;

        c(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogPageFocused{pageIdentifier=");
            sb.append(this.a);
            sb.append(", pageUri=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: raj$d */
    public static final class d extends raj {
        public final YourLibraryPageId a;
        public final boolean b;

        d(YourLibraryPageId yourLibraryPageId, boolean z) {
            this.a = (YourLibraryPageId) gec.a(yourLibraryPageId);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a == this.a && dVar.b == this.b;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotifyPageFocusChanged{pageId=");
            sb.append(this.a);
            sb.append(", isFocused=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: raj$e */
    public static final class e extends raj {
        public final vbz a;

        e(vbz vbz) {
            this.a = (vbz) gec.a(vbz);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotifyYourLibraryStateChanged{newYourLibraryState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: raj$f */
    public static final class f extends raj {
        public final YourLibraryPageId a;

        f(YourLibraryPageId yourLibraryPageId) {
            this.a = (YourLibraryPageId) gec.a(yourLibraryPageId);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof f) && ((f) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ScrollPageToTop{pageId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: raj$g */
    public static final class g extends raj {
        public final boolean a;

        g(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof g) && ((g) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetPageSwipeLock{swipeLocked=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: raj$h */
    public static final class h extends raj {
        public final boolean a;

        h(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof h) && ((h) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetTabsCollapseLock{isLocked=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: raj$i */
    public static final class i extends raj {
        public final YourLibraryTabsCollapseState a;
        public final boolean b;

        i(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
            this.a = (YourLibraryTabsCollapseState) gec.a(yourLibraryTabsCollapseState);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return iVar.a == this.a && iVar.b == this.b;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetTabsCollapseState{tabsCollapseState=");
            sb.append(this.a);
            sb.append(", animate=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    raj() {
    }

    public static raj a(YourLibraryPageId yourLibraryPageId, boolean z) {
        return new d(yourLibraryPageId, z);
    }

    public static raj a(YourLibraryPageId yourLibraryPageId, boolean z, boolean z2) {
        return new a(yourLibraryPageId, z, z2);
    }

    public static raj a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        return new i(yourLibraryTabsCollapseState, z);
    }

    public static raj a(vbz vbz) {
        return new e(vbz);
    }
}
