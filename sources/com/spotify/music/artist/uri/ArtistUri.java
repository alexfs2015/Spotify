package com.spotify.music.artist.uri;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ArtistUri {
    public String a;
    public String b;
    private final String c;

    public enum Type {
        ARTIST(""),
        ABOUT(":about"),
        BIOGRAPHY(":biography"),
        CONCERT(":concert"),
        GALLERY(":gallery"),
        PLAYLISTS(":playlists"),
        RELATED(":related");
        
        public static final Type[] b = null;
        public final String mSuffix;

        static {
            b = values();
        }

        private Type(String str) {
            this.mSuffix = (String) fay.a(str);
        }
    }

    public ArtistUri(String str) {
        Type[] typeArr;
        this.c = (String) fay.a(str);
        for (Type type : Type.b) {
            StringBuilder sb = new StringBuilder("(spotify:artist:([a-zA-Z0-9]+))");
            sb.append(type.mSuffix);
            Matcher matcher = Pattern.compile(sb.toString()).matcher(str);
            if (matcher.find()) {
                this.b = matcher.group(1);
                this.a = matcher.group(2);
            }
        }
        fay.a(this.b);
    }

    public final String toString() {
        return this.c;
    }
}
