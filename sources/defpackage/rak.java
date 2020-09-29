package defpackage;

import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;

/* renamed from: rak reason: default package */
public abstract class rak {

    /* renamed from: rak$a */
    public static final class a extends rak {
        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee10.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InvalidateOptionsMenuRequest{}";
        }
    }

    /* renamed from: rak$b */
    public static final class b extends rak {
        final int a;

        public b(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee8.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MaxTabsOffsetChanged{newMaxTabsOffset=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rak$c */
    public static final class c extends rak {
        final YourLibraryPageId a;
        final boolean b;

        public c(YourLibraryPageId yourLibraryPageId, boolean z) {
            this.a = (YourLibraryPageId) gec.a(yourLibraryPageId);
            this.b = z;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a == this.a && cVar.b == this.b;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PageFocusRequest{pageId=");
            sb.append(this.a);
            sb.append(", smooth=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rak$d */
    public static final class d extends rak {
        private final YourLibraryPageId a;

        public d(YourLibraryPageId yourLibraryPageId) {
            this.a = (YourLibraryPageId) gec.a(yourLibraryPageId);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof d) && ((d) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PageFocusSettled{pageId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rak$e */
    public static final class e extends rak {
        final YourLibraryPageId a;
        final String b;
        final String c;

        public e(YourLibraryPageId yourLibraryPageId, String str, String str2) {
            this.a = (YourLibraryPageId) gec.a(yourLibraryPageId);
            this.b = (String) gec.a(str);
            this.c = (String) gec.a(str2);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.a == this.a && eVar.b.equals(this.b) && eVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PageFocused{pageId=");
            sb.append(this.a);
            sb.append(", pageIdentifier=");
            sb.append(this.b);
            sb.append(", pageUri=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rak$f */
    public static final class f extends rak {
        final YourLibraryPageId a;
        final LoadingState b;

        public f(YourLibraryPageId yourLibraryPageId, LoadingState loadingState) {
            this.a = (YourLibraryPageId) gec.a(yourLibraryPageId);
            this.b = (LoadingState) gec.a(loadingState);
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee11.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.a == this.a && fVar.b == this.b;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PageLoadingStateChanged{requestingPageId=");
            sb.append(this.a);
            sb.append(", loadingState=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rak$g */
    public static final class g extends rak {
        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ScrollActivePageToTopRequest{}";
        }
    }

    /* renamed from: rak$h */
    public static final class h extends rak {
        final YourLibraryPageId a;
        final boolean b;

        public h(YourLibraryPageId yourLibraryPageId, boolean z) {
            this.a = (YourLibraryPageId) gec.a(yourLibraryPageId);
            this.b = z;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.a == this.a && hVar.b == this.b;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetPageSwipeLockRequest{requestingPageId=");
            sb.append(this.a);
            sb.append(", swipeLocked=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rak$i */
    public static final class i extends rak {
        final YourLibraryPageId a;
        final boolean b;

        public i(YourLibraryPageId yourLibraryPageId, boolean z) {
            this.a = (YourLibraryPageId) gec.a(yourLibraryPageId);
            this.b = z;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee5.apply(this);
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
            sb.append("SetTabsCollapseLockRequest{requestingPageId=");
            sb.append(this.a);
            sb.append(", collapseLocked=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rak$j */
    public static final class j extends rak {
        final YourLibraryPageId a;
        final YourLibraryTabsCollapseState b;
        final boolean c;

        public j(YourLibraryPageId yourLibraryPageId, YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
            this.a = (YourLibraryPageId) gec.a(yourLibraryPageId);
            this.b = (YourLibraryTabsCollapseState) gec.a(yourLibraryTabsCollapseState);
            this.c = z;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return jVar.a == this.a && jVar.b == this.b && jVar.c == this.c;
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Boolean.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetTabsCollapseStateRequest{requestingPageId=");
            sb.append(this.a);
            sb.append(", tabsCollapseState=");
            sb.append(this.b);
            sb.append(", animate=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rak$k */
    public static final class k extends rak {
        final int a;

        public k(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11) {
            return gee9.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof k) && ((k) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TabsOffsetChanged{newTabsOffset=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    rak() {
    }

    public abstract <R_> R_ a(gee<e, R_> gee, gee<d, R_> gee2, gee<c, R_> gee3, gee<g, R_> gee4, gee<i, R_> gee5, gee<h, R_> gee6, gee<j, R_> gee7, gee<b, R_> gee8, gee<k, R_> gee9, gee<a, R_> gee10, gee<f, R_> gee11);
}
