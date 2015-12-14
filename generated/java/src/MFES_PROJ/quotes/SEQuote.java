package MFES_PROJ.quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


@SuppressWarnings("all")
public class SEQuote {
    private static int hc = 0;
    private static SEQuote instance = null;

    public SEQuote() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static SEQuote getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new SEQuote();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof SEQuote;
    }

    public String toString() {
        return "<SE>";
    }
}
