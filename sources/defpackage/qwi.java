package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;

/* renamed from: qwi reason: default package */
public abstract class qwi {

    /* renamed from: qwi$a */
    public static final class a extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CancelTextFilter{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: qwi$aa */
    public static final class aa extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToShowFilterTextView{}";
        }

        aa() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof aa;
        }
    }

    /* renamed from: qwi$ab */
    public static final class ab extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToShowSortOptions{}";
        }

        ab() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof ab;
        }
    }

    /* renamed from: qwi$ac */
    public static final class ac extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToShufflePlay{}";
        }

        ac() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof ac;
        }
    }

    /* renamed from: qwi$ad */
    public static final class ad extends qwi {
        public final String a;
        public final int b;

        ad(String str, int i) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$ae */
    public static final class ae extends qwi {
        public final String a;
        public final String b;

        ae(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
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

    /* renamed from: qwi$af */
    public static final class af extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToAddArtist{}";
        }

        af() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof af;
        }
    }

    /* renamed from: qwi$ag */
    public static final class ag extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToCreatePlaylist{}";
        }

        ag() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof ag;
        }
    }

    /* renamed from: qwi$ah */
    public static final class ah extends qwi {
        public final String a;

        ah(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$ai */
    public static final class ai extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToHiddenArtists{}";
        }

        ai() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof ai;
        }
    }

    /* renamed from: qwi$aj */
    public static final class aj extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToHiddenTracks{}";
        }

        aj() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof aj;
        }
    }

    /* renamed from: qwi$ak */
    public static final class ak extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToSettings{}";
        }

        ak() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof ak;
        }
    }

    /* renamed from: qwi$al */
    public static final class al extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotifyScrollability{}";
        }

        al() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof al;
        }
    }

    /* renamed from: qwi$am */
    public static final class am extends qwi {
        public final String a;
        public final ImmutableMap<String, Boolean> b;
        public final ImmutableList<String> c;

        am(String str, ImmutableMap<String, Boolean> immutableMap, ImmutableList<String> immutableList) {
            this.a = (String) gcr.a(str);
            this.b = (ImmutableMap) gcr.a(immutableMap);
            this.c = (ImmutableList) gcr.a(immutableList);
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

    /* renamed from: qwi$an */
    public static final class an extends qwi {
        public final String a;

        an(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$ao */
    public static final class ao extends qwi {
        public final String a;
        public final String b;
        public final String c;

        ao(String str, String str2, String str3) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (String) gcr.a(str3);
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

    /* renamed from: qwi$ap */
    public static final class ap extends qwi {
        public final String a;

        ap(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$aq */
    public static final class aq extends qwi {
        public final MusicItem a;
        public final String b;
        public final uqv c;

        aq(MusicItem musicItem, String str, uqv uqv) {
            this.a = (MusicItem) gcr.a(musicItem);
            this.b = (String) gcr.a(str);
            this.c = (uqv) gcr.a(uqv);
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

    /* renamed from: qwi$ar */
    public static final class ar extends qwi {
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

    /* renamed from: qwi$as */
    public static final class as extends qwi {
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

    /* renamed from: qwi$at */
    public static final class at extends qwi {
        public final YourLibraryTabsCollapseState a;
        public final boolean b;

        at(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
            this.a = (YourLibraryTabsCollapseState) gcr.a(yourLibraryTabsCollapseState);
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

    /* renamed from: qwi$au */
    public static final class au extends qwi {
        public final String a;
        public final String b;
        public final Boolean c;

        au(String str, String str2, Boolean bool) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (Boolean) gcr.a(bool);
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

    /* renamed from: qwi$av */
    public static final class av extends qwi {
        public final String a;
        public final uqv b;

        av(String str, uqv uqv) {
            this.a = (String) gcr.a(str);
            this.b = (uqv) gcr.a(uqv);
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

    /* renamed from: qwi$aw */
    public static final class aw extends qwi {
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

    /* renamed from: qwi$ax */
    public static final class ax extends qwi {
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

    /* renamed from: qwi$ay */
    public static final class ay extends qwi {
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

    /* renamed from: qwi$az */
    public static final class az extends qwi {
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

    /* renamed from: qwi$b */
    public static final class b extends qwi {
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

    /* renamed from: qwi$ba */
    public static final class ba extends qwi {
        public final String a;
        public final String b;
        public final Optional<String> c;

        ba(String str, String str2, Optional<String> optional) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (Optional) gcr.a(optional);
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

    /* renamed from: qwi$bb */
    public static final class bb extends qwi {
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

    /* renamed from: qwi$bc */
    public static final class bc extends qwi {
        public final String a;
        public final String b;

        bc(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
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

    /* renamed from: qwi$bd */
    public static final class bd extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowSortOptions{}";
        }

        bd() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof bd;
        }
    }

    /* renamed from: qwi$be */
    public static final class be extends qwi {
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

    /* renamed from: qwi$bf */
    public static final class bf extends qwi {
        public final qut a;
        public final String b;

        bf(qut qut, String str) {
            this.a = (qut) gcr.a(qut);
            this.b = (String) gcr.a(str);
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

    /* renamed from: qwi$bg */
    public static final class bg extends qwi {
        public final String a;

        bg(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$bh */
    public static final class bh extends qwi {
        public final String a;
        public final boolean b;

        bh(String str, boolean z) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$bi */
    public static final class bi extends qwi {
        private final qum a;

        bi(qum qum) {
            this.a = (qum) gcr.a(qum);
        }

        public final qum a() {
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

    /* renamed from: qwi$bj */
    public static final class bj extends qwi {
        public final String a;
        public final boolean b;

        bj(String str, boolean z) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$bk */
    public static final class bk extends qwi {
        public final String a;
        public final String b;
        public final boolean c;

        bk(String str, String str2, boolean z) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
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

    /* renamed from: qwi$bl */
    public static final class bl extends qwi {
        public final String a;
        public final String b;
        public final boolean c;

        bl(String str, String str2, boolean z) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
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

    /* renamed from: qwi$c */
    public static final class c extends qwi {
        public final String a;
        public final uqv b;
        public final ImmutableList<uqv> c;

        c(String str, uqv uqv, ImmutableList<uqv> immutableList) {
            this.a = (String) gcr.a(str);
            this.b = (uqv) gcr.a(uqv);
            this.c = (ImmutableList) gcr.a(immutableList);
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

    /* renamed from: qwi$d */
    public static final class d extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentClearAllFilters{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }
    }

    /* renamed from: qwi$e */
    public static final class e extends qwi {
        public final String a;

        e(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$f */
    public static final class f extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToAddArtists{}";
        }

        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }
    }

    /* renamed from: qwi$g */
    public static final class g extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToAddArtistsFromEmptyPage{}";
        }

        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }
    }

    /* renamed from: qwi$h */
    public static final class h extends qwi {
        public final String a;
        public final int b;

        h(String str, int i) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$i */
    public static final class i extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToCancelFind{}";
        }

        i() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }
    }

    /* renamed from: qwi$j */
    public static final class j extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToCreatePlaylist{}";
        }

        j() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof j;
        }
    }

    /* renamed from: qwi$k */
    public static final class k extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToCreatePlaylistFromEmptyPage{}";
        }

        k() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }
    }

    /* renamed from: qwi$l */
    public static final class l extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToDismissInfoDialog{}";
        }

        l() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof l;
        }
    }

    /* renamed from: qwi$m */
    public static final class m extends qwi {
        public final boolean a;
        public final String b;

        m(boolean z, String str) {
            this.a = z;
            this.b = (String) gcr.a(str);
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

    /* renamed from: qwi$n */
    public static final class n extends qwi {
        public final String a;
        public final boolean b;

        n(String str, boolean z) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$o */
    public static final class o extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToFind{}";
        }

        o() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof o;
        }
    }

    /* renamed from: qwi$p */
    public static final class p extends qwi {
        public final String a;
        private final int b;

        p(String str, int i) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$q */
    public static final class q extends qwi {
        public final String a;
        public final int b;

        q(String str, int i) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$r */
    public static final class r extends qwi {
        public final String a;
        public final int b;

        r(String str, int i) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$s */
    public static final class s extends qwi {
        public final String a;
        public final int b;

        s(String str, int i) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$t */
    public static final class t extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToNavigateToFavoriteSongs{}";
        }

        t() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof t;
        }
    }

    /* renamed from: qwi$u */
    public static final class u extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToNavigateToHiddenArtists{}";
        }

        u() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof u;
        }
    }

    /* renamed from: qwi$v */
    public static final class v extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToNavigateToHiddenTracks{}";
        }

        v() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof v;
        }
    }

    /* renamed from: qwi$w */
    public static final class w extends qwi {
        public final String a;
        public final int b;

        w(String str, int i) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$x */
    public static final class x extends qwi {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LogIntentToOpenInfoDialog{}";
        }

        x() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof x;
        }
    }

    /* renamed from: qwi$y */
    public static final class y extends qwi {
        public final String a;
        public final int b;
        public final boolean c;
        public final boolean d;

        y(String str, int i, boolean z, boolean z2) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: qwi$z */
    public static final class z extends qwi {
        public final String a;
        public final int b;
        public final boolean c;

        z(String str, int i, boolean z) {
            this.a = (String) gcr.a(str);
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

    qwi() {
    }

    public static qwi a(String str, String str2) {
        return new ae(str, str2);
    }

    public static qwi a(String str) {
        return new ah(str);
    }

    public static qwi b(String str) {
        return new ap(str);
    }

    public static qwi c(String str) {
        return new bg(str);
    }

    public static qwi b(String str, String str2) {
        return new bc(str, str2);
    }

    public static qwi a(boolean z2) {
        return new aw(z2);
    }

    public static qwi b(boolean z2) {
        return new ay(z2);
    }

    public static qwi a(String str, String str2, Boolean bool) {
        return new au(str, str2, bool);
    }

    public static qwi a(qum qum) {
        return new bi(qum);
    }

    public static qwi a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z2) {
        return new at(yourLibraryTabsCollapseState, false);
    }

    public static qwi c(boolean z2) {
        return new as(z2);
    }

    public static qwi d(boolean z2) {
        return new ar(z2);
    }

    public static qwi e(boolean z2) {
        return new bb(z2);
    }

    public static qwi a(String str, int i2, boolean z2, boolean z3) {
        return new y(str, i2, z2, z3);
    }
}
