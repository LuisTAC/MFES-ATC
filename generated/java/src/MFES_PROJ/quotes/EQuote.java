package MFES_PROJ.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class EQuote {
    private static int hc = 0;
    private static EQuote instance = null;

    public EQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static EQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new EQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof EQuote;
    }

    public String toString() {
        return "<E>";
    }
}
