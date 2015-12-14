package MFES_PROJ.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class NQuote {
    private static int hc = 0;
    private static NQuote instance = null;

    public NQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static NQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new NQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof NQuote;
    }

    public String toString() {
        return "<N>";
    }
}
