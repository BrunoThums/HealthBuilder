package util;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public final class Styler {

    public static Border getTitledBorder(
            final String title,
            final boolean isRequired,
            final Font font
    ) {
        return BorderFactory.createTitledBorder(
                null,
                title + (isRequired ? " *" : ""),
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.ABOVE_TOP,
                font);
    }
}
