package defpackage;

import android.os.Build.VERSION;
import com.spotify.music.lyrics.model.LyricsLineData;
import com.spotify.music.lyrics.model.Word;
import java.lang.Character.UnicodeBlock;
import java.util.List;

/* renamed from: slg reason: default package */
public final class slg {
    public static boolean a(List<LyricsLineData> list) {
        for (LyricsLineData words : list) {
            if (a(((Word) words.words().get(0)).getString())) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str) {
        if (str.isEmpty()) {
            return false;
        }
        return a(Character.codePointAt(str, 0));
    }

    private static boolean a(int i) {
        UnicodeBlock of = UnicodeBlock.of(i);
        return a(of) || c(of) || d(of);
    }

    private static boolean a(UnicodeBlock unicodeBlock) {
        return UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS.equals(unicodeBlock) || UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A.equals(unicodeBlock) || UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B.equals(unicodeBlock) || UnicodeBlock.CJK_COMPATIBILITY.equals(unicodeBlock) || UnicodeBlock.CJK_COMPATIBILITY_FORMS.equals(unicodeBlock) || UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS.equals(unicodeBlock) || UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT.equals(unicodeBlock) || UnicodeBlock.CJK_RADICALS_SUPPLEMENT.equals(unicodeBlock) || UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION.equals(unicodeBlock) || UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS.equals(unicodeBlock) || UnicodeBlock.KANGXI_RADICALS.equals(unicodeBlock) || UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS.equals(unicodeBlock) || b(unicodeBlock);
    }

    private static boolean b(UnicodeBlock unicodeBlock) {
        if (VERSION.SDK_INT < 19) {
            return false;
        }
        if (UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C.equals(unicodeBlock) || UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D.equals(unicodeBlock) || UnicodeBlock.CJK_STROKES.equals(unicodeBlock) || UnicodeBlock.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT.equals(unicodeBlock)) {
            return true;
        }
        return false;
    }

    private static boolean c(UnicodeBlock unicodeBlock) {
        return UnicodeBlock.HIRAGANA.equals(unicodeBlock) || UnicodeBlock.KATAKANA.equals(unicodeBlock) || UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS.equals(unicodeBlock);
    }

    private static boolean d(UnicodeBlock unicodeBlock) {
        return UnicodeBlock.HANGUL_JAMO.equals(unicodeBlock) || UnicodeBlock.HANGUL_COMPATIBILITY_JAMO.equals(unicodeBlock) || UnicodeBlock.HANGUL_SYLLABLES.equals(unicodeBlock) || e(unicodeBlock);
    }

    private static boolean e(UnicodeBlock unicodeBlock) {
        if (VERSION.SDK_INT < 19) {
            return false;
        }
        if (UnicodeBlock.HANGUL_JAMO_EXTENDED_A.equals(unicodeBlock) || UnicodeBlock.HANGUL_JAMO_EXTENDED_B.equals(unicodeBlock)) {
            return true;
        }
        return false;
    }
}
