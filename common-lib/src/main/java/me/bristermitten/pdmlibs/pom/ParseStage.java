package me.bristermitten.pdmlibs.pom;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Document;

/**
 * @author AlexL
 */
public interface ParseStage<T>
{

    @NotNull
    T parse(@NotNull final Document document);
}
