package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;

/* renamed from: rex reason: default package */
public abstract class rex {

    /* renamed from: rex$a */
    public static final class a extends rex {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CancelTextFilter{}";
        }
    }

    /* renamed from: rex$aa */
    public static final class aa extends rex {
        aa() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof aa;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToShowFilterTextView{}";
        }
    }

    /* renamed from: rex$ab */
    public static final class ab extends rex {
        ab() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof ab;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToShowSortOptions{}";
        }
    }

    /* renamed from: rex$ac */
    public static final class ac extends rex {
        ac() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof ac;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToShufflePlay{}";
        }
    }

    /* renamed from: rex$ad */
    public static final class ad extends rex {
        public final String a;
        public final int b;

        ad(String str, int i) {
            this.a = (String) gec.a(str);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ad)) {
                return false;
            }
            ad adVar = (ad) obj;
            return adVar.b == this.b && adVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToUnlikeTrack{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$ae */
    public static final class ae extends rex {
        public final String a;
        public final String b;

        ae(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ae)) {
                return false;
            }
            ae aeVar = (ae) obj;
            return aeVar.a.equals(this.a) && aeVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NavigateTo{uri=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$af */
    public static final class af extends rex {
        af() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof af;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToAddArtist{}";
        }
    }

    /* renamed from: rex$ag */
    public static final class ag extends rex {
        ag() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof ag;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToCreatePlaylist{}";
        }
    }

    /* renamed from: rex$ah */
    public static final class ah extends rex {
        public final String a;

        ah(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ah)) {
                return false;
            }
            return ((ah) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NavigateToCreatePlaylistInFolder{folderUri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$ai */
    public static final class ai extends rex {
        ai() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof ai;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToHiddenArtists{}";
        }
    }

    /* renamed from: rex$aj */
    public static final class aj extends rex {
        aj() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof aj;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToHiddenTracks{}";
        }
    }

    /* renamed from: rex$ak */
    public static final class ak extends rex {
        ak() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof ak;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToSettings{}";
        }
    }

    /* renamed from: rex$al */
    public static final class al extends rex {
        al() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof al;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotifyScrollability{}";
        }
    }

    /* renamed from: rex$am */
    public static final class am extends rex {
        public final String a;
        public final ImmutableMap<String, Boolean> b;
        public final ImmutableList<String> c;

        am(String str, ImmutableMap<String, Boolean> immutableMap, ImmutableList<String> immutableList) {
            this.a = (String) gec.a(str);
            this.b = (ImmutableMap) gec.a(immutableMap);
            this.c = (ImmutableList) gec.a(immutableList);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof am)) {
                return false;
            }
            am amVar = (am) obj;
            return amVar.a.equals(this.a) && amVar.b.equals(this.b) && amVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ObserveFilterStates{uri=");
            sb.append(this.a);
            sb.append(", defaultFilterStates=");
            sb.append(this.b);
            sb.append(", allowedFilters=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$an */
    public static final class an extends rex {
        public final String a;

        an(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof an)) {
                return false;
            }
            return ((an) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ObservePagePrefs{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$ao */
    public static final class ao extends rex {
        public final String a;
        public final String b;
        public final String c;

        ao(String str, String str2, String str3) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ao)) {
                return false;
            }
            ao aoVar = (ao) obj;
            return aoVar.a.equals(this.a) && aoVar.b.equals(this.b) && aoVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("OpenInfoDialog{title=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", dismissText=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$ap */
    public static final class ap extends rex {
        public final String a;

        ap(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ap)) {
                return false;
            }
            return ((ap) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayPreview{previewId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$aq */
    public static final class aq extends rex {
        public final MusicItem a;
        public final String b;
        public final vca c;

        aq(MusicItem musicItem, String str, vca vca) {
            this.a = (MusicItem) gec.a(musicItem);
            this.b = (String) gec.a(str);
            this.c = (vca) gec.a(vca);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof aq)) {
                return false;
            }
            aq aqVar = (aq) obj;
            return aqVar.a.equals(this.a) && aqVar.b.equals(this.b) && aqVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayTrack{musicItem=");
            sb.append(this.a);
            sb.append(", playContextTitle=");
            sb.append(this.b);
            sb.append(", sortOption=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$ar */
    public static final class ar extends rex {
        public final boolean a;

        ar(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ar) && ((ar) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestSetPageSwipeLock{swipeLocked=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$as */
    public static final class as extends rex {
        public final boolean a;

        as(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof as) && ((as) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestSetTabsCollapseLock{collapseLocked=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$at */
    public static final class at extends rex {
        public final YourLibraryTabsCollapseState a;
        public final boolean b;

        at(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
            this.a = (YourLibraryTabsCollapseState) gec.a(yourLibraryTabsCollapseState);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof at)) {
                return false;
            }
            at atVar = (at) obj;
            return atVar.a == this.a && atVar.b == this.b;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestTabsCollapseState{tabsCollapseState=");
            sb.append(this.a);
            sb.append(", animate=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$au */
    public static final class au extends rex {
        public final String a;
        public final String b;
        public final Boolean c;

        au(String str, String str2, Boolean bool) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (Boolean) gec.a(bool);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof au)) {
                return false;
            }
            au auVar = (au) obj;
            return auVar.a.equals(this.a) && auVar.b.equals(this.b) && auVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SaveFilterState{uri=");
            sb.append(this.a);
            sb.append(", filterId=");
            sb.append(this.b);
            sb.append(", filterState=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$av */
    public static final class av extends rex {
        public final String a;
        public final vca b;

        av(String str, vca vca) {
            this.a = (String) gec.a(str);
            this.b = (vca) gec.a(vca);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof av)) {
                return false;
            }
            av avVar = (av) obj;
            return avVar.a.equals(this.a) && avVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SaveSortOption{uri=");
            sb.append(this.a);
            sb.append(", sortOption=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$aw */
    public static final class aw extends rex {
        public final boolean a;

        aw(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof aw) && ((aw) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ScrollToTop{smooth=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$ax */
    public static final class ax extends rex {
        public final int a;

        ax(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ax) && ((ax) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetCenteredContentTopMargin{topMargin=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$ay */
    public static final class ay extends rex {
        public final boolean a;

        ay(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ay) && ((ay) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetFilterTextViewShowing{showing=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$az */
    public static final class az extends rex {
        public final int a;

        az(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof az) && ((az) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetMaxTabsOffset{maxTabsOffset=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$b */
    public static final class b extends rex {
        public final boolean a;

        b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DownloadFavoriteSongs{download=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$ba */
    public static final class ba extends rex {
        public final String a;
        public final String b;
        public final Optional<String> c;

        ba(String str, String str2, Optional<String> optional) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (Optional) gec.a(optional);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ba)) {
                return false;
            }
            ba baVar = (ba) obj;
            return baVar.a.equals(this.a) && baVar.b.equals(this.b) && baVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetPagePrefsOption{uri=");
            sb.append(this.a);
            sb.append(", key=");
            sb.append(this.b);
            sb.append(", value=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$bb */
    public static final class bb extends rex {
        public final boolean a;

        bb(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof bb) && ((bb) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SetPulldownLock{isLocked=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$bc */
    public static final class bc extends rex {
        public final String a;
        public final String b;

        bc(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof bc)) {
                return false;
            }
            bc bcVar = (bc) obj;
            return bcVar.a.equals(this.a) && bcVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowExplicitTrackDialog{trackUri=");
            sb.append(this.a);
            sb.append(", contextUri=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$bd */
    public static final class bd extends rex {
        bd() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof bd;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowSortOptions{}";
        }
    }

    /* renamed from: rex$be */
    public static final class be extends rex {
        public final int a;
        public final SpotifyIconV2 b;

        be(int i, SpotifyIconV2 spotifyIconV2) {
            this.a = i;
            this.b = spotifyIconV2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof be)) {
                return false;
            }
            be beVar = (be) obj;
            return beVar.a == this.a && beVar.b == this.b;
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (Integer.valueOf(this.a).hashCode() + 0) * 31;
            SpotifyIconV2 spotifyIconV2 = this.b;
            if (spotifyIconV2 != null) {
                i = spotifyIconV2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowToast{stringResourceId=");
            sb.append(this.a);
            sb.append(", spotifyIconV2=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$bf */
    public static final class bf extends rex {
        public final rdi a;
        public final String b;

        bf(rdi rdi, String str) {
            this.a = (rdi) gec.a(rdi);
            this.b = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof bf)) {
                return false;
            }
            bf bfVar = (bf) obj;
            return bfVar.a.equals(this.a) && bfVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShufflePlay{musicItemSource=");
            sb.append(this.a);
            sb.append(", playContextTitle=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$bg */
    public static final class bg extends rex {
        public final String a;

        bg(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof bg)) {
                return false;
            }
            return ((bg) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StopPreview{previewId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$bh */
    public static final class bh extends rex {
        public final String a;
        public final boolean b;

        bh(String str, boolean z) {
            this.a = (String) gec.a(str);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof bh)) {
                return false;
            }
            bh bhVar = (bh) obj;
            return bhVar.b == this.b && bhVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateAlbumLikedState{albumUri=");
            sb.append(this.a);
            sb.append(", isLiked=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$bi */
    public static final class bi extends rex {
        private final rdb a;

        bi(rdb rdb) {
            this.a = (rdb) gec.a(rdb);
        }

        public final rdb a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof bi)) {
                return false;
            }
            return ((bi) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateDataSourceConfiguration{dataSourceConfiguration=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$bj */
    public static final class bj extends rex {
        public final String a;
        public final boolean b;

        bj(String str, boolean z) {
            this.a = (String) gec.a(str);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof bj)) {
                return false;
            }
            bj bjVar = (bj) obj;
            return bjVar.b == this.b && bjVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateFollowState{uri=");
            sb.append(this.a);
            sb.append(", follow=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$bk */
    public static final class bk extends rex {
        public final String a;
        public final String b;
        public final boolean c;

        bk(String str, String str2, boolean z) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof bk)) {
                return false;
            }
            bk bkVar = (bk) obj;
            return bkVar.c == this.c && bkVar.a.equals(this.a) && bkVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Boolean.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateTrackBannedState{trackUri=");
            sb.append(this.a);
            sb.append(", contextUri=");
            sb.append(this.b);
            sb.append(", isBanned=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$bl */
    public static final class bl extends rex {
        public final String a;
        public final String b;
        public final boolean c;

        bl(String str, String str2, boolean z) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof bl)) {
                return false;
            }
            bl blVar = (bl) obj;
            return blVar.c == this.c && blVar.a.equals(this.a) && blVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Boolean.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateTrackLikedState{trackUri=");
            sb.append(this.a);
            sb.append(", contextUri=");
            sb.append(this.b);
            sb.append(", isLiked=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$c */
    public static final class c extends rex {
        public final String a;
        public final vca b;
        public final ImmutableList<vca> c;

        c(String str, vca vca, ImmutableList<vca> immutableList) {
            this.a = (String) gec.a(str);
            this.b = (vca) gec.a(vca);
            this.c = (ImmutableList) gec.a(immutableList);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b) && cVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LoadSortOption{uri=");
            sb.append(this.a);
            sb.append(", defaultSortOption=");
            sb.append(this.b);
            sb.append(", allowedSortOptions=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$d */
    public static final class d extends rex {
        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentClearAllFilters{}";
        }
    }

    /* renamed from: rex$e */
    public static final class e extends rex {
        public final String a;

        e(String str) {
            this.a = (String) gec.a(str);
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
            sb.append("LogIntentClearFilter{filterId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$f */
    public static final class f extends rex {
        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToAddArtists{}";
        }
    }

    /* renamed from: rex$g */
    public static final class g extends rex {
        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToAddArtistsFromEmptyPage{}";
        }
    }

    /* renamed from: rex$h */
    public static final class h extends rex {
        public final String a;
        public final int b;

        h(String str, int i) {
            this.a = (String) gec.a(str);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.b == this.b && hVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToBanTrack{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$i */
    public static final class i extends rex {
        i() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToCancelFind{}";
        }
    }

    /* renamed from: rex$j */
    public static final class j extends rex {
        j() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof j;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToCreatePlaylist{}";
        }
    }

    /* renamed from: rex$k */
    public static final class k extends rex {
        k() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToCreatePlaylistFromEmptyPage{}";
        }
    }

    /* renamed from: rex$l */
    public static final class l extends rex {
        l() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof l;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToDismissInfoDialog{}";
        }
    }

    /* renamed from: rex$m */
    public static final class m extends rex {
        public final boolean a;
        public final String b;

        m(boolean z, String str) {
            this.a = z;
            this.b = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return mVar.a == this.a && mVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((Boolean.valueOf(this.a).hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToDownloadFavoriteSongs{download=");
            sb.append(this.a);
            sb.append(", uri=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$n */
    public static final class n extends rex {
        public final String a;
        public final boolean b;

        n(String str, boolean z) {
            this.a = (String) gec.a(str);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return nVar.b == this.b && nVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToFilterFromContextMenu{filterId=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$o */
    public static final class o extends rex {
        o() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof o;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToFind{}";
        }
    }

    /* renamed from: rex$p */
    public static final class p extends rex {
        public final String a;
        private final int b;

        p(String str, int i) {
            this.a = (String) gec.a(str);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return pVar.b == this.b && pVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToFollowArtist{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$q */
    public static final class q extends rex {
        public final String a;
        public final int b;

        q(String str, int i) {
            this.a = (String) gec.a(str);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return qVar.b == this.b && qVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToLikeAlbum{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$r */
    public static final class r extends rex {
        public final String a;
        public final int b;

        r(String str, int i) {
            this.a = (String) gec.a(str);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return rVar.b == this.b && rVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToLikeRecommendedTrack{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$s */
    public static final class s extends rex {
        public final String a;
        public final int b;

        s(String str, int i) {
            this.a = (String) gec.a(str);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return sVar.b == this.b && sVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToNavigateToEntity{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$t */
    public static final class t extends rex {
        t() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof t;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToNavigateToFavoriteSongs{}";
        }
    }

    /* renamed from: rex$u */
    public static final class u extends rex {
        u() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof u;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToNavigateToHiddenArtists{}";
        }
    }

    /* renamed from: rex$v */
    public static final class v extends rex {
        v() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof v;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToNavigateToHiddenTracks{}";
        }
    }

    /* renamed from: rex$w */
    public static final class w extends rex {
        public final String a;
        public final int b;

        w(String str, int i) {
            this.a = (String) gec.a(str);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return wVar.b == this.b && wVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToNavigateToSectionHeaderEntity{uri=");
            sb.append(this.a);
            sb.append(", index=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$x */
    public static final class x extends rex {
        x() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof x;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToOpenInfoDialog{}";
        }
    }

    /* renamed from: rex$y */
    public static final class y extends rex {
        public final String a;
        public final int b;
        public final boolean c;
        public final boolean d;

        y(String str, int i, boolean z, boolean z2) {
            this.a = (String) gec.a(str);
            this.b = i;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return yVar.b == this.b && yVar.c == this.c && yVar.d == this.d && yVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode()) * 31) + Boolean.valueOf(this.c).hashCode()) * 31) + Boolean.valueOf(this.d).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToPlayPreview{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append(", recommended=");
            sb.append(this.c);
            sb.append(", viaImage=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rex$z */
    public static final class z extends rex {
        public final String a;
        public final int b;
        public final boolean c;

        z(String str, int i, boolean z) {
            this.a = (String) gec.a(str);
            this.b = i;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return zVar.b == this.b && zVar.c == this.c && zVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode()) * 31) + Boolean.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogIntentToPlayTrack{uri=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append(", recommended=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    rex() {
    }

    public static rex a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z2) {
        return new at(yourLibraryTabsCollapseState, false);
    }

    public static rex a(String str) {
        return new ah(str);
    }

    public static rex a(String str, int i2, boolean z2, boolean z3) {
        return new y(str, i2, z2, z3);
    }

    public static rex a(String str, String str2) {
        return new ae(str, str2);
    }

    public static rex a(String str, String str2, Boolean bool) {
        return new au(str, str2, bool);
    }

    public static rex a(rdb rdb) {
        return new bi(rdb);
    }

    public static rex a(boolean z2) {
        return new aw(z2);
    }

    public static rex b(String str) {
        return new ap(str);
    }

    public static rex b(String str, String str2) {
        return new bc(str, str2);
    }

    public static rex b(boolean z2) {
        return new ay(z2);
    }

    public static rex c(String str) {
        return new bg(str);
    }

    public static rex c(boolean z2) {
        return new as(z2);
    }

    public static rex d(boolean z2) {
        return new ar(z2);
    }

    public static rex e(boolean z2) {
        return new bb(z2);
    }
}
