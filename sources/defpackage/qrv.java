package defpackage;

import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;

/* renamed from: qrv reason: default package */
public abstract class qrv {

    /* renamed from: qrv$a */
    public static final class a extends qrv {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InvalidateOptionsMenuRequest{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct10.apply(this);
        }
    }

    /* renamed from: qrv$b */
    public static final class b extends qrv {
        final int a;

        public b(int i) {
            this.a = i;
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

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct8.apply(this);
        }
    }

    /* renamed from: qrv$c */
    public static final class c extends qrv {
        final YourLibraryPageId a;
        final boolean b;

        public c(YourLibraryPageId yourLibraryPageId, boolean z) {
            this.a = (YourLibraryPageId) gcr.a(yourLibraryPageId);
            this.b = z;
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

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct3.apply(this);
        }
    }

    /* renamed from: qrv$d */
    public static final class d extends qrv {
        private final YourLibraryPageId a;

        public d(YourLibraryPageId yourLibraryPageId) {
            this.a = (YourLibraryPageId) gcr.a(yourLibraryPageId);
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

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct2.apply(this);
        }
    }

    /* renamed from: qrv$e */
    public static final class e extends qrv {
        final YourLibraryPageId a;
        final String b;
        final String c;

        public e(YourLibraryPageId yourLibraryPageId, String str, String str2) {
            this.a = (YourLibraryPageId) gcr.a(yourLibraryPageId);
            this.b = (String) gcr.a(str);
            this.c = (String) gcr.a(str2);
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

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct.apply(this);
        }
    }

    /* renamed from: qrv$f */
    public static final class f extends qrv {
        final YourLibraryPageId a;
        final LoadingState b;

        public f(YourLibraryPageId yourLibraryPageId, LoadingState loadingState) {
            this.a = (YourLibraryPageId) gcr.a(yourLibraryPageId);
            this.b = (LoadingState) gcr.a(loadingState);
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

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct11.apply(this);
        }
    }

    /* renamed from: qrv$g */
    public static final class g extends qrv {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ScrollActivePageToTopRequest{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct4.apply(this);
        }
    }

    /* renamed from: qrv$h */
    public static final class h extends qrv {
        final YourLibraryPageId a;
        final boolean b;

        public h(YourLibraryPageId yourLibraryPageId, boolean z) {
            this.a = (YourLibraryPageId) gcr.a(yourLibraryPageId);
            this.b = z;
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

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct6.apply(this);
        }
    }

    /* renamed from: qrv$i */
    public static final class i extends qrv {
        final YourLibraryPageId a;
        final boolean b;

        public i(YourLibraryPageId yourLibraryPageId, boolean z) {
            this.a = (YourLibraryPageId) gcr.a(yourLibraryPageId);
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
            sb.append("SetTabsCollapseLockRequest{requestingPageId=");
            sb.append(this.a);
            sb.append(", collapseLocked=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct5.apply(this);
        }
    }

    /* renamed from: qrv$j */
    public static final class j extends qrv {
        final YourLibraryPageId a;
        final YourLibraryTabsCollapseState b;
        final boolean c;

        public j(YourLibraryPageId yourLibraryPageId, YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
            this.a = (YourLibraryPageId) gcr.a(yourLibraryPageId);
            this.b = (YourLibraryTabsCollapseState) gcr.a(yourLibraryTabsCollapseState);
            this.c = z;
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

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct7.apply(this);
        }
    }

    /* renamed from: qrv$k */
    public static final class k extends qrv {
        final int a;

        public k(int i) {
            this.a = i;
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

        public final <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11) {
            return gct9.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<e, R_> gct, gct<d, R_> gct2, gct<c, R_> gct3, gct<g, R_> gct4, gct<i, R_> gct5, gct<h, R_> gct6, gct<j, R_> gct7, gct<b, R_> gct8, gct<k, R_> gct9, gct<a, R_> gct10, gct<f, R_> gct11);

    qrv() {
    }
}
