package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter;

public class DefaultIndenter extends NopIndenter {
    public static final DefaultIndenter SYSTEM_LINEFEED_INSTANCE = new DefaultIndenter("  ", SYS_LF);
    public static final String SYS_LF;
    private static final long serialVersionUID = 1;
    private final int charsPerLevel;
    private final String eol;
    private final char[] indents;

    public boolean isInline() {
        return false;
    }

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        SYS_LF = str;
    }

    public DefaultIndenter() {
        this("  ", SYS_LF);
    }

    public DefaultIndenter(String str, String str2) {
        this.charsPerLevel = str.length();
        this.indents = new char[(str.length() << 4)];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            str.getChars(0, str.length(), this.indents, i);
            i += str.length();
        }
        this.eol = str2;
    }

    public void writeIndentation(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.writeRaw(this.eol);
        if (i > 0) {
            int i2 = i * this.charsPerLevel;
            while (true) {
                char[] cArr = this.indents;
                if (i2 > cArr.length) {
                    jsonGenerator.writeRaw(cArr, 0, cArr.length);
                    i2 -= this.indents.length;
                } else {
                    jsonGenerator.writeRaw(cArr, 0, i2);
                    return;
                }
            }
        }
    }
}
